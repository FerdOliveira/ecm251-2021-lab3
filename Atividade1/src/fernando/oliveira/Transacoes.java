package fernando.oliveira;

import java.util.Random;

public class Transacoes {
    public static String gerarOsQRCode(double valor, Contas conta, Usuarios pessoa){ // metodo criado para gerar o QRcode que no caso é uma string entao feito um static para mostrar que a mesma é algo que que é compartilhado
        // as demais classes
        int id = conta.getIdConta(); //  pegar o id  da conta da
        String nome = pessoa.getNome(); // pegar o nome da pessoa a qual eu queria da classe Usuarios
        int randomTransacao = getRandomNumberInRange(1000,9999); //pegar numero aleatorio inteiro entre 1000 e 9999
        return id+";"+nome+";"+valor+";"+randomTransacao; // retorno no formato que queria Ex “5;PERIGO;1;1234”
    }

    private static int getRandomNumberInRange ( int min , int max ) { // metodo para gerarmos um numero aleatorio
        Random r = new Random();
        return r . nextInt (( max - min ) + 1 ) + min ;
    }
}
