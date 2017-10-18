package Estudo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TelaCadastroProf {
    //VARIÁVEIS GLOBAIS
    JFrame janela;
    JTextField campoNome,campoSobreNome,campoEndereco,
    campoCep,campoNumero,campoBairro,campoTelefone,
    campoEmail,campoCelular;    
    JButton botao,botao2;
    JComboBox<String> campoEstados;
    

    public static void main(String args[])
    {
    	TelaCadastroProf des=new TelaCadastroProf();
         des.desafio();
    }
     
    public void desafio()
    {
    
    janela = new JFrame("Cadastro de Clientes"); 
    
    janela.setSize(500, 600); 
    janela.setLocation(200, 200); 
    janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
    GridLayout grid = new GridLayout(11,2); 
    
    janela.setLayout(grid); 
    
    JLabel textoNome = new JLabel("Nome: ");     
    janela.add(textoNome); 
    
        campoNome = new JTextField(); 
        campoNome.setSize(100, 10); 
        janela.add(campoNome); 

        JLabel textoSobreNome = new JLabel("Sobrenome: ");     
        janela.add(textoSobreNome); 

        campoSobreNome = new JTextField(); 
        campoSobreNome.setSize(100, 10); 
        janela.add(campoSobreNome); 


        JLabel textoEndereco = new JLabel("Endereco: ");     
        janela.add(textoEndereco); 

        campoEndereco = new JTextField(); 
        campoEndereco.setSize(100, 10); 
        janela.add(campoEndereco); 

        JLabel textoCep = new JLabel("Cep: ");     
        janela.add(textoCep); 

        campoCep = new JTextField(); 
        campoCep.setSize(100, 10); 
        janela.add(campoCep); 


        JLabel textoNumero = new JLabel("Numero: ");     
        janela.add(textoNumero); 
    
    campoNumero = new JTextField(); 
    campoNumero.setSize(100, 10); 
    janela.add(campoNumero); 
    
    
    JLabel textoBairro = new JLabel("Bairro: ");     
    janela.add(textoBairro); 
    
    campoBairro = new JTextField();      
    campoBairro.setSize(100, 10); 
    janela.add(campoBairro); 
    
   
    JLabel textoTelefone = new JLabel("Telefone: ");     
    janela.add(textoTelefone); 
    
    campoTelefone = new JTextField(); 
    campoTelefone.setSize(100, 10); 
    janela.add(campoTelefone); 
    
    JLabel textoEmail = new JLabel("Email: ");     
    janela.add(textoEmail); 
    
    campoEmail = new JTextField(); 
    campoEmail.setSize(100, 10); 
    janela.add(campoEmail); 
    
   
    JLabel textoCelular = new JLabel("Celular: ");     
    janela.add(textoCelular); 
    
    campoCelular = new JTextField(); 
    campoCelular.setSize(100, 10); 
    janela.add(campoCelular); 
    
    
    JLabel textoEstado = new JLabel("Estado: "); 
    janela.add(textoEstado); 
    
    campoEstados = new JComboBox<String>(); 
    campoEstados.addItem("");
    campoEstados.addItem("AC");
    campoEstados.addItem("AL");
    campoEstados.addItem("AP");
    campoEstados.addItem("AM");
    campoEstados.addItem("BA");
    campoEstados.addItem("CE");
    campoEstados.addItem("DF");
    campoEstados.addItem("ES");
    campoEstados.addItem("GO");
    campoEstados.addItem("MA");
    campoEstados.addItem("MT");
    campoEstados.addItem("MS");
    campoEstados.addItem("MG");
    campoEstados.addItem("PA");
    campoEstados.addItem("PB");
    campoEstados.addItem("PR");
    campoEstados.addItem("PE");
    campoEstados.addItem("PI");
    campoEstados.addItem("RJ");
    campoEstados.addItem("RN");
    campoEstados.addItem("RS");
    campoEstados.addItem("RO");
    campoEstados.addItem("RR");
    campoEstados.addItem("SC");
    campoEstados.addItem("SP");
    campoEstados.addItem("SE");
    campoEstados.addItem("TO");
    janela.add(campoEstados); 
   
        
        JButton botao = new JButton("Enviar"); 
        janela.add(botao); 
    
        JButton botao2 = new JButton("Limpar"); 
        janela.add(botao2); 
    
        janela.setVisible(true);
        
        
        botao.addMouseListener(new Evento());
        
    }
    
        
    class Evento implements MouseListener {
    
        @Override
        public void mouseClicked(MouseEvent e) {
                verificar();
        }
        
        @Override
        public void mousePressed(MouseEvent e) {
     
        }

        @Override
        public void mouseReleased(MouseEvent e) {
     
        }

        @Override
        public void mouseEntered(MouseEvent e) {
     
        }

        @Override
        public void mouseExited(MouseEvent e) {
     
        }
        
        
        public boolean verificar()
        {
            //Verificar em Branco
            if(emBranco(campoNome.getText(), "Nome")==true)                
            {    return false;    }
            
            if(emBranco(campoSobreNome.getText(), "SobreNome")==true)                
            {    return false;    }
            
            if(emBranco(campoEndereco.getText(), "Endereco")==true)                
            {    return false;    }
            
            if(emBranco(campoCep.getText(), "Cep")==true)                
            {    return false;    }
            
            if(emBranco(campoNumero.getText(), "Numero")==true)                
            {    return false;    }
             if(emBranco(campoBairro.getText(), "Bairro")==true)                
            {    return false;    }
             
            if(emBranco(campoTelefone.getText(), "Telefone")==true)                
            {    return false;    }
             
            if(emBranco(campoEmail.getText(), "Email")==true)                
            {    return false;    }
             
            if(emBranco(campoCelular.getText(), "Celular")==true)                
            {    return false;    }
             
            if(emBranco(campoTelefone.getText(), "Telefone")==true)                
            {    return false;    }
                           
                if(campoEstados.getSelectedIndex()==0)
                {    JOptionPane.showMessageDialog(null,"Campo Estados Não Selecionado");
                return false;                 
                }
            
               //o campo email deve ter ‘@’,  
               // email@teste.com.br
               //  5
               // email.teste.com.br
               // -1
                if(campoEmail.getText().indexOf("@")< 0 )
                {   JOptionPane.showMessageDialog(null,"Campo Email preenchido de forma incorreta");
                    return false;                 
                }
    
               //o campo cep e número deve ter somente números
               if( somenteNumero(campoCep.getText(),"Cep")==false  )
                {   
                    return false;                 
                }
               
               if( somenteNumero(campoNumero.getText(),"Numero")==false  )
                { 
                    return false;                 
                }
               
                //o campo celular e telefone devem conter ‘–’ e ‘(‘ ‘)’. 
                if( !campoCelular.getText().contains("-") || 
                    campoCelular.getText().indexOf("(")<0 ||
                     campoCelular.getText().indexOf(")")<0)
                {   JOptionPane.showMessageDialog(null,"Campo Celular preenchido de forma incorreta");
                    return false;                 
                }

                
            JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso");                            
            return true;
        }
        
        public boolean emBranco(String aux, String campo)
        {    
            if(aux.isEmpty())
            { JOptionPane.showMessageDialog(null,"Campo "+campo+" em Branco");
             return true; 
            }
            return false;
        }
        
        public boolean somenteNumero(String aux,String campo)
        {
            String nao[]={"a","b","c","d","e","f","g","h",
            "i","j","k","l","m","n","o","p","q","r","s",
            "t","u","v","x","z","w","y","@"};
           
            aux=aux.toLowerCase();
            
            for(int i=0; i< nao.length; i++)
               if(aux.contains(nao[i])) 
               {
                   JOptionPane.showMessageDialog(null,"Campo "+campo+" deve conter somente números"); 
                   return false;
               } 
            
           return true;         
        }
    }
}
    
