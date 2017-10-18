package Estudo;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Exemplo6 {
public static void main(String[] args) throws IOException
{

    try {
        OutputStream outputStream = new
        FileOutputStream("C:/Users/katlen.ferreira/Desktop/tdd.txt",true);
        Writer outputStreamWriter = new OutputStreamWriter

(outputStream);
        
        String inp="";
      while( inp.equals("1")==false)
      {
          inp = (new java.util.Scanner(System.in)).nextLine();
          outputStreamWriter.write(inp);
          outputStreamWriter.write("\n");
          
      } 
        outputStreamWriter.close();
    } catch (Exception e) {
        System.out.println("Algum erro na leitura do arquivo!");
    }
}
}