package Estudo;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Exemplo {
	private Scanner l;
	private List<Dados> dados;
	
	public static void main(String[] args) {
		new Exemplo();
	}
	private Exemplo() {
		l = new Scanner(System.in);
		dados = new ArrayList<Dados>();
		
		Object[] options = {  "Adicionar Livro ", "Listar livros", "Sair" }; 
  		int teste = JOptionPane.showOptionDialog(null, "Deseja alterar?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
  		if (teste == 0){
				adicionarLivro();
			} else if (teste == 1) {
				listarLivrosAtual();
			} else if (teste == 2) {
			} else {
				JOptionPane.showMessageDialog(null, "\nOp��o Inv�lida! \n");
	   	 }}

	
	private void adicionarLivro() {
		boolean cadastrando = true;
		while (cadastrando) {

			
			System.out.println("Cadastro de livro");
			Dados d = new Dados();
			d.setTitulo(textInput("T�tulo:"));
			d.setCodigo(textInput("C�digo: "));
			d.setPreco(textInput("Pre�o: "));
			d.setCategoria(textInput("Categoria: "));
			d.setAno(textInput("Ano: "));
			
			Object[] options = {  "Cadastrar", "Cancelar" }; 
	  		int cadastra = JOptionPane.showOptionDialog(null, "Cadastrado!", "Cancelado!", 
	  				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
	  		if (cadastra == 0){
	  				dados.add(d);
				} else if (cadastra == 1) {
					JOptionPane.showMessageDialog(null, "\nCancelado! \n");
					cadastrando = false;
				} else {
					JOptionPane.showMessageDialog(null, "\nOp��o Inv�lida! \n");
					cadastrando = false;
					Exemplo ex = new Exemplo();
					ex.listarLivrosAtual();
		   	 }}
			
	}		
	
	private void listarLivrosAtual() {
		if (dados.size() == 0) {
			System.out.println("\nN�o existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < dados.size(); i++) {
				Dados d = dados.get(i);
				
				System.out.println("C�digo n�mero: " + i);
				System.out.println("\tTitulo: " + d.getTitulo());
				System.out.println("\tCodigo: " + d.getCodigo());
				System.out.println("\tPreco: " + d.getPreco());
				System.out.println("\tCategoria: " + d.getCategoria());
				System.out.println("\tAno: " + d.getAno());
			
				
			}
			
			

			System.out.println("\nFim da lista\n");
		}
	}
	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}