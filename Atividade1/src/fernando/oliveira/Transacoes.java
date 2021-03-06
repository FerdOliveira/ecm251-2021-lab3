// Fernando Oliveira de souza 19.00617-9
// Este trabalho foi realizado com auxilio dos programas anteriores de aula e o curso de introdução a Orientacao da Alura
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

    public static void transacao(Contas pagador, Contas recebedor, String boleto){ // metodo que precisa de 3 parametros a Conta que ira pagar, a Conta que ira receber, e o QRcode gerado em gerarOsQRCode
        String s = boleto; //atribuida a string s o Qr code que no caso é o boleto aqui
        String[] dados = s.split(";"); // transformar a string em lsita para uma melhor manipulação dos dados
//        System.out.println(dados[0]); //teste para ver se pegava separado o 1° item que seria o id
//        System.out.println(dados[1]); //teste para ver se pegava separado o 2° item que seria o nome
//        System.out.println(dados[2]); //teste para ver se pegava separado o 3° item que seria o valor a ser pago
//        System.out.println(dados[3]); //teste para ver se pegava separado o 4° item que seria o id

//        if(pagador.getSaldo()>= dados[2]){  ///////TENTADO CRIAR DIRETO UM IF ASSIM, ENTRETANTO ESTA TUDO EM STRING, PRECISO CONVERTER PARA DOUBLE OU INT;
//        pagador.sacar(dados[2]);
//        recebedor.depositar(dados[2]);
//    }
        double valor = Double.parseDouble(dados[2]); // para tentar converter o valor  em string  tentei usar double valor = dados[2], entretanto deu erro e ele me ofereceu essa opcao que deu certo kkk
        if(pagador.getSaldo()>=valor){ //
            pagador.sacar(valor);
            recebedor.depositar(valor);
        }else{
        System.out.println("ERRO SALDO INSUFICIENTE DO USUARIO COM ID: " + pagador.getIdConta());}
    }
}
