package je_poo;

public class Sistema {
    static void main(String[] args) {

        Cliente gabriel = new Cliente("Gabriel Bonamichi");
        gabriel.solicitarLimiteCredito(3800);
        gabriel.comprar(2250.00);

        Cliente sofia = new Cliente("Sofia Maria");
        sofia.solicitarLimiteCredito(2800);
        sofia.comprar(250.00);

        System.out.println("Limite " + gabriel.nome + ": " + gabriel.limiteCredito);
        System.out.println("Limite " + sofia.nome + ": " + sofia.limiteCredito);

    }

}
