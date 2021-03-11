package com.example;

import javax.swing.*;
import javax.swing.plaf.multi.MultiInternalFrameUI;
import java.awt.*;
import java.awt.event.*;

public class showGUI implements ActionListener {
    JFrame myFrame;
    JButton btn;
    JTextField pwdLength;
    JTextField pwdNumber;
    JLabel lengthLabel;
    JLabel numberLabel;

    passwordCreator pwd = new passwordCreator();

    public showGUI(){
        myFrame = new JFrame("Password Generator");
        btn = new JButton("Generate");
        pwdLength = new JTextField(7);
        pwdNumber = new JTextField(7);
        lengthLabel = new JLabel("Number of Characters:");
        numberLabel = new JLabel("Amount of Passwords:");

        myFrame.setLayout(null);
        myFrame.setSize(700, 400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);

        btn.setSize(130,70);
        btn.setLocation(270,45);
        btn.setBackground(Color.LIGHT_GRAY);

        lengthLabel.setLocation(90, 20);
        lengthLabel.setSize(200, 25);
        numberLabel.setLocation(465, 20);
        numberLabel.setSize(200, 25);

        pwdLength.setLocation(100, 60);
        pwdLength.setSize(100, 25);
        pwdNumber.setLocation(480, 60);
        pwdNumber.setSize(100, 25);

        myFrame.add(btn);
        myFrame.add(pwdLength);
        myFrame.add(pwdNumber);
        myFrame.add(lengthLabel);
        myFrame.add(numberLabel);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        pwd.length = Integer.parseInt(pwdLength.getText());
        int pwdInt = Integer.parseInt(pwdNumber.getText());

        for (int i = 0; i < pwdInt; i++)
        System.out.println(pwd.randomizer());
    }
}
