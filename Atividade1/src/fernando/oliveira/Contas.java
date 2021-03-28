package fernando.oliveira;

public class Contas {
    private int idConta;
    private double saldo;
    private static int idDaVez = 1; // foi adicionado o static para contar o id de cada conta pois, caso contrario ele nao seria um atributo compartilhado com as demais classes
    private Usuarios pessoa; // para então saber para que saldo sera atribuido precisanmos pegar a classe de usuarios que foi criada naquele momento para usar como referencia a mesma.

    public void depositar(double valor){ //Mesmo não tendo operação para depositar, sei que vou ter que usar o metodo depositar para colocar o dinheiro de alguem em transacoes e por o saldo ser privado preciso fazer aqui
        this.saldo += valor;
    }

    public boolean sacar(double valor){ //Mesmo não tendo operação para sacar, sei que vou ter que usar o metodo sacar para tirar o dinheiro de alguem em transacoes e por o saldo ser privado preciso fazer aqui
        if(valor >= this.saldo ){
            this.saldo -= valor;
            return true;
        } return false;
    }

    public int getIdConta(){ //metodo criado para pegar o id da conta já que dito iremos utilizar ele em transacoes
        return this.idConta;
    }

    public double getSaldo() { //No momento não preciso mas deixarei criado para todos um getter
        return this.saldo;
    }

    public int getIdDaVez() { //No momento não preciso mas deixarei criado para todos um getter
        return Contas.idDaVez;
    }
}




