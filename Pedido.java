import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Mesa mesa;
    private Funcionario garcom;
    private List<Cardapio> itens;
    private double valorTotal;

    public Pedido(Mesa mesa, Funcionario garcom) {
        this.mesa = mesa;
        this.garcom = garcom;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarItem(Cardapio item) {
        if (item.estoque > 0) {
            itens.add(item);
            valorTotal += item.preco;
            item.estoque--; 
            System.out.println("Item " + item.nome_prato_bebida + " adicionado ao pedido.");
        } else {
            System.out.println("O item " + item.nome_prato_bebida + " está esgotado.");
        }
    }

    public void mostrarValorTotal() {
        System.out.println("Valor total do pedido: R$ " + valorTotal);
    }

    public void detalhesPedido() {
        System.out.println("Mesa: " + mesa.num_mesa);
        System.out.println("Garçom: " + garcom.nome);
        System.out.println("Itens do pedido:");
        for (Cardapio item : itens) {
            System.out.println("- " + item.nome_prato_bebida + ": R$ " + item.preco);
        }
        mostrarValorTotal();
    }
}