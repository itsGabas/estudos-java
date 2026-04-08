package je_exercises.conta;

class ContaCorrente extends Conta {

    public ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor){

        double taxa = 2.0;

        if ((valor + taxa) <= saldo){

            saldo -= (valor + taxa);

        }
        else{
            System.out.println("Saldo insuficiente (Taxa Inclusa)");
        }

    }

}
