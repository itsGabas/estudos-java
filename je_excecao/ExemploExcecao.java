package je_excecao;

import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            Double valor = Double.valueOf("a1.75");
            System.out.println(valor);
        }
        catch (NumberFormatException e){
            System.err.println("Número Invalido");
        }

    }

}
