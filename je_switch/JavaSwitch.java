package je_switch;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int opcoes = sc.nextInt();

        switch(opcoes){

            case 1:
                System.out.println("Abra a sua Conta");
                break;

            case 2:
                System.out.println("Fatura do Cartão");
                break;

            case 3:
                System.out.println("Crédito Imobiliário");
                break;

            default:
                System.out.println("Escolha alguma opção válida!");

        }

    }
}
