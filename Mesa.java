public class Mesa {
  int num_mesa;
  int capacidade;
  boolean status;
  
  public Mesa(int num_mesa, int capacidade){
    this.num_mesa = num_mesa;
    this.capacidade = capacidade;
    this.status = false;
  }

  public void consultar_status(){
    if(status == true) System.out.println("A mesa " + this.num_mesa + " esta disponivel");
    else System.out.println("O prato " + this.num_mesa + " nao esta disponivel");
  }

  public void mudar_status(){
    if(status == false) {
      status = true;
      System.out.println("A mesa " + this.num_mesa + " ficou disponivel");
    }
    else if(status == true) {
      status = false;
      System.out.println("A mesa " + this.num_mesa + " nao esta mais disponivel");
    }
  }

}
