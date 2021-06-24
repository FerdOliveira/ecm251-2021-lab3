package fernando.oliveira.sistema;

import fernando.oliveira.enums.HorarioSistema;
import fernando.oliveira.enums.TiposDeMembro;
import fernando.oliveira.models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static ArrayList<Membros> listaUsuarios = new ArrayList<>(); //ArrayList foi escolhido por apresentar o que mais preciso https://lemus.webs.upv.es/wordpress/wp-content/uploads/2018/02/cheat-sheets.pdf
    private static HorarioSistema horarioSistema = HorarioSistema.NORMAL;

    public static void menu() {
        boolean op = true;

        while (op) {
            System.out.println("------------------------------------------------");
            if (horarioSistema.equals(HorarioSistema.NORMAL)){
                System.out.println(" HORÁRIO NORMAL ");
            }else{
                System.out.println(" HORÁRIO EXTRA ");
            }
            System.out.println("\n Opções Disponiveis: ");
            System.out.println(" 1 - Castrar um novo usuário \n 2 - Postar uma mensagem \n 3 - Trocar o horário de trabalho \n 4 - Excluir membro ja cadastrado \n 5 - Apresentacao de todos os membros \n 6 - Para sair ");
            Scanner in = new Scanner(System.in);

            int num = in.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Opcao de cadastrar escolhida");

                    System.out.println("Nome: ");
                    String nome = in.next();

                    System.out.println("Email: ");
                    String email = in.next();

                    System.out.println(" Escolha o cargo para " + nome + ":");
                    System.out.println(" 1 - Mobile Members \n 2 - Heavy Lifters \n 3 - Script guys \n 4 - Big Brothers");
                    int cargo = in.nextInt();
                    in.nextLine();
                    /**
                     * Este foi criado para cadastrar os membros em um determinado cargo
                     */
                    switch (cargo) {
                        case 1:
                            listaUsuarios.add(new MobileMembers(nome, email, TiposDeMembro.MOBILE_MEMBERS));
                            System.out.println("Cadastrando Mobile members");
                            break;
                        case 2:
                            listaUsuarios.add(new HeavyLifters(nome, email, TiposDeMembro.HEAVY_LIFTERS));
                            System.out.println("Cadastrando Heavy lifters");
                            break;
                        case 3:
                            listaUsuarios.add(new ScriptGuys(nome, email, TiposDeMembro.SCRIPT_GUYS));
                            System.out.println("Cadastrando Script guy");
                            break;
                        case 4:
                            listaUsuarios.add(new BigBrothers(nome, email, TiposDeMembro.BIG_BROTHERS));
                            System.out.println("Cadastrando Big Brothers");
                            break;
                        default:
                            System.out.println("Este cargo nao existe");
                            break;
                    }
                    break;

                case 3:
                    if (horarioSistema.equals(horarioSistema.NORMAL)){
                        horarioSistema = horarioSistema.EXTRA;
                        System.out.println("Voce agora esta fazendo hora EXTRA");
                    }else{
                        horarioSistema = horarioSistema.NORMAL;
                        System.out.println("Seu horario agora é NORMAL");
                    }
                    break;

                case 4:
                    System.out.println("Digite a posição do membro cadastrado que deseja excluir: ");
                    int excluirMembro = in.nextInt();
                    in.nextLine();
                    try{
                        listaUsuarios.remove(excluirMembro);
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("ESSA POSICAO NAO EXISTE");
                    }
                    break;

                case 5:
                    int index = 0;
                    for (Membros membro : listaUsuarios) {
                        listaUsuarios.get(index).apresentacao();
                        index++;
                    }
                    break;

                case 6:
                    listaUsuarios.forEach(System.out::println);
                    System.out.println("Obrigado por usar nosso sistema");
                    op = false;
                    break;

                default:
                    System.out.println("ESTA OPCAO NAO EXISTE, TENTE OUTRA");
                    break;

            }
        }
    }
}
