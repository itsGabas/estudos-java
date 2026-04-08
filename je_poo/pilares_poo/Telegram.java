package je_poo.pilares_poo;

public class Telegram extends SistemaMensagemInstantanea {

    // HERDANDO DA CLASSE PRINCIPAL (SistemaMensagemInstantanea)
    @Override
    protected void enviar(){
        System.out.println("Mensagem enviada pelo Telegram com sucesso!");
    }

    @Override
    protected void receber(){
        System.out.println("Mensagem recebida pelo Telegram com sucesso!");
    }

}
