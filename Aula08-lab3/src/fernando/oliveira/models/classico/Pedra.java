package fernando.oliveira.models.classico;
import fernando.oliveira.models.Jogada;
import fernando.oliveira.models.bazinga.Lagarto;
import fernando.oliveira.models.bazinga.Spoke;

public class Pedra extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Lagarto(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Papel(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}