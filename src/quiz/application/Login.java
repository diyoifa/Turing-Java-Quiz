package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    public JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/intregantes.jpg"));
        Image image = i1.getImage(); // Obtener la imagen del ImageIcon
        Image newImage = image.getScaledInstance(600, 600, Image.SCALE_SMOOTH); // Redimensionar la imagen

        ImageIcon resizedImage = new ImageIcon(newImage); // Crear un nuevo ImageIcon con la imagen redimensionada
        JLabel imageLabel = new JLabel(resizedImage); // Usar el nuevo ImageIcon en el JLabel
        imageLabel.setBounds(0, 0, 600, 600); // Establecer los límites del JLabel

        add(imageLabel); // Agregar el JLabel al contenedor

        JLabel heading = new JLabel("Teoria de la computacion");
        heading.setBounds(650, 60, 500, 45);
        heading.setFont(new Font("Arial", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Ingresa tu nombre");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Iniciar");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Salir");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 700);
        setLocation(100, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
