package je_exercises.produto;

class Produto{

    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String nome, Double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public void aplicarDesconto(double desconto){

        if (preco>1000){

            desconto = (desconto / 100) * preco;
            preco -= desconto;

        }
        else{
            System.out.println("Só será aplicado desconto em produtos com preço maior que R$1000,00");
        }

    }

    public void adicionarEstoque(int qtd){

        quantidade += qtd;

    }

    public void removerEstoque(int qtd){
        quantidade -= qtd;
    }

    public int getQuantiadde(){
        return quantidade;
    }

    public double getPreco(){

        return preco;
    }

}
