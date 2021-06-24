package fernando.oliveira.models;

import fernando.oliveira.Interface.ApresentacaoMembros;

public class Membros implements ApresentacaoMembros {

    //TODO: tentar usar o lombok para os getters e construtor
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }

    private String nome;
    private String email;
    private String cargo;

    public Membros(String nome, String email, String cargo){
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    public void apresentacao(){
        System.out.println("Nome: " + getNome() + "\n" + "Email: " + getEmail() + "\n" + "Cargo: " + getCargo() + "\n-----------------------");
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
