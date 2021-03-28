package fernando.oliveira;

public class Main {

    public static void main(String[] args) {
	Usuarios usuario1 = new Usuarios("Murilo Zanini","123321","Zanini@maua.com");
	Usuarios usuario2 = new Usuarios("Ferd","123123","Ferd@maua.com");
	Usuarios usuario3 = new Usuarios("Scalco","321321","Scalco@maua.com");
//	System.out.println(usuario1);
//	System.out.println(usuario2);
//	System.out.println(usuario3);
	Contas conta1 = new Contas(usuario1,1000);
	Contas conta2 = new Contas(usuario2,250);
	Contas conta3 = new Contas(usuario3,3000);
//	System.out.println(conta1.getIdConta()); //Ver se estava atualizando o ID da conta e se compialva a classe conta
//	System.out.println(conta2.getIdConta()); //Ver se estava atualizando o ID da conta e se compialva a classe conta
//	System.out.println(conta3.getIdConta()); //Ver se estava atualizando o ID da conta e se compialva a classe conta
//		------------------------------------------------------
//	conta1.depositar(100); //Teste para depositar
//	conta2.sacar(300); //Teste para sacar, nao dando para sacar
//	conta3.sacar(500); // Teste para sacar podendo dar certo
//
//	System.out.println(conta1.getSaldo());
//	System.out.println(conta2.getSaldo());
//	System.out.println(conta3.getSaldo());
    }
}
