package Estudo;

public class Professor extends Pessoa implements AmbienteEAD {
    String titulo;
    float salarioBruto;

    Professor(String titaux,float sb, String nomeaux){
        titulo= titaux;
        salarioBruto = sb;
        nome = nomeaux;
    }
    
public void imprimir()
{
    System.out.println("Professor");
    System.out.println("Nome:" + nome + "\nTitulo"+titulo
            +"\nSalario Bruto:"+salarioBruto);
    calcularSalario(5);
}


public void  calcularSalario(double percimposto)
{
    System.out.println("Salário:" + (salarioBruto-percimposto));
}

   

    @Override
    public void login() {        
    }

    @Override
    public void logout() {        
    }

    @Override
    public void listarDisciplinas() {        
    }

    @Override
    public void postarMaterial() {        
    }

    @Override
    public void postarDuvidas() { 
        System.out.println("Postar Dúvidas : Não implementa");
    }

    @Override
    public void responderDuvidas() {        
    }

    @Override
    public void entrarDisciplina() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
