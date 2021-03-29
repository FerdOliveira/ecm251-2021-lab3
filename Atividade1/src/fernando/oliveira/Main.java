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
	String Req1 = Transacoes.gerarOsQRCode(250,conta1,usuario1); // Gerar uma operação de recebimento de 250 para o usuario 1 conforme pedido
	//System.out.println(Req1); // saida -> 1;Murilo Zanini;250.0;3348
	String Req2 = Transacoes.gerarOsQRCode(1000,conta2,usuario2); // Gerar uma operação de recebimento de 1000 para o usuario 2 conforme pedido
	//System.out.println(Req2); // saida -> 2;Ferd;1000.0;6008

	Transacoes.transacao(conta2,conta1,Req1); // primeira transacao que teria que ser feita( usada tambem como teste)
	Transacoes.transacao(conta3,conta1,Req1);
	Transacoes.transacao(conta2,conta1,Req1);
	Transacoes.transacao(conta3,conta2,Req2);

	System.out.println(conta1.getSaldo()); // verificar se at transacao estava ocorrendo corretamente
	System.out.println(conta2.getSaldo()); // verificar se at transacao estava ocorrendo corretamente
	System.out.println(conta3.getSaldo()); // verificar se at transacao estava ocorrendo corretamente

    }
}
