package je_operadores;

public class OperadoresUnarios {
    public static void main(String[] args){

        int numero = 5;

        System.out.println(numero);
        System.out.println(-numero); // Inverte o Sinal somente nessa saída. Ele nao muda a variavel, somente muda ESSA SAÍDA.
        System.out.println(++numero); // Nesse caso atribuimos o valor a variável. A partir daqui ele será o numero somado + 1 como podemos conferir abaixo.
        System.out.println(numero);

    }
}
