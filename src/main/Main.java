package main;

import javax.swing.*;

public class Main extends JFrame {


    static SoundClass soundClass = new SoundClass();


    public static void main(String[] args) {
        Main window = new Main();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Main Window");
        window.setSize(500, 500);
        window.setLayout(null);

        window.setLocationRelativeTo(null);

        window.setVisible(true);
        window.setFocusable(true);

        soundClass.startThread();

    }



}