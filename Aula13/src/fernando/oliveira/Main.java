package fernando.oliveira;

import fernando.oliveira.model.Item;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	File file = new File("dados.txt");
    //Realizar a leitura do conteudo desse arquivo
        try{
            //criar elemento para iterar pelo arquivo
            Scanner scanner = new Scanner(file);
            //Passa por todos os elementos do arquivo
            while(scanner.hasNext()){
                String linha = scanner.nextLine();
                System.out.println("Linha Atual:" + linha);
            }

        }
        catch(Exception exception){
            System.out.println("Algo deu errado"
            );
        }

        }
    public static Item pegaItem(String dados){
        return new Item(dados.split(",")[0],
                Double.parseDouble(dados.split(",")[1]));
    }

}
