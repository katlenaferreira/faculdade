package Estudo;



public class PratProgUNI4 {

    public static void main(String[] args) {
       Professor p1=new Professor("Especialista",850,"Jo�o");
       Estudante est=new Estudante(1234, "Praticas de Programa��o", 10,10,"Pedro");
       
       Pessoa p2= est;
       p2.imprimir();
       
       p1.imprimir();
       est.imprimir();
       
       
       p1.postarDuvidas();
       est.postarDuvidas();
    }
}
