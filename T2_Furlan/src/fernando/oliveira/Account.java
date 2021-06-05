package fernando.oliveira;

public class Account {
    private double balance;

    public Account(double saldoInicial){
        this.balance = saldoInicial;
        System.out.println("Seu saldo inicial é de R$ "+ this.balance);
    }

    public void deposit(Double deposit){
        balance += deposit;
        System.out.println("Deposito efetuado: R$ " + deposit);
    }
}
