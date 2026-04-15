package je_nio;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    static void main(String[] args) {

        // Verificar se o diretório existe
        File diretorio = new File("c:\\rocket\\curso-java");
        System.out.println("Diretório existe?: " + diretorio.exists());

        // Fluxo para criar o diretorio casa ele não exista.
        if(!diretorio.exists()){
            diretorio.mkdir();
            System.out.println("Diretório criado");
        }

        // Tentando criar um arquivo de uma forma mais robusta
        try {

            File arquivo = new File(diretorio, "aula-java.txt");
            System.out.println("Arquivo existe?: " + arquivo.exists());

            arquivo.createNewFile();
            System.out.println("Arquivo criado? " + arquivo.exists());

        }
        catch( IOException e){
            e.printStackTrace();
        }
    }
}
