package je_poo.enums;

public class SistemaEnumeracao {
    static void main(String[] args) {
        for(EstadosBrasileiros eb: EstadosBrasileiros.values()){
            System.out.println("Estado: " + eb.getNome() + ", " + eb.getSigla());
            // TODOS OS ESTADOS
        }

        EstadosBrasileiros eb = EstadosBrasileiros.SP;
        System.out.println("Estado específico: " + eb.getNome() + ", " + eb.getSigla());
        // UM ESPECÍFICO
    }
}
