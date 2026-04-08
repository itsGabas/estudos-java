package je_classes_essenciais;

public class StringBuilderClass {
    static void main(String[] args){
        String nome = "Gabriel";

        // Muito melhor e mais rapido do que ficar usando .concat e afins

        StringBuilder sb = new StringBuilder(nome);
        sb.append(" Bonamichi");
        sb.append(" Desenvolvedor Java");

        System.out.println(sb.toString());

    }
}
