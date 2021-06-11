package fernando.oliveira;

import java.util.Random;

public class Cliente extends Thread {

    private String name;
    private Account account;

    public Cliente(String name, Account account) {
        super(name);
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                if (!execute()) {
                    break;
                }
                Thread.sleep(random.nextInt(1000));
                Thread.yield();
            }
        } catch (InterruptedException e) {
            //Pega a execao gerado quando se encerra
            System.err.println("Cliente " + Thread.currentThread().getName() + " encerrando...");
        }
    }

    public boolean execute() {
        int valores[] = {10, 20, 50, 100};

        Random number = new Random();

        int valor = valores[number.nextInt(4)];
        int DepositaSaca = number.nextInt(2);

        if (DepositaSaca == 0) {
            account.withdraw(valor);
            System.out.println("Cliente: " + this.name + " retirou " + valor);
            System.out.println("Conta: saldo atualizado de " + account.getBalance());
        }
        if (DepositaSaca == 1) {
            account.deposit(valor);
            System.out.println("Clliente " + this.name + " depositou " + valor);
            System.out.println("Conta: saldo atualizado de " + account.getBalance());
        }
        return true;
    }
}