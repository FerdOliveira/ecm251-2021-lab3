package fernando.oliveira.sistema;

import fernando.oliveira.enums.HorarioSistema;
import fernando.oliveira.enums.TiposDeMembro;
import fernando.oliveira.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Menu inicial que faz tudo
 */
public class Menu {

    private static ArrayList<Membros> listaUsuarios = new ArrayList<>(); //ArrayList foi escolhido por apresentar o que mais preciso https://lemus.webs.upv.es/wordpress/wp-content/uploads/2018/02/cheat-sheets.pdf
    private static HorarioSistema horarioSistema = HorarioSistema.NORMAL;

    public static void menu() throws IOException {
        boolean op = true;

        /**
         *  While para ficar executando
         */
        while (op) {
            System.out.println("------------------------------------------------");
            getHorario();
            System.out.println("\n Opções Disponiveis: ");
            System.out.println(" 1 - Castrar um novo usuário \n 2 - Postar uma mensagem \n 3 - Trocar o horário de trabalho \n 4 - Excluir membro ja cadastrado \n 5 - Apresentacao de todos os membros \n 6 - Para sair ");
            Scanner in = new Scanner(System.in);

            int num = in.nextInt();
            in.nextLine();

            switch (num) {

                /**
                 * Case 1, cadrasta membros com Nome, Email e Cargo
                 */
                case 1:
                    System.out.println("Opcao de cadastrar escolhida");

                    System.out.println("Nome: ");
                    String nome = in.nextLine();

                    System.out.println("Email: ");
                    String email = in.next();
                    in.nextLine();

                    System.out.println(" Escolha o cargo para " + nome + ":");
                    System.out.println(" 1 - Mobile Members \n 2 - Heavy Lifters \n 3 - Script guys \n 4 - Big Brothers");
                    int cargo = in.nextInt();

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

                /**
                 * Case 2 para postar uma mensagem para todos os membros, onde todos os membros mandam a mesma mensagem
                 * e assinam diferente para cada cargo
                 */
                case 2:
                    System.out.println("Digite a mensagem que deseja mandar para os membros: ");
                    String mensagem = in.nextLine();
                    listaUsuarios.forEach(membro -> membro.postarMensagem(mensagem, horarioSistema));
                    break;

                /**
                 * Case 3 para trocar o horário do sistema onde que compara com o atual e troca o mesmo
                 */
                case 3:
                    horarioSistema = horarioSistema.trocarHorario();
                    break;

                /**
                 * Case 4 para excluir um membro onde recebe a posicao onde o membro sera excluido lembrando que o index comeca em 0
                 */
                case 4:
                    System.out.println("Digite a posição do membro cadastrado que deseja excluir: ");
                    int excluirMembro = in.nextInt();
                    in.nextLine();

                    try {
                        listaUsuarios.remove(excluirMembro);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("ESSA POSICAO NAO EXISTE");
                    }
                    break;

                /**
                 * case 5 chama o metodo apresentacao que faz apresentacao de todos os membros monstrando
                 * nome, email e cargo
                 */
                case 5:
                    int index2 = 0;
                    for (Membros membro : listaUsuarios) {
                        listaUsuarios.get(index2).apresentacao();
                        index2++;
                    }
                    break;

                /**
                 * Case 6 Encerra o programa e manda o arraylist listausuarios para um arquivo csv
                 */
                case 6:
//                    listaUsuarios.forEach(System.out::println);
                    // video do youtube para fazer esta parte https://www.youtube.com/watch?v=dHZaqMmQNO4
                    try {
                        writeCSV();
                    } catch (FileNotFoundException e) {
                        System.out.println("Arquivo não Encontrado...");
                    }
                    System.out.println("Obrigado por usar nosso sistema");
                    op = false;
                    break;

                /**
                 * Se caso escolher um numero que nao tenha no case, apenas apresenta a mensagem abaixo e volta pro inicio
                 */
                default:
                    System.out.println("ESTA OPCAO NAO EXISTE, TENTE OUTRA");
                    break;

            }
        }
    }

    /**
     * Método para criar um arquivo CSV
     *
     * @throws FileNotFoundException
     */
    static void writeCSV() throws FileNotFoundException {
        File csvFile = new File("arquivo_super_Secreto_nao_abrir.csv");
        PrintWriter out = new PrintWriter(csvFile);
        for (Membros usuario : listaUsuarios) {
            out.println(usuario);
        }
        out.close();
    }

    /**
     * Método para verifica o horario atual
     */
    private static void getHorario() {
        if (horarioSistema.equals(HorarioSistema.NORMAL)) {
            System.out.println(" HORÁRIO NORMAL ");
        } else {
            System.out.println(" HORÁRIO EXTRA ");
        }
    }
}
