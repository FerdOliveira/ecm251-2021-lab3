package fernando.oliveira.enums;

/**
 * Enum para determinar se o horário do sistema é EXTRA ou NORMAL
 */
public enum HorarioSistema {
    EXTRA {
        @Override
        public HorarioSistema trocarHorario() {
            System.out.println("Seu horario agora é NORMAL");
            return NORMAL;
        }
    }, NORMAL {
        @Override
        public HorarioSistema trocarHorario() {
            System.out.println("Voce agora esta fazendo hora EXTRA");
            return EXTRA;
        }
    };

    public abstract HorarioSistema trocarHorario();
}
