package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class showGUI implements ActionListener {
    JFrame myFrame;
    passwordCreator pwd = new passwordCreator();

    public showGUI(){
        myFrame = new JFrame("Password Generator");
        JButton btn = new JButton("Generate");
        JTextField pwdLength = new JTextField(7);
        JTextField pwdNumber = new JTextField(7);

        myFrame.setLayout(null);
        myFrame.setSize(700, 400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);

        btn.setSize(130,70);
        btn.setLocation(270,200);
        btn.setBackground(Color.LIGHT_GRAY);

        pwdLength.setLocation(30, 60);
        pwdLength.setLocation(70, 60);

        myFrame.add(btn);
        myFrame.add(pwdLength);
        myFrame.add(pwdNumber);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(pwd.randomizer());
        System.out.println(pwd.randomizer());
        System.out.println(pwd.randomizer());
    }
}
