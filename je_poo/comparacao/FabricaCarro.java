package je_poo.comparacao;

public class FabricaCarro {
    static void main(String[] args){
        Carro carro1 = new Carro("branca", "Fiat", "Palio");
        Carro carro2 = new Carro("branca", "Fiat", "Palio");
        Carro carro3 = new Carro("branca", "Fiat", "Palio");
        Carro carro4 = new Carro("branca", "Fiat", "Palio");
        Carro carro5 = new Carro("branca", "Fiat", "Palio");

        //case01
        System.out.println(carro1 == carro2);

        //case02
        System.out.println(carro1.equals(carro2));

    }
}
