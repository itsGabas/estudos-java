package je_exercises.agenda;

import java.util.ArrayList;
import java.util.List;

// ESSE ARQUIVO NUNCA VAI TER SCANNER, MENU. APENAS LÓGICA PURA.

// MAIS IMPORTANTE: Como tudo vai funcionar. Ou melhor... O QUE FAZER COM NOSSOS CONTATOS??

// Garantimos que cada contato tenha um ID diferente, e seja guardado no nosso "banco de dados da memoria", a lista.

public class AgendaService {
    private List<Agenda> contatos = new ArrayList<>();
    private int contadorId = 1;

    // Aqui é onde CRIAMOS OS NOSSOS OBJETOS de Adicionar, Listar e Remover. Recebemos os dados do Scanner da Main.

    public void adicionar(String nome, String numero){
        Agenda agenda = new Agenda(contadorId++, nome, numero);
        contatos.add(agenda);
        System.out.println("Contato adicionado com sucesso!");

    }

    public void listar() {
        if(contatos.isEmpty()){
            System.out.println("Nenhum contato adicionado!");
            return;
        }
        contatos.forEach(contato -> System.out.println(contato));

    }

    // Buscamos PELO OBJETO e tiramos ele da lista. Não diretamente pelo ID

    public void remover(int id){
        Agenda agenda = buscarPorId(id);
        if(agenda != null){
            contatos.remove(agenda);
            System.out.println("Contato removido com sucesso!");
        }

        else {
            System.out.println("Nenhum contato encontrado!");
        }

    }

    // AQUI TEMOS UM MÉTODO AUXILIAR. SEMPRE PRIVATE. Aqui é onde buscamos o objeto para excluir.

    private Agenda buscarPorId(int id){
        for(Agenda contato : contatos) {
            if(contato.getId() == id){
                return contato;
            }
        }
        return null;
    }
}
