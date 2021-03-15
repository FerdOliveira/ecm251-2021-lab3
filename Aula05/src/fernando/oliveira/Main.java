package fernando.oliveira;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Quase 5° temporada ai!");
	// criar uma referencia para Conta
        Conta c1;
        //instanciar um objeto conta
        c1 = new Conta();
        c1.cliente = new Cliente();

        c1.cliente.titular = "Inuyasha";
        c1.saldo = 199.99;
        c1.visualizarSaldo();

        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.cliente.titular = "Seichomaru";
        c2.saldo = 1000;
        c2.visualizarSaldo();
        c1.depositar(20);
        c2.depositar(35.99);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        if(c1.sacar(100)){
            System.out.println("Deu Bom");

        } else{
            System.out.println("Deu ruiim");
        }
        c1.visualizarSaldo();

        if(c1.transferirPara(1000,c2)){
            System.out.println("Deu bom! transferiu !");
        } else {
            System.out.println("DEu ruim! Não foi!");

        }
        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.println("C1:" + c1.toString());
        System.out.println("C2:" + c2.toString());
    }
}
