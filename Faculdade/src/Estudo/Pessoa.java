/*** Os vetores ou array são objetos que possuem um tipo de dado ou Classe, um
identificador (nome), e várias posições unidimensional (eixo y), acessados
via índice.
Ex.
String nomes[] = new String[3];
nomes[0]=“Ana Paula”;
nomes[1]=“Rolfi”;
nomes[2]=“Josué”;
No código acima temos um vetor de String com 3 posições incluindo o 0, com o
identificador “nomes”.
A palavra new demonstra que será criado um Array ou Vetor na memória
com a quantidade de “linhas” ou posições dentro do colchete [ ] .
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