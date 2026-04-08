package je_operadores;

import java.sql.SQLOutput;

public class Operadores {
    public static void main(String[] args){

        int valor1 = 10;
        int valor2 = 10;
        int soma = valor1 + valor2;
        int sub = valor1 - valor2;
        int div = valor1 / valor2;
        int mult = valor1 * valor2;
        int rest = valor1 % valor2;

        System.out.println("Soma Direta: " + (valor1 + valor2) + " Soma Variavel: " + soma);
        System.out.println("Subtração Direta: " + (valor1 - valor2) + " Subtração Variavel: " + sub);
        System.out.println("Divisão Direta: "+ (valor1 / valor2) + " Divisão Variavel: " + div);
        System.out.println("Multiplicação Direta: "+ (valor1 * valor2) + " Multiplicação Variavel: " + mult);
        System.out.println("Resto Direto: " + (valor1 % valor2) + " Resto Variavel: " + rest);

    }
}
