package Estudo;

public class Dados {
	   private String titulo;
	   private String ano;
	   private String codigo;
	   private String categoria;
	   private String preco;

	   
	   
	   public Dados(){
	   }
	   public String getTitulo(){
	   return titulo;
	   }
	   public void setTitulo(String title){
		   titulo = title;
	   }
	   public String getCodigo(){
	   return codigo;
	   }
	   public void setCodigo(String cod ){
		   codigo = cod;
	   }
	   public String getCategoria(){
	   return categoria;
	   }
	   public void setCategoria(String category){
		   categoria = category;
	   }
	   public String getPreco(){
	   return preco;
	   }
	   public void setPreco(String price){
		   preco = price;
	   }
	   
	   public String getAno(){
	   return ano;
	   }
	   public void setAno(String year){
		   ano = year;
	   }
}