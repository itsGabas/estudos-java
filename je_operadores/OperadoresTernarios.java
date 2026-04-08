package je_operadores;

public class OperadoresTernarios {
    public static void main(String[] args) {

        String nome = "Gabriel";
        int idade = 1;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        String mensagem = nome + (maiorIdade ? " é de maior" : " não é de maior"); // MODO MODERNO, a MESMA função de um IF / ELSE.

        System.out.println(mensagem);

    }
}
