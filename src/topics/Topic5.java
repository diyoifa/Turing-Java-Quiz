package topics;

import java.awt.*;
import javax.swing.*;

public class Topic5 extends JFrame {

    JTextPane contentPane;
    String htmlContentES;
    String htmlContentENG;
    String name;
    public Topic5(String name) {
        this.name = name;
        setTitle("Contenido - Topic 5");
        setSize(900, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear un JTextPane en lugar de un JTextArea
        contentPane = new JTextPane();
        contentPane.setContentType("text/html");
        contentPane.setEditable(false);

       // Contenido en español
       htmlContentES = "<html><body><h1>Conceptos del Topic 5 (ES)</h1><br><br>" +
       "Aquí está la imagen: <img src='https://via.placeholder.com/150' alt='Placeholder Image'><br><br>" +
       "<h2>Contenido de ejemplo para el Topic 5 (ES):</h2><br>" +
       "<p>texto ficticio Topic 5 (ES):</p>" +
       "<ul>" +
       "<li>Dato 1: Valor 1</li>" +
       "<li>Dato 2: Valor 2</li>" +
       "<li>Dato 3: Valor 3</li>" +
       "</ul>" +
       "<p> datos ficticios para el Topic 5 (ES)...</p>" +
       "<p> datos ficticios</p>" +
       "<br><br></body></html>";

// Contenido en inglés
htmlContentENG = "<html><body><h1>Concepts of Topic 5 (ENG)</h1><br><br>" +
       "Here is the image: <img src='https://via.placeholder.com/150' alt='Placeholder Image'><br><br>" +
       "<h2>Example content for Topic 5 (ENG):</h2><br>" +
       "<p>fictional text Topic 5 (ENG):</p>" +
       "<ul>" +
       "<li>Data 1: Value 1</li>" +
       "<li>Data 2: Value 2</li>" +
       "<li>Data 3: Value 3</li>" +
       "</ul>" +
       "<p>fictional data for Topic 5 (ENG)...</p>" +
       "<p>fictional data for Topic 5</p>" +
       "<br><br></body></html>";

        contentPane.setText(htmlContentES);

        // Botones para cambiar el idioma
        JButton btnSpanish = new JButton("ES");
        JButton btnEnglish = new JButton("ENG");

        // Listener para el botón en español
        btnSpanish.addActionListener(e -> {
            contentPane.setText(htmlContentES);
        });

        // Listener para el botón en inglés
        btnEnglish.addActionListener(e -> {
            contentPane.setText(htmlContentENG);
        });

         // Botones para cambiar de pagina
        JButton prev = new JButton("anterior");        
        JButton next = new JButton("siguiente");
        
        // Listener para el botón anterior
        prev.addActionListener(e -> {
            setVisible(false);
            new Topic4(name);
        });
        
        next.addActionListener(e ->{
            setVisible(false);
            new Topic6(name);
        });

        JPanel btnPanel = new JPanel();
        btnPanel.add(prev);       
        btnPanel.add(btnSpanish);
        btnPanel.add(btnEnglish);
        btnPanel.add(next);

        JScrollPane scrollPane = new JScrollPane(contentPane);
        add(btnPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Topic5("test");
    }
}
