package je_exercises.conta;

class Conta{

    protected double saldo;

    public Conta(double saldoInicial){

        this.saldo = saldoInicial;

    }

    public void depositar(double valor){

        saldo += valor;

    }

    public void sacar(double valor){

        if (valor <= saldo){
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }

    }

    public double getSaldo(){

        return saldo;
    }

}