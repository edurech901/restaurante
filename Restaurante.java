import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurante {

  public static void main(String[] args) {

    List<Cardapio> cardapio = new ArrayList<>();
    cardapio.add(new Cardapio("Jen's Cheese", 1, 24.00));
    cardapio.add(new Cardapio("Jen's Salada", 2, 26.00));
    cardapio.add(new Cardapio("Jen's Cheddar", 3, 26.00));
    cardapio.add(new Cardapio("Jen's Bacon", 4, 28.00));
    cardapio.add(new Cardapio("Jen's Crispy", 5, 29.00));
    cardapio.add(new Cardapio("Jen's Mexican", 6, 28.00));
    cardapio.add(new Cardapio("Jen's Clássico", 7, 29.00));
    cardapio.add(new Cardapio("Jen's Sweet Pepper", 8, 29.00));
    cardapio.add(new Cardapio("Jen's Cheddar 2.0", 9, 31.00));
    cardapio.add(new Cardapio("Jen's Tomato Dry", 10, 29.00));
    cardapio.add(new Cardapio("Big Jen's", 11, 29.90));
    cardapio.add(new Cardapio("Bacon Jelly", 12, 37.90));
    cardapio.add(new Cardapio("Jen's Costela Alhoó", 13, 37.90));
    cardapio.add(new Cardapio("Jen's Costela BBQ", 14, 38.80));
    cardapio.add(new Cardapio("Duplo BCC", 15, 39.90));

    List<Funcionario> funcionarios = new ArrayList<>();
    funcionarios.add(new Funcionario("Cleiton", 1000, "Garçom"));
    funcionarios.add(new Funcionario("Robson", 1001, "Garçom"));
    funcionarios.add(new Funcionario("Roberto", 1002, "Atendente"));
    funcionarios.add(new Funcionario("Maria", 1003, "Cozinheiro"));
    funcionarios.add(new Funcionario("Vitor", 1004, "Cozinheiro"));
    funcionarios.add(new Funcionario("Danilo", 1005, "Garçom"));

    List<Mesa> mesas = new ArrayList<>();
    mesas.add(new Mesa(1, 4));
    mesas.add(new Mesa(2, 4));
    mesas.add(new Mesa(3, 4));
    mesas.add(new Mesa(4, 6));
    mesas.add(new Mesa(5, 10));

    List<Pedido> pedidos = new ArrayList<>();

    while (true) {
      Scanner scan = new Scanner(System.in);
      int op;
      System.out.println("\n-------- MENU ---------");
      System.out.println("1  -- Cadastrar funcionario");
      System.out.println("2  -- Lista de funcionarios");
      System.out.println("3  -- Cadastrar mesa");
      System.out.println("4  -- Lista de mesas mesa");
      System.out.println("5  -- Cadastrar prato no cardapio");
      System.out.println("6  -- Mostrar cardapio");
      System.out.println("7  -- Consultar mesa");
      System.out.println("8  -- Mudar o Status da mesa");
      System.out.println("9  -- Anotar pedido");
      System.out.println("10 -- Lista de pedidos");
      System.out.println("0  -- Sair");

      op = scan.nextInt();

      switch (op) {
        case 0 -> {
          return;
        }
        case 1 -> {
          String nome, cargo;
          System.out.println("Digite o nome do funcionario");
          nome = scan.next();
          System.out.println("Digite o cargo do funcionario");
          cargo = scan.next();
          funcionarios.add(new Funcionario(nome, 1000 + funcionarios.size(), cargo));
        }
        case 2 -> {
          for (Funcionario a : funcionarios) {
            System.out.println(a.getId() + " - " + a.getNome() + " - " + a.getCargo());
          }
        }
        case 3 -> {
          System.out.println("Qual a capacidade da mesa");
          op = scan.nextInt();
          mesas.add(new Mesa(mesas.size(), op));
        }
        case 4 -> {
          for (Mesa a : mesas) {
            System.out.println("Mesa " + a.getNumMesa() + " com capacidade para " + a.getCapacidade()
                + (a.status == false ? " esta disponivel" : " nao esta disponivel"));
          }
        }
        case 5 -> {
          String nome;
          double preco;
          System.out.println("Digite o nome do prato ou bebida");
          nome = scan.next();
          System.out.println("Digite o preco");
          preco = scan.nextDouble();
          cardapio.add(new Cardapio(nome, cardapio.size(), preco));
        }
        case 6 -> {
          System.out.println("\n--- Cardapio ---");
          for (Cardapio item : cardapio) {
            System.out.println(item.getCodigo() + " - " + item.getNomePratoBebida() + ": R$ " + item.getPreco());
          }
        }
        case 7 -> {
          System.out.println("Digite o numero da mesa que deseja consultar:");
          op = scan.nextInt();
          mesas.get(op - 1).consultarStatus();
        }
        case 8 -> {
          System.out.println("Digite o numero da mesa que deseja mudar o status:");
          op = scan.nextInt();
          mesas.get(op - 1).mudarStatus();
        }

        case 9 -> {
          Mesa m_temp = null;
          Funcionario f_temp = null;
          int id, num_mesa;
          System.out.println("Digite o ID de funcionário do pedido: ");
          id = scan.nextInt();
          if (id > 999 + funcionarios.size() || id < 1000) {
            System.out.println("Codigo invalido");
            break;
          }
          for (Funcionario a : funcionarios) {
            if (a.getId() == id)
              f_temp = a;
          }
          System.out.println("Digite o numero da mesa do pedido: ");
          num_mesa = scan.nextInt();
          if (num_mesa > mesas.size() - 1 || id <= 0) {
            System.out.println("Codigo invalido");
            break;
          }
          for (Mesa a : mesas) {
            if (a.getNumMesa() == num_mesa)
              m_temp = a;
          }
          Pedido p_temp = new Pedido(m_temp, f_temp);
          while (true) {
            int codigo;
            Cardapio item = null;
            System.out.println("Digite o codigo do item pedido");
            System.out.println("0 -- Sair");
            codigo = scan.nextInt();
            if (codigo == 0) {
              pedidos.add(p_temp);
              break;
            }
            for (Cardapio a : cardapio) {
              if (a.getCodigo() == codigo)
                item = a;
            }
            p_temp.adicionarItem(item);
          }
        }
        case 10 -> {
          for (Pedido a : pedidos) {
            System.out.println("--------------------------");
            a.detalhesPedido();
            System.out.println("--------------------------");
          }
        }
      }
    }
  }
}
