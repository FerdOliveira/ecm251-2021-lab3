package fernando.oliveira;

interface Trabalhador {
    String descricao();

    boolean executarTrabalho();
}

interface InformacoesPessoais {
    String getNome();
    double getSalario();
    String getTelefone();
}

class Pintor implements InformacoesPessoais, Trabalhador {

    private final String nome;
    private final double salario;
    private final String telefone;

    public Pintor(String nome, Double salario, String telefone) {
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }

    @Override
    public String descricao() {
        return "Eu pinto construcoes";
    }

    @Override
    public boolean executarTrabalho() {
        return true;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }
}

class Encanador implements InformacoesPessoais, Trabalhador {

    private final String nome;
    private final double salario;
    private final String telefone;

    public Encanador(String nome, Double salario, String telefone) {
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }

    @Override
    public String descricao() {
        return "Eu arrumo encanamentos";
    }

    @Override
    public boolean executarTrabalho() {
        return true;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }
}

class Eletricista implements InformacoesPessoais, Trabalhador {

    private final String nome;
    private final double salario;
    private final String telefone;

    public Eletricista(String nome, Double salario, String telefone) {
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }

    @Override
    public String descricao() {
        return "Eu faco parte da equipe eletrica da cidade";
    }

    @Override
    public boolean executarTrabalho() {
        return true;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }
}

class Zelador implements InformacoesPessoais, Trabalhador {

    private final String nome;
    private final double salario;
    private final String telefone;

    public Zelador(String nome, Double salario, String telefone) {
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }

    @Override
    public String descricao() {
        return "Eu limpo sua bagunca";
    }

    @Override
    public boolean executarTrabalho() {
        return true;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }
}