package dio.paulo.aula.dio.credit.api.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDetails> lidaComExcessao(
        MethodArgumentNotValidException excp){
        
        Map<String, String> erros = new HashMap<>();
        excp.getBindingResult().getAllErrors().forEach(erro ->{
            String fieldName = ((FieldError) erro).getField();
            String messageError = erro.getDefaultMessage();
            erros.put(fieldName, messageError);
        });
        ExceptionDetails detalhesDaExcessao = new ExceptionDetails();
        detalhesDaExcessao.title = "Ocorreu um erro, consulte a documentação para mais detalhes";
        detalhesDaExcessao.timeStamp = LocalDateTime.now();
        detalhesDaExcessao.status = HttpStatus.BAD_REQUEST.value();
        detalhesDaExcessao.exception = excp.getClass().toString();
        detalhesDaExcessao.details = erros;
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(detalhesDaExcessao);
    }
    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity<ExceptionDetails> valorUnicoInfringido(
        DataAccessException excp){
        Throwable causaRaiz = ExceptionUtils.getRootCause(excp);
        Map<String,String> msg = new HashMap<>();
        msg.put(excp.getCause().toString(),excp.getMessage());
        msg.put("Mensagem: ", excp.getMessage());
        msg.put("Causa: ", excp.getCause().toString());
        msg.put("Causa Raiz: ",causaRaiz.getMessage());

        ExceptionDetails detalhesDaExcessao = new ExceptionDetails();
        detalhesDaExcessao.title = "Ocorreu um erro, consulte a documentação para mais detalhes";
        detalhesDaExcessao.timeStamp = LocalDateTime.now();
        detalhesDaExcessao.status = HttpStatus.CONFLICT.value();
        detalhesDaExcessao.exception = excp.getClass().toString();
        detalhesDaExcessao.details = msg;
        return ResponseEntity.status(HttpStatus.CONFLICT).body(detalhesDaExcessao);
    }
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ExceptionDetails> usuarioNaoEncontrado(
        BusinessException excp){
        
        Map<String,String> msg = new HashMap<>();
        Throwable causaRaiz = ExceptionUtils.getRootCause(excp);
        msg.put("Causa raiz", causaRaiz.getMessage());
        
        ExceptionDetails detalhesDaExcessao = new ExceptionDetails();
        detalhesDaExcessao.title = "Ocorreu um erro ao procurar o usuario";
        detalhesDaExcessao.timeStamp = LocalDateTime.now();
        detalhesDaExcessao.status = HttpStatus.BAD_REQUEST.value();
        detalhesDaExcessao.details = msg;
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(detalhesDaExcessao);
    }
    
    
}
