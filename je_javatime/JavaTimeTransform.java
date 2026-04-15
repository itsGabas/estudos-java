package je_javatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTimeTransform {
    static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.of(2023,1,24, 10,50,22);
        esperaData(dataHora.toLocalDate(), dataHora.toLocalTime());

    }

    static void esperaData(LocalDate data, LocalTime time){

    }

}
