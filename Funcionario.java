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

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getQuantPedidos() {
        return quant_pedidos;
    }
    public void setQuantPedidos(int quant_pedidos) {
        this.quant_pedidos = quant_pedidos;
    }
    public Double getValorVendido() {
        return valor_vendido;
    }
    public void setValorVendido(Double valor_vendido) {
        this.valor_vendido = valor_vendido;
    }

  
  
}