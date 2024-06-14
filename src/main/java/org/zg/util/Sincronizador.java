package org.zg.util;

public class Sincronizador {

    public static void esperarParaContinuar(Double segundos){
        try {
            Thread.sleep((long) (segundos * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
