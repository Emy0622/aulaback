package br.senai.sp.jandira.game;

import br.senai.sp.jandira.game.Model.Enemy;
import br.senai.sp.jandira.game.Model.Output;

import java.util.Scanner;

public class Register {

    /** Instancia Player */
    Player player = new Player();

    /** Instancia Enemy*/
    Enemy enemy = new Enemy();

    /** Instancia Teclado */
    Output output = new Output();

    /** Instancia Teclado */
    Scanner teclado = new Scanner(System.in);

    public void PlayerRegister() {
        System.out.println("---------------------------------------");
        System.out.println("-----------  Cadastro Player  ---------");
        System.out.println("---------------------------------------");
        System.out.println(" Qual é o seu nome: ");
        player.name = teclado.nextLine();
        System.out.println(" Selecione sua skin [red- yellow - blue] : ");
        player.skin = teclado.nextLine();
        System.out.println("------ Player Cadastrado com Sucesso ------");

        Output.PrintPlayer(player);
    }
    public void EnemyRegister() {
        System.out.println("---------------------------------------");
        System.out.println("------------- Cadastro Enemy----------");
        System.out.println("---------------------------------------");
        System.out.println("Qual é o seu nome");
        player.name = teclado.nextLine();
        System.out.println(" Selecione sua skin [red- yellow - blue] : ");
        player.skin = teclado.nextLine();
        System.out.println("------ Player Cadastrado com Sucesso ------");


        output.PrintEnemy(enemy);
    }

    public void BothRegister(){

        String decision;

        System.out.println(" Seja Bem-vindo!!! ");
        System.out.println(" o que deseja cadastrar? [Player - Enemys - Ambos] ");
        decision = teclado.nextLine();

        switch (decision){

            case "Player":
                PlayerRegister();
                break;

                case "Enemy":
            EnemyRegister();
                break;

            case "Ambos":
                BothRegister();
                break;

            default:
                System.out.println("Escolha uma opção valida");
                Decision();

        }
    }

    }

