package quiz.application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import contentTopics.Contents;
import contentTopics.topicSquema;
//import topics.*;

public class MenuButton {

    private JButton btnOpenMenu;
    private JPopupMenu popupMenu;
    private JFrame windowToClose;
    public String name;
    public Contents contents = new Contents();
            

    public MenuButton(JFrame windowToClose, String name) {
        this.windowToClose = windowToClose;
        this.name = name;
        // Crear el menú emergente
        popupMenu = new JPopupMenu();

        // Crear los elementos del menú
        JMenuItem inicio = new JMenuItem("1)INICIO");
        JMenuItem contexto = new JMenuItem("2)Contexto");
        JMenuItem topic1 = new JMenuItem("3)Biografía de Turín");
        JMenuItem topic2 = new JMenuItem("4)Lenguajes reconocidos por las MT");
        JMenuItem topic3 = new JMenuItem("5)Introducción a las MT");
        JMenuItem topic4 = new JMenuItem("6)Lenguajes aceptados por las MT");
        JMenuItem topic5 = new JMenuItem("7)Extensiones de las MT básicas");
        JMenuItem topic6 = new JMenuItem("8)Algoritmos asociados a las MT");
        JMenuItem quiz = new JMenuItem("9)QUIZ");

        // Agregar los elementos al menú emergente
        popupMenu.add(inicio);
        popupMenu.add(contexto);
        popupMenu.add(topic1);
        popupMenu.add(topic2);
        popupMenu.add(topic3);
        popupMenu.add(topic4);
        popupMenu.add(topic5);
        popupMenu.add(topic6);
        popupMenu.add(quiz);

        
        // Enlaces a otros items cuando se da click
        inicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                // System.out.println("Item A seleccionado");
                closeWindow(); // Llama al método para cerrar la ventana
                new Login();
            }
        });
        contexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                // System.out.println("Item A seleccionado");
                closeWindow(); // Llama al método para cerrar la ventana
                new Rules(name);
            }
        });
        topic1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                // System.out.println("Item A seleccionado");
                closeWindow(); // Llama al método para cerrar la ventana
                String htmlContentES = contents.getContentES()[0];
                String htmlContentENG = contents.getContentEN()[0];
                new topicSquema(name, htmlContentES, htmlContentENG);
            }
        });
        topic2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Item A seleccionado");
                // Agrega aquí el código que deseas ejecutar
                closeWindow(); // Llama al método para cerrar la ventana
                String htmlContentES = contents.getContentES()[1];
                String htmlContentENG = contents.getContentEN()[1];
                new topicSquema(name, htmlContentES, htmlContentENG);
            }
        });
        topic3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                closeWindow(); // Llama al método para cerrar la ventana
                String htmlContentES = contents.getContentES()[2];
                String htmlContentENG = contents.getContentEN()[2];
                new topicSquema(name, htmlContentES, htmlContentENG);
            }
        });
        topic4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                // System.out.println("Item A seleccionado");
                closeWindow(); // Llama al método para cerrar la ventana
                String htmlContentES = contents.getContentES()[3];
                String htmlContentENG = contents.getContentEN()[3];
                new topicSquema(name, htmlContentES, htmlContentENG);
            }
        });
        topic5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Item A seleccionado");
                closeWindow(); // Llama al método para cerrar la ventana
                String htmlContentES = contents.getContentES()[4];
                String htmlContentENG = contents.getContentEN()[4];
                new topicSquema(name, htmlContentES, htmlContentENG);
            }
        });
        topic6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                // System.out.println("Item A seleccionado");
                closeWindow(); // Llama al método para cerrar la ventana
                String htmlContentES = contents.getContentES()[5];
                String htmlContentENG = contents.getContentEN()[5];
                new topicSquema(name, htmlContentES, htmlContentENG);
            }
        });
        quiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                // System.out.println("Item A seleccionado");
                closeWindow(); // Llama al método para cerrar la ventana
                new Quiz(name);
            }
        });

        // Crear el botón para abrir el menú
        btnOpenMenu = new JButton("TEMAS");
        // funcion que abre el menu
        btnOpenMenu.addActionListener(e -> popupMenu.show(btnOpenMenu, 0, btnOpenMenu.getHeight()));
    }

    // funcion que retorna el boton para abrir el menu
    public JButton getButton() {
        return btnOpenMenu;
    }

    // Método para cerrar la ventana
    private void closeWindow() {
        if (windowToClose != null) {
            windowToClose.dispose(); // Cierra la ventana
        }
    }

    public JPopupMenu getPopupMenu() {
        return popupMenu;
    }


}
