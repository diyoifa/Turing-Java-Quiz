package topics;

import java.awt.*;
import javax.swing.*;
import quiz.application.MenuButton;

public class Topic3 extends JFrame {

    JTextPane contentPane;
    String htmlContentES;
    String htmlContentENG;
    String name;

    public Topic3(String name) {
        this.name = name;
        setTitle("INTRODUCCION A LAS MAQUINA DE TURING");
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
                + "<h1 style='color: gray;'>INTRODUCCION A LAS MAQUINA DE TURING</h1><br><br>"
                
                + "<img src='https://th.bing.com/th/id/OIP.BDs8D_Jtb7yKMAK86mKADgAAAA?rs=1&pid=ImgDetMain' alt='Placeholder Image'><br><br>"
                
                + "<p style='text-align:left; margin-left:100px;'>Las máquinas de Turing son un modelo matemático de una computadora abstracta Fueron inventadas por Alan Turing en 1936 <br> para estudiar la naturaleza de los cálculos computables "
                + "<br><br><br></p>"
                + "<h2 style='color:gray;'>¿QUE ES?</h2>"
                
                + "<p style='text-align:left; margin-left:100px;'>Es una abstracción matemática que representa un modelo teórico <br>"
                + "de un dispositivo capaz de realizar cálculos"
                + "siguiendo reglas específicas. La introducción de la máquina de Turing <br>"
                + "marcó un hito importante en el desarrollo de la teoría de la computación"
                + "y tuvo un impacto significativo en la comprensión  <br>"
                + "de los límites y capacidades de los algoritmos y las computadoras.<br>"
                + "Este modelo está formado por un alfabeto de entrada y uno de salida, un símbolo especial llamado"
                + "blanco un conjunto de estados finitos <br> y un conjunto de transiciones entre dichos estados. "
                + "<br><br><br> </p>"
                
                + "<div style='text-align: left; margin-left:100px;'> "
                + "<h2 style='color:gray;'>Componentes</h2>"
                + "<ul style='margin-left: 20px;'>"
                
                + "<li>Una cinta infinita dividida en casillas y una cabeza lectora/escritora que se mueve <br> a lo largo de la cinta</li>"
                
                + "<li>La cinta contiene símbolos, y la cabeza puede leer y escribir símbolos en las casillas.</li>"
                
                + "<li>La máquina tiene un conjunto finito de estados internos y reglas de transición <br> que determinan su comportamiento.</li>"
                
                + "</ul>"
                + "</div>"
                
                + "<div style='margin-left:-10px; padding:20px;'>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404941852_281385274901849_1086748544672084846_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=5f2048&_nc_ohc=WRn318vJYrEAX_-By2C&_nc_ht=scontent.fbga3-1.fna&oh=00_AfDx5h8xqCSaD8NkXe0N9ll7iTeQITdEaqewQWcwoOWXVg&oe=6565BD2F' alt='Placeholder Image'><br><br>"
                + "</div>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'>"
                + "<h2 style='color:gray;'>Puede definirse en una cinta como una 7-tupla Donde: "
                + "</h2> <br>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405886584_281462008227509_9070894222190674188_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=5f2048&_nc_ohc=moQV-X_HGNIAX-qeYaJ&_nc_ht=scontent.fbga3-1.fna&oh=00_AfCbpJ-BYfdSmz8hwvroGkyd6Ys8RgtxS__UtnafJX70ZQ&oe=65661F95' alt='Placeholder Image'><br><br>"
                + "<ul style='margin-left: 20px;'>"
               
                + "<li> Q -> Es un conjunto finito de estados.</li>"
                
                + "<li> E -> Es un conjunto finito de símbolos distinto del espacio en blanco, denominado </li>"
                
                + "<li> Γ -> Es un conjunto finito de símbolos de cinta, denominado alfabeto de cinta (Σ⊆Γ) </li>"
               
                + "<li>	S E Q -> Es el estado inicial</li>"
               
                + "<li>	B E Γ -> Es un símbolo denominado blanco, y es el único símbolo que se puede repetir un número infinito de veces.</li>"
               
                + "<li>	F E Q es el conjunto de estados finales de aceptación.</li>"
               
                + "<li>	Q × Γ→ Q × Γ × {L,R} -> Es una función parcial denominada función de transición, donde L es un movimiento a la izquierda <br> y R es el movimiento a la derecha.</li>"
               
                + "</ul>"
                + "</div>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>¿Cómo Funciona?</h2>"
                + "<ol style='margin-left: 20px;'>"    
                + "<li>La máquina comienza en un estado inicial y se coloca el cabezal lector/escritor en el primer cuadrado de la cinta.</li>"
               
                + "<li>La máquina lee el símbolo que se encuentra en el cuadrado en el que se encuentra el cabezal lector/escritor</li>"
               
                + "<li>La máquina utiliza la tabla de transición para determinar cuál debe ser su siguiente acción</li>"
               
                + "<li>La máquina realiza la acción especificada por la tabla de transición</li>"
               
                + "<li>El cabezal lector/escritor se mueve a la siguiente posición de la cinta</li>"
               
                + "<li>Los pasos 2 a 5 se repiten hasta que la máquina llegue a un estado final</li>"
                + "</ol>"
                + "</div>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>Ejemplo</h2>"
                + "<p style='margin-left: 20px;'>"
                + "Consideremos una máquina de Turing que, dada una cadena de ceros y unos, escribe el número de ceros que contiene en la cinta. <br>"
                + "La máquina tiene un alfabeto de dos símbolos: 0 y 1. El conjunto de estados de la máquina es {q0, q1, q2}. <br> <br>"
                + "El estado inicial es q0. La tabla de transición de la máquina es la siguiente:"
                + "<br></p>"
                + "</div>"
                
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405882392_281467738226936_2974071418843638468_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_ohc=NLoyQGH0TiAAX_cuYmx&_nc_ht=scontent.fbga3-1.fna&oh=00_AfBgk8KQnN4mxh8-SMwjTWjzeTb-voLtQMhZUh1kqOsAzA&oe=65658E4A' alt='Placeholder Image'><br><br>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>El funcionamiento de la máquina es el siguiente: </h2>"
                + "<ul style='margin-left: 20px;'>"
                + "<li>La máquina comienza en el estado q0 con el cabezal lector/escritor en la primera celda de la cinta.</li>"
               
                + "<li>La máquina lee el primer símbolo en la cinta. Si es un 0, la máquina escribe un 1 en la celda y pasa al estado q1.<br> Si es un 1, la máquina escribe un 1 en la celda y permanece en el estado q0.</li>"
               
                + "<li>La máquina repite los pasos 2 y 3 hasta que llega al final de la cinta</li>"
              
                + "<li>Si la máquina llega al final de la cinta y está en el estado q2, entonces la cinta contiene solo ceros. <br> La máquina escribe el número de ceros que contiene la cinta en la última celda y se detiene.</li>"
               
                + "</ul>"
                + "<p style='margin-left: 20px;'>"
                + "Por ejemplo, si la máquina se le da la cadena de entrada \"110110\", la máquina escribirá el número 4 en la última celda de la cinta. <br>"
                + "<br></p>"
                + "</div>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>Diagrama transición </h2>"
                + "<p style='margin-left: 20px;'>"
                + "Los componentes principales de un diagrama de transición son: <br>"
                + "</p>"
                + "<ul style='margin-left: 20px;'>"
                + "<li>Estados: Los estados representan los diferentes estados en los que puede estar la máquina. Se representan como círculos</li>"
               
                + "<li>Transiciones: Las transiciones representan los cambios de estado que puede realizar la máquina. <br> Se representan como flechas que conectan los estados</li>"
               
                + "<li>Acciones: Las acciones son las operaciones que realiza la máquina en cada estado. Se representan como etiquetas en las flechas</li>"
               
                + "<li>Movimientos: Los movimientos son los movimientos que realiza el cabezal lector/escritor en la cinta. <br> Se representan como flechas en los estados.</li>"
                + "</ul>"
                + "</div>"
                
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405855247_281472168226493_5783500389954792890_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=5f2048&_nc_ohc=_R9AAEvB5fYAX-qwOG9&_nc_ht=scontent.fbga3-1.fna&oh=00_AfDIEX6kuisbMreM10Uco3qh-BMMO0uK716XR-yxDAL2CQ&oe=6565AF79' alt='Placeholder Image'><br><br>"
                
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>Explicación del diagrama: </h2>"
                + "<p style='margin-left: 20px;'>"
                + "El diagrama está dividido en dos partes principales: <br>"
                + "</p>"
                + "<ul style='margin-left: 20px;'>"
                + "<li>Los estados se muestran como círculos</li>"
                + "<li>Las acciones se muestran como flechas que conectan los estados</li>"
                + "</ul>"
                + "</div>"
                
                + "<br><br></body></html>";

        // Contenido en inglés
        htmlContentENG = "<html><body style='text-align: center; color: white; font-family: Arial;' >"
                + "<h1 style='color: gray;'>INTRODUCTION TO TURING MACHINES</h1><br><br>"
                + "<img src='https://th.bing.com/th/id/OIP.BDs8D_Jtb7yKMAK86mKADgAAAA?rs=1&pid=ImgDetMain' alt='Placeholder Image'><br><br>"
                + "<p style='text-align:left; margin-left:100px;'>Turing machines are a mathematical model of an abstract computer. They were invented by Alan Turing in 1936 <br> to study the nature of computable calculations."
                + "<br><br><br></p>"
                + "<h2 style='color:gray;'>WHAT IS IT?</h2>"
                + "<p style='text-align:left; margin-left:100px;'>It is a mathematical abstraction that represents a theoretical model <br>"
                + "of a device capable of performing calculations"
                + "following specific rules. The introduction of the Turing machine <br>"
                + "marked a significant milestone in the development of the theory of computation"
                + "and had a significant impact on understanding <br>"
                + "the limits and capabilities of algorithms and computers.<br>"
                + "This model is composed of an input and an output alphabet, a special symbol called"
                + "blank, a set of finite states <br> and a set of transitions between those states. "
                + "<br><br><br> </p>"
                + "<div style='text-align: left; margin-left:100px;'> "
                + "<h2 style='color:gray;'>Components</h2>"
                + "<ul style='margin-left: 20px;'>"
                + "<li>An infinite tape divided into squares and a reading/writing head that moves <br> along the tape</li>"
                + "<li>The tape contains symbols, and the head can read and write symbols on the squares.</li>"
                + "<li>The machine has a finite set of internal states and transition rules <br> that determine its behavior.</li>"
                + "</ul>"
                + "</div>"
                + "<div style='margin-left:-10px; padding:20px;'>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/404941852_281385274901849_1086748544672084846_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=5f2048&_nc_ohc=WRn318vJYrEAX_-By2C&_nc_ht=scontent.fbga3-1.fna&oh=00_AfDx5h8xqCSaD8NkXe0N9ll7iTeQITdEaqewQWcwoOWXVg&oe=6565BD2F' alt='Placeholder Image'><br><br>"
                + "</div>"
                + "<div style='text-align: left; margin-left:100px; padding:20px;'>"
                + "<h2 style='color:gray;'>It can be defined on a tape as a 7-tuple Where: "
                + "</h2> <br>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405886584_281462008227509_9070894222190674188_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=5f2048&_nc_ohc=moQV-X_HGNIAX-qeYaJ&_nc_ht=scontent.fbga3-1.fna&oh=00_AfCbpJ-BYfdSmz8hwvroGkyd6Ys8RgtxS__UtnafJX70ZQ&oe=65661F95' alt='Placeholder Image'><br><br>"
                + "<ul style='margin-left: 20px;'>"
                + "<li> Q -> Is a finite set of states.</li>"
                + "<li> E -> Is a finite set of symbols different from the blank, denoted </li>"
                + "<li> Γ -> Is a finite set of tape symbols, called the tape alphabet (Σ⊆Γ) </li>"
                + "<li>S E Q -> Is the initial state</li>"
                + "<li>B E Γ -> Is a symbol called blank, and it's the only symbol that can be repeated an infinite number of times.</li>"
                + "<li>F E Q is the set of final accepting states.</li>"
                + "<li>Q × Γ→ Q × Γ × {L,R} -> Is a partial function called the transition function, where L is a move to the left <br> and R is a move to the right.</li>"
                + "</ul>"
                + "</div>"
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>How Does It Work?</h2>"
                + "<ol style='margin-left: 20px;'>"
                + "<li>The machine starts in an initial state, and the reading/writing head is placed on the first square of the tape.</li>"
                + "<li>The machine reads the symbol on the square where the reading/writing head is positioned.</li>"
                + "<li>The machine uses the transition table to determine its next action.</li>"
                + "<li>The machine performs the action specified by the transition table.</li>"
                + "<li>The reading/writing head moves to the next position on the tape.</li>"
                + "<li>Steps 2 to 5 are repeated until the machine reaches a final state.</li>"
                + "</ol>"
                + "</div>"
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>Example</h2>"
                + "<p style='margin-left: 20px;'>"
                + "Consider a Turing machine that, given a string of zeros and ones, writes the number of zeros it contains on the tape. <br>"
                + "The machine has an alphabet of two symbols: 0 and 1. The set of states of the machine is {q0, q1, q2}. <br> <br>"
                + "The initial state is q0. The transition table of the machine is as follows:"
                + "<br></p>"
                + "</div>"
                + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405882392_281467738226936_2974071418843638468_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_ohc=NLoyQGH0TiAAX_cuYmx&_nc_ht=scontent.fbga3-1.fna&oh=00_AfBgk8KQnN4mxh8-SMwjTWjzeTb-voLtQMhZUh1kqOsAzA&oe=65658E4A' alt='Placeholder Image'><br><br>"
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>The machine's operation is as follows: </h2>"
                + "<ul style='margin-left: 20px;'>"
                + "<li>The machine starts in state q0 with the reading/writing head in the first tape cell.</li>"
                + "<li>The machine reads the first symbol on the tape. If it is a 0, the machine writes a 1 on the cell and moves to state q1.<br> If it is a 1, the machine writes a 1 on the cell and remains in state q0.</li>"
                + "<li>The machine repeats steps 2 and 3 until it reaches the end of the tape.</li>"
                + "<li>If the machine reaches the end of the tape and is in state q2, then the tape contains only zeros. <br> The machine writes the number of zeros contained in the tape in the last cell and stops.</li>"
                + "</ul>"
                + "<p style='margin-left: 20px;'>"
                + "For example, if the machine is given the input string \"110110\", the machine will write the number 4 in the last tape cell. <br>"
                + "<br></p>"
                + "</div>"
                + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                + "<h2 style='color:gray;'>Transition Diagram </h2>"
                + "<p style='margin-left: 20px;'>"
                + "The main components of a transition diagram are: <br>"
                + "</p>"
                + "<ul style='margin-left: 20px;'>"
                + "<li>States: States represent the different states the machine can be in. They are represented as circles.</li>"
                + "<li>Transitions: Transitions represent the state changes the machine can make. <br> They are represented as arrows connecting the states.</li>"
                + "<li>Actions: Actions are the operations the machine performs in each state. They are represented as labels on the arrows.</li>"
                + "<li>Movements: Movements are the movements the reading/writing head makes on the tape. <br> They are represented as arrows on the states.</li>"
                + "</ul>"
                + "</div>"
                + "<br><br></body></html>";

        contentPane.setText(htmlContentES);

        // Botones para cambiar el idioma
        JButton btnSpanish = new JButton("ES");
        btnSpanish.setBackground(new Color(44, 62, 80));
        btnSpanish.setForeground(new Color(171, 178, 185));
        btnSpanish.setFont(new Font("Arial", Font.BOLD, 12));
        btnSpanish.setCursor(getCursor());

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
            new Topic2(name);
        });

        next.addActionListener(e -> {
            setVisible(false);
            new Topic4(name);
        });

        //instanciamos el boton de abrir menu desde la clase MenuButton
        MenuButton menuButton = new MenuButton(this);
        JButton btnOpenMenu = menuButton.getButton();
        btnOpenMenu.setBackground(new Color(44, 62, 80));
        btnOpenMenu.setForeground(new Color(171, 178, 185));
        btnOpenMenu.setFont(new Font("Arial", Font.BOLD, 12));

        //agregamos los botones al panel de botones
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
    //     new Topic3("test");
    // }
}
