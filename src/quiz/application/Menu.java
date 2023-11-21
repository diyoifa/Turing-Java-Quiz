package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import topics.*;

public class Menu extends JFrame implements ActionListener {

    // Atributos
    String topics[] = {"Biografía de Alan Turing", "lenguajes que reconoceN las MT", "Introduccion a las MT", "Lenguajes Aceptados por las MT", "Extensiones de las MT básicas", "Algoritmos MT"};
    JButton topicButtons[];
    String name;

    // Constructor
    public Menu(String name) {
        
        setTitle("Menu");
        Font titleFont = new Font("Arial", Font.BOLD, 24);
        Color titleColor = new Color(30, 144, 254);
        getRootPane().setBorder(BorderFactory.createMatteBorder(0, 4, 4, 4, titleColor));
        getRootPane().setFont(titleFont);
        this.name = name;
        
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // Panel para los botones con GridLayout
        buttonPanel.setBackground(Color.WHITE);

        topicButtons = new JButton[topics.length];

        for (int i = 0; i < topics.length; i++) {
            topicButtons[i] = new JButton(topics[i]);
            topicButtons[i].setBackground(new Color(30, 144, 254));
            topicButtons[i].setForeground(Color.WHITE);
            topicButtons[i].addActionListener(this);
            buttonPanel.add(topicButtons[i]); // Agregar botones al panel con GridLayout
        }

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/intregantes.jpg"));
        Image image = i1.getImage(); // Obtener la imagen del ImageIcon
        Image newImage = image.getScaledInstance(600, 600, Image.SCALE_SMOOTH); // Redimensionar la imagen

        ImageIcon resizedImage = new ImageIcon(newImage); // Crear un nuevo ImageIcon con la imagen redimensionada
        JLabel imageLabel = new JLabel(resizedImage); // Usar el nuevo ImageIcon en el JLabel
        imageLabel.setBounds(0, 350, 600, 400); // Establecer los límites del JLabel

        // Agregar el panel de botones y la imagen redimensionada al JFrame
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.CENTER);
        add(imageLabel, BorderLayout.SOUTH);

        setSize(900, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu("test");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < topics.length; i++) {
            if (e.getSource() == topicButtons[i]) {
                System.out.println("Clicked topic: " + topics[i]);
                // Realizar acciones específicas para cada botón aquí
                switch (topics[i]) {
                    case "Biografía de Alan Turing":
                        setVisible(false);
                        new Topic1(name);
                        break;
                    case "lenguajes que reconoceN las MT":
                        setVisible(false);

                        new Topic2(name);
                        break;

                    case "Introduccion a las MT":
                        setVisible(false);

                        new Topic3(name);
                        break;

                    case "Lenguajes Aceptados por las MT":
                        setVisible(false);

                        new Topic4(name);
                        break;

                    case "Extensiones de las MT básicas":
                        setVisible(false);

                        new Topic5(name);
                        break;

                    case "Algoritmos MT":
                        setVisible(false);

                        new Topic6(name);
                        break;

                    default:

                        break;
                }
                break;
            }
        }
    }
}
