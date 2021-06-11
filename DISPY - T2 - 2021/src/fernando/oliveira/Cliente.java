package fernando.oliveira;

import java.util.Random;
/**
 * responsável por gerenciar o cadastro do cliente, com nome e referencia
 */
public class Cliente  extends Thread{

    //Atributos
    private String name;
    private Account account;
    //Métodos

    //Construtor
    public Cliente(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            // Tenta produzir um número inteiro aleatório
            while (true) {
                if (!execute()) {
                    break;
                }
                Thread.sleep(random.nextInt(1000));
                Thread.yield();
            }
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.err.println("Cliente " + Thread.currentThread().getName() + " encerrando...");
        }
    }

    public boolean execute(){
        int valores[] = {10,20,50,100};
        Random number = new Random();
        //Variaveis Auxiliares
        int valor = valores[number.nextInt(4)];
        int escolha = number.nextInt(2);// 1 para saque/ 2 para deposito

        //Sacando ou depositando
        if (escolha == 1) {

            if(account.withdraw(valor) == 1) {
                System.out.println("Cliente: " + this.name + " retirou " + valor);
                System.out.println("Conta: saldo atualizado de: " + account.getBalance());
            }
            else System.out.println("Esperando deposito....");
        }
        if (escolha == 0) {
            account.deposit(valor);
            System.out.println("Clliente " + this.name + " depositou " + valor);
            System.out.println("Conta: saldo atualizado de: " + account.getBalance());
        }

        return true;
    }

}