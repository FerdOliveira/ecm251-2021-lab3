package br.com.ferd;

import jdk.dynalink.beans.StaticClass;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    static class Account {
        public double getBalance() {
            return balance;
        }

        private double balance;

        public Account(double saldoInicial){
            this.balance = saldoInicial;
        }

        public void deposit(Double deposit){
            balance += deposit;
            System.out.println("Deposito efetuado: R$ " + deposit + " da " + Thread.currentThread().getName());
        }
        public int randomValores(){
            Random v1 = new Random();
            return v1.nextInt(3);

        }
        public void withdraw(Double withdraw){
            if(balance>withdraw){
                balance -= withdraw;
                System.out.println("Foi retirado: R$- " + withdraw + " da " + Thread.currentThread().getName());
            }else{
                System.out.println("Saldo Indisponivel"  + " da " + Thread.currentThread().getName());
            }
        }
    }

    static class Cliente extends Thread{

        private String name;
        private br.com.ferd.Account account;
        private AtomicBoolean atomicBoolean;

        public Cliente(String name, br.com.ferd.Account account){
            super(name);
            this.name = name;
            this.account = account;
            this.atomicBoolean = new AtomicBoolean(true);

        }

        public double execute(){
            Random r1 = new Random();
            return r1.nextInt(2);
        }
        public br.com.ferd.Account getAccount(){
            return this.account;
        }

        public void stopExecution() {
            this.atomicBoolean.set(false);
        }

        @Override
        public void run() {
            double[] array = {10.0, 20.0, 50.0, 100.0};
            while(atomicBoolean.get()) {

                double r1 = execute();
                int v1 = account.randomValores();
                if(r1==1.0){
                    account.deposit(array[v1]);

                }else{
                    account.withdraw(array[v1]);
                }

                System.out.println("Balance: R$ " + account.getBalance());
            }
        }
    }
    public static void main(String[] args) {
        Account c1 = new Account(0.0);
        System.out.println("C1: R$ " + c1.getBalance());
        Cliente cliente1 = new Cliente("GutaMax", c1);
        Cliente cliente2 = new Cliente("Ferd", c1);
        Cliente cliente3 = new Cliente("Rapha", c1);
        Cliente cliente4 = new Cliente("Matheus", c1);

        Cliente[] clientes = new Cliente[]{cliente1, cliente2, cliente3, cliente4};

        for (Cliente customer : clientes) {
            customer.start();
        }

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            for (Cliente customer : clientes) {
                customer.stopExecution();
                System.out.println(String.format("------- ENCERRANDO %s -------", customer.getName()));
            }

            System.out.println("---------RESULTADO---------");
            System.out.println("Terminando a simulação...");
            System.out.println(String.format("Balanço final R$ %.2f", c1.getBalance()));
        }));
    }
}
