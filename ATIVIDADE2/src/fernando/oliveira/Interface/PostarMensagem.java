package fernando.oliveira.Interface;

import fernando.oliveira.enums.HorarioSistema;
import fernando.oliveira.enums.TiposDeMembro;

/**
 * Interface de Postar Mensagem para todos os membros, implementada em membros
 */
public interface PostarMensagem {
    public void postarMensagem(String mensagem, HorarioSistema horarioSistema, TiposDeMembro membro);
}
