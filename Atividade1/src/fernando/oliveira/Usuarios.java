package fernando.oliveira;

public class Usuarios {
    private String nome;
    private String senha;
    private String email;

    public Usuarios(String nome, String senha, String email) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
//    @Override
//    public String toString() {
//        return "Seu nome é: " +
//                  nome +
//                ", com a senha:" + senha +
//                ", e e-mail "+ email.toString();
//    }
    public String getNome(){ //metodo criado para pegar nome do usuario já que dito iremos utilizar ele em transacoes
        return this.nome;
    }

    public String getSenha() { //No momento não preciso mas deixarei criado para todos um getter
        return this.senha;
    }

    public String getEmail() { //No momento não preciso mas deixarei criado para todos um getter
        return this.email;
    }
}
