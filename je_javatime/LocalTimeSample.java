package je_javatime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSample {
    static void main(String[] args) {

        // Hora atual
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora Atual: " + horaAtual);

        // Hora, Minuto e segundo ESPECIFICADOS
        LocalTime hhMMss = LocalTime.of(13,21,42);
        System.out.println("Hora, Minuto e Segundo especificos: " + hhMMss);

        // Hora, Minuto ESPECIFICADOS
        LocalTime hhMM = LocalTime.of(14,25);
        System.out.println("Hora e Minuto especificos: " + hhMM);

        // Hora formatada de uma STRING
        LocalTime horaString = LocalTime.parse("15:28:33");
        System.out.println("Recebendo hora em uma String: " + horaString);

        // Formatando no padrão de HH:MM:SS numero que vieram de um arquivo sem separação, como um CSV
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime tempoArquivo = LocalTime.parse("222222", formatter);
        System.out.println("Recebendo hora de um arquivo sem separação: " + tempoArquivo);

        // Adicionando ou Tirando tempo nas nossas horas
        horaAtual = horaAtual.plusHours(1);
        System.out.println("Adicionando uma hora: " + horaAtual);

        horaAtual = horaAtual.minusMinutes(41);
        System.out.println("Subtraindo 41 minutos: " + horaAtual);

        // Formatação
        LocalTime hora = LocalTime.of(13,21,42);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("ss-mm-HH");
        String horaFormatada = hora.format(formatter2);
        System.out.println("Hora formatada manualmente: " + horaFormatada);
    }
}
