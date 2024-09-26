public class Restaurante {

  public static void main(String[] args) {
    
  List<Cardapio> cardapio = new ArrayList<>();

        cardapio.add(new Cardapio("Jen's Cheese", 24.00));
        cardapio.add(new Cardapio("Jen's Salada", 26.00));
        cardapio.add(new Cardapio("Jen's Cheddar", 26.00));
        cardapio.add(new Cardapio("Jen's Bacon", 28.00));
        cardapio.add(new Cardapio("Jen's Crispy", 29.00));
        cardapio.add(new Cardapio("Jen's Mexican", 28.00));
        cardapio.add(new Cardapio("Jen's Clássico", 29.00));
        cardapio.add(new Cardapio("Jen's Sweet Pepper", 29.00));
        cardapio.add(new Cardapio("Jen's Cheddar 2.0", 31.00));
        cardapio.add(new Cardapio("Jen's Tomato Dry", 29.00));
        cardapio.add(new Cardapio("Big Jen's", 29.90));
        cardapio.add(new Cardapio("Bacon Jelly", 37.90));
        cardapio.add(new Cardapio("Jen's Costela Alhoó", 37.90));
        cardapio.add(new Cardapio("Jen's Costela BBQ", 38.80));
        cardapio.add(new Cardapio("Duplo BCC", 39.90));
        
        for (Cardapio item : cardapio) {
            System.out.println(item);
        }
    }

  
}
