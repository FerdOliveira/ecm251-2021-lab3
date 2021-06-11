package fernando.oliveira;

import java.util.Random;

//@AllArgsConstructor
//@Getter
public class Account {

    private double balance;

    public Account(double saldoInicial) {
        this.balance = saldoInicial;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(Double deposit) {
        balance += deposit;
        System.out.println("Deposito efetuado: R$ " + deposit + " da " + Thread.currentThread().getName());
    }

    public int randomValores() {
        Random v1 = new Random();
        return v1.nextInt(3);
    }

    public void withdraw(Double withdraw) {
        if (balance > withdraw) {
            balance -= withdraw;
            System.out.println("Foi retirado: R$- " + withdraw + " da " + Thread.currentThread().getName());
        } else {
            System.out.println("Saldo Indisponivel" + " da " + Thread.currentThread().getName());
        }
    }
}
