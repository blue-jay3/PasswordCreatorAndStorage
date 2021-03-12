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
    JLabel showPassword1;
    JLabel showPassword2;
    JLabel showPassword3;
    JLabel showPassword4;
    JLabel showPassword5;

    passwordCreator pwd = new passwordCreator();

    public showGUI(){
        myFrame = new JFrame("Password Generator");
        btn = new JButton("Generate");
        pwdLength = new JTextField(7);
        pwdNumber = new JTextField(7);
        lengthLabel = new JLabel("Number of Characters:");
        numberLabel = new JLabel("Amount of Passwords:");
        showPassword1 = new JLabel("");
        showPassword2 = new JLabel("");
        showPassword3 = new JLabel("");
        showPassword4 = new JLabel("");
        showPassword5 = new JLabel("");

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

        showPassword1.setLocation(60,150);
        showPassword1.setSize(500,25);
        showPassword2.setLocation(60,180);
        showPassword2.setSize(500,25);
        showPassword3.setLocation(60,210);
        showPassword3.setSize(500,25);
        showPassword4.setLocation(60,240);
        showPassword4.setSize(500,25);
        showPassword5.setLocation(60,270);
        showPassword5.setSize(500,25);

        myFrame.add(btn);
        myFrame.add(pwdLength);
        myFrame.add(pwdNumber);
        myFrame.add(lengthLabel);
        myFrame.add(numberLabel);
        myFrame.add(showPassword1);
        myFrame.add(showPassword2);
        myFrame.add(showPassword3);
        myFrame.add(showPassword4);
        myFrame.add(showPassword5);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        showPassword1.setText("");
        showPassword2.setText("");
        showPassword3.setText("");
        showPassword4.setText("");
        showPassword5.setText("");
        int pwdInt = Integer.parseInt(pwdNumber.getText());

        for (int i = 0; i < pwdInt; i++) {
            showPassword1.setText(pwd.randomizer(Integer.parseInt(pwdLength.getText())));
        }
        for (int i = 0; i < pwdInt; i++) {
            showPassword2.setText(pwd.randomizer(Integer.parseInt(pwdLength.getText())));
        }
        for (int i = 0; i < pwdInt; i++) {
            showPassword3.setText(pwd.randomizer(Integer.parseInt(pwdLength.getText())));
        }
        for (int i = 0; i < pwdInt; i++) {
            showPassword4.setText(pwd.randomizer(Integer.parseInt(pwdLength.getText())));
        }
        for (int i = 0; i < pwdInt; i++) {
            showPassword5.setText(pwd.randomizer(Integer.parseInt(pwdLength.getText())));
        }
    }
}
