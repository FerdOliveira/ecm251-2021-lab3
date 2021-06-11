package fernando.oliveira;

/**
 * @author Fernando Oliveira de Souza 19.00617-9
 * @author Gustavo Zamboni do Carmo 19.01266-7
 * @author Matheus Takahashi Nakai 19.01355-8
 * @author Raphael Marchetti Calciolari 19.00828-7
 */

import sun.misc.Signal;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1000);
        System.out.println("Conta criada com saldo inicial de:"+account.getBalance()+" R$");
        Cliente customers[] = {
                new Cliente("GutaMax", account),
                new Cliente("Ferd", account),
                new Cliente("Rapha", account),
                new Cliente("Nakai", account)};


        Signal.handle(new Signal("INT"), // CTRL+C
                (Signal signal) -> {
                    System.out.println("Terminando a simulação...");
                    for (Cliente customer : customers) {
                        customer.interrupt();
                    }
                });
        for (Cliente customer : customers) {
            customer.start();
        }
    }
}