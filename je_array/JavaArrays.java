package je_array;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args){

        String[] lista_nomes = {"Gabriel", "Sofia", "Ana Luiza", " ", "24", "18", "20"};
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println(lista_nomes[1]);
        System.out.println(numeros[1]);

        for (int num : numeros){

            System.out.println("Imprimindo todos os numeros da lista");
            System.out.println(num);

        }

        System.out.println("Imprimindo todos os nomes da lista na mesma linha: " + Arrays.toString(lista_nomes));

    }
}
