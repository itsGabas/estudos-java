package je_sintaxe;

public class EstruturasCondicionais {
    public static void main(String[] args){

        String sexo = "Masculino";
        int idade = 24;

        // SEXO

        if(sexo == "Masculino"){
            System.out.println("Sexo Masculino");

        }
        else if(sexo == "Feminino"){
            System.out.println("Sexo Femenino");
        }
        else{
            System.out.println("Erro!");
        }

        // IDADE

        if(idade < 18){
            System.out.println("Menor de Idade.");
        }
        else{
            System.out.println("Maior de Idade.");
        }

    }
}
