package je_exercises.verificador;

class VerificadorNumero {

    private int numero;

    public VerificadorNumero(int numero){

        this.numero = numero;

    }

    public String parImpar(){

        if(numero % 2 == 0){
            return "Par";
        }
        return "Impar";

    }

    public boolean positivoNegativo(){

        if(numero > 0){
            return true;
        }
        return false;

    }

}
