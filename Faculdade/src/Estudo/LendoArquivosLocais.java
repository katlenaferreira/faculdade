package Estudo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoArquivosLocais {
	 
    public static void main(String[] args) {
    try {
        Scanner sc = new Scanner(new
        File("C:/Users/katlen.ferreira/Desktop/tdd.txt/"));
        // System.in 
        // Em mem�ria - cria o objeto File, com o endere�amento
        // e conte�do do arquivo.txt
        // -1 , 0 , 1 , 2, 3 NULL
        while (sc.hasNextLine()==true) {
        System.out.println(sc.nextLine());
        }
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo n�o encontrado!");
    }
}

}
