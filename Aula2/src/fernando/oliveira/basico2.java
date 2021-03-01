package fernando.oliveira;

import java.sql.SQLOutput;

public class basico2 {
    //Estruturas de decisão
    public static void main(String[] args) {
        int ano = 2020;

        //Estrutura de decisão simples
        if(ano % 2 == 0){
            System.out.println("Ano par!");

        }
        if(ano % 2 == 1){
            System.out.println("Ano impar! ");
        }

        //Estrutura de decisão compostas
        if(ano %2 == 0){
            System.out.println("ano par!");
        } else{
            System.out.println("Ano impar!");
        }

        //varias decisoes
        switch(ano){
            case 2020:
                System.out.println("Vixi!");
                break;
            case 1996:
                System.out.println("Pokemon Red!!");
                break;
            default:
                System.out.println("Quase boku no hero saindo!");
        }
    }
}
