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
    funcionarios.add(new Funcionario("Roberto", 2000, "Atendente"));
    funcionarios.add(new Funcionario("Maria", 3000, "Cozinheiro"));
    funcionarios.add(new Funcionario("Vitor", 3001, "Cozinheiro"));
    funcionarios.add(new Funcionario("Danilo", 1002, "Garçom"));

    List<Mesa> mesas = new ArrayList<>();
    mesas.add(new Mesa(1, 4));
    mesas.add(new Mesa(2, 4));
    mesas.add(new Mesa(3, 4));
    mesas.add(new Mesa(4, 6));
    mesas.add(new Mesa(5, 10));

    while (true) {
      Scanner scan = new Scanner(System.in);
      int op;
      System.out.println("\n-------- MENU ---------");
      System.out.println("1 -- Consultar mesa");
      System.out.println("2 -- Mudar o Status da mesa");
      System.out.println("3 -- Mostrar cardapio");
      System.out.println("0 -- Sair");

      op = scan.nextInt();

      switch (op) {
        case 0 -> {
          return;
        }
        case 1 -> {
          System.out.println("Digite o numero da mesa que deseja consultar:");
          op = scan.nextInt();
          mesas.get(op - 1).consultarStatus();
        }
        case 2 -> {
          System.out.println("Digite o numero da mesa que deseja mudar o status:");
          op = scan.nextInt();
          mesas.get(op - 1).mudarStatus();
        }
        case 3 -> {
          System.out.println("\n--- Cardapio ---");
          for(Cardapio item : cardapio){
            System.out.println("- " + item.getNomePratoBebida() + ": R$ " + item.getPreco());
          }
        }
      }
    }
  }
}
