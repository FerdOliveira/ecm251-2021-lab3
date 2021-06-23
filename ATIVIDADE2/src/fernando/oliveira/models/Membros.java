package fernando.oliveira.models;

public class Membros {
    private String nome;
    private String email;
    private String cargo;

    public Membros(String nome, String email, String cargo){
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Membros{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
    // Se nao tiver esse override ele printa assim a lista de membros "fernando.oliveira.models.Membros@9629756"
}
