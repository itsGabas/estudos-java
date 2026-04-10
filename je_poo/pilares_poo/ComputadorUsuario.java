package je_poo.pilares_poo;

public class ComputadorUsuario {
    static void main(String[] args){
        // Aplicando os conceitos do polimorfismo após utilizar a Abstração e a Herança nas outras classes.

        SistemaMensagemInstantanea smi = null;

        /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGENS.
         */

        String appEscolhido ="tlg";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }

        else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }
        else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();

    }
}
