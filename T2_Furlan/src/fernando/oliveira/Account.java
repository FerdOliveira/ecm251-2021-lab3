package fernando.oliveira;

public class Account {
    private double balance;

    public Account(double saldoInicial){
        this.balance = saldoInicial;
    }

    public void deposit(Double deposit){
        balance += deposit;
        System.out.println("Deposito efetuado: R$ " + deposit);
    }
}
