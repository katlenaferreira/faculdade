package Estudo;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Livro {
	private Scanner l;
	private boolean execute;
	private List<Dados> dados;
	
	public static void main(String[] args) {
		new Livro();
	}
	private Livro() {
		l = new Scanner(System.in);
		execute = true;
		dados = new ArrayList<Dados>();
		System.out.println("Boa Leitura - Livraria");
		while (execute) {
			String opcao = menu();
			if (opcao.equalsIgnoreCase("1")) {
				adicionarLivro();
			} else if (opcao.equalsIgnoreCase("2")) {
				listarLivrosAtual();
			} else if (opcao.equalsIgnoreCase("3")) {
				execute = false;
			} else {
				System.out.println("\nOpção Inválida! \n");
			}
		}
	}
	

	private String menu() {
		System.out.println("Selecione a opção:");
		System.out.println("1 - Cadastrar Livro");
		System.out.println("2 - Exibir");
		System.out.println("3 - Sair");
			return l.nextLine();
	}
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
				System.out.println("Cadastro adicionado!");
				dados.add(d);
			} else if (cadastrar.equalsIgnoreCase("n")){
				System.out.println("Cadastro ignorado !!!");
			} else {
				System.out.println("\nOpção inválida! \n");
			}
			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
		
			} else {
				System.out.println("\nOpção inválida! \n");
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