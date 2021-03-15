package fernando.oliveira;
import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private Scanner scanner;
    private Conta conta;

    public Sistema(){
        this.continuarExecucao = true;
        this.scanner = new Scanner(System.in);
        this.conta = new Conta(1236, 1000, "Toad");

    }

    public void executar(){
        while(continuarExecucao) {
            exibirMenu();
            int opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch(opcao){
            case 0:
                System.out.println("Obrigado por ter utilizado nosso sistema!");
                this.continuarExecucao = false;
                break;
            case 1:
                System.out.println("Saldo: R$" + this.conta.getSaldo());
                break;
            case 2:
                System.out.println("Informe o valor:");
                double valorParaDepositar = scanner.nextDouble();
                this.conta.depositar(valorParaDepositar);
                System.out.println("Operação realizada com sucesso! ");
                break;
            case 3:
                System.out.println("Informe o valor:");
                double valorParaRetirar = scanner.nextDouble();
                if(this.conta.sacar(valorParaRetirar)) {
                    System.out.println("Operação realizada com sucesso!");

                }else{
                    System.out.println(("Operação falhou! Vericar Saldo"));
                }
                break;
            case 5:
                System.out.println("Nome do título:");
                String nomeTitulo = scanner.next();
                System.out.println("Informe o valor do título:");
                double valorTitulo = scanner.nextDouble();
                System.out.println("Informe o valor do juros  ao dia");
                double valorJurosTitulo = scanner.nextDouble();
                System.out.println("Informe a dara de vencimento (aaaa-mm-dd): ");
                String dataVAlidade = scanner.next();
                Titulo titulo = new Titulo(valorTitulo, valorJurosTitulo,nomeTitulo, dataVAlidade);
                if(this.conta.sacar(titulo.getTotalPagamento())){
                    System.out.println("Operação realizada com sucesso!");
                } else{
                    System.out.println("Falaha na operação!");
                }
                break;
            default:
                System.out.println("Funcionalidade ainda não implementada");
                break;
        }
    }

    private void exibirMenu() {
        System.out.println("Bem vindo ao MauaBank");
        System.out.println("1 - Vizualizar SAldo");
        System.out.println("2 - Depositar Dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Transferir dinheiro");
        System.out.println("5 - Pagar titulo");
        System.out.println("0 - Sair do sistema");

    }
}
