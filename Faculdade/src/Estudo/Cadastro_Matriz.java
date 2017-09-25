package Estudo;

import java.util.Scanner;
import javax.swing.JOptionPane;
 

//Matriz de cadastro - 8 nomes e pesquisa de nome cadastrado.

public class Cadastro_Matriz {
	
	Scanner scan;
	String matrix[][];
	int row, column;
 
	
//abre o menu com duas op��es 1- vai para o desafio 2- volta para o c�digo//
	void menu() {
		   int opcao = -1;
	        while (opcao != 0) {
	            String entrada = JOptionPane.showInputDialog(null, "Digite a op��o desejada: \n"
	                    + "1 - Desafio \n"
	                    + "0 - Sair");
	            if (entrada == null) {
	                break;
	            }
	            if ("".equals(entrada)) {
	            }
	            opcao = Integer.parseInt(entrada);
	            switch (opcao) {
	                case 1:
	                    desafio();
	                    break;
	                case 0:
	                	close();
	                    break;
	            }}
	             
	}
	
//desafio, incialmente cadastramos os nomes e depois pesquisamos e exibimos a posi��o do nome pesquisado.//
	void desafio() {
		String[][] matriz = new String[3][3];
		
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				matriz[i][j] = JOptionPane.showInputDialog("Cadastre seu nome: ");
		
		String nomeProcura = JOptionPane.showInputDialog("Qual o nome deseja procurar?");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if (matriz[i][j].equals(nomeProcura))
					System.out.println("Encontrado na posi��o X:" + i + " , Y:" + j);
				else 
					System.out.println("N�o encontrado!");
					close();
					
			
			}
	}}
			

//menu de op��es e op��o "cancelar" do bot�o do jOptionPane, ou seja, escolheu a op��o 2, rodamos esse c�digo.//
	void close() {
		Object[] options = {"Sair, voltar para o c�digo!", "Cadastrar novos nomes!"};

		int Answer = JOptionPane.showOptionDialog(null, "O que voc� deseja fazer? ","Quit:Continue", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
		    null, options,options[1]);
		    if(Answer == JOptionPane.YES_OPTION){

		        System.exit(0); 
		    }
		    else if (Answer == JOptionPane.CANCEL_OPTION) {
		        return;
		    } 
     
		
		
	}

//classe principal que define a sequencia e roda o nosso programa//	
public static void main(String args[]) {
	
	Cadastro_Matriz obj = new Cadastro_Matriz();
	obj.menu();
	obj.desafio();
	obj.close();
	
	
}
}

