
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudo;



import java.util.Scanner;

public class Exemplo1A {
    @SuppressWarnings("resource")
	public static void main(String args[]) {
    try {
		Scanner entrada = new Scanner(System.in);
		@SuppressWarnings("unused")
		int numero = entrada.nextInt();
    	} catch (Exception e) {
            System.out.println("O valor digitado é inválido!");
    }
}
}
