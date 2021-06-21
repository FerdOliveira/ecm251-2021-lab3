package fernando.oliveira.sistema;
import java.util.Scanner;
public class Menu {

    public static void menu(){
        boolean op = true;
        while(op){
        System.out.println("Opções Disponiveis: ");
        System.out.println(" 1 - Castrar um novo usuário \n 2 - Postar uma mensagem \n 3 - Trocar o horário de trabalho \n 4 - Excluir usuário \n 5 - Para sair ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num){
        case 1:
            System.out.println("Opcao de cadastrar escolhida");
            System.out.println("Nome: ");
            String nome = in.next();
            System.out.println("Email: ");
            String email = in.next();
            System.out.println(" Escolha o cargo para "+ nome + ":");
            System.out.println(" 1 - Mobile Members \n 2 - Heavy Lifters \n 3 - Script guys \n 4 - Big Brothers");
            String cargo = in.next();
            in.nextLine();
            break;
        case 5:
            System.out.println("Obrigado por usar nosso sistema");
            op = false;


    }
    }
    }
}
