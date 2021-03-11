package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class showGUI implements ActionListener {
    JFrame myFrame;
    JButton btn;
    JTextField pwdLength;
    JTextField pwdNumber;
    passwordCreator pwd = new passwordCreator();

    public showGUI(){
        myFrame = new JFrame("Password Generator");
        btn = new JButton("Generate");
        pwdLength = new JTextField(7);
        pwdNumber = new JTextField(7);

        myFrame.setLayout(null);
        myFrame.setSize(700, 400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);

        btn.setSize(130,70);
        btn.setLocation(270,45);
        btn.setBackground(Color.LIGHT_GRAY);

        pwdLength.setLocation(100, 60);
        pwdLength.setSize(100, 25);
        pwdNumber.setLocation(480, 60);
        pwdNumber.setSize(100, 25);

        myFrame.add(btn);
        myFrame.add(pwdLength);
        myFrame.add(pwdNumber);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        pwd.length = Integer.parseInt(pwdLength.getText());
        int pwdInt = Integer.parseInt(pwdNumber.getText());

        for (int i = 0; i < pwdInt; i++)
        System.out.println(pwd.randomizer());
    }
}
