package Estudo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Login extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfLogin;
	private JTextField tfModelo;
    private JLabel lbSenha;
    private JLabel lbLogin;
    private JLabel lbModelo;
    private JButton btLogar;
    private JButton btLimpar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static GUI_Login frame;

    public GUI_Login() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Login no Sistema");
        setBounds(0,0,350,350);
        setLayout(null);
        tfLogin = new JTextField(5);
        tfModelo = new JTextField(5);
        
        pfSenha = new JPasswordField(5);
        lbSenha = new JLabel("Senha:");
        lbLogin = new JLabel("Login:");
        lbModelo = new JLabel("Modelo:");
        btLimpar = new JButton("Limpar");
        btLogar = new JButton("Logar");
        btCancelar = new JButton("Cancelar");
        
        tfLogin.setBounds(100, 30, 120, 25);
        lbLogin.setBounds(30, 30, 80, 25);
        lbSenha.setBounds(30, 75, 80, 25);
        pfSenha.setBounds(100, 75, 120, 25);
        btLogar.setBounds(20, 120, 100, 25);
        btLimpar.setBounds(125, 120, 100, 25);
      
        tfModelo.setBounds(30, 30, 120, 25);
        lbModelo.setBounds(30, 30, 80, 25);
        
        add(tfModelo);
        add(tfLogin);
        add(lbSenha);
        add(lbLogin);
        add(lbModelo);
        add(btLogar);
        add(btLimpar);
        add(pfSenha);
        //obs:setBounds(int x,int y,int width,int height)
    }

    private void definirEventos() {
        btLogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String senha = String.valueOf(pfSenha.getPassword()); // Conversão do arry de caractere em string
                if(tfLogin.getText().equals("password") && senha.equals("password")){
                    frame.setVisible(false);   
                    //Classe.metodo();
                }
                else{
                   JOptionPane.showMessageDialog(null,"Login ou Senha incorretas!");
                }
            }
        });

        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new GUI_Login();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2,
                        (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);
            }
        });
    }
}

