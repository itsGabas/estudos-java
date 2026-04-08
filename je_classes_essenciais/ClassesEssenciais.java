package je_classes_essenciais;

import java.util.Scanner;

public class ClassesEssenciais {
    static void main(String[] args){

        // Try - Catch
        try{
            System.out.println(1/0);
        }
        catch(Exception e){
            System.err.println("Nao se divide por zero."); // Retorna mensagem em vermelho para erros
        }

        // Scanner para input de mensagens.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        System.out.println(num);
        scan.close();

        // Usando Scanner com dilimitador de informações

        String nome = null;
        Integer idade = null;
        Double altura = null;

        // Simulando uma linha existente em um arquivo txt/csv
        String stringLinhaArquivo = "gabriel bonamichi;24;1.70";
        Scanner delim = new Scanner(stringLinhaArquivo);
        delim.useDelimiter(";");

        // Conhecendo recursos novos
        int index = 0;

        // Controle de Fluxo para verificar se os indices continuam
        while (delim.hasNext()){

            if(index == 0)
                nome = delim.next();

            else if(index == 1)
                idade = Integer.valueOf(delim.next());

            else
                altura = Double.valueOf(delim.next());

            index++;
        }
        delim.close();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
    }
}
