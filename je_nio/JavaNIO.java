package je_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    static void main(String[] args){

        // Tentando achar o arquivo
        try{

            Path path = Paths.get("c:\\rocket\\curso-java\\aula-java.txt");

            // Escrevendo no arquivo com Java
            List<String> nomes = new ArrayList<>();
            nomes.add("Gabriel");
            nomes.add("Sofia");

            StringBuilder conteudo = new StringBuilder();
            nomes.forEach(n-> conteudo.append(n + "\n"));

            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));

            // Como são bytes, podemos criar uma String com eles
            List<String> lines = Files.readAllLines(path);
            lines.forEach(l -> System.out.println(l));

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
