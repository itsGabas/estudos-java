package je_repeticao;

import java.util.Random;

public class DoWhile {

    private static int numeroTentativas = 0;
    public static void main(String[] args) {

        System.out.println("Discando...");
        do{

            System.out.println("'TRIM TRIM' Telefone tocando...");
        }
        while(tocando());
        if(numeroTentativas < 5){
            System.out.println("Alô!!!?");
        }
        else{

            System.out.println("Caiu... Tente novamente.");

        }
    }

    private static boolean tocando(){
        numeroTentativas++;
        boolean atendeu = new Random().nextInt(5) == 1;
        if (numeroTentativas == 5)
            return false;
        else
            return !atendeu;

    }
}
