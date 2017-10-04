package Estudo;

public class Calculadora {
	public Calculadora(){}
	public void calcule(double a, double b, String operacao)
	{
		if( operacao.equals("+"))
			System.out.println(soma(a,b));
			if( operacao.equals("-"))
			System.out.println(subtracao(a,b));
			
		if( operacao.equals("*"))
				System.out.println(multiplicacao(a,b));
				if( operacao.equals("/"))
				System.out.println(divisao(a,b));
	}
	
	public double soma(double a, double b)
	{ return a+b; }
	public double subtracao(double a, double b)
	{ return a-b; }
	public double multiplicacao(double a,
	double b)
	{ return a*b; }
	public double divisao(double a, double b)
	{return a/b; } 
}