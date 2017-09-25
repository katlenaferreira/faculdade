package Estudo;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastroComputadores extends JFrame implements ActionListener {
    /* grid: posicionamento */
    /* painel: agrupamento */
    /* conteiner: inserção no Jframe */

    /**
	 * @Katlen Ferreira
	 */
	
	private static final long serialVersionUID = 1L;
	private JLabel lblMarca, lblModelo, lblProcessador, lblSO, lblEstado;
    private JTextField txtMarca, txtModelo, txtProcessador, txtSO;
    private JRadioButton rdbNovo, rdbUsado;
    private ButtonGroup grpEstado;
    private JTextArea txtMensagem;
    private JButton btnAdicionar, btnLimpar, btnFechar, btnAlterar, btnExcluir, btnBuscar;

    public CadastroComputadores() {
  
        setTitle("Cadastro de Computadores");
        
        //Nome dos campos (Labels):
        lblMarca = new JLabel("Marca");
        lblModelo = new JLabel("Modelo");
        lblProcessador = new JLabel("Processador");
        lblSO = new JLabel("Sistema Operacional");
        lblEstado = new JLabel("Estado");

        //Campos de texto:
        txtMarca = new JTextField(10);
        txtModelo = new JTextField(10);
        txtProcessador = new JTextField(10);
        txtSO = new JTextField(10);

        //Radio Button:
        rdbNovo = new JRadioButton("Novo");
        rdbUsado = new JRadioButton("Usado");
        grpEstado = new ButtonGroup();
        grpEstado.add(rdbNovo);
        grpEstado.add(rdbUsado);

        txtMensagem = new JTextArea(10, 40);

        //Botões:
        btnAdicionar = new JButton("Adicionar");
        btnLimpar = new JButton("Limpar");
        btnFechar = new JButton("Fechar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnBuscar = new JButton("Buscar");

        JPanel pnlMarca = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlMarca.add(lblMarca);
        pnlMarca.add(txtMarca);

        JPanel pnlModelo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlModelo.add(lblModelo);
        pnlModelo.add(txtModelo);

        JPanel pnlProcessador = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlProcessador.add(lblProcessador);
        pnlProcessador.add(txtProcessador);

        JPanel pnlSO = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlSO.add(lblSO);
        pnlSO.add(txtSO);

        JPanel pnlEstado = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlEstado.add(lblEstado);
        pnlEstado.add(rdbNovo);
        pnlEstado.add(rdbUsado);

        JPanel pnlMarcaModelo = new JPanel(new GridLayout(0, 4));
        pnlMarcaModelo.add(pnlMarca);
        pnlMarcaModelo.add(pnlModelo);

        JPanel pnlProcessadorU = new JPanel(new GridLayout(0, 4));
        pnlProcessadorU.add(pnlProcessador);
   
        JPanel pnlSOU = new JPanel(new GridLayout(0, 4));
        pnlSOU.add(pnlSO);

        JPanel pnlFormulario = new JPanel(new GridLayout(0, 4));
        pnlFormulario.add(pnlMarcaModelo);
        pnlFormulario.add(pnlProcessadorU);
        pnlFormulario.add(pnlSOU);
        pnlFormulario.add(pnlEstado);

        JPanel pnlBotoes = new JPanel(new FlowLayout());
        pnlBotoes.add(btnAdicionar);
        pnlBotoes.add(btnLimpar);
        pnlBotoes.add(btnExcluir);
        pnlBotoes.add(btnAlterar);
        pnlBotoes.add(btnBuscar);
        pnlBotoes.add(btnFechar);
        
        Container c = getContentPane();
        c.add(pnlFormulario, BorderLayout.NORTH);
        c.add(txtMensagem, BorderLayout.CENTER);
        c.add(pnlBotoes, BorderLayout.SOUTH);

        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnAdicionar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnFechar.addActionListener(this);
        btnAlterar.addActionListener(this);
        btnExcluir.addActionListener(this);
        btnBuscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botao = e.getSource();

        if (botao == btnFechar) {
            System.exit(0);
            
        } else if (botao == btnExcluir) {
        	txtMarca.setText("");
        	txtModelo.setText("");
        	txtProcessador.setText("");
        	txtSO.setText("");
            grpEstado.clearSelection();
            txtMensagem.setText("");
        	
        } else if (botao == btnLimpar) {
        	txtMarca.setText("");
        	txtModelo.setText("");
        	txtProcessador.setText("");
        	txtSO.setText("");
            grpEstado.clearSelection();
            txtMensagem.setText("");
            
        } else if (botao == btnAlterar) {
        	Object[] options = {  "Sim", "Não" }; 
        	 int response = JOptionPane.showOptionDialog(null, "Deseja alterar?", "", 
        			 JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        	 if (response == 0){
        		 txtMarca.setText("");
             	 txtModelo.setText("");
             	 txtProcessador.setText("");
             	 txtSO.setText("");
                 grpEstado.clearSelection();
                 txtMensagem.setText("");
        	 }
        
        	   
        } else if (botao == btnBuscar) {
        	//Não foi implementada conexão com BD ou arraylist, pois não foi solicitada na atividade.
        	
        	
        	
        } else if (botao == btnAdicionar) {
          //Validação do preechimento dos campos:  
            if ((txtMarca.getText() == null || txtMarca.getText().trim().isEmpty()) ||
            		  (txtSO.getText() == null || txtSO.getText().trim().isEmpty()) ||
            		  (txtModelo.getText() == null || txtModelo.getText().trim().isEmpty()) ||
            		  (txtProcessador.getText() == null || txtProcessador.getText().trim().isEmpty())) {
            		  JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
          //Inclusão do Cadastro do Computador:		
          } else {
            			 String mensagem = "";
            	            mensagem += "Marca: " + txtMarca.getText() + "\n";
            	            mensagem += "Modelo: " + txtModelo.getText() + "\n";
            	            mensagem += "Processador: " + txtProcessador.getText() + "\n";
            	            mensagem += "Sistema Operacional: " + txtSO.getText() + "\n";
            	            mensagem += "Estado: " + (rdbNovo.isSelected() ? "Novo" : (rdbUsado.isSelected() ? "Usado" : "")) + "\n";
            	            txtMensagem.setText(mensagem);
            		 }
        }
    }

    public static void main(String[] args) {
        CadastroComputadores janela = new CadastroComputadores();
        janela.setVisible(true);
    }
}