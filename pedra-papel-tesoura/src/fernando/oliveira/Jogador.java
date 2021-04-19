package fernando.oliveira;

public class Jogador {

    private String nome;
    private boolean ehHumano;

    public Jogador(String nome, boolean ehHumano) {
        this.nome = nome;
        this.ehHumano = ehHumano;
    }


    public Jogador(String nome) {
        this.nome = nome;
        this.ehHumano = false;
    }

    public String getNome(){
        if(isEhHumano())
            return nome;
        return "(BOT)" + nome;

    }

    public boolean isEhHumano() {
        return ehHumano;
    }
}
