package Estudo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Testando extends JFrame {
    private static final long serialVersionUID = 1L;

    	String[] tituloCampos = { "Código", "Nome", "Sobrenome" };	    
    	int[] tamanhoCampos = { 5, 30, 30 };

	    JTextField[] txtCampos;
	    JLabel[] lblCampos;

	    JPanel jpBotoes;

	    JButton btnInserir;
	    JButton btnAlterar;
	    JButton btnPesquisar;
	    JButton btnExcluir;
	    JButton btnFechar;

    public Testando() {
        initForm();
    }

    // Método que montará o formulário
    private void initForm() {
        // Será setado o layout GridBagLayout que vc poderá montrar os componentes
        // imaginando ser uma planilha excel.
        this.setLayout(new GridBagLayout());

        // Instânciamos o GridBagConstrants que será onde setaremos a formatação
        // dos componentes para inserir no
        // Layout do Formulário
        GridBagConstraints gbc = new GridBagConstraints();

        // dizemos como ficará o texto dentro do componente inserido
        gbc.anchor = GridBagConstraints.WEST; //a esquerda vai ficar
        
        // Dizemos qual será o espaçamento dos componentes com relação aos outros
        // componentes
        gbc.insets = new Insets(10, 10, 10, 10); //espaçamento

        // Dizemos em qual coluna irá iniciar a inserção dos componentes
        gbc.gridx = 0;
        gbc.gridy = 0;
    
        // Instânciamos os array de label e textfield com a quantidade de campos a ser inserida
        // Insta baseado na quantidade de titulos na variavel global
        lblCampos = new JLabel[tituloCampos.length];
        txtCampos = new JTextField[tituloCampos.length];

        // Entra no for para colocar a formatação dos campos um por um,
        // seguindo a ordem das linhas
        for (int i = 0; tituloCampos.length > i; i++) {
            //Instanciando a label i do array
            lblCampos[i] = new JLabel();
            //Settando o nome do campo
            lblCampos[i].setText(tituloCampos[i]);
            
            
            //Adiciona no formulario com a formatação dentro do GridBagLayout Instanciado
            this.add(lblCampos[i], gbc);
            
            //Coloca para adicionar o próximo componente dentro da proxima coluna
            gbc.gridx += 1;
            
            //Instância o campo na posição i do array
            txtCampos[i] = new JTextField();
            //Informa o tamanho do campo baseado na array com os tamanhos.
            //Somente multipliquei por 10 para ficar com um tamanho bom, não é padrão esse cálculo
            txtCampos[i].setPreferredSize(new Dimension(tamanhoCampos[i] * 10,
                    20));
            
            //Adicionando no formulário
            this.add(txtCampos[i], gbc);
            
            //Coloca na proxima linha os outros componentes
            gbc.gridy += 1;
            
            //Volta para a coluna 0
            gbc.gridx = 0;
        }
        //Fim do for
        
        //Instânciando o painel onde ficará os botões
        jpBotoes = new JPanel();
        
        //Dizemos qual será seu tamanho.
        jpBotoes.setPreferredSize(new Dimension(500, 40));
        
        //Colocamos no layout FlowLayout que coloca os componentes como se fossem palavras num editor. ex 1 2 3 4 5. em linha
        jpBotoes.setLayout(new FlowLayout());

        //Instanciando o botão inserir e já colocando o nome
        btnInserir = new JButton("Inserir");
        
        //Adcionando ao painel onde ficará os botoes
        jpBotoes.add(btnInserir);
        
        //Fazemos como acima nos demais botões. Instanciamos, colocamos nome e adicionamos ao painel 
        btnAlterar = new JButton("Alterar");
        jpBotoes.add(btnAlterar);

        btnExcluir = new JButton("Excluir");
        jpBotoes.add(btnExcluir);

        btnPesquisar = new JButton("Pesquisar");
        jpBotoes.add(btnPesquisar);

        btnFechar = new JButton("Fechar");
        jpBotoes.add(btnFechar);

        // Dizemos em qual coluna e linha vai ficar o painel
        gbc.gridx = 0;
        gbc.gridy = gbc.gridy + 1;
        //Essa opção é como a função mesclar do excel, permite fazer o componente ocupar quantas colunas settar
        gbc.gridwidth = 5;
        
        //Iniciamos o painel. e deixamos visivel
        jpBotoes.setVisible(true);
        
        //Adicionamos ao formulário o painel com a formatação
        this.add(jpBotoes, gbc);
        
        //Dizemos que vai ficar com o tamanho proporcional ao tanto de componentes inseridos o formulário
        this.pack();
        
        //Colocamos para inserir centralizado na tela
        this.setLocationRelativeTo(null);
        
        //Setamos o titulo do formulário
        this.setTitle("Cadastro de pessoas");
        
        //Setamos o funcionamento do botão fechar no formulário
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args){
		
	}
	
}
//fim