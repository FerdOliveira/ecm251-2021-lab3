package fernando.oliveira.models.classico;
import fernando.oliveira.models.Jogada;
import fernando.oliveira.models.bazinga.Lagarto;
import fernando.oliveira.models.bazinga.Spoke;

public class Papel extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Tesoura(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Papel";
    }
}