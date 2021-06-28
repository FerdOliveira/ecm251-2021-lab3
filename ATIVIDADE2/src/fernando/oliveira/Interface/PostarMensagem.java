package fernando.oliveira.Interface;

import fernando.oliveira.enums.HorarioSistema;

/**
 * Interface de Postar Mensagem para todos os membros, implementada em membros
 */
public interface PostarMensagem {
    public void postarMensagem(String mensagem, HorarioSistema horarioSistema);
}
