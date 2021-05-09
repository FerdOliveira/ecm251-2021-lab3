package fernando.oliveira.models.classico;
import fernando.oliveira.models.Jogada;

public class Tesoura extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Lagarto(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Pedra(), new Spoke()};
    }
    @Override
    public String toString() {
        return "Tesoura";
    }
}
