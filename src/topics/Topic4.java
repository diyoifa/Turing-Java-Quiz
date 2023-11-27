package topics;

import java.awt.*;
import javax.swing.*;
import quiz.application.MenuButton;

public class Topic4 extends JFrame {

    JTextPane contentPane;
    String htmlContentES;
    String htmlContentENG;
    String name;

    public Topic4(String name) {
        this.name = name;
        setTitle("LENGUAJES ACEPTADO POR MT");
        setSize(1050, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear un JTextPane en lugar de un JTextArea
        contentPane = new JTextPane();
        contentPane.setContentType("text/html");
        contentPane.setBackground(new Color(44, 62, 80));
        contentPane.setEditable(false);

        // Contenido en español
        htmlContentES = "<html><body style='text-align: center; color: white; font-family: Arial;' >"
                + "<h1 style='color: gray;'>LENGUAJES ACEPTADO POR MT</h1><br><br>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404394946_281688391538204_7760882090424535812_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=5f2048&_nc_ohc=GShqvLw_RIgAX_kji-p&_nc_ht=scontent.fbga3-1.fna&oh=00_AfB00b9PNCJYuIxeOzJhqgNxZmJP9CvZcGtZtHR9Kv11jA&oe=6566CCA2' alt='Placeholder Image'><br><br>"
                + "<p style='text-align:left; margin-left:100px;'>"
                + "Las máquinas de Turing son conceptos teóricos que han sido utilizados para definir  el concepto de algoritmo <br> "
                + "y estudiar la computabilidad. Aunque las máquinas de Turing teóricas no se utilizan directamente para implementar <br>"
                + " lenguajes de programación prácticos, se han desarrollado lenguajes y modelos que están influenciados por los <br>"
                + " conceptos de máquinas de Turing y teoría de la computación."
                + "<br><br><br></p>"
                
                + "<div style='text-align: left; margin-left:100px;'> "
                + "<ul style='margin-left: 20px;'>"
                + "<li><b>Lenguaje de Máquina de Turing (LMT): </b> No se trata de un lenguaje de programación en el sentido práctico, "
                + "<br> sino de una descripción formal de cómo una máquina de Turing realiza cálculos. Se utiliza para expresar <br>"
                + "algoritmos y procesos computacionales en el ámbito teórico <br><br></li>"
                + "<li><b>Lenguaje Universal de Máquina de Turing (LUMT):</b> Se utiliza para describir procesos computacionales <br>"
                + "desde una perspectiva teórica. Proporciona una notación formal para representar algoritmos y problemas <br><br></li>"
                + "<li><b>Lenguajes de Programación de Propósito General:</b> Aunque las máquinas de Turing no están <br>"
                + "directamente asociadas con lenguajes de programación prácticos, los principios de la teoría de la <br>"
                + "computación, como la recursividad y la computabilidad,  han influido en el diseño de lenguajes de <br> "
                + "programación de propósito general, como Python, C++, Java, entre otros. <br><br></li>"
                + "</ul>"
                + "</div>"
                
                + "<br><img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405725431_281691078204602_3570899331837360331_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=5f2048&_nc_ohc=zk2Kz1POmJsAX_UOFh2&_nc_oc=AQk7dD_kQviwO4pucAOfM5DDl4u2GFIcjgTipWxnhSDz3iFLQ0rTzKkkXwpbYA-8nuo&_nc_ht=scontent.fbga3-1.fna&oh=00_AfA-xO9RCLxzcR6KI5M4T49NgCYyIEm4YKe98AHITM_JTg&oe=65676627' alt='Placeholder Image'><br><br>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<p style='margin-left: 20px;'>"
                + "Los lenguajes aceptados por las máquinas de Turing son los lenguajes recursivamente enumerables (RE). <br>"
                + "<b>Un lenguaje es RE si y solo si existe una máquina de Turing que lo acepta</b> <br> <br>"
                + "Un lenguaje es aceptado por una máquina de Turing si y solo si, para cada cadena en el lenguaje, la máquina se <br>"
                + "detiene en un estado final cuando se le da la cadena como entrada."
                + "<br></p>"
                + "</div>"
                
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404356715_281693338204376_8530490967892118103_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=5f2048&_nc_ohc=EJ3u1WKFgdcAX_Ea29Z&_nc_ht=scontent.fbga3-1.fna&oh=00_AfB8lqRJkNxje_TkOBymhEA3m-G_C340o9R59HGcQQaciQ&oe=65671194' alt='Placeholder Image'><br><br>"
               
                + "<div style='text-align: left; margin-left:100px; padding:20px;'>"
                + "<h2 style='color:gray;'>Algunos ejemplos de lenguajes aceptados por las máquinas de Turing incluyen:"
                + "</h2> <br>"
                + "<ul style='margin-left: 20px;'>"
                + "<li>"
                + "<p>El lenguaje de todas las cadenas de ceros y unos que tienen un número par de ceros: <br><br></p>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404324800_281694514870925_4834036160232784939_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=5f2048&_nc_ohc=5-a1-zNi_qsAX-NmuSQ&_nc_ht=scontent.fbga3-1.fna&oh=00_AfASGe5wf-M8K5u1eBSZEp8NgtImNGW68orNMHuX0V1ayA&oe=6566767A'><br><br>"
                + "</li>"
                + "<li>"
                + "<p>El lenguaje de todas las cadenas de caracteres que son palíndromos. Se lee de igual forma al derecho y al revés <br>"
                + "<br></p>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404330794_281697101537333_5054902503383001380_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=5f2048&_nc_ohc=NbqI9DdR9AgAX-PMokn&_nc_ht=scontent.fbga3-1.fna&oh=00_AfCu2oiTyS1BvgxwenTyEbdvooWZe-_T8-F_SNgVNUoJew&oe=65676EE1'>"
                + "</li>"
                + "</ul>"
                + "</div>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>Algoritmo</h2>"
                + "<ol style='margin-left: 20px;'>"
                + "<li>Se ejecuta la máquina de Turing con la cadena como entrada</li>"
                + "<li>Si la máquina se detiene en un estado final, entonces la cadena pertenece al lenguaje</li>"
                + "<li>Si la máquina no se detiene, entonces la cadena no pertenece al lenguaje</li>"
                + "</ol>"
                + "</div>"
                
                + "<br><br></body></html>";

        // Contenido en inglés
        htmlContentENG = "<html><body style='text-align: center; color: white; font-family: Arial;' >"
                + "<h1 style='color: gray;'>LANGUAGES ACCEPTED BY TM</h1><br><br>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404394946_281688391538204_7760882090424535812_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=5f2048&_nc_ohc=GShqvLw_RIgAX_kji-p&_nc_ht=scontent.fbga3-1.fna&oh=00_AfB00b9PNCJYuIxeOzJhqgNxZmJP9CvZcGtZtHR9Kv11jA&oe=6566CCA2' alt='Placeholder Image'><br><br>"
                + "<p style='text-align:left; margin-left:100px;'>"
                + "Turing machines are theoretical concepts used to define the concept of an algorithm <br> "
                + "and study computability. Although theoretical Turing machines are not directly used to implement <br>"
                + "practical programming languages, languages and models influenced by <br>"
                + "Turing machine concepts and computer theory have been developed."
                + "<br><br><br></p>"
                
                + "<div style='text-align: left; margin-left:100px;'> "
                + "<ul style='margin-left: 20px;'>"
                + "<li><b>Turing Machine Language (TML): </b> It is not a practical programming language, "
                + "<br> but a formal description of how a Turing machine performs computations. It is used to express <br>"
                + "algorithms and computational processes in the theoretical realm. <br><br></li>"
                + "<li><b>Universal Turing Machine Language (UTML):</b> Used to describe computational processes <br>"
                + "from a theoretical perspective. It provides a formal notation to represent algorithms and problems. <br><br></li>"
                + "<li><b>General-Purpose Programming Languages:</b> Although Turing machines are not <br>"
                + "directly associated with practical programming languages, principles of computer <br>"
                + "theory like recursion and computability have influenced the design of general-purpose <br>"
                + "programming languages such as Python, C++, Java, among others. <br><br></li>"
                + "</ul>"
                + "</div>"
                
                + "<br><img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405725431_281691078204602_3570899331837360331_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=5f2048&_nc_ohc=zk2Kz1POmJsAX_UOFh2&_nc_oc=AQk7dD_kQviwO4pucAOfM5DDl4u2GFIcjgTipWxnhSDz3iFLQ0rTzKkkXwpbYA-8nuo&_nc_ht=scontent.fbga3-1.fna&oh=00_AfA-xO9RCLxzcR6KI5M4T49NgCYyIEm4YKe98AHITM_JTg&oe=65676627' alt='Placeholder Image'><br><br>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<p style='margin-left: 20px;'>"
                + "The languages accepted by Turing machines are recursively enumerable languages (RE). <br>"
                + "<b>A language is RE if and only if there exists a Turing machine that accepts it.</b> <br> <br>"
                + "A language is accepted by a Turing machine if and only if, for every string in the language, the machine <br>"
                + "halts in a final state when given the string as input."
                + "<br></p>"
                
                + "</div>"
                
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404356715_281693338204376_8530490967892118103_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=5f2048&_nc_ohc=EJ3u1WKFgdcAX_Ea29Z&_nc_ht=scontent.fbga3-1.fna&oh=00_AfB8lqRJkNxje_TkOBymhEA3m-G_C340o9R59HGcQQaciQ&oe=65671194' alt='Placeholder Image'><br><br>"
                
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'>"
                + "<h2 style='color:gray;'>Some examples of languages accepted by Turing machines include:"
                + "</h2> <br>"
                + "<ul style='margin-left: 20px;'>"
                + "<li>"
                + "<p>The language of all strings of zeros and ones that have an even number of zeros: <br><br></p>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404324800_281694514870925_4834036160232784939_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=5f2048&_nc_ohc=5-a1-zNi_qsAX-NmuSQ&_nc_ht=scontent.fbga3-1.fna&oh=00_AfASGe5wf-M8K5u1eBSZEp8NgtImNGW68orNMHuX0V1ayA&oe=6566767A'><br><br>"
                + "</li>"
                + "<li>"
                + "<p>The language of all strings of characters that are palindromes. Readable the same forwards and backwards <br>"
                + "<br></p>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404330794_281697101537333_5054902503383001380_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=5f2048&_nc_ohc=NbqI9DdR9AgAX-PMokn&_nc_ht=scontent.fbga3-1.fna&oh=00_AfCu2oiTyS1BvgxwenTyEbdvooWZe-_T8-F_SNgVNUoJew&oe=65676EE1'>"
                + "</li>"
                + "</ul>"
                + "</div>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>Algorithm</h2>"
                + "<ol style='margin-left: 20px;'>"
                + "<li>The Turing machine runs with the string as input</li>"
                + "<li>If the machine halts in a final state, then the string belongs to the language</li>"
                + "<li>If the machine does not halt, then the string does not belong to the language</li>"
                + "</ol>"
                + "</div>"
                
                + "<br><br></body></html>";

        contentPane.setText(htmlContentES);

        // Botones para cambiar el idioma
        JButton btnSpanish = new JButton("ES");
        btnSpanish.setBackground(new Color(44, 62, 80));
        btnSpanish.setForeground(new Color(171, 178, 185));
        btnSpanish.setFont(new Font("Arial", Font.BOLD, 12));
        
        JButton btnEnglish = new JButton("ENG");
        btnEnglish.setBackground(new Color(44, 62, 80));
        btnEnglish.setForeground(new Color(171, 178, 185));
        btnEnglish.setFont(new Font("Arial", Font.BOLD, 12));

        // Listener para el botón en español
        btnSpanish.addActionListener(e -> {
            contentPane.setText(htmlContentES);
        });

        // Listener para el botón en inglés
        btnEnglish.addActionListener(e -> {
            contentPane.setText(htmlContentENG);
        });

        JButton prev = new JButton("ANTERIOR");
        prev.setBackground(new Color(44, 62, 80));
        prev.setForeground(new Color(171, 178, 185));
        prev.setFont(new Font("Arial", Font.BOLD, 12));
        
        JButton next = new JButton("SIGUIENTE");
        next.setBackground(new Color(44, 62, 80));
        next.setForeground(new Color(171, 178, 185));
        next.setFont(new Font("Arial", Font.BOLD, 12));
        
        // Listener para el botón anterior
        prev.addActionListener(e -> {
            setVisible(false);
            new Topic3(name);
        });

        next.addActionListener(e -> {
            setVisible(false);
            new Topic5(name);
        });

        // instanciamos el boton de abrir menu desde la clase MenuButton
        MenuButton menuButton = new MenuButton(this, name);
        JButton btnOpenMenu = menuButton.getButton();
        btnOpenMenu.setBackground(new Color(44, 62, 80));
        btnOpenMenu.setForeground(new Color(171, 178, 185));
        btnOpenMenu.setFont(new Font("Arial", Font.BOLD, 12));

        // agregamos los botones al panel de botones
        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(new Color(86, 101, 115));
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

    // public static void main(String[] args) {
    //     new Topic4("test");
    // }
}
