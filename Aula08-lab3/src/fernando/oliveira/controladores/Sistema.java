package fernando.oliveira.controladores;

import fernando.oliveira.models.Jogada;
import fernando.oliveira.models.Jogador;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Jogador player1;
    private Jogador player2;
    private Scanner scanner;
    private final Jogada[] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura(), new Lagarto(), new Spoke()};

    public Sistema() {
        this.scanner = new Scanner(System.in);
        inicializaPlayers();
    }

    private void inicializaPlayers() {
        System.out.println("Informe seu nome:");
        String nome = scanner.next();
        this.player1 = new Jogador(nome, true);
        this.player2 = new Jogador("Cid");
    }

    public void run(){
        while(true){
            System.out.println(player1 + " vs "+player2);
            player1.setJogada(selecionarJogada());
            player2.setJogada(sortearJogada());
            System.out.println("Jogadas:");
            System.out.println(player1+":"+player1.getJogada());
            System.out.println(player2+":"+player2.getJogada());
            System.out.println("Resultado:" + player1.getJogada().verificaResultado(player2.getJogada()));
        }
    }

    private Jogada selecionarJogada() {
        int escolha;
        System.out.println("Escolha:");
        for (int i = 0; i < jogadas.length; i++) {
            System.out.println(""+i+" - "+ jogadas[i]);
        }
        escolha = scanner.nextInt();
        return jogadas[escolha];
    }

    private Jogada sortearJogada() {
        return jogadas[new Random().nextInt(jogadas.length)];
    }
}
