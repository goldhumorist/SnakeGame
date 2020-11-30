package com.company;

import javax.swing.*;

public class Main extends JFrame {
    public Main(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new Game());
        setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
