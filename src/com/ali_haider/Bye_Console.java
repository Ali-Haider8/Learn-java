package com.ali_haider;

import javax.swing.*;
import java.awt.event.*;

public class Bye_Console {

	public static void main(String[] args) {
		JFrame F=new JFrame("Frist JavaFX Program");
                JButton B=new JButton("Add TEXT");
                JTextField T=new JTextField("");
                F.setSize(400, 400);
                F.add(B);
                F.add(T);
                F.setLayout(null);
                F.setVisible(true);
                F.setOpacity(1);
                F.setLocation(10,10);
                F.setAlwaysOnTop(true);
                B.setBounds(200, 200, 150, 50);
                T.setBounds(200, 50, 150, 25);
                B.addActionListener((ActionEvent e)->{
                    T.setText("Button is clicked");
                });

	}

}