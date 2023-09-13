package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    double a;
    double b;

    boolean plus = false;
    boolean minus = false;
    boolean mult = false;
    boolean dev = false;
    Button[] btn;
    TextField tf;
    Calculator() {
        btn = new Button[20];
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button();
        }
        int x = 20; int y = 100;
        for (int i = 0; i < btn.length; i++) {
            btn[i].setBounds(x, y, 50, 50);
            x += 60;
            if ((i+1) % 4 == 0) {
                x = 20;
                y += 60;
            }
        }
        btn[0].setLabel("C");
        btn[1].setLabel("");
        btn[2].setLabel("");
        btn[3].setLabel("");
        btn[4].setLabel("1");
        btn[5].setLabel("2");
        btn[6].setLabel("3");
        btn[7].setLabel("*");
        btn[8].setLabel("4");
        btn[9].setLabel("5");
        btn[10].setLabel("6");
        btn[11].setLabel("/");
        btn[12].setLabel("7");
        btn[13].setLabel("8");
        btn[14].setLabel("9");
        btn[15].setLabel("-");
        btn[16].setLabel(".");
        btn[17].setLabel("0");
        btn[18].setLabel("=");
        btn[19].setLabel("+");

        tf = new TextField();
        tf.setBounds(20, 40, 230, 50);
        Font font = new Font("Comic", 1, 38);
        tf.setFont(font);

        add(tf);
        addBtn();

        for (int i = 0; i < btn.length; i++) {
            btn[i].addActionListener(this);
        }

        setTitle("Калькулятор");
        setLayout(null);
        setVisible(true);
        setSize(270, 410);
    }

    public void addBtn() {
        for (int i = 0; i < btn.length; i++) {
            add(btn[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn[0]) {
          tf.setText("");
        } else if (e.getSource() == btn[4]) {
            tf.setText(tf.getText() + "1");
        } else if (e.getSource() == btn[5]) {
            tf.setText(tf.getText() + "2");
        } else if (e.getSource() == btn[6]) {
            tf.setText(tf.getText() + "3");
        } else if (e.getSource() == btn[8]) {
            tf.setText(tf.getText() + "4");
        } else if (e.getSource() == btn[9]) {
            tf.setText(tf.getText() + "5");
        } else if (e.getSource() == btn[10]) {
            tf.setText(tf.getText() + "6");
        } else if (e.getSource() == btn[12]) {
            tf.setText(tf.getText() + "7");
        } else if (e.getSource() == btn[13]) {
            tf.setText(tf.getText() + "8");
        } else if (e.getSource() == btn[14]) {
            tf.setText(tf.getText() + "9");
        } else if (e.getSource() == btn[17]) {
            tf.setText(tf.getText() + "0");
        } else if (e.getSource() == btn[16]) {
            tf.setText(tf.getText() + ".");
        } else if (e.getSource() == btn[18]) {
            if (plus) {
                b = Double.parseDouble(tf.getText());
                tf.setText(String.valueOf(a + b));
            } else if (minus) {
                b = Double.parseDouble(tf.getText());
                tf.setText(String.valueOf(a - b));
            } else if (mult) {
                b = Double.parseDouble(tf.getText());
                tf.setText(String.valueOf(a * b));
            } else if (dev) {
                b = Double.parseDouble(tf.getText());
                tf.setText(String.valueOf((double) a / (double)b));
            }
        } else if (e.getSource() == btn[19]) {
            if (!tf.getText().equals("")) {
                a = Double.parseDouble(tf.getText());
                tf.setText("");
                plus = true;
                minus = false;
                dev = false;
                mult = false;
            }
        } else if (e.getSource() == btn[7]) {
            if (!tf.getText().equals("")) {
                a = Double.parseDouble(tf.getText());
                tf.setText("");
                plus = false;
                minus = false;
                dev = false;
                mult = true;
            }
        } else if (e.getSource() == btn[11]) {
            if (!tf.getText().equals("")) {
                a = Double.parseDouble(tf.getText());
                tf.setText("");
                plus = false;
                minus = false;
                dev = true;
                mult = false;
            }
        } else if (e.getSource() == btn[15]) {
            if (!tf.getText().equals("")) {
                a = Double.parseDouble(tf.getText());
                tf.setText("");
                plus = false;
                minus = true;
                dev = false;
                mult = false;
            }
        }

//        Color rdm = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
//        this.setBackground(rdm);
    }
}
