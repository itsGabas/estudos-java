package je_repeticao;

import java.util.Random;

public class CarneirinhosWhile {
    public static void main(String[] args){

        Random random = new Random();

        boolean acordado = true;
        int carneirinhos = 0;
        while (acordado){
            System.out.println("Contando Carneirinhos .. " + (++carneirinhos));
            acordado = !(random.nextInt(3) == carneirinhos);
            if (carneirinhos == 20) {
                carneirinhos = 0;
            }
        }
        System.out.println("Dormiu...");

        }

    }