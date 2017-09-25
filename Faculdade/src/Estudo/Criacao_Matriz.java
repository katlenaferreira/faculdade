package Estudo;
import java.util.Scanner;
 
public class Criacao_Matriz {
	
	Scanner scan;
	String matrix[][];
	int row, column;
 
	void create() {
		
		scan = new Scanner(System.in);
		
		System.out.println("Criação de matriz");
		
		System.out.println("\nEntre o numero de linhas:");
		row = Integer.parseInt(scan.nextLine());
		
		System.out.println("Numero de colunas:");
		column = Integer.parseInt(scan.nextLine());
		
		matrix = new String[row][column];
		System.out.println("Dados:");
 
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				matrix[i][j] = scan.nextLine();
			}
		}
	}
	
	void display() {
		
		System.out.println("\nA matriz é:");
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}

 

	public static void main(String args[]) {
		
		Criacao_Matriz obj = new Criacao_Matriz();
		
		obj.create();
		obj.display();
	}
}
