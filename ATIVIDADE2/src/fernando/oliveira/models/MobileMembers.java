package fernando.oliveira.models;

import fernando.oliveira.enums.TiposDeMembro;

/**
 * Classe filha de Membros
 */

public class MobileMembers extends Membros {
    public MobileMembers(String nome, String email, TiposDeMembro cargo) {
        super(nome, email, cargo);
    }
}
