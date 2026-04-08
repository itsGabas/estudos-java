package je_exercises.aluno;

public class AlunoMain {
    public static void main(String[] args){

        double[] notas = {8.5, 8.0, 9.0};

        Aluno aluno = new Aluno("Gabriel", notas);

        aluno.imprimirMedia();

        System.out.println("Aprovado??: " + aluno.aprovado());

    }
}
