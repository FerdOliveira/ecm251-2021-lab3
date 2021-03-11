package fernando.oliveira;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Quase 5° temporada ai!");
	// criar uma referencia para Conta
        Conta c1;
        //instanciar um objeto conta
        c1 = new Conta("Saitama",999.99);

        Conta c2 = new Conta("Goku","123456789-9");
        c1.depositar(300);
        c1.sacar(250);
        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
    }
}
