package dio.exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

public class APIdoServicoDeCep {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
    public static Endereco buscaEnderecoPeloCep(String cep) throws Exception{
        String urlChamada = "https://viacep.com.br/ws/"+cep+"/json";
        try{
            URL link_api = new URL(urlChamada);
            HttpURLConnection conexao = (HttpURLConnection) link_api.openConnection();
            if(conexao.getResponseCode() != 200){
                throw new RuntimeException("Erro na conexão código: " + conexao.getResponseCode());
            }
            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String jsonConvertido = converteJsonEmString(resposta);

            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(jsonConvertido,Endereco.class);
            return endereco;
        }catch(Exception e){
            throw new Exception("Erro: "+ e);
        }
        
    }
    
}
