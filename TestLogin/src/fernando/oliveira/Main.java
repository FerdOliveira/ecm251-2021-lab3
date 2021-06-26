package fernando.oliveira;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Login.run();

    }
    static class Login {
        public static void run() throws FileNotFoundException {
            Scanner scan = new Scanner (new File("C:\\projeto\\Login.txt"));
            Scanner keyboard = new Scanner (System.in);
            String user = scan.nextLine();
            String pass = scan.nextLine(); // looks at selected file in scan

            String inpUser = keyboard.nextLine();
            String inpPass = keyboard.nextLine(); // gets input from user

            if (inpUser.equals(user) && inpPass.equals(pass)) {
                System.out.print("your login message");
            } else {
                System.out.print("your error message");
            }
        }
    }
}
