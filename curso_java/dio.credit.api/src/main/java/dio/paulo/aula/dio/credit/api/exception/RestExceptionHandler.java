package dio.paulo.aula.dio.credit.api.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

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
}
