public class Mesa {
    private int num_mesa;
    private int capacidade;
    private boolean status;

    public Mesa(int num_mesa, int capacidade) {
        this.num_mesa = num_mesa;
        this.capacidade = capacidade;
        this.status = false;
    }

    public int getNumMesa() {
        return num_mesa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNum_mesa(int num_mesa) {
        this.num_mesa = num_mesa;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void consultarStatus() {
        if (status == false) {
            System.out.println("A mesa " + this.num_mesa + " está disponível");
        } else {
            System.out.println("A mesa " + this.num_mesa + " não está disponível");
        }
    }

    public void mudarStatus() {
        if (status == false) {
            status = true;
            System.out.println("A mesa " + this.num_mesa + " não está mais disponível");
        } else {
            status = false;
            System.out.println("A mesa " + this.num_mesa + " agora está disponível");
        }
    }

}