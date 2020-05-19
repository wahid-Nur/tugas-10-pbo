package oop10;

import javax.swing.*;
public class Swing {
    public static void main (String[] args) {
        JFrame myFrame = new JFrame("program Swing");
        JLabel myLabel = new JLabel("Ini adalah bagian swing");
        myFrame.add(myLabel);
        myFrame.setSize(250,200);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
