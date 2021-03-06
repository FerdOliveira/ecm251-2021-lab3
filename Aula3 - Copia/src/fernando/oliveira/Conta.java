package fernando.oliveira;

import java.awt.event.ComponentListener;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    //Construtor da classe

    public Conta(String nomeCliente, double saldoInicial){
        this.saldo = saldoInicial;
        this.cliente = new Cliente(nomeCliente);
        this.numero = 1234;

    }

    public Conta(String nomeCliente, String cpf){
        this.cliente = new Cliente(nomeCliente);
    }
    public double getSaldo(){
        return  this.saldo;

    }

    public void visualizarSaldo(){
//        double saldo = this.saldo ;
        System.out.println("Saldo da conta: R$" + this.saldo);
//        while(saldo > 0){
//            System.out.println("Gastando!!!" + saldo);
//            saldo = saldo - 10;
//        }
    }
    public void depositar(double valor) {

            this.saldo = this.saldo + valor;


    }
   public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirPara(double valor, Conta destino){
        if(this.sacar(valor))
        {destino.depositar(valor);
        return true; }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.toString() +
                '}';
    }
}
