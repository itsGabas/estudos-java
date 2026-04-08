package je_exercises.agenda;

import java.util.Scanner;

public class AgendaMain {
    static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        AgendaService service = new AgendaService();
        int opcao = 0;

        // Apenas para rodar
        // QUEM CONVERSA COM O USUARIO.

        while(opcao != 4){

            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            opcao = scan.nextInt();

            if(opcao == 1){
                System.out.println("Digite o nome do contato: ");
                String nome = scan.next();

                System.out.println("Digite o numero do contato: ");
                String numero = scan.next();

                service.adicionar(nome, numero);
            }

            else if(opcao == 2){
                service.listar();
            }

            else if(opcao == 3){
                System.out.println("Digite o ID do contato que deseja remover: ");
                int id = scan.nextInt();
                service.remover(id);
            }

            else if(opcao == 4){
                System.out.println("Saindo da agenda...");
                break;
            }

            else{
                System.out.println("Opção inválida. Digite uma opção válida!!");
            }
        }

    }
}
