package Estudo;

public class Exemplo2A {

	 
	  // LAN�ANDO ERRO SEM TRY-CATH 
	   // sem tratamento do erro
	    
	    public static void main(String args[])
	    {
	        
	        Exemplo2A conta=new Exemplo2A();
	        conta.sacar(15);
	        System.out.println("teste");
	        
	    }
	    
	    
	    float saldo=10.0f;
	    
	    public void sacar(float quantia) {
	    float dispon�vel = saldo;
	    if(quantia < dispon�vel) {
	        saldo = saldo - quantia;
	    } else {
	    throw new IllegalArgumentException("Saldo Insuficiente");
	    }

	 }
	    
}
