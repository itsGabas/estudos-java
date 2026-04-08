package je_exercises.aluno;

class Aluno {

    private String nome;
    private double[] notas;

    public Aluno(String nome, double[] notas){

        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia(){

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;

    }

    public void imprimirMedia(){

        System.out.println("Aluno: " + nome);
        System.out.printf("Media: %.2f%n", calcularMedia());

    }

    public boolean aprovado(){

        if(calcularMedia() < 7){
            return false;
        }
        return true;

    }

}
