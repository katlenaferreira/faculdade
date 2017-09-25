package Estudo;

import javax.swing.JOptionPane;

public class Cadastro_Matriz_2 {
	public static void main(String[] args){
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
					System.out.println("Encontrado na posição X:" + i + " , Y:" + j);
				else 
					System.out.println("Não encontrado!");
			}
			
			
			
			 
		}
		
	} 
}


