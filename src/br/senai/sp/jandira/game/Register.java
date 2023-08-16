package br.senai.sp.jandira.game;

import br.senai.sp.jandira.game.Model.Enemy;
import br.senai.sp.jandira.game.Model.Output;

import java.util.Locale;
import java.util.Scanner;

public class Register {

    int avaliaAmbos = 0;
    /**
     * Instancia Player
     */
    Player player = new Player();

    /**
     * Instancia Enemy
     */
    Enemy enemy = new Enemy();

    /**
     * Instancia Teclado
     */
    Output output = new Output();

    /**
     * Instancia Teclado
     */
    Scanner teclado = new Scanner(System.in);


    public void BothRegister() {
        avaliaAmbos = 1;

        PlayerRegister();
        EnemyRegister();


    }

    public void PlayerRegister() {
        System.out.println("---------------------------------------");
        System.out.println("-----------  Cadastro Player  ---------");
        System.out.println("---------------------------------------");
        System.out.println(" Qual é o seu nome: ");
        player.name = teclado.next();
        System.out.println(" Selecione sua skin [red- yellow - blue] : ");
        player.skin = teclado.next();
        System.out.println("------ Player Cadastrado com Sucesso ------");

        if (avaliaAmbos != 1) {
            output.PrintPlayer(player);
        }

    }

    public void EnemyRegister() {
        System.out.println("---------------------------------------");
        System.out.println("------------- Cadastro Enemy----------");
        System.out.println("---------------------------------------");
        System.out.println("Qual é o seu nome");
        enemy.name = teclado.next();
        System.out.println(" Selecione sua skin [red- yellow - blue] : ");
        enemy.skin = teclado.next();
        System.out.println("------ Player Cadastrado com Sucesso ------");

        if (avaliaAmbos != 1) {
            output.PrintEnemy(enemy);
        }
    }


    public void Decision() {

        String decision;

        System.out.println(" Seja Bem-vindo!!! ");
        System.out.println(" o que deseja cadastrar? [Player - Enemys - Ambos] ");
        decision = teclado.next();

        switch (decision.toLowerCase()) {

            case "player":
                PlayerRegister();
                break;

            case "enemy":
                EnemyRegister();
                break;

            case "ambos":
                BothRegister();

                break;

        }
        System.out.println("----------------");
        System.out.println("Deseja Continuar [1-Sim  2-Não]");
        int continuar = teclado.nextInt();

        if (continuar == 1) {
            Decision();
        }
    }
}

