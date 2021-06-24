package fernando.oliveira.models;

import fernando.oliveira.Interface.ApresentacaoMembros;
import fernando.oliveira.enums.TiposDeMembro;

public class Membros implements ApresentacaoMembros {

    //TODO: tentar usar o lombok para os getters e construtor
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public TiposDeMembro getCargo() { return cargo; }

    protected String nome;
    protected String email;
    protected TiposDeMembro cargo;

    public Membros(String nome, String email, TiposDeMembro cargo){
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
