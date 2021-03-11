package com.example;

import javax.swing.*;

public class showGUI {
    JFrame myFrame = new JFrame("Password Generator");
    passwordCreator pwd = new passwordCreator();

    public void gui(){
        JButton btn = new JButton("Generate");

        myFrame.setLayout(null);
        myFrame.setSize(700, 400);
        myFrame.setVisible(true);


    }
}
