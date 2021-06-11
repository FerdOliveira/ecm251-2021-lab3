package fernando.oliveira;

//Fernando Oliveira de Souza 19.00617-9
//Gustavo Zamboni do Carmo 19.01266-7
//Matheus Takahashi Nakai 19.01355-8
//Raphael Marchetti Calciolari 19.00828-7
public class Main {

    public static void main(String[] args) {
        Account c1 = new Account(0.0);
        System.out.println("C1: R$ " + c1.getBalance());
        Cliente cliente1 = new Cliente("GutaMax", c1);
        Cliente cliente2 = new Cliente("Ferd", c1);
        Cliente cliente3 = new Cliente("Rapha", c1);
        Cliente cliente4 = new Cliente("Matheus", c1);

        Cliente[] clientes = new Cliente[]{cliente1, cliente2, cliente3, cliente4};


        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            for (Cliente customer : clientes) {
                customer.stopExecution();
                System.out.println(String.format("------- ENCERRANDO %s -------", customer.getName()));
            }

            System.out.println("---------RESULTADO---------");
            System.out.println("Terminando a simulação...");
            System.out.println(String.format("Balanço final R$ %.2f", c1.getBalance()));
        }));

        for (Cliente customer : clientes) {
            customer.start();
        }
    }
}