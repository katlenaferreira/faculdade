package Estudo;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exemplo5 {

    public static void main(String[] args) throws IOException {
        try {
            InputStream inputStream = new FileInputStream("C:/Users/katlen.ferreira/Desktop/tdd.txt/");
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Algum erro na leitura do arquivo !");
        }
    }
}
