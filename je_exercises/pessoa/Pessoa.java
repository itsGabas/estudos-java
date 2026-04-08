package je_exercises.pessoa;

class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }

    public void apresentar(){

        System.out.println("Olá, meu nome é " + this.nome + " e eu tenho " + this.idade + " anos.");

    }

}