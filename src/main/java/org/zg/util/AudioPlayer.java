package org.zg.util;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioPlayer {
    public static void playAudio(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Aguarda até que o áudio termine de ser reproduzido
            while (!clip.isRunning())
                Thread.sleep(10);
            while (clip.isRunning())
                Thread.sleep(10);

            clip.close();
            audioStream.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException |InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
