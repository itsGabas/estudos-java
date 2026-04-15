package je_javatime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeSamle {
    static void main(String[] args) {

        // DateTime - Ano, Mes, Dia, Hora, Minuto, Segundo
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Agora: " + now);

        // Adicionando e Subtraindo
        LocalDateTime now2 = now.plusMonths(2);
        now2 = now.minusHours(4);
        System.out.println("Meses aumentados, horas reduzidas: " + now2);

        // Mudando apenas os segundos.
        LocalDateTime teste = LocalDateTime.of(2026, 4, 10, 14,22,21);
        teste = teste.withSecond(33);
        System.out.println("Alterando somente os segundos: " + teste);

        // Formatação
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        String nowFormatado = now.format(formatter);
        System.out.println("Hoje formatado: " + nowFormatado);

    }
}
