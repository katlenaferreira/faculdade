package Testes;

import org.openqa.selenium.WebDriver;

public class GeradorCPF extends PageObject{ 


public GeradorCPF(WebDriver driver) {
		super(driver);
	}

private static String calcDigVerif(String num) {    
		 
        Integer primeiroDigito; 
        Integer segundoDigito;    
        int soma = 0; 
        int peso = 10; 
 
        for (int i = 0; i < num.length(); i++)    
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;    
 
                if (soma % 11 == 0 | soma % 11 == 1)    
                    primeiroDigito = new Integer(0);    
                else   
                    primeiroDigito = new Integer(11 - (soma % 11));    
 
                soma = 0;    
                peso = 11; 
 
        for (int i = 0; i < num.length(); i++)    
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;    
 
        soma += primeiroDigito.intValue() * 2;    
        if (soma % 11 == 0 | soma % 11 == 1)    
            segundoDigito = new Integer(0);    
        else   
            segundoDigito = new Integer(11 - (soma % 11));    
 
        return primeiroDigito.toString() + segundoDigito.toString();    
    }    
	
	public String geraCPF() {   
		 
        String iniciais = "";    
        Integer numero;  
 
        for (int i = 0; i < 9; i++) {    
            numero = new Integer((int) (Math.random() * 10));    
            iniciais += numero.toString();    
        }    
        return iniciais + calcDigVerif(iniciais);    
    }    
	
	public static boolean validaCPF(String cpf) {    
        if (cpf.length() != 11)    
            return false;    
 
        String numDig = cpf.substring(0, 9);    
        return calcDigVerif(numDig).equals(cpf.substring(9, 11));    
        
    }   }