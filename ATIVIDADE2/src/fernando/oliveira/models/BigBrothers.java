package fernando.oliveira.models;

import fernando.oliveira.enums.TiposDeMembro;

/**
 * Classe filha de Membros
 */

public class BigBrothers extends Membros {
    public BigBrothers(String nome, String email, TiposDeMembro cargo) {
        super(nome, email, cargo);
    }
}
