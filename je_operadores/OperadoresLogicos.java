package je_operadores;

public class OperadoresLogicos {
    public static void main(String[] args){

        boolean resultado;
        boolean resultado2;

        if(10 == 10 && 10 < 20){
            resultado = true;

        }
        else{
            resultado = false;
        }

        System.out.println(resultado);

        if (10 == 10 || 10 > 20){
            resultado2 = true;
        }
        else{
            resultado2 = false;
        }

        System.out.println(resultado2);

    }
}
