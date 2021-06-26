package fernando.oliveira.models;

import fernando.oliveira.enums.TiposDeMembro;

/**
 * Classe filha de Membros
 */

public class HeavyLifters extends Membros {
    public HeavyLifters(String nome, String email, TiposDeMembro cargo) {
        super(nome, email, cargo);
    }
}
