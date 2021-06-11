package fernando.oliveira;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Cliente extends Thread {

    private String name;
    private Account account;
    private AtomicBoolean atomicBoolean;

    public Cliente(String name, Account account) {
        super(name);
        this.name = name;
        this.account = account;
        this.atomicBoolean = new AtomicBoolean(true);
    }

    public double execute() {
        Random r1 = new Random();
        return r1.nextInt(2);
    }

    public Account getAccount() {
        return this.account;
    }

    public void stopExecution() {
        this.atomicBoolean.set(false);
    }

    @Override
    public void run() {
        double[] array = {10.0, 20.0, 50.0, 100.0};
        while (atomicBoolean.get()) {

            double r1 = execute();
            int v1 = account.randomValores();
            if (r1 == 1.0) {
                account.deposit(array[v1]);

            } else {
                account.withdraw(array[v1]);
            }

            System.out.println("Balance: R$ " + account.getBalance());
        }
    }
}