import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Mesa mesa;
    private Funcionario garcom;
    private List<Cardapio> itens;
    private double valorTotal;

    // Construtor
    public Pedido(Mesa mesa, Funcionario garcom) {
        this.mesa = mesa;
        this.garcom = garcom;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarItem(Cardapio item) {
        if (item.getEstoque() > 0) {
            itens.add(item);
            valorTotal += item.getPreco();
            item.setEstoque(item.getEstoque() - 1);  // Reduzir o estoque do item adicionado
            System.out.println("Item " + item.getNomePratoBebida() + " adicionado ao pedido.");
        } else {
            System.out.println("O item " + item.getNomePratoBebida() + " está esgotado.");
        }
    }

    public void mostrarValorTotal() {
        System.out.println("Valor total do pedido: R$ " + valorTotal);
    }

    public void detalhesPedido() {
        System.out.println("Mesa: " + mesa.getNumMesa());
        System.out.println("Garçom: " + garcom.getNome());
        System.out.println("Itens do pedido:");
        for (Cardapio item : itens) {
            System.out.println("- " + item.getNomePratoBebida() + ": R$ " + item.getPreco());
        }
        mostrarValorTotal();
    }
}
