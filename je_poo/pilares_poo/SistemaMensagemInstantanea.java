package je_poo.pilares_poo;

public abstract class SistemaMensagemInstantanea {

    public void enviarMensagem(){
        if(verificarInternet()) {
            enviar();
            receber();
        }

        else
            System.out.println("Sem Conexão com a internet!");
    }

    // Classe ABSTRATA, nossa classe mãe. Define o que as filhas vão ter, mas as filhas escolhem como vão acontecer.

    protected abstract void enviar();

    protected abstract void receber();

    // Princípio do Encapsulamento, este métod0 só irá acontecer internamente, não precisam ser visíveis
    // por isso declaramos ele como private
    // No caso, vamos encapsular eles dentro dos métodos publicos acima conforme a lógica de enviar mensagens.

    private boolean verificarInternet(){
        System.out.println("Verificando se está conectado a internet!");
        return false;
    }

}