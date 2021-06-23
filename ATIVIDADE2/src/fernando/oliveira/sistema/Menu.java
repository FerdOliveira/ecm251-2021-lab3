package fernando.oliveira.sistema;
import fernando.oliveira.models.Membros;

import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    private static ArrayList<Membros> listaUsuarios = new ArrayList<>(); //ArrayList foi escolhido por apresentar o que mais preciso https://lemus.webs.upv.es/wordpress/wp-content/uploads/2018/02/cheat-sheets.pdf
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
            int cargo = in.nextInt();
            in.nextLine();
            /**
             * Este foi criado para cadastrar os membros em um determinado cargo
             */
            switch (cargo) {
                case 1:
                    listaUsuarios.add(new Membros(nome, email, "MOBILEMEMBER"));
                    System.out.println("Cadastrando Mobile members");
                    break;
                case 2:
                    System.out.println("Cadastrando Heavy lifters");
                    break;
                case 3:
                    System.out.println("Cadastrando Script guy");
                    break;
                case 4:
                    System.out.println("Cadastrando Big Brothers");
                    break;
                default:
                    System.out.println("Este cargo nao existe");
                    break;
            }
            break;
        case 4:
            System.out.println("Digite a posição do membro cadastrado que deseja excluir: ");
            int excluirMembro = in.nextInt();
            in.nextLine();
            listaUsuarios.remove(excluirMembro);
            break;
        case 5:
            listaUsuarios.forEach(user -> System.out.println(user));
            System.out.println("Obrigado por usar nosso sistema");
            op = false;
            break;

    }
    }
    }
}
