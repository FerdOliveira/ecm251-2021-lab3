package fernando.oliveira.sistema;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static fernando.oliveira.sistema.Menu.menu;

/**
 * Classe de Login que faz com que verifique se é um big brother ou não, para ter acesso ao login exato verificar o arquivo de LoginBigBrother
 */

public class Login {
    public static void run() throws IOException {
        Scanner scan = new Scanner(new File("C:\\projeto\\LoginBigBrother.txt")); // pegar o arquivo do meu repositorio do github
        Scanner keyboard = new Scanner(System.in);
        String user = scan.nextLine();
        String pass = scan.nextLine();

        String inpUser = keyboard.nextLine();
        String inpPass = keyboard.nextLine();

        if (inpUser.equals(user) && inpPass.equals(pass)) {
            System.out.print("Bem vindo BigBrother \n");
            menu();
        } else {
            System.out.print("VOCE NAO É UM BIG BROTHER, LOGO NAO PODERA ACESSAR MEUS RECURSOS");
        }
    }
}
