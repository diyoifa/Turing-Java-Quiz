package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {
    String name;
    JButton inicio, submit, salir;

    Score(String name, float score) {
        this.name = name;
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(222, 230, 254));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Gracias " + name + " por resolver el questionario");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Arial", Font.PLAIN, 26));
        heading.setForeground(new Color(91, 116, 195));
        add(heading);
        
        JLabel lblscore = new JLabel("Tu puntaje es:  " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Arial", Font.PLAIN, 26));
        lblscore.setForeground(new Color(91, 116, 195));
        add(lblscore);
        
        submit = new JButton("NUEVO INTENTO");
        submit.setBounds(400, 270, 150, 30);
        submit.setBackground(Color.WHITE);
        submit.setForeground(new Color(91, 116, 195));
        submit.addActionListener(this);
        add(submit);
        
        inicio = new JButton("INICIO");
        inicio.setBounds(360, 350, 100, 30);
        inicio.setBackground(Color.WHITE);
        inicio.setForeground(new Color(91, 116, 195));
        inicio.addActionListener(this);
        add(inicio);
        
        salir = new JButton("CERRAR");
        salir.setBounds(490, 350, 100, 30);
        salir.setBackground(Color.WHITE);
        salir.setForeground(new Color(91, 116, 195));
        salir.addActionListener(this);
        add(salir);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        // si da click en salir se cierra la ventana
        if(ae.getSource() == salir) {
            System.exit(0);
        } else if(ae.getSource() == inicio) {
            setVisible(false);
            new Login();
        } else {
            setVisible(false);
            new Quiz(name);
        }
    }

    //public static void main(String[] args) {
      //  new Score("User", 0);
    //}
}
