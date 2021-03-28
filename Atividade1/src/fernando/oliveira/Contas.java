package fernando.oliveira;

public class Contas {
    private int idConta;
    private double saldo;
    private int IdDaVez = 1;

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




