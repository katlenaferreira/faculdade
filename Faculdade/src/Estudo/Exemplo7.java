/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *

 */
public class Exemplo7 {
    
    @SuppressWarnings("resource")
	public static void main(String args[])
    {
        String inp="";
        
        Exemplo7 ex=new Exemplo7();
        
        while(inp.equals("4")==false)
        {
            String msg=" 1- Grava  , 2 - Sobreescrever ,3- Mostra , 4 Sair ";
            System.out.println(msg);
            inp = (new java.util.Scanner(System.in)).nextLine();
            
            if(inp.equals("1"))
            {   System.out.println("Digite para gravar:");
                ex.escrever((new java.util.Scanner(System.in)).nextLine());
            }else if( inp.equals("2") )
             {   System.out.println("Digite para gravar:");
              ex.sobreescrever((new java.util.Scanner(System.in)).nextLine());
             }else if( inp.equals("3") )
                    ex.ler();
            
        }
    }
    
    public  void ler()
    {
          try {
            InputStream inputStream = new FileInputStream("c:/teste/arquivo.txt");
            @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Algum erro na leitura do arquivo !");
        }
        
    }
    
    //Sobreescrever
     public  void sobreescrever( String args)
    {
        try {
        OutputStream outputStream = new
        FileOutputStream("c:/teste/arquivo.txt");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);
        
          outputStreamWriter.write(args);
          
          outputStreamWriter.write("\n");
          
           outputStreamWriter.close();
    } catch (Exception e) {
        System.out.println("Algum erro na leitura do arquivo!");
    }
        
    }
     
    // ADICIONA    
    public  void escrever( String args)
    {
        try {
        OutputStream outputStream = new
        FileOutputStream("c:/teste/arquivo.txt",true);
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);
        
          outputStreamWriter.write(args);
          
          outputStreamWriter.write("\n");
          
           outputStreamWriter.close();
    } catch (Exception e) {
        System.out.println("Algum erro na leitura do arquivo!");
    }
        
    }
    
}
