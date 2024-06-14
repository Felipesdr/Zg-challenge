package org.zg.model;

import org.zg.util.AudioPlayer;
import org.zg.util.Sincronizador;

import java.util.List;

public class ErgueiAsMaos {
    public static final String O_SENHOR_TEM_MUITOS_FILHOS = "O senhor tem muitos filhos";
    public static final String MUITOS_F_ILHOS_ELE_TEM = "Muitos fIlhos ele tem";
    public static final String EU_SOU_UM_DELES_VOCE_TAMBEM = "Eu sou um deles, você também";
    private static final String ERGUEI_AS_MAOS = "Erguei as mãos";
    private static final String E_DAI_GLORIA_A_DEUS = " e dai gloria a deus";
    private static final String OS_ANIMAIZINHOS_SUBIRAM = "Os animaizinhos subiram de dois em dois";
    private static final String DEUS_DISSE_A_NOE = "Deus disse a Noé: Constrói uma arca";
    private static final String QUE_SEJA_FEITA = "Que seja feita";
    private static final String LOUVEMOS_AO_SENHOR = "Louvemos ao senhor";
    private static final String E_ATENCAO_AGORA_PORQUE = "E atenção agora porque \n";
    private static final List<String> MEMBROS = List.of("Braço direito", ", braço esquerdo \n", "Perna direita", ", perna esquerda");
    private static final List<String> ACOES = List.of("Balança a cabeça", ", dá uma voltinha \n", "Dá um pulinho", " e abraço o irmão");

    //Tocar muisca com letra
    public void tocarMusicaInteiraComLetra(){
        Thread threadMusica = new Thread(() -> AudioPlayer.playAudio("D:/IdeaProjects/zg-challenge/audio-files/Erguei as maos musica inteira.wav"));
        threadMusica.start();
        letraPrimeiraParte();
        System.out.println(E_ATENCAO_AGORA_PORQUE);
        letraSegundaParte();

        try {
            threadMusica.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void tocarPrimeiraParteComLetra(){
        Thread threadMusica = new Thread(() -> AudioPlayer.playAudio("D:/IdeaProjects/zg-challenge/audio-files/Erguei as maos musica primeira parte.wav"));
        threadMusica.start();
        letraPrimeiraParte();

        try {
            threadMusica.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void tocarSegundaParteComLetra(){
        Thread threadMusica = new Thread(() -> AudioPlayer.playAudio("D:/IdeaProjects/zg-challenge/audio-files/Erguei as maos musica segunda parte.wav"));
        threadMusica.start();
        Sincronizador.esperarParaContinuar(3.5);
        letraSegundaParte();

        try {
            threadMusica.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    //Parte 1
    public void letraPrimeiraParte() {
        Sincronizador.esperarParaContinuar(23.0);
        estrofeErgueiAsMaos(1);
        estrofeAnimaizinhos("elefante", "E os passarinhos,");
        estrofeAnimaizinhos("minhoquinha", "E os pinguins,");
        estrofeAnimaizinhos("canguru", "E o sapinho,");
        estrofeNoe();
        estrofeErgueiAsMaos(3);
    }

    private void estrofeErgueiAsMaos(int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            imprimirVersoDuasVezes(List.of(ERGUEI_AS_MAOS, E_DAI_GLORIA_A_DEUS));
            System.out.println(ERGUEI_AS_MAOS);
            Sincronizador.esperarParaContinuar(2.0);
            versoOsFilhosDoSenhor("E cantai");
        }
    }

    private void estrofeAnimaizinhos(String animal1, String inicioDaFrase) {
        imprimirVersoDuasVezes(List.of(OS_ANIMAIZINHOS_SUBIRAM));
        versoAnimal(animal1);
        Sincronizador.esperarParaContinuar(1.0);
        versoOsFilhosDoSenhor(inicioDaFrase);
    }

    private void estrofeNoe() {
        imprimirVersoDuasVezes(List.of(DEUS_DISSE_A_NOE));
        System.out.println(QUE_SEJA_FEITA);
        versoOsFilhosDoSenhor("De madeira");
        Sincronizador.esperarParaContinuar(1.5);
    }

    private void versoOsFilhosDoSenhor(String inicioDaFrase) {
        if (inicioDaFrase.equals("De madeira")) {
            System.out.println(inicioDaFrase + " para os filhos do senhor" + "\n");
            Sincronizador.esperarParaContinuar(5.0);
        } else {
            System.out.println(inicioDaFrase + " como os filhos do Senhor" + "\n");
            Sincronizador.esperarParaContinuar(5.0);
        }
    }

    private void versoAnimal(String animal) {
        if(animal.charAt(animal.length() -1) == 'a'){
            System.out.println("A " + animal);
            Sincronizador.esperarParaContinuar(0.5);
        } else {
            System.out.println("O " + animal);
            Sincronizador.esperarParaContinuar(0.5);
        }
    }

    private void imprimirVersoDuasVezes(List<String> frase) {
        for (int i = 0; i < 2; i++) {
            imprimirLista(frase);
            System.out.println();
            Sincronizador.esperarParaContinuar(4.0);
        }
    }

    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.print(elemento);
        }
    }

    //Parte 2
    public void letraSegundaParte() {
        for (int i = 1; i < 5; i++) {
            estrofeOSenhorTemMuitosFilhos();
            estrofeIncremental(MEMBROS.subList(0, i));
            System.out.println("\n");
        }

        for (int i = 1; i < 5; i++) {
            estrofeOSenhorTemMuitosFilhos();
            estrofeIncremental(MEMBROS);
            System.out.println();
            estrofeIncremental(ACOES.subList(0, i));
            System.out.println("\n");
        }
    }

    private void estrofeOSenhorTemMuitosFilhos() {
        System.out.println(O_SENHOR_TEM_MUITOS_FILHOS);
        Sincronizador.esperarParaContinuar(3.5);
        System.out.println(MUITOS_F_ILHOS_ELE_TEM);
        Sincronizador.esperarParaContinuar(3.0);
        System.out.println(EU_SOU_UM_DELES_VOCE_TAMBEM);
        Sincronizador.esperarParaContinuar(3.0);
        System.out.println(LOUVEMOS_AO_SENHOR);
        Sincronizador.esperarParaContinuar(4.0);
        System.out.println();
    }
    private void estrofeIncremental(List<String> lista) {
        imprimirLista(lista);
        Sincronizador.esperarParaContinuar(lista.size() * 0.65);
    }
}
