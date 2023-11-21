package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;
    JTextArea rulesTextArea;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Bienvenido " + name + " a Turin Quiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        rulesTextArea = new JTextArea();
        rulesTextArea.setBounds(20, 90, 700, 350);
        rulesTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rulesTextArea.setLineWrap(true);
        rulesTextArea.setWrapStyleWord(true);
        rulesTextArea.setText(
                "El presente trabajo se presenta como proyecto final para la materia de Teoría de la Computación consiste en el desarrollo de un aplicativo de escritorio para Windows utilizando Java como lenguaje de programación. Este aplicativo estará enfocado en el estudio y comprensión de las Máquinas de Turing, un concepto central en la teoría de la computación.\n\n"
                + "El objetivo principal es crear una interfaz gráfica que permita a los usuarios explorar y comprender los fundamentos de las Máquinas de Turing. El aplicativo contará con diversas secciones dedicadas a aspectos específicos de este tema, incluyendo:\n\n"
                + "1. Biografía de Alan Turing\n\n"
                + "2. Lenguajes reconocidos por las Máquinas de Turing\n\n"
                + "3. Introducción a las Máquinas de Turing\n\n"
                + "4. Lenguajes Aceptados por las Máquinas de Turing\n\n"
                + "5. Extensiones de las Máquinas de Turing básicas\n\n"
                + "6. Algoritmos asociados a las Máquinas de Turing\n\n"
                + "Cada sección sobre las Máquinas de Turing proporcionará información relevante y comprensible para facilitar el aprendizaje y la exploración de este concepto fundamental en la teoría de la computación."
        );

        JScrollPane scrollPane = new JScrollPane(rulesTextArea);
        scrollPane.setBounds(90, 120, 750, 450);
        add(scrollPane);

        back = new JButton("Back");
        back.setBounds(300, 600, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(450, 600, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(900, 700);
        setLocation(300, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            //new Quiz(name);
            new Menu(name);

        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
