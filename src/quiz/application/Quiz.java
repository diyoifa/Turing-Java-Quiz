package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame implements ActionListener {

    //preguntas
    String questions[][] = new String[10][5];
    //las respuestas correctas 
    String answers[][] = new String[10][1];
    //guarda las opciones seleccionadas del usuario
    String useranswers[][] = new String[10][1];
    //numero de pregunta y texto de la pregunta
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static float score = 0;

    String name;

    public Quiz(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(222, 230, 254));
        setLayout(null);
        
        //imagen de fondo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1400, 350);
        add(image);
        
        //numero de la pregunta
        qno = new JLabel();
        qno.setBounds(100, 370, 50, 30);
        qno.setFont(new Font("Arial", Font.PLAIN, 24));
        qno.setForeground(new Color(91, 116, 195));
        add(qno);

        //pregunta
        question = new JLabel();
        question.setBounds(150, 370, 900, 30);
        question.setForeground(new Color(91, 116, 195));
        question.setFont(new Font("Arial", Font.PLAIN, 24));
        add(question);
        //orden de vectores a las preguntas
        questions[0][0] = "¿Cuáles son los componentes principales de un diagrama de transición?";
        questions[0][1] = "Estados, transiciones, acciones, movimientos";
        questions[0][2] = "Estados, transiciones, acciones";
        questions[0][3] = "Estados, transiciones, movimientos";
        questions[0][4] = "Acciones, movimientos";

        questions[1][0] = "¿Cómo se representan los estados en un diagrama de transición?";
        questions[1][1] = "Como círculos";
        questions[1][2] = "Como cuadrados";
        questions[1][3] = "Como triángulos";
        questions[1][4] = "Como rombos";

        questions[2][0] = "¿Cuál de los siguientes es un componente de una máquina de Turing?";
        questions[2][1] = "Cinta";
        questions[2][2] = "Estado";
        questions[2][3] = "Alfabeto de máquina";
        questions[2][4] = "Todas las anteriores";

        questions[3][0] = "¿Qué es el estado inicial de una máquina de Turing";
        questions[3][1] = "El estado en el que comienza la máquina";
        questions[3][2] = "El estado en el que se detiene la máquina";
        questions[3][3] = "El estado en el que la máquina puede realizar cualquier acción";
        questions[3][4] = "Todas las anteriores";

        questions[4][0] = "¿Qué son los lenguajes aceptados por las máquinas de Turing?";
        questions[4][1] = "Los lenguajes que pueden ser reconocidos por algoritmos finitos";
        questions[4][2] = "Los lenguajes que pueden ser reconocidos por máquinas de Turing";
        questions[4][3] = "Los lenguajes que pueden ser reconocidos por máquinas";
        questions[4][4] = "Todas las anteriores";

        questions[5][0] = "Qué es el \"Lenguaje de Máquina de Turing (LMT)\" según la información dada";
        questions[5][1] = "Un lenguaje de programación práctico.";
        questions[5][2] = "Una descripción formal de cómo una máquina de Turing realiza cálculos";
        questions[5][3] = "Un lenguaje universal de programación";
        questions[5][4] = "Un lenguaje de bajo nivel para la comunicación entre máquinas";

        questions[6][0] = "¿Qué son las máquinas de Turing no deterministas?";
        questions[6][1] = "Máquinas de Turing que tienen más de una acción para cada estado";
        questions[6][2] = "Máquinas de Turing que tienen una cinta infinita";
        questions[6][3] = "Máquinas de Turing que tienen un almacenamiento secundario";
        questions[6][4] = "Máquinas de Turing que pueden leer y escribir símbolos continuamente";

        questions[7][0] = "¿Qué son las máquinas de Turing con cinta infinita?";
        questions[7][1] = "Máquinas de Turing que tienen más de una acción para cada estado";
        questions[7][2] = "Máquinas de Turing que tienen un almacenamiento secundario";
        questions[7][3] = "Máquinas de Turing que tienen una cinta infinita";
        questions[7][4] = "Máquinas de Turing que pueden leer y escribir símbolos continuamente";

        questions[8][0] = "¿Qué son las máquinas de Turing con almacenamiento secundario?";
        questions[8][1] = "Máquinas de Turing que tienen más de una acción para cada estado";
        questions[8][2] = "Máquinas de Turing que tienen un almacenamiento secundario";
        questions[8][3] = "Máquinas de Turing que tienen una cinta infinita";
        questions[8][4] = "Máquinas de Turing que pueden leer y escribir símbolos continuamente";

        questions[9][0] = "¿Qué son las máquinas de Turing con entrada y salida continua?";
        questions[9][1] = "Máquinas de Turing que tienen más de una acción para cada estado";
        questions[9][2] = "Máquinas de Turing que tienen un almacenamiento secundario";
        questions[9][3] = "Máquinas de Turing que tienen una cinta infinita";
        questions[9][4] = "Máquinas de Turing que pueden leer y escribir símbolos continuamente";

        answers[0][0] = "Estados, transiciones, acciones, movimientos";
        answers[1][0] = "Como círculos";
        answers[2][0] = "Todas las anteriores";
        answers[3][0] = "El estado en el que comienza la máquina";
        answers[4][0] = "Los lenguajes que pueden ser reconocidos por máquinas de Turing";
        answers[5][0] = "Una descripción formal de cómo una máquina de Turing realiza cálculos";
        answers[6][0] = "Máquinas de Turing que tienen más de una acción para cada estado";
        answers[7][0] = "Máquinas de Turing que tienen una cinta infinita";
        answers[8][0] = "Máquinas de Turing que tienen un almacenamiento secundario";
        answers[9][0] = "Máquinas de Turing que pueden leer y escribir símbolos continuamente";

        opt1 = new JRadioButton();
        opt1.setBounds(150, 430, 700, 30);
        opt1.setBackground(new Color(222, 230, 254));
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(150, 470, 700, 30);
        opt2.setBackground(new Color(222, 230, 254));
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(150, 510, 700, 30);
        opt3.setBackground(new Color(222, 230, 254));
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(150, 560, 700, 30);
        opt4.setBackground(new Color(222, 230, 254));
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("SIGUIENTE");
        next.setBounds(1100, 450, 200, 40);
        next.setFont(new Font("Arial", Font.PLAIN, 22));
        next.setBackground(Color.WHITE);
        next.setForeground(new Color(91, 116, 195));
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 Bono");
        lifeline.setBounds(1100, 500, 200, 40);
        lifeline.setFont(new Font("Arial", Font.PLAIN, 22));
        lifeline.setBackground(Color.WHITE);
        lifeline.setForeground(new Color(91, 116, 195));
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Enviar");
        submit.setBounds(1100, 550, 200, 40);
        submit.setFont(new Font("Arial", Font.PLAIN, 22));
        submit.setBackground(Color.WHITE);
        submit.setForeground(new Color(91, 116, 195));
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        //implementar contador
        start(count);

        setSize(1450, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        
        //toma los botones del quiz cuando se le da click
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            //unica respuesta
            ans_given = 1;
            //captura la opcion seleccionada
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if ( count == 0 || count == 1 || count == 2 || count == 3 ||  count == 6 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][0])) {
                    score += 0.5;
                } else {
                    score += 0;
                }
            }
            new Score(name, score);
            score = 0;
            count = 0;
            ans_given = 0;
            setVisible(false);

        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Tiempo - " + timer + " segundos"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1080, 420);
        } else {
            g.drawString("Siguiente!!", 1100, 410);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 0.5;
                    } else {
                        score += 0;
                    }
                }
                // cerrar ventana
                new Score(name, score);
                count = 0;
                ans_given = 0;
                score = 0; 
                setVisible(false);

            } else { // next button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setForeground(Color.BLACK);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        opt2.setForeground(Color.BLACK);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        opt3.setForeground(Color.BLACK);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        opt4.setForeground(Color.BLACK);

        groupoptions.clearSelection();
    }

   //public static void main(String[] args) {
     //   new Quiz("test");
    //}
}
