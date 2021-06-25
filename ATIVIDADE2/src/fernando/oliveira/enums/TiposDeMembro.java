package fernando.oliveira.enums;

public enum TiposDeMembro {
    MOBILE_MEMBERS {
        @Override
        public String getExtraAssinatura() {
            return "Happy_C0d1ng. Maskers";

        }

        @Override
        public String getNormalAssinatura() {
            return "Happy Coding!";
        }
    }, HEAVY_LIFTERS {

        @Override
        public String getExtraAssinatura() {
            return "N00b_qu3_n_Se_r3pita.bat";
        }

        @Override
        public String getNormalAssinatura() {
            return "Podem contar conosco!";
        }
    }, SCRIPT_GUYS {
        @Override
        public String getExtraAssinatura() {
            return "Podem contar conosco!";
        }

        @Override
        public String getNormalAssinatura() {
            return "Prazer em ajudar novos amigos de código!";
        }
    }, BIG_BROTHERS {
        @Override
        public String getExtraAssinatura() {
            return "...";
        }

        @Override
        public String getNormalAssinatura() {
            return "Sempre ajudando as pessoas membros ou não S2!";
        }
    };

    public abstract String getExtraAssinatura();

    public abstract String getNormalAssinatura();
}
