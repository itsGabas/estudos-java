package je_excecao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        boolean idadeValida = false;
        boolean alturaValida = false;
        int idade = 0;
        double altura = 0;

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        try {
            idade = scanner.nextInt();
            idadeValida = true;
        }
        catch (InputMismatchException e){
            System.err.println("A idade deve ser escrita em números.");
        }

        if (idadeValida) {
            System.out.println("Digite sua altura");
            try {
                altura = scanner.nextDouble();
                alturaValida = true;
            } catch (InputMismatchException e) {
                System.err.println("A altura deve ser digitada no padrão americano: 0.00.");
            }
        }

        if (idadeValida && alturaValida){
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ", tenho " + idade + " anos e meço " + altura + " metros de altura");
        }

        scanner.close();
    }
}
