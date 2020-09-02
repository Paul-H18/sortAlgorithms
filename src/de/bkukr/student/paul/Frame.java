package de.bkukr.student.paul;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {



    public void setUp() {
        setVisible(true);
        setResizable(false);

        setBounds(0, 0, 600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        Font h1 = new Font("Calibri", Font.PLAIN, 32);
        Font h2 = new Font("Calibri", 2, 14);


        JLabel maxLabel = new JLabel();
        JLabel amountLabel = new JLabel();
        JLabel header = new JLabel();

        header.setText("Sortieralgorithmen");
        header.setFont(h1);





        maxLabel.setVisible(true);
        amountLabel.setVisible(true);
        header.setVisible(true);

        header.setBounds(20, 10, 690, 150);

        JTextField amountField = new JTextField();
        JTextField maxField = new JTextField();

        amountField.setVisible(true);
        maxField.setVisible(true);
        amountField.setBounds(20, 150, 250, 30);
        amountLabel.setBounds(20, 125, 350, 30);
        amountLabel.setText("Amount of random Numbers: ");
        amountLabel.setFont(h2);

        maxField.setBounds(20, 250, 250, 30);
        maxLabel.setBounds(20, 225, 350, 30);
        maxLabel.setText("Max value of the Numbers: ");
        maxLabel.setFont(h2);

        add(maxField);
        add(amountField);
        add(header);
        add(amountLabel);
        add(maxLabel);


    }


}
