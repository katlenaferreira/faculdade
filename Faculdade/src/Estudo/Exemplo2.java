
/*
 * To change this license header, choose License Headers in Project 

Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudo;

public class Exemplo2 {
    public static void main(String args[]) {
    int vetor [] = new int[5];
  
    try{
                vetor[8] = 10;
                
    }catch(Exception e)
    {
        System.out.println("Erro:"+e);
        System.out.println("Valor inválido de posição de vetor");
    }
}
}
