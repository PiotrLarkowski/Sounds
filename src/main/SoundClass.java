package main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class SoundClass implements Runnable {
    Thread mainThreat = new Thread(this);
    static Clip clip;
    URL[] soundURL = new URL[10];

    public SoundClass() {
        soundURL[0] = getClass().getResource("/main/resources/music/aaa.wav");
    }

    void startThread(){
        mainThreat.start();
    }
    private void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception ignore) {
        }
    }

    public static void play() {
            clip.start();
    }

    private void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public static void stop() {
        clip.stop();
    }

    public void playMusic(int i){
        setFile(i);
        play();
        loop();
    }

    @Override
    public void run() {
        System.out.println("Running");
        playMusic(0);
    }


}
