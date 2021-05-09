package fernando.oliveira.models.bazinga;

import fernando.oliveira.models.Jogada;
import fernando.oliveira.models.classico.Papel;
import fernando.oliveira.models.classico.Pedra;
import fernando.oliveira.models.classico.Tesoura;


public class Spoke extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Papel(), new Lagarto()};
    }
    @Override
    public String toString() {
        return "Spoke";
    }}