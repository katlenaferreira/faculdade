package Estudo;



	import java.io.PrintStream;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class Exemplo4 {
	    
	    public static void main(String[] args)
	   throws FileNotFoundException 
	    {
	        Scanner leitor = new Scanner(System.in);
	        PrintStream destino = new
	        PrintStream("C:/Users/katlen.ferreira/Desktop/tdd.txt/");
	        String texto = leitor.nextLine();
	        destino.println(texto);
	    }   
	    
	    
	}

