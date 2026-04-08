package je_poo.pilares_poo;

public class FacebookMessenger extends SistemaMensagemInstantanea {

    // HERDANDO DA CLASSE PRINCIPAL (SistemaMensagemInstantanea)
    @Override
    protected void enviar(){
        System.out.println("Mensagem enviada pelo Facebook Messenger com sucesso!");
    }

    @Override
    protected void receber(){
        System.out.println("Mensagem recebida pelo Facebook Messenger com sucesso!");
    }

}
