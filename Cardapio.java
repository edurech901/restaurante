public class Cardapio {
  String nome_prato_bebida;
  int codigo;
  Double preco;
  boolean disponibilidade;

  public Cardapio(String nome_prato_bebida, int codigo, Double preco){
    this.nome_prato_bebida = nome_prato_bebida;
    this.codigo = codigo;
    this.preco = preco;
    disponibilidade = false;
  }

  public void consultar_disponibilidade(){
    if(disponibilidade == true) System.out.println("O prato " + this.nome_prato_bebida + " esta para ser vendido");
    else System.out.println("O prato " + this.nome_prato_bebida + " nao esta disponivel para ser vendido");
  }

  public void mudar_disponilibidade(){
    if(disponibilidade == false) {
      disponibilidade = true;
      System.out.println("O prato " + this.nome_prato_bebida + " ficou disponivel para ser vendido");
    }
    else if(disponibilidade == true) {
      disponibilidade = false;
      System.out.println("O prato " + this.nome_prato_bebida + " nao esta mais disponivel para ser vendido");
    }
  }
  
}
