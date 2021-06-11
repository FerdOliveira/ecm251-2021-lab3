package fernando.oliveira;

//@AllArgsConstructor
//@Getter
public class Account {

    private double balance;

    public void deposit(int valor) {
        this.balance += valor;
    }

    public int withdraw(int valor) {
        if (valor > this.balance) {
            System.out.println("Não é possivel realizar esse saque!");
            return -1;
        } else this.balance -= valor;
        return 1;
    }

    public double getBalance() {
        return balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }
}