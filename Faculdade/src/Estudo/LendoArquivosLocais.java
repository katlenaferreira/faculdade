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
        // Em memória - cria o objeto File, com o endereçamento
        // e conteúdo do arquivo.txt
        // -1 , 0 , 1 , 2, 3 NULL
        while (sc.hasNextLine()==true) {
        System.out.println(sc.nextLine());
        }
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado!");
    }
}

}
