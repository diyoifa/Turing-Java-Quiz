
package contentTopics;

import java.awt.*;
import java.util.Arrays;
import javax.swing.*;
import quiz.application.*;

public class topicSquema extends JFrame {

  JTextPane contentPane;
  String htmlContentES;
  String htmlContentENG;
  String name;

  public topicSquema(String name, String htmlContentES, String htmlContentENG) {

    this.htmlContentES = htmlContentES;
    this.htmlContentENG = htmlContentENG;
    this.name = name;
    //añadimos un titulo a la ventana
    setTitle("CONTENIDO DE APRENDIZAJE");
    //el tamaño de la ventana
    setSize(1050, 700);
    //centrar la ventana
    setLocationRelativeTo(null);
    //cerrar el programa si da click en la X de la ventana
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Crear un JTextPane en lugar de un JTextArea
    contentPane = new JTextPane();
    //se le asigna contenido HTML
    contentPane.setContentType("text/html");
    //color de fondo
    contentPane.setBackground(new Color(234, 254, 255));
    //para que el usuario no pueda editar la ventana
    contentPane.setEditable(false);
    
    //poner contenido en español 
    contentPane.setText(htmlContentES);

    // Botones para cambiar el idioma
    JButton btnSpanish = new JButton("ES");
    //color de fondo del boton
    btnSpanish.setBackground(Color.WHITE);
    //color de la letra del boton
    btnSpanish.setForeground(new Color(34, 153, 255));
    //tipo de fuente y el tamaño
    btnSpanish.setFont(new Font("Arial", Font.BOLD, 12));

    JButton btnEnglish = new JButton("ENG");
    btnEnglish.setBackground(Color.WHITE);
    btnEnglish.setForeground(new Color(34, 153, 255));
    btnEnglish.setFont(new Font("Arial", Font.BOLD, 12));

    // Listener para el botón en español
    //cuando da click en el boton español cambia el contenido a español
    btnSpanish.addActionListener(e -> {
      contentPane.setText(htmlContentES);
    });

    // Listener para el botón en inglés
    //cuando da click en el boton ingles cambia el contenido a ingles
    btnEnglish.addActionListener(e -> {
      contentPane.setText(htmlContentENG);
    });
    
    // boton para anterior
    JButton prev = new JButton("ANTERIOR");
    prev.setBackground(Color.WHITE);
    prev.setForeground(new Color(34, 153, 255));
    prev.setFont(new Font("Arial", Font.BOLD, 12));
    
    String nextText = "SIGUIENTE";
    if(htmlContentES.contains("ALGORITMOS ASOCIADOS A LAS MT")) {
      nextText = "QUIZ";
    }
    
    //boton siguente
    JButton next = new JButton(nextText);
    next.setBackground(Color.WHITE);
    next.setForeground(new Color(34, 153, 255));
    next.setFont(new Font("Arial", Font.BOLD, 12));

    // cuando de click en anterior
    prev.addActionListener(e -> {
      handlePrevAction();
      setVisible(false);

    });

    // cuando de click en siguiente
    next.addActionListener(e -> {
      handleNextAction();
      setVisible(false);

    });

    // instanciamos el boton de abrir menu desde la clase MenuButton
    MenuButton menuButton = new MenuButton(this, name);
    JButton btnOpenMenu = menuButton.getButton();
    btnOpenMenu.setBackground(Color.WHITE);
    btnOpenMenu.setForeground(new Color(34, 153, 255));
    btnOpenMenu.setFont(new Font("Arial", Font.BOLD, 12));

    // agregamos los botones al panel de botones
    JPanel btnPanel = new JPanel();
  //   {
  //     @Override
  //     protected void paintComponent(Graphics g) {
  //         super.paintComponent(g);
  //         ImageIcon icon = new ImageIcon("icons/bg-nav.jpg");
  //         Image image = icon.getImage();
  //         g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
  //     }
  // };
    btnPanel.setBackground(new Color(34, 153, 255));
    btnPanel.add(prev);
    btnPanel.add(next);
    btnPanel.add(btnOpenMenu);
    btnPanel.add(btnSpanish);
    btnPanel.add(btnEnglish);

    JScrollPane scrollPane = new JScrollPane(contentPane);
    add(btnPanel, BorderLayout.NORTH);
    add(scrollPane, BorderLayout.CENTER);

    setVisible(true);

  }

  private void handlePrevAction() {
    //Llamamos la clase a la clase contents para traerse los arrays con los temas
    Contents contents = new Contents();
    //me traigo el array de los contenidos en español
    String[] contentES = contents.getContentES();
    //tomo el indice del contenido actual en español
    int indexHtmlContentES = Arrays.asList(contentES).indexOf(htmlContentES);
    
    if (indexHtmlContentES > 0) {
      String newHtmlContentES = contentES[indexHtmlContentES - 1];
      String newHtmlContentENG = contents.getContentEN()[indexHtmlContentES - 1];
      new topicSquema(name, newHtmlContentES, newHtmlContentENG);
      
    } else {
      new Rules(name);
    }
  }

  private void handleNextAction() {
    //Llamamos la clase a la clase contents para traerse los arrays con los temas
    Contents contents = new Contents();
    String[] contentES = contents.getContentES();
    int indexHtmlContentES = Arrays.asList(contentES).indexOf(htmlContentES);
    
    if (indexHtmlContentES < contentES.length - 1) {
      String newHtmlContentES = contentES[indexHtmlContentES + 1];
      String newHtmlContentENG = contents.getContentEN()[indexHtmlContentES + 1];
      new topicSquema(name, newHtmlContentES, newHtmlContentENG);
    } else {
      new Quiz(name);
    }
  }

 //public static void main(String[] args) {
 //  Contents contents = new Contents();
 //  String htmlContentES = contents.getContentES()[0];
  // String htmlContentENG = contents.getContentEN()[0];
  // new topicSquema("test", htmlContentES, htmlContentENG);
 //}

}
