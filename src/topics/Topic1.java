package topics;

import java.awt.*;
import javax.swing.*;
import quiz.application.*;

public class Topic1 extends JFrame {

    JTextPane contentPane;
    String htmlContentES;
    String htmlContentENG;
    String name;

    public Topic1(String name) {
        this.name = name;
        setTitle("BIOGRAFIA DE ALAN TURING");
        setSize(1050, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear un JTextPane en lugar de un JTextArea
        contentPane = new JTextPane();
        contentPane.setContentType("text/html");
        contentPane.setBackground(new Color(234, 254, 255));
        contentPane.setEditable(false);

        // Contenido en español
        htmlContentES = "<html><body style='text-align: center; color: black; font-family: Arial;' >"

                + "<h1 style='color: #5B74C3;'>BIOGRAFIA DE ALAN TURING</h1><br><br>"

                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405654731_281713151535728_8275004349497538077_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_ohc=tYgTMtgogxwAX8yWbcL&_nc_oc=AQnJpsPamEOrrp07bcPIolWqCgfwvJLvEBRGddFoi7ELsZr5MD-8xPgEhPH2PsqOeTI&_nc_ht=scontent.fbga3-1.fna&oh=00_AfAoCHwfIh_3ajSX3ThTO_YvhuzHmguC_8QWLswt8CmUbA&oe=6567CE82' alt='Placeholder Image'><br><br>"

                + "<p style='text-align:left; margin-left:100px;'>"
                + "Las máquinas de Turing básicas son modelos teóricos que se utilizan para estudiar la computabilidad. Son máquinas <br> "
                + "abstractas que tienen un conjunto finito de estados, un alfabeto de símbolos y una función de transición que  <br>"
                + "determina qué acción debe tomar la máquina en cada estado y símbolo."
                + "<br><br><br></p>"

                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404372970_281713804868996_6356173709026303313_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=5f2048&_nc_ohc=2bcSvkDFvkcAX_QliNa&_nc_ht=scontent.fbga3-1.fna&oh=00_AfA31ZILZPvJw8mMuVGRL_jDdPiR9HripuvMmrzIR6b_IQ&oe=656669B1' alt='Placeholder Image'><br><br>"

                + "<p style='text-align:left; margin-left:100px;'>"
                + "Máquinas de Turing no deterministas: Estas máquinas pueden tener más de una acción posible para cada estado <br> "
                + "y símbolo. Esto les permite modelar sistemas que pueden tener múltiples resultados posibles para una misma <br>"
                + "entrada"
                + "<br><br></p>"

                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color: #5B74C3;'>Ejecución</h2>"
                + "<ol style='margin-left: 20px;'>"
                + "<li>La MT-ND comienza en un estado inicial q0.</li>"
                + "<li>La MT-ND lee el símbolo actual de la cinta.</li>"
                + "<li>La MT-ND aplica la función de transición δ para determinar la siguiente acción.</li>"
                + "<li>La MT-ND realiza la acción determinada por δ.</li>"
                + "<li>Los pasos 2-4 se repiten hasta que la MT-ND se detiene.</li>"
                + "</ol>"
                + "</div>"

                + "<p style='text-align:left; margin-left:100px;'>"
                + "<b>Máquinas de Turing con cinta infinita:</b> Estas máquinas tienen una cinta infinita, lo que les permite modelar <br> "
                + "sistemas que pueden tener una entrada infinita. La cinta infinita proporciona un espacio de almacenamiento ilimitado <br>"
                + "hacia la izquierda y hacia la derecha, permitiendo a la máquina desplazarse en ambas direcciones sin restricciones. "
                + "<br><br><br></p>"

                + "<div style='text-align: left; margin-left:100px;'> "
                + "<h2 style='color: #5B74C3;'>Características:"
                + "</h2>"
                + "<ul style='margin-left: 20px;'>"
                + "<li><b>Cinta Infinita: </b> A diferencia de las Máquinas de Turing estándar, que tienen una cinta finita, las <br>  "
                + " Máquinas de Turing con cinta infinita cuentan con una cinta que se extiende infinitamente en ambas direcciones.<br> "
                + "<br></li>"
                + "<li><b>Desplazamiento Infinito:</b> La cabeza lectora/escritora tiene la capacidad de moverse hacia la izquierda<br>"
                + "y hacia la derecha a lo largo de la cinta infinita. Esto permite a la máquina acceder a cualquier posición"
                + "en la cinta, independientemente de su lejanía desde la posición inicial. <br><br></li>"
                + "</ul>"
                + "</div>"

                + "<h2 style='color: #5B74C3; text-align:center'>"
                + "Las extensiones de las máquinas de Turing básicas han permitido modelar una amplia gama de <br>"
                + "sistemas reales, incluidos:"
                + "</h2> <br>"

                + "<div style='text-align: left; margin-left:100px; padding:20px;'>"
                + "<ol style='margin-left: 20px;'>"

                + "<li>"
                + "<p><b>Computadoras:</b> Las máquinas de Turing básicas se utilizan para modelar el funcionamiento interno  <br>"
                + "de las computadoras.: <br><br></p>"

                + "<div style='margin-left:100px;'>"
                + " <img  src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405554473_281721568201553_4190671734879336388_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=5f2048&_nc_ohc=rqoDg5OSrFYAX_y2z9w&_nc_ht=scontent.fbga3-1.fna&oh=00_AfD01m-suNlxjT6kLOT31la43JbxoBRbz2ne2dF7VrjXsw&oe=65667088'><br><br><br><br>"
                + "</div>"

                + "</li>"

                + "<br><li>"
                + "<p><b>Lógica:</b> Las máquinas de Turing se utilizan para estudiar la lógica formal.<br>"
                + "<br></p>"

                + "<div style='margin-left:100px;'>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405553615_281722054868171_209498988647614606_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=5f2048&_nc_ohc=n5ariE2o2lYAX-9AiQv&_nc_ht=scontent.fbga3-1.fna&oh=00_AfAdpUG7_YU-o3lF1XJl2EVBpvVy-_LAqdERUDb58sfUmw&oe=65676ABD'><br><br><br><br>"
                + "</div>"

                + "</li>"

                + "<li>"
                + "<p><b>Matemáticas:</b> Las máquinas de Turing se utilizan para estudiar los fundamentos de las matemáticas.<br>"
                + "<br></p>"
                
                + "<div style='margin-left:100px;'>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405582692_281722838201426_1563785501134258681_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=5f2048&_nc_ohc=z3EsZ7JkftYAX_tZL_u&_nc_ht=scontent.fbga3-1.fna&oh=00_AfASf_DOuJrMpykNOfhVyhBXTW2qW9ykHC_PtfeN3vP3Cg&oe=65664AA3'><br><br><br><br>"
                + "</div>"

                + "</li>"

                + "<li>"
                + "<p><b>Ciencia de la computación:</b> Las máquinas de Turing se utilizan para estudiar la teoría de la computación.<br>"
                + "<br></p>"

                + "<div style='margin-left:100px;'>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405598730_281723171534726_6799405737082640228_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=5f2048&_nc_ohc=Wg9nxt2F6LoAX-QS2oH&_nc_ht=scontent.fbga3-1.fna&oh=00_AfCruFOAar4gtIHsJHugwiiEFG0GfxLYZlCkBTQJvU0Nig&oe=65671FC6'>"
                + "</div>"

                + "<br><br><br></li>"

                + "</ol>"
                + "</div>"

                + "<br><br></body></html>";

        // Contenido en inglés
        htmlContentENG = "<html><body style='text-align: center; color: black; font-family: Arial;' >"
                + "<h1 style='color: #5B74C3;'>EXTENSIONS OF BASIC TURING MACHINES</h1><br><br>"

                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405654731_281713151535728_8275004349497538077_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_ohc=tYgTMtgogxwAX8yWbcL&_nc_oc=AQnJpsPamEOrrp07bcPIolWqCgfwvJLvEBRGddFoi7ELsZr5MD-8xPgEhPH2PsqOeTI&_nc_ht=scontent.fbga3-1.fna&oh=00_AfAoCHwfIh_3ajSX3ThTO_YvhuzHmguC_8QWLswt8CmUbA&oe=6567CE82' alt='Placeholder Image'><br><br>"

                + "<p style='text-align:left; margin-left:100px;'>"
                + "Basic Turing machines are theoretical models used to study computability. They are abstract machines that have a finite set of states, an alphabet of symbols, and a transition function that determines which action the machine should take for each state and symbol."
                + "<br><br><br></p>"

                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404372970_281713804868996_6356173709026303313_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=5f2048&_nc_ohc=2bcSvkDFvkcAX_QliNa&_nc_ht=scontent.fbga3-1.fna&oh=00_AfA31ZILZPvJw8mMuVGRL_jDdPiR9HripuvMmrzIR6b_IQ&oe=656669B1' alt='Placeholder Image'><br><br>"

                + "<p style='text-align:left; margin-left:100px;'>"
                + "Non-deterministic Turing machines: These machines can have more than one possible action for each state and symbol. This allows them to model systems that can have multiple possible outcomes for the same input."
                + "<br><br></p>"

                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color: #5B74C3;'>Execution</h2>"
                + "<ol style='margin-left: 20px;'>"
                + "<li>The NTM starts in an initial state q0.</li>"
                + "<li>The NTM reads the current symbol from the tape.</li>"
                + "<li>The NTM applies the transition function δ to determine the next action.</li>"
                + "<li>The NTM performs the action determined by δ.</li>"
                + "<li>Steps 2-4 are repeated until the NTM halts.</li>"
                + "</ol>"
                + "</div>"

                + "<p style='text-align:left; margin-left:100px;'>"
                + "<b>Turing Machines with Infinite Tape:</b> These machines have an infinite tape, allowing them to model systems that can have infinite input. The infinite tape provides unlimited storage space to the left and right, enabling the machine to move in both directions without restrictions."
                + "<br><br><br></p>"

                + "<div style='text-align: left; margin-left:100px;'> "
                + "<h2 style='color: #5B74C3;'>Characteristics:"
                + "</h2>"
                + "<ul style='margin-left: 20px;'>"
                + "<li><b>Infinite Tape:</b> Unlike standard Turing Machines that have a finite tape, Turing Machines with an infinite tape have a tape that extends infinitely in both directions."
                + "<br><br></li>"
                + "<li><b>Infinite Movement:</b> The read/write head has the ability to move left and right along the infinite tape. This allows the machine to access any position on the tape, regardless of its distance from the initial position."
                + "<br><br></li>"
                + "</ul>"
                + "</div>"

                + "<h2 style='color: #5B74C3; text-align:center'>"
                + "Extensions of basic Turing machines have allowed modeling a wide range of real systems, including:"
                + "</h2> <br>"

                + "<div style='text-align: left; margin-left:100px; padding:20px;'>"
                + "<ol style='margin-left: 20px;'>"

                + "<li>"
                + "<p><b>Computers:</b> Basic Turing machines are used to model the internal workings of computers.<br>"
                + "<br></p>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405554473_281721568201553_4190671734879336388_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=5f2048&_nc_ohc=rqoDg5OSrFYAX_y2z9w&_nc_ht=scontent.fbga3-1.fna&oh=00_AfD01m-suNlxjT6kLOT31la43JbxoBRbz2ne2dF7VrjXsw&oe=65667088'><br><br><br><br>"
                + "</li>"

                + "<br><li>"
                + "<p><b>Logic:</b> Turing machines are used to study formal logic.<br>"
                + "<br></p>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405553615_281722054868171_209498988647614606_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=5f2048&_nc_ohc=n5ariE2o2lYAX-9AiQv&_nc_ht=scontent.fbga3-1.fna&oh=00_AfAdpUG7_YU-o3lF1XJl2EVBpvVy-_LAqdERUDb58sfUmw&oe=65676ABD'><br><br><br><br>"
                + "</li>"

                + "<li>"
                + "<p><b>Mathematics:</b> Turing machines are used to study the foundations of mathematics.<br>"
                + "<br></p>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405582692_281722838201426_1563785501134258681_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=5f2048&_nc_ohc=z3EsZ7JkftYAX_tZL_u&_nc_ht=scontent.fbga3-1.fna&oh=00_AfASf_DOuJrMpykNOfhVyhBXTW2qW9ykHC_PtfeN3vP3Cg&oe=65664AA3'><br><br><br><br>"
                + "</li>"

                + "<li>"
                + "<p><b>Computer Science:</b> Turing machines are used to study the theory of computation.<br>"
                + "<br></p>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405598730_281723171534726_6799405737082640228_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=5f2048&_nc_ohc=Wg9nxt2F6LoAX-QS2oH&_nc_ht=scontent.fbga3-1.fna&oh=00_AfCruFOAar4gtIHsJHugwiiEFG0GfxLYZlCkBTQJvU0Nig&oe=65671FC6'>"
                + "<br><br><br></li>"

                + "</ol>"
                + "</div>"

                + "<br><br></body></html>";

        contentPane.setText(htmlContentES);

        // Botones para cambiar el idioma
        JButton btnSpanish = new JButton("ES");
        btnSpanish.setBackground(Color.WHITE);
        btnSpanish.setForeground(new Color(34, 153, 255));
        btnSpanish.setFont(new Font("Arial", Font.BOLD, 12));
        btnSpanish.setCursor(getCursor());

        JButton btnEnglish = new JButton("ENG");
        btnEnglish.setBackground(Color.WHITE);
        btnEnglish.setForeground(new Color(34, 153, 255));
        btnEnglish.setFont(new Font("Arial", Font.BOLD, 12));

        // Listener para el botón en español
        btnSpanish.addActionListener(e -> {
            contentPane.setText(htmlContentES);
        });

        // Listener para el botón en inglés
        btnEnglish.addActionListener(e -> {
            contentPane.setText(htmlContentENG);
        });
        // boton para atras
        JButton prev = new JButton("ANTERIOR");
        prev.setBackground(Color.WHITE);
        prev.setForeground(new Color(34, 153, 255));
        prev.setFont(new Font("Arial", Font.BOLD, 12));
        // boton siguente
        JButton next = new JButton("SIGUIENTE");
        next.setBackground(Color.WHITE);
        next.setForeground(new Color(34, 153, 255));
        next.setFont(new Font("Arial", Font.BOLD, 12));

        // cuando de click en anterior abrir el tema 4
        prev.addActionListener(e -> {
            setVisible(false);
            new Rules(name);
        });

        // cuando de click en siguiente abrir el tema 6
        next.addActionListener(e -> {
            setVisible(false);
            new Topic2(name);
        });

        // instanciamos el boton de abrir menu desde la clase MenuButton
        MenuButton menuButton = new MenuButton(this, name);
        JButton btnOpenMenu = menuButton.getButton();
        btnOpenMenu.setBackground(Color.WHITE);
        btnOpenMenu.setForeground(new Color(34, 153, 255));
        btnOpenMenu.setFont(new Font("Arial", Font.BOLD, 12));

        // agregamos los botones al panel de botones
        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(new Color(34, 153, 255));
        btnPanel.add(prev);
        btnPanel.add(next);
        btnPanel.add(btnOpenMenu);
        btnPanel.add(btnSpanish);
        btnPanel.add(btnEnglish);

        // Cargar la imagen desde el archivo en el proyecto
        // ImageIcon backgroundImage = new
        // ImageIcon(getClass().getResource("/icons/bg-nav.jpg"));
        // System.out.println("backgroundImage = " + backgroundImage);
        // JLabel backgroundLabel = new JLabel(backgroundImage);
        // backgroundLabel.setLayout(new BorderLayout());

        // Añadir el panel de botones al label de fondo
        // backgroundLabel.add(btnPanel, BorderLayout.CENTER);
        // add(backgroundLabel);

        JScrollPane scrollPane = new JScrollPane(contentPane);
        add(btnPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    //public static void main(String[] args) {
      //  new Topic1("test");
    //}
}
