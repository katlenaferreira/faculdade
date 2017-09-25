package Estudo;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Usuarios  extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTitulo, lblCodigo, lblPreco, lblCategoria, lblAno;
    private JTextField txtTitulo, txtCodigo, txtPreco, txtCategoria, txtAno;
    private JTextArea txtMensagem;
    private JButton btnAdicionar, btnSair, btnListar;
	private List<Dados> dados;
	
	public static void main(String[] args) {
		 Usuarios janela = new Usuarios();
	        janela.setVisible(true);
	    }
			
			
	private Usuarios() {

	    setDados(new ArrayList<Dados>());

		//Nome dos campos (Labels):
        lblTitulo = new JLabel("Titulo");
        lblCodigo = new JLabel("Código");
        lblPreco = new JLabel("Preço");
        lblCategoria = new JLabel("Categoria");
        lblAno = new JLabel("Ano");

        //Campos de texto:
        txtTitulo = new JTextField(10);
        txtCodigo = new JTextField(10);
        txtPreco = new JTextField(10);
        txtCategoria = new JTextField(10);
		txtAno = new JTextField(10);

        txtMensagem = new JTextArea(10, 40);

        //Botões:
        btnAdicionar = new JButton("Adicionar");
		btnListar = new JButton("Listar");      
		btnSair = new JButton("Sair");
      
        JPanel pnlTitulo = new JPanel();
        pnlTitulo.add(lblTitulo);
        pnlTitulo.add(txtTitulo);

        JPanel pnlCodigo = new JPanel();
        pnlCodigo.add(lblCodigo);
        pnlCodigo.add(txtCodigo);

        JPanel pnlPreco = new JPanel();
        pnlPreco.add(lblPreco);
        pnlPreco.add(txtPreco);

        JPanel pnlCategoria = new JPanel();
        pnlCategoria.add(lblCategoria);
        pnlCategoria.add(txtCategoria);

        JPanel pnlAno = new JPanel();
        pnlAno.add(lblAno);
		pnlAno.add(txtAno);

        JPanel pnlTituloCodigo = new JPanel(new GridLayout(1, 2));
        pnlTituloCodigo.add(pnlTitulo);
        pnlTituloCodigo.add(pnlCodigo);

        JPanel pnlPrecoCategoria = new JPanel(new GridLayout(1, 2));
        pnlPrecoCategoria.add(pnlPreco);
		pnlPrecoCategoria.add(pnlCategoria);
   
       
        JPanel pnlFormulario = new JPanel(new GridLayout(5, 1));
        pnlFormulario.add(pnlTituloCodigo);
        pnlFormulario.add(pnlPrecoCategoria);
        pnlFormulario.add(pnlAno);

        JPanel pnlBotoes = new JPanel(new FlowLayout());
        pnlBotoes.add(btnAdicionar);
        pnlBotoes.add(btnListar);
        pnlBotoes.add(btnSair);
    
        
        Container c = getContentPane();
        c.add(pnlFormulario, BorderLayout.NORTH);
        c.add(txtMensagem, BorderLayout.CENTER);
        c.add(pnlBotoes, BorderLayout.SOUTH);

        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnAdicionar.addActionListener(this);
        btnListar.addActionListener(this);
        btnSair.addActionListener(this);
		
	
	}
	

	@Override
	    public void actionPerformed(ActionEvent e) {
	        Object botao = e.getSource();

	        if (botao == btnSair) {
	            System.exit(0);
	            
	        } else if (botao ==  btnListar) {
	        	Object[] options = {  "Sim", "Não" }; 
	        	 int response = JOptionPane.showOptionDialog(null, "Deseja alterar?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
	        	 if (response == 0){
	        		 txtTitulo.setText("");
	        		 txtCodigo.setText("");
	        		 txtPreco.setText("");
	        		 txtCategoria.setText("");
	        		 txtAno.setText("");
	 	        	
	        } else if (botao == btnAdicionar) {
	          //Validação do preechimento dos campos:  
	            if ((txtTitulo.getText() == null || txtTitulo.getText().trim().isEmpty()) ||
	            		  (txtCodigo.getText() == null || txtCodigo.getText().trim().isEmpty()) ||
	            		  (txtPreco.getText() == null || txtPreco.getText().trim().isEmpty()) ||
	            		  (txtAno.getText() == null || txtAno.getText().trim().isEmpty()) ||
	            		  (txtCategoria.getText() == null || txtCategoria.getText().trim().isEmpty())) {
	            		  JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
	          //Inclusão do Cadastro do Computador:		
	          } else {
	        	  Dados d = new Dados();
	     		  String mensagem = "";
	     		  mensagem += "Modelo: " + txtTitulo.getText() + "\n";
	     		  
	            	            mensagem += "Ano: " + d.getAno() + "\n";
	            	            mensagem += "Titulo: " + d.getTitulo() + "\n";
	            	            mensagem += "Preço: " + d.getPreco() + "\n";
	            	            mensagem += "Categoria: " + d.getCategoria() +  "\n";
	            	            mensagem += "Codigo: " + d.getCodigo() +  "\n";
	            	            mensagem += ": " + "\n";
	            	            txtMensagem.setText(mensagem);
	            		 }
	        }}}


	public List<Dados> getDados() {
		return dados;
	}


	public void setDados(List<Dados> dados) {
		this.dados = dados;
	}}



	    /***		int opcao = -1;
		
    while (opcao != 0) {
            String entrada = JOptionPane.showInputDialog(null, "Boa leitura! O que deseja fazer? \n"
                    + "1 - Adicionar livro \n"
					+ "2 - Listar livros \n"
                    + "0 - Sair");
            if (entrada == null) {
                break;
            }
            if ("".equals(entrada)) {
            }
            opcao = Integer.parseInt(entrada);
            switch (opcao) {
                case 1:
                  adicionarLivro();
                    break;
				case 2:
                  listarLivrosAtual();
                    break;
                case 0:
                	close();
                    break;
            }}
	}
	

	private void close() {
		Object[] options = {"Sair, voltar para o código!", "Voltar para Boa leitura!"};

		int Answer = JOptionPane.showOptionDialog(null, "O que você deseja fazer? ","Quit:Continue", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
		    null, options,options[1]);
		    if(Answer == JOptionPane.YES_OPTION){

		        System.exit(0); 
		    }
		    else if (Answer == JOptionPane.CANCEL_OPTION) {
		        return;
		    } 
     
		
		
	}**/



/*** private void adicionarLivro() {
		boolean cadastrando = true;
		while (cadastrando) {
			JOptionPane.showMessageDialog(null, "Cadastro de livro");
			
			String mensagem = "";
			Dados d = new Dados();
			  mensagem += "Modelo: " + txtTitulo.getText() + "\n";
			  
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
				System.out.println("\nOpção inválida! \n");
			}
			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				// se for s sai do if e volta para o inicio do while
			} else {
				System.out.println("\nOpção inválida!\n");
				cadastrando = false;
			}
		}
	}
	private void listarLivrosAtual() {
		if (dados.size() == 0) {
			System.out.println("\nNenhum livro cadastrado!\n");
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

}**/