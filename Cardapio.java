public class Cardapio {
  String nome_prato_bebida;
  int codigo;
  Double preco;
  int estoque;

  public Cardapio(String nome_prato_bebida, int codigo, Double preco){
    this.nome_prato_bebida = nome_prato_bebida;
    this.codigo = codigo;
    this.preco = preco;
    this.estoque = 0;
  }

  public void consultar_estoque(){
    if(estoque == 0) System.out.println("O prato " + this.nome_prato_bebida + " esta esgotado.");
    else System.out.println("Ha "+ this.estoque + " do prato " + this.nome_prato_bebida + " no estoque.");
  }


  
}
