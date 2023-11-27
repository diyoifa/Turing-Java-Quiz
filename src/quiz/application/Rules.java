package quiz.application;

import contentTopics.Contents;
import contentTopics.topicSquema;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;
    JTextArea rulesTextArea;

    public Rules(String name) {
        //contenido del contexto
        this.name = name;
        // color de fondo de la ventana
        getContentPane().setBackground(new Color(222, 230, 254));
        setLayout(null);
        
        JLabel heading = new JLabel("Bienvenido " + name + " a Turin Quiz");
        //ubicacion del titulo
        heading.setBounds(200, 20, 700, 30);
        //tipo de fuente
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        //color de la fuente
        heading.setForeground(new Color(91, 116, 195));
        //agregar a la pantalla el titulo
        add(heading);

        //texto del contexto
        rulesTextArea = new JTextArea();
        rulesTextArea.setBounds(20, 90, 800, 500);
        rulesTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        //para ordenar el texto que no quede en una linea
        rulesTextArea.setLineWrap(true);
        rulesTextArea.setWrapStyleWord(true);
        //color de la letra
        rulesTextArea.setForeground(Color.BLACK);
        //color del fondo
        rulesTextArea.setBackground(new Color(222, 230, 254));
        // poner el texto que va a llevar el text area
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
                        + "al finilazar todos los temas tendra la opcion de realizar un Quiz para ponerse a prueba.");
        //para que el usuario no pueda editar el contenido
        rulesTextArea.setEditable(false);
        
        //agrega el textarea a la ventana
        add(rulesTextArea);
        // JScrollPane scrollPane = new JScrollPane(rulesTextArea);
        // scrollPane.setBounds(90, 120, 750, 450);
        // add(scrollPane);

        back = new JButton("ATRAS");
        //UBICACION DEL BOTON 
        back.setBounds(300, 600, 100, 30);
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(91, 116, 195));
        back.addActionListener(this);
        add(back);

        start = new JButton("INICIO");
        start.setBounds(450, 600, 100, 30);
        start.setBackground(Color.WHITE);
        start.setForeground(new Color(91, 116, 195));
        //El oyente de accion del boton
        start.addActionListener(this);
        add(start);

        setSize(900, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    //[t1, t2, t3 ....]

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            Contents contents = new Contents();
            //obtenemos el contenido en español y en ingles del primer tema de la calse Contents
            String htmlContentES = contents.getContentES()[0];
            String htmlContentENG = contents.getContentEN()[0];
            new topicSquema(name, htmlContentES, htmlContentENG);
            // new Topic1(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    // public static void main(String[] args) {
    // new Rules("User");
    // }
}
