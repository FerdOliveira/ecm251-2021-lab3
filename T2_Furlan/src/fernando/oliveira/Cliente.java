package fernando.oliveira;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Cliente extends Thread{

    private String name;
    private Account account;

    public Cliente(String name, Account account){
        super("Cliente");
        this.name = name;
        this.account = account;

    }

    public double execute(){
        Random r1 = new Random();
        return(double) r1.nextInt(2);
    }
    public Account getAccount(){
        return this.account;
    }
    @Override
    public void run() {
        double[] array = {10.0, 20.0, 50.0, 100.0};
        Scanner scanner = new Scanner(System.in);
        AtomicBoolean shouldContinue = new AtomicBoolean(true);
        new Thread(() -> {
            int i = scanner.nextInt();
            if (i == 0) shouldContinue.set(false);
        }).start();
        while(shouldContinue.get()){

            double r1 = execute();
            int v1 = account.randomValores();
            if(r1==1.0){
                account.deposit(array[v1]);

            }else{
                account.withdraw(array[v1]);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Balance: R$ " + account.getBalance());
        }
    }
}