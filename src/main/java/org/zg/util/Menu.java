package org.zg.util;

import org.zg.model.ErgueiAsMaos;

import java.util.Scanner;

public class Menu {

    private int opcao = 0;
    private ErgueiAsMaos ergueiAsMaos = new ErgueiAsMaos();
    private Scanner sc = new Scanner(System.in);
    public void exibirMenu(){
        Thread threadMusica = new Thread(() -> AudioPlayer.playAudio("D:/IdeaProjects/zg-challenge/audio-files/menu.wav"));
        threadMusica.start();

        System.out.println("  _____          _            __  __                    _         _____               _            ______                      _               __  __  /\\/|             _ _ ");
        System.out.println(" |  __ \\        | |          |  \\/  |                  | |       |  __ \\             (_)          |  ____|                    (_)             |  \\/  ||/\\/             | | |");
        System.out.println(" | |__) |_ _  __| |_ __ ___  | \\  / | __ _ _ __ ___ ___| | ___   | |__) |___  ___ ___ _   ______  | |__   _ __ __ _ _   _  ___ _    __ _ ___  | \\  / | __ _  ___  ___  | | |");
        System.out.println(" |  ___/ _` |/ _` | '__/ _ \\ | |\\/| |/ _` | '__/ __/ _ \\ |/ _ \\  |  _  // _ \\/ __/ __| | |______| |  __| | '__/ _` | | | |/ _ \\ |  / _` / __| | |\\/| |/ _` |/ _ \\/ __| | | |");
        System.out.println(" | |  | (_| | (_| | | |  __/ | |  | | (_| | | | (_|  __/ | (_) | | | \\ \\ (_) \\__ \\__ \\ |          | |____| | | (_| | |_| |  __/ | | (_| \\__ \\ | |  | | (_| | (_) \\__ \\ |_|_|");
        System.out.println(" |_|   \\__,_|\\__,_|_|  \\___| |_|  |_|\\__,_|_|  \\___\\___|_|\\___/  |_|  \\_\\___/|___/___/_|          |______|_|  \\__, |\\__,_|\\___|_|  \\__,_|___/ |_|  |_|\\__,_|\\___/|___/ (_|_)");
        System.out.println("                                                                                                               __/ |                                                        ");
        System.out.println("                                                                                                              |___/                                                         ");

        System.out.println("\n Selecione a opção que deseja: \n");

        while (opcao != 4){
            System.out.println("[1] -> Tocar primeira parte");
            System.out.println("[2] -> Tocar segunda parte");
            System.out.println("[3] -> Tocar música inteira");
            System.out.println("[4] -> Sair");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    ergueiAsMaos.tocarPrimeiraParteComLetra();
                    break;
                case 2:
                    ergueiAsMaos.tocarSegundaParteComLetra();
                    break;
                case 3:
                    ergueiAsMaos.tocarMusicaInteiraComLetra();
                    break;
            }
        }
    }
}
