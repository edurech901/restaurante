public class Cardapio {
  String nome_prato_bebida;
  int codigo;
  Double preco;
  int estoque;

  public Cardapio(String nome_prato_bebida, int codigo, Double preco){
    this.nome_prato_bebida = nome_prato_bebida;
    this.codigo = codigo;
    this.preco = preco;
    this.estoque = 10;
  }

  public void consultar_estoque(){
    if(estoque == 0) System.out.println("O prato " + this.nome_prato_bebida + " esta esgotado.");
    else System.out.println("Ha "+ this.estoque + " do prato " + this.nome_prato_bebida + " no estoque.");
  }

  public int getCodigo() {
      return codigo;
  }
  public String getNomePratoBebida(){
    return nome_prato_bebida;
  }
  public Double getPreco(){
    return preco;
  }
  public int getEstoque(){
    return estoque;
  }
  public void setNomePratoBebida(String nome_prato_bebida){
    this.nome_prato_bebida = nome_prato_bebida;
  }
  public void setCodigo(int codigo){
    this.codigo = codigo;
  }
  public void setPreco(Double preco){
    this.preco = preco;
  }
  public void setEstoque(int estoque){
    this.estoque = estoque;
  }

}
