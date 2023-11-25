package quiz.application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import topics.*;

public class MenuButton {

    private JButton btnOpenMenu;
    private JPopupMenu popupMenu;
    private JFrame windowToClose;

    public MenuButton(JFrame windowToClose) {
        this.windowToClose = windowToClose;

        // Crear el menú emergente
        popupMenu = new JPopupMenu();

        // Crear los elementos del menú
        JMenuItem itemA = new JMenuItem("Biografía de Turín");
        JMenuItem itemB = new JMenuItem("Lenguajes reconocidos por las MT");
        JMenuItem itemC = new JMenuItem("Introducción a las MT");
        JMenuItem itemD = new JMenuItem("Lenguajes aceptados por las MT");
        JMenuItem itemF = new JMenuItem("Extensiones de las MT básicas");
        JMenuItem itemG = new JMenuItem("Algoritmos asociados a las MT");

        // Agregar los elementos al menú emergente
        popupMenu.add(itemA);
        popupMenu.add(itemB);
        popupMenu.add(itemC);
        popupMenu.add(itemD);
        popupMenu.add(itemF);
        popupMenu.add(itemG);

        // Configurar acciones para cada elemento del menú
        //Enlaces a otros items cuando se da click
        itemA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                System.out.println("Item A seleccionado");
                // Agrega aquí el código que deseas ejecutar
                closeWindow(); // Llama al método para cerrar la ventana
                new Topic1("love");
            }
        });
        itemB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                System.out.println("Item A seleccionado");
                // Agrega aquí el código que deseas ejecutar
                closeWindow(); // Llama al método para cerrar la ventana

                new Topic2("love");
            }
        });
        itemC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                System.out.println("Item A seleccionado");
                // Agrega aquí el código que deseas ejecutar
                closeWindow(); // Llama al método para cerrar la ventana

                new Topic3("love");
            }
        });
        itemD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                System.out.println("Item A seleccionado");
                // Agrega aquí el código que deseas ejecutar
                closeWindow(); // Llama al método para cerrar la ventana

                new Topic4("love");
            }
        });
        itemF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Item A seleccionado");
                closeWindow(); // Llama al método para cerrar la ventana

                new Topic5("love");
            }
        });
        itemG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se selecciona el itemA
                System.out.println("Item A seleccionado");
                // Agrega aquí el código que deseas ejecutar
                closeWindow(); // Llama al método para cerrar la ventana

                new Topic6("love");
            }
        });

        // Crear el botón para abrir el menú
        btnOpenMenu = new JButton("Abrir Menú");
        //funcion que abre el menu
        btnOpenMenu.addActionListener(e -> popupMenu.show(btnOpenMenu, 0, btnOpenMenu.getHeight()));
    }

    //funcion que retorna el boton para abrir el menu
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

    //Funcion que retorna el popupMenu para agregar nuevos items
    public void addMenuItem(String itemName) {
        JMenuItem newItem = new JMenuItem(itemName);
        // Configurar acciones para el nuevo elemento del menú si es necesario
        // ...
        popupMenu.add(newItem);
    }

}
