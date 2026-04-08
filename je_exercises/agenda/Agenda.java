package je_exercises.agenda;

// Esse arquivo DEFINE o que é uma agenda e o que ela precisa pra ser uma agenda.

public class Agenda {
    private int id;
    private String nome;
    private String numero;

    // Construtor da Agenda. Aqui definimos o que é uma agenda

    public Agenda(int id, String nome, String numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    // Construindo getters. Aqui é como nossos contatos vao "nascer".

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getNumero(){
        return numero;
    }

    // Nossas variaveis (Atributos da nossa agenda) são PRIVATE. Essa é a unica forma de acessar fora da classe.

    @Override
    public String toString(){
        return id + " - " + nome + " - " + numero;
    }

}
