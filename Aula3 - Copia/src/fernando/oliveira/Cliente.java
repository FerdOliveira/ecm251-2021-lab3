package fernando.oliveira;

public class Cliente {

    private String nome;
    private String titular;
    private String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
