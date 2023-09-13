package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    Button[] btn;
    TextField tf;
    Calculator() {
        btn = new Button[16];
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button();
        }
        int x = 50; int y = 200;
        for (int i = 0; i < btn.length; i++) {
            btn[i].setBounds(x, y, 50, 50);
            x += 60;
            if ((i+1) % 4 == 0) {
                x = 50;
                y += 60;
            }
        }
        btn[0].setLabel("1");
        btn[1].setLabel("2");
        btn[2].setLabel("3");
        btn[3].setLabel("*");
        btn[4].setLabel("4");
        btn[5].setLabel("5");
        btn[6].setLabel("6");
        btn[7].setLabel("/");
        btn[8].setLabel("7");
        btn[9].setLabel("8");
        btn[10].setLabel("9");
        btn[11].setLabel("-");
        btn[12].setLabel("");
        btn[13].setLabel("0");
        btn[14].setLabel("=");
        btn[15].setLabel("+");

        tf = new TextField();
        tf.setBounds(50, 100, 200, 20);

        add(tf);
        addBtn();

        for (int i = 0; i < btn.length; i++) {
            btn[i].addActionListener(this);
        }

        setTitle("Калькулятор");
        setLayout(null);
        setVisible(true);
        setSize(340, 500);
    }

    public void addBtn() {
        for (int i = 0; i < btn.length; i++) {
            add(btn[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn[0]) {
            tf.setText(tf.getText() + "1");
        } else if (e.getSource() == btn[1]) {
            tf.setText(tf.getText() + "2");
        }

//        Color rdm = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
//        this.setBackground(rdm);
    }
}
