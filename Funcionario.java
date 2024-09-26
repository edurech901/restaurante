public class Funcionario {
  String nome;
  int id;
  String cargo;
  int quant_pedidos;
  Double valor_vendido;

  public Funcionario(String nome, int id, String cargo){
    this.nome = nome;
    this.id = id;
    this.cargo = cargo;
    this.quant_pedidos = 0;
    this.valor_vendido = 0.0;
  }
}