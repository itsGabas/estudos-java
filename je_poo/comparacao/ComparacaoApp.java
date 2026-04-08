package je_poo.comparacao;

public class ComparacaoApp {
    static void main(String args[]){
        // stack vs heap
        // Stack guarda variaveis locais, chamadas de métodos. - Mais Rapido

        Integer n1 = 128; // objeto no Heap, fora do Integer Cache (-128 a 127)
        Integer n2 = Integer.parseInt("128"); // novo objeto no Heap, endereço diferente

        // O Heap guarda os objetos com o new. a variavel n2 vai pro Stack, mas o Objeto (após o sinal de igual) fica no Heap
        // Mais lento, porem mais dinamico.

        // == compara ENDEREÇO DE MEMÓRIA no Heap → false (objetos diferentes)
        // equals() compara o VALOR → true
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

    }
}
