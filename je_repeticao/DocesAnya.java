package je_repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class DocesAnya {
    public static void main(String[] args) {

        double mesada = 150.0;

        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce de valor: " + valorDoce + " adicionado no Carrinho.");
            mesada -= valorDoce;
        }
        System.out.println("Mesada final: " + mesada);
        System.out.println("Anya gastou toda sua mesada em doces");
    }

        private static double valorAleatorio () {
            return ThreadLocalRandom.current().nextDouble(4, 22);
        }


}
