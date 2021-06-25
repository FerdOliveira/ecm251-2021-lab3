package fernando.oliveira.Interface;

import fernando.oliveira.enums.HorarioSistema;
import fernando.oliveira.enums.TiposDeMembro;

public interface PostarMensagem {
    public void postarMensagem(String mensagem, HorarioSistema horarioSistema, TiposDeMembro membro);
}
