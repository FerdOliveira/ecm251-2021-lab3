package fernando.oliveira.models;

import fernando.oliveira.enums.TiposDeMembro;

public class MobileMembers extends Membros {
    public MobileMembers(String nome, String email, TiposDeMembro cargo) {
        super(nome, email, cargo);
    }

    @Override
    public String getExtraAssinatura() {
        return super.getExtraAssinatura();
    }

    @Override
    public String getNormalAssinatura() {
        return super.getNormalAssinatura();
    }


}
