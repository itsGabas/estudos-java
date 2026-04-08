package je_poo.pilares_poo;

public class MSNMessenger extends SistemaMensagemInstantanea {

    // HERDANDO DA CLASSE PRINCIPAL (SistemaMensagemInstantanea)
    @Override
    protected void enviar(){
        System.out.println("Mensagem enviada pelo MSN com sucesso!");
    }

    @Override
    protected void receber(){
        System.out.println("Mensagem recebida pelo MSN com sucesso!");
    }

}
