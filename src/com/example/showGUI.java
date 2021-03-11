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
    JLabel showPasswords;

    passwordCreator pwd = new passwordCreator();

    public showGUI(){
        myFrame = new JFrame("Password Generator");
        btn = new JButton("Generate");
        pwdLength = new JTextField(7);
        pwdNumber = new JTextField(7);
        lengthLabel = new JLabel("Number of Characters:");
        numberLabel = new JLabel("Amount of Passwords:");
        showPasswords = new JLabel("");

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

        showPasswords.setLocation(60,100);
        showPasswords.setSize(700,100);

        myFrame.add(btn);
        myFrame.add(pwdLength);
        myFrame.add(pwdNumber);
        myFrame.add(lengthLabel);
        myFrame.add(numberLabel);
        myFrame.add(showPasswords);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        showPasswords.setText("");
        int pwdInt = Integer.parseInt(pwdNumber.getText());

        for (int i = 0; i < pwdInt; i++) {
            showPasswords.setText(showPasswords.getText() + (i + 1) + ": " + pwd.randomizer(Integer.parseInt(pwdLength.getText())) + "  ");
        }
    }
}
