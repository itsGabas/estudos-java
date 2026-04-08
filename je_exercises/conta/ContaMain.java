package je_exercises.conta;

public class ContaMain {
    public static void main(String[] args){

        Conta conta = new Conta(2000);

        conta.depositar(200);
        System.out.println("Saldo Conta após Depósito: " + conta.getSaldo());

        conta.sacar(2200);
        System.out.println("Saldo Conta após Saque: " + conta.getSaldo());

        ContaCorrente cc = new ContaCorrente(3000);

        cc.depositar(300);
        System.out.println("Saldo Conta Corrente após Depósito: " + cc.getSaldo());

        cc.sacar(300);
        System.out.println("Saldo Conta Corrente após Saque (Com taxa): " + cc.getSaldo());

    }
}
