public class Mesa {
  private int num_mesa;
  private int capacidade;
  private boolean status;

  public Mesa(int num_mesa, int capacidade) {
      this.num_mesa = num_mesa;
      this.capacidade = capacidade;
      this.status = false;
  }

  // Getters e Setters
  public int getNumMesa() {
      return num_mesa;
  }

  public int getCapacidade() {
      return capacidade;
  }

  public boolean getStatus() {
      return status;
  }

  // Métodos para consultar e mudar o status da mesa
  public void consultarStatus() {
      if (status) {
          System.out.println("A mesa " + this.num_mesa + " está disponível");
      } else {
          System.out.println("A mesa " + this.num_mesa + " não está disponível");
      }
  }

  public void mudarStatus() {
      status = !status; // Alterna o status
      System.out.println("A mesa " + this.num_mesa + (status ? " ficou disponível" : " não está mais disponível"));
  }
}
