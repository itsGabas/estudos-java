package je_javatime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    static void main(String args[]){
        LocalDate dataAtual = LocalDate.now();
        System.out.println(" Data atual: " + dataAtual);

        LocalDate meuAniversario = LocalDate.of(2002, 1, 28);
        System.out.println(" Meu Aniversario: " + meuAniversario);

        String dataBR = "13/08/2007";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataCerta = LocalDate.parse(dataBR, formatter);
        System.out.println(" Transformando datas do tipo BR pro padrão do Java: " + dataCerta);
    }
}
