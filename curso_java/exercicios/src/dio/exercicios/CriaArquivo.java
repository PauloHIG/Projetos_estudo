package dio.exercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriaArquivo {
    public static void main(String[] args) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("ola_mundo.py"));
            escritor.write("print(1+2)");
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Arquivo fechado");
        }
    }
}
