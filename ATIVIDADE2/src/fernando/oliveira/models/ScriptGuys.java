package fernando.oliveira.models;

import fernando.oliveira.enums.TiposDeMembro;

/**
 * Classe filha de Membros
 */

public class ScriptGuys extends Membros {
    public ScriptGuys(String nome, String email, TiposDeMembro cargo) {
        super(nome, email, cargo);
    }
}
