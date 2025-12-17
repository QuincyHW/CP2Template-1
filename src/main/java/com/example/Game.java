package com.example;
import javax.swing.*;
//very simple runner for our program. Don't mess with it.
public class Game implements Runnable {
    public void run() {
        SwingUtilities.invokeLater(new StartMenu()); 
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game());

        //  GameWindow window = new GameWindow("black","white", 0,0,0);
        //  Board b = new Board(window);
         
         
         
    }
}
