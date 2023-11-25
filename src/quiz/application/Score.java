package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(44, 62, 80));
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
        heading.setForeground(new Color(171, 178, 185));
        add(heading);
        
        JLabel lblscore = new JLabel("Tu puntaje es:  " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Arial", Font.PLAIN, 26));
        lblscore.setForeground(new Color(171, 178, 185));
        add(lblscore);
        
        JButton submit = new JButton("Intentarlo de nuevo");
        submit.setBounds(380, 270, 220, 30);
        submit.setBackground(new Color(44, 62, 80));
        submit.setForeground(new Color(171, 178, 185));
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

   // public static void main(String[] args) {
     //   new Score("User", 0);
    //}
}
