package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    public JTextField tfname;

    Login() {
        //color del fondo
        getContentPane().setBackground(new Color(222, 230, 254));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/intregantes.jpg"));
        Image image = i1.getImage(); // Obtener la imagen del ImageIcon
        Image newImage = image.getScaledInstance(600, 600, Image.SCALE_SMOOTH); // Redimensionar la imagen

        ImageIcon resizedImage = new ImageIcon(newImage); // Crear un nuevo ImageIcon con la imagen redimensionada
        JLabel imageLabel = new JLabel(resizedImage); // Usar el nuevo ImageIcon en el JLabel
        imageLabel.setBounds(0, 0, 600, 600); // Establecer los límites del JLabel

        add(imageLabel); // Agregar el JLabel al contenedor
        
        //el titulo
        JLabel heading = new JLabel("Teoria de la computacion");
        //ubicacion
        heading.setBounds(650, 60, 500, 45);
        heading.setFont(new Font("Arial", Font.BOLD, 40));
        //color de la letra
        heading.setForeground(new Color(91, 116, 195));
        add(heading);

        JLabel name = new JLabel("Ingresa tu nombre");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setForeground(new Color(91, 116, 195));
        add(name);
        
        //campo de texto para el nombre
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Arial", Font.PLAIN, 20));
        tfname.setBackground(Color.WHITE);
        tfname.setForeground(Color.BLACK);
        add(tfname);

        //boton de inicio 
        rules = new JButton("Iniciar");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.WHITE);
        rules.setForeground(new Color(91, 116, 195));
        rules.addActionListener(this);
        add(rules);

        //boton de salir
        back = new JButton("Salir");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(91, 116, 195));
        back.addActionListener(this);
        add(back);
        
        //tamaño de la pantalla
        setSize(1200, 700);
        //para que centrar la pantalla
        setLocationRelativeTo(null);
        //para cerrar el programa cuando le da click en la x de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //para visualizarce
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        //si da click en rules
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            //oculata esta pantalla
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
