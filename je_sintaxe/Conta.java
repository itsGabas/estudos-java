package je_sintaxe;

public class Conta {
    // Variavel da classe (global)
    double saldo = 100.0;
    double novoSaldo;

    // Criando método sacar
    public void sacar (Double valor){
        // variavel do método (só funciona dentro do método)
        novoSaldo = saldo - valor;

    }

    public void imprimirSaldo(){
        System.out.println("Saldo antigo: " + saldo);
        System.out.println("Saldo atual: " + novoSaldo);
    }
}
