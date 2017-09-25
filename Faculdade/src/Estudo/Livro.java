package Estudo;

import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Estudo.Dados;
import java.util.ArrayList;

	public class Livro {
		private Scanner l;
		private List<Dados> dados;
	public static void main(String[] args) {
		new Livro();
		}
	private Livro() {
	l = new Scanner(System.in);
	dados = new ArrayList<Dados>();
	Object[] options = {  "Adicionar Livro ", "Listar livros", "Sair" };
	  int teste = JOptionPane.showOptionDialog(null, "Deseja alterar?",
	"", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,
	options, options[0]);
	  if (teste == 0){
	adicionarLivro();
	} else if (teste == 1) {
	listarLivrosAtual();
	} else if (teste == 2) {
	} else {
System.out.println("\nOpção Inválida! \n");

  }}

	private void adicionarLivro() {
	boolean cadastrando = true;
	while (cadastrando) {
	
	System.out.println("Cadastro de livro");
		Dados d = new Dados();
		d.setTitulo(textInput("Título:"));
		d.setCodigo(textInput("Código: "));
		d.setPreco(textInput("Preço: "));
		d.setCategoria(textInput("Categoria: "));
		d.setAno(textInput("Ano: "));
	String cadastrar = textInput("Adicionar cadastro (S/N) ?");
		if (cadastrar.equalsIgnoreCase("s")) {
	System.out.println("Cadastro adicionado !!!");
		dados.add(d);
		} else if (cadastrar.equalsIgnoreCase("n")){
	System.out.println("Cadastro ignorado !!!");
		} else {
	System.out.println("\nOpção inválida seu noob, vou ignorar o cadastro só pra você ter que digitar denovo !!! \n");
	}
	String continua = textInput("Continuar cadastrando (S/N) ?");
		if (continua.equalsIgnoreCase("N")) {
		cadastrando = false;
		} else if (continua.equalsIgnoreCase("s")){
		// se for s sai do if e volta para o inicio do while
		} else {
	System.out.println("\nOpção inválida seu noob, eu vou sair só porque você não colabora !!! \n");
		cadastrando = false;
			}
			}
			}
		private void listarLivrosAtual() {
			if (dados.size() == 0) {
		System.out.println("\nNão existem cadastros !!!\n");
		} else {
		System.out.println("\nLista de Cadastros\n");
		for (int i = 0; i < dados.size(); i++) {
		Dados d = dados.get(i);
		System.out.println("Código número: " + i);
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