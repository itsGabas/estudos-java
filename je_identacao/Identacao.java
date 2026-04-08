package je_identacao;

public class Identacao {
    public static void main(String[] args){

        int mediaFinal = 9;

        if (mediaFinal < 6)
            System.out.println("REPROVADO");

        else if (mediaFinal == 6)
            System.out.println("PROVA FINAL");

        else
            System.out.println("APROVADO");
    }
}
