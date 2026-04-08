package je_repeticao;

import java.util.Random;

public class Carneirinhos {
    public static void main(String[] args){

        Random random = new Random();

        boolean dormiu = false;
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println(carneirinhos + " - Carneirinho(s)..");

            if (dormiu = random.nextInt(20) == 0) {
                System.out.println(carneirinhos + " - Dormiu..");
                break;
            }

        }
        if (!dormiu){
            System.out.println("Não Dormiu...");
        }

    }
}
