// Fernando Oliveira de souza 19.00617-9
// Este trabalho foi realizado com auxilio dos programas anteriores de aula e o curso de introdução a Orientacao da Alura
package fernando.oliveira;

public class Contas {
    private int idConta;
    private double saldo;
    private static int idDaVez = 1; // foi adicionado o static para contar o id de cada conta pois, caso contrario ele nao seria um atributo compartilhado com as demais classes
    private Usuarios pessoa; // para então saber para que saldo sera atribuido precisanmos pegar a classe de usuarios que foi criada naquele momento para usar como referencia a mesma.

    public Contas(Usuarios pessoa, double saldo){ //o IdConta nao entra pois é um atributo que iremos indo atualizar ele, e nao algo que precisa ser passado como parametro
        this.pessoa = pessoa; // pegar as informações da classe Usuarios daquele que quero acessar
        this.saldo = saldo;
        this.idConta = idDaVez;
        idDaVez++; //primeramente o id vale 1, mas conforme for criando este id vai para 2, 3 ....
    }

    public void depositar(double valor){ //Mesmo não tendo operação para depositar, sei que vou ter que usar o metodo depositar para colocar o dinheiro de alguem em transacoes e por o saldo ser privado preciso fazer aqui
        this.saldo += valor;
    }

    public boolean sacar(double valor){ //Mesmo não tendo operação para sacar, sei que vou ter que usar o metodo sacar para tirar o dinheiro de alguem em transacoes e por o saldo ser privado preciso fazer aqui
        if(valor <= this.saldo ){ // alem disso teve que ser boolean e ter feito uma verificação para ver se a mesma pode ser sacada, ja que precisamos veridicar se temos saldo para isto
            this.saldo -= valor;
            return true;
        }
        System.out.println("o usuario:" + pessoa.getNome() + " não pode sacar dinheiro, pois nao possui creditos suficientes" ); // Mensagem  para caso o usario nao consiga sacar o dinheiro informar uma mesnagem de erro
        return false;
    }

    public int getIdConta(){ //metodo criado para pegar o id da conta já que dito iremos utilizar ele em transacoes
        return this.idConta;
    }

    public double getSaldo() { //No momento não preciso mas deixarei criado para todos um getter
        return this.saldo;
    }

    public static int getIdDaVez() { //No momento não preciso mas deixarei criado para todos um getter
        return Contas.idDaVez; // Lembrando que aqui nao pode ser this, pois o atributo idDaVez nao deve ser algo instancia, e sim algo para a classe Contas.
    } // e tambem nao podemos invocar nada com this dentro deste metodo.
}




