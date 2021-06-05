package fernando.oliveira;

import java.util.Random;

//@AllArgsConstructor
//@Getter
public class Account {
    public double getBalance() {
        return balance;
    }

    private double balance;

    public Account(double saldoInicial){
        this.balance = saldoInicial;
    }

    public void deposit(Double deposit){
        balance += deposit;
        System.out.println("Deposito efetuado: R$ " + deposit);
    }
    public int randomValores(){
        Random v1 = new Random();
        return v1.nextInt(3);

    }
    public void withdraw(Double withdraw){
        if(balance>withdraw){
            balance -= withdraw;
            System.out.println("Foi retirado: R$- "+ withdraw);
        }else{
            System.out.println("Saldo Indisponivel");
        }
    }
}
