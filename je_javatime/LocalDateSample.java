package je_javatime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateSample {
    static void main(String args[]){
        // Data Atual
        LocalDate dataAtual = LocalDate.now();
        System.out.println(" Data atual: " + dataAtual);

        // Data programada a mão
        LocalDate meuAniversario = LocalDate.of(2002, 1, 28);
        System.out.println(" Meu Aniversario: " + meuAniversario);

        // Aumentando anos da data
        LocalDate dataQueTera47Anos = meuAniversario.plusYears(47);
        System.out.println(" Data em que terei 47 anos: " + dataQueTera47Anos);

        // Diminuindo meses da data
        LocalDate gravidez = meuAniversario.minusMonths(9);
        System.out.println(" Gravidez: " + gravidez);

        // Convertendo do padrão BR pro padrão do Java
        String dataBR = "13/08/2007";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataCerta = LocalDate.parse(dataBR, formatter);
        System.out.println(" Transformando datas do tipo BR pro padrão do Java: " + dataCerta);

        // Convertendo do padrão do Java (ou outro) para o padrão BR
        LocalDate data = LocalDate.of(2002, 1, 28);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(" Data BR: " + formatterBR.format(data));

        // Estilos de formatações pré definidos do Java
        LocalDate data2 = LocalDate.of(2007, 8, 13);

        String dataFormatada = data2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(" Data formatada: " + dataFormatada);

        dataFormatada = data2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(" Data formatada: " + dataFormatada);

        dataFormatada = data2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(" Data formatada: " + dataFormatada);

        dataFormatada = data2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(" Data formatada: " + dataFormatada);

        // Utilizando o Locale para fusos hoarios
        Locale[] locales = {Locale.CANADA, Locale.CANADA_FRENCH, Locale.US, Locale.UK, Locale.JAPAN, new Locale("pt", "BR")};
        for(Locale locale : locales){
            String dataPorPais = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
            System.out.println(" Data por país: " + dataPorPais);
        }
    }
}
