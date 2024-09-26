import java.util.ArrayList;
import java.util.List;

public class Restaurante {

  public static List<Cardapio> cardapio(){
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
    return cardapio;
  }

  public static List<Mesa> mesas(){
    List<Mesa> mesas = new ArrayList<>();
    mesas.add(new Mesa(1, 4));
    mesas.add(new Mesa(2, 4));
    mesas.add(new Mesa(3, 4));
    mesas.add(new Mesa(4, 6));
    mesas.add(new Mesa(5, 10));
    return mesas;
  }

  public static void main(String[] args) {
    
    
    
    }
}
