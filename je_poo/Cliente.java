package je_poo;

public class Cliente {

    String nome;
    Double limiteCredito = 5.0;

    public void solicitarLimiteCredito(double valorSolicitado){
        limiteCredito = valorSolicitado;

    }

    public void comprar(Double valorProduto){
        limiteCredito -= valorProduto;

    }

    public Cliente (String nome){
        this.nome = nome;
    }
}
