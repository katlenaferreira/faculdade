/*** Os vetores ou array s�o objetos que possuem um tipo de dado ou Classe, um
identificador (nome), e v�rias posi��es unidimensional (eixo y), acessados
via �ndice.
Ex.
String nomes[] = new String[3];
nomes[0]=�Ana Paula�;
nomes[1]=�Rolfi�;
nomes[2]=�Josu�;
No c�digo acima temos um vetor de String com 3 posi��es incluindo o 0, com o
identificador �nomes�.
A palavra new demonstra que ser� criado um Array ou Vetor na mem�ria
com a quantidade de �linhas� ou posi��es dentro do colchete [ ] .
**/


package Estudo;

import java.util.ArrayList;

public class Pessoa {
	private ArrayList<Contatos>
	Contatos =new ArrayList<Contatos>();
	
	public void addContatos(String email){
	Contatos c=new Contatos();
	c.setEmail(email);
	Contatos.add(c);
	
}
	public void mostrarContatos(){
	for(Contatos c: Contatos)
	System.out.println(c.getEmail());

	}


}