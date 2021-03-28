package fernando.oliveira;

public class Contas {
    private int idConta;
    private double saldo;
    private int IdDaVez = 1;

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
        return saldo;
    }

    public int getIdDaVez() { //No momento não preciso mas deixarei criado para todos um getter
        return IdDaVez;
    }
}




