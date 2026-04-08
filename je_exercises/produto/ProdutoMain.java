package je_exercises.produto;

public class ProdutoMain {
    public static void main(String[] args){

        Produto produto = new Produto("Computador", 10000.0, 10);

        produto.aplicarDesconto(10);
        System.out.println("Preço do produto com desconto: " + produto.getPreco());

        produto.adicionarEstoque(1);
        System.out.println("Quantidade no estoque após Adicionar: " + produto.getQuantiadde());

        produto.removerEstoque(3);
        System.out.println("Quantidade no estoque após Vender: " + produto.getQuantiadde());


    }
}
