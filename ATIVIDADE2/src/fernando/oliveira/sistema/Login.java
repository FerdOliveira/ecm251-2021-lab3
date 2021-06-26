package fernando.oliveira.sistema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static fernando.oliveira.sistema.Menu.menu;

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
