package fernando.oliveira;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero, double saldo, String cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = new Cliente(cliente);
    }

    public double getSaldo(){
//        double saldo = this.saldo ;
        return this.saldo;
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
