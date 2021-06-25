package fernando.oliveira.models;

import fernando.oliveira.Interface.ApresentacaoMembros;
import fernando.oliveira.Interface.PostarMensagem;
import fernando.oliveira.enums.HorarioSistema;
import fernando.oliveira.enums.TiposDeMembro;

public abstract class Membros implements ApresentacaoMembros, PostarMensagem {

    //TODO: tentar usar o lombok para os getters e construtor
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public TiposDeMembro getCargo() { return cargo; }

    public String getExtraAssinatura() { return extraAssinatura; }

    public String getNormalAssinatura() { return normalAssinatura; }

    protected String nome;
    protected String email;
    protected TiposDeMembro cargo;
    protected String extraAssinatura = "";
    protected String normalAssinatura = "";

    public Membros(String nome, String email, TiposDeMembro cargo) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.extraAssinatura = cargo.getExtraAssinatura();
        this.normalAssinatura = cargo.getNormalAssinatura();
    }

    public void apresentacao() {
        System.out.println("Nome: " + getNome() + "\n" + "Email: " + getEmail() + "\n" + "Cargo: " + getCargo() + "\n-----------------------");
    }

    @Override
    public String toString() {
        return "Membros{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }// Se nao tiver esse override ele printa assim a lista de membros "fernando.oliveira.models.Membros@9629756"

    public void postarMensagem(String mensagem, HorarioSistema horarioSistema, TiposDeMembro membro) {
        System.out.println("Enviando mensagem: ");
        if (horarioSistema.EXTRA.equals(horarioSistema)){
            System.out.println( mensagem + "\nAss: " + membro.getExtraAssinatura());
        }else{
            System.out.println( mensagem + "\nAss: " + membro.getNormalAssinatura());
        }
        System.out.println("---------------------------------------------");
    }

}
