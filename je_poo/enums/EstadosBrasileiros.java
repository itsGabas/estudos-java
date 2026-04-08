package je_poo.enums;

public enum EstadosBrasileiros {
    SP ("São Paulo", "SP"),
    MG ("Minas Gerais", "MG"),
    RJ ("Rio de Janeiro", "RJ"),
    SC ("Santa Catarina", "SC"),
    RS ("Rio Grande do Sul", "RS");

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
