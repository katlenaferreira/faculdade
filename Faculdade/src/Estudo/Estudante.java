package Estudo;

public class Estudante extends Pessoa implements AmbienteEAD {

    int ra;
    String disciplina;
    float nota1,nota2;

    Estudante(int raaux, String disaux, float n1,float n2,String nome)
    {
        
        ra= raaux;
        disciplina=disaux;
        nota1=n1;
        nota2=n2;        
    }
    
    public void calcularMedia()
    {
        System.out.println("Média:"+(nota1+nota2)/2);
    }

    @Override
    protected void imprimir() {
        System.out.println("Aluno");
        System.out.println("RA:" + ra + "\nDisciplina:"+ disciplina+
         "\nNota1:"+nota1+"\nNota2:"+nota2);
        calcularMedia();
    }

    public void entrarDisciplina() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void listarDisciplinas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void postarMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void postarDuvidas() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Postando dúvidas");
    }

    @Override
    public void responderDuvidas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
