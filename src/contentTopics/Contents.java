
package contentTopics;

public class Contents {
        // Atributos
        // crea variables constanstes de tipo string con su respectivo metodo get
        // contenido en español
        private final String topic1ES = "<html><body style='text-align: center; color: black; font-family: Arial;' >"

                        + "<h1 style='color: #5B74C3;'>BIOGRAFIA DE ALAN TURING</h1><br><br>"

                        + "<img src='https://i.pinimg.com/474x/b6/bd/b0/b6bdb04511b63475b5c5e1887c9c6221.jpg'> <br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "(Alan Mathison Turing; Londres, 1912 - Wilmslow, Reino Unido, 1954) Matemático británico. Pasó sus primeros   <br> "
                        + "trece años en la India, donde su padre trabajaba en la Administración colonial De regreso al Reino Unido, <br> "
                        + "estudió en el King's College y, tras su graduación, se trasladó a la Universidad estadounidense de Princeton <br>"
                        + "donde trabajó con el lógico Alonzo Church.<br><br></p>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "En 1937 publicó un célebre artículo en el que definió una máquina calculadora de capacidad infinita (máquina de Turing)<br> "
                        + "que operaba basándose en una serie de instrucciones lógicas, sentando así las bases del concepto moderno de algoritmo<br>"
                        + "Turing describió en términos matemáticos precisos cómo un sistema automático con reglas extremadamente simples podía<br>"
                        + "efectuar toda clase de operaciones matemáticas expresadas en un lenguaje formal determinado. La máquina de Turing era tanto<br>"
                        + "un ejemplo de su teoría de computación como una prueba de que un cierto tipo de máquina computadora podía ser construida. <br>"
                        + "<br><br></p>"

                        + "<img src='https://slsa-collections.s3.amazonaws.com/cb/14/5bd1-565a-5961-aac8-ca1053c6160f.jpg'> <br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "<b>La Segunda Guerra Mundial</b> ofreció un insospechado marco de aplicación práctica de sus teorías, al surgir la <br> "
                        + "necesidad de descifrar los mensajes codificados que la Marina alemana empleaba para enviar instrucciones a los <br>"
                        + "submarinos que hostigaban los convoyes de ayuda material enviados desde Estados Unidos; Turing, al mando de una <br>"
                        + "división de la Inteligencia británica, diseñó tanto los procesos como las máquinas que, eran capaces de efectuar<br>"
                        + "cálculos combinatorios mucho más rápidamente que cualquier ser humano, fueron decisivos en la ruptura final del código.<br>"
                        + "<br><br></p>"

                        + "<img src='https://assets.isu.pub/document-structure/230409175227-6cf94194da62e53299ee9883ec3ce921/v1/b51bb4ecd3c455d5a5cac83338893fc7.jpeg'> <br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "Alan Turing definió además un método teórico para decidir si una máquina era capaz de pensar como un hombre<br>"
                        + "(test de Turing) y realizó contribuciones a otras ramas de la matemática aplicada, como la aplicación de<br>"
                        + "métodos analíticos y mecánicos al problema biológico de la morfogénesis. En el ámbito personal, su condicion<br>"
                        + "de homosexual fue motivo constante de fuertes presiones sociales y familiares, hasta el punto de especularse<br>"
                        + "si su muerte por intoxicación fue accidental o se debió a un intento de suicidio.<br>"
                        + "<br><br></p>"

                        + "<br><br></body></html>";

        private final String topic2ES = "<html><body style='text-align: center; color: black; font-family: Arial;' >"

                        + "<h1 style='color: #5B74C3;'>LENGUAJES ACEPTADOS POR LAS MT</h1><br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "De acuerdo a la clasificación de los lenguajes formales realizada por el norteamericano Avram Chomsky, la Máquina <br>"
                        + "de Turing acepta los lenguajes más generales, o tipo cero (0), también llamados lenguajes recursivamente enumerables.<br>"
                        + "<br><br></p>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "Un lenguaje recursivamente enumerable es un lenguaje formal para el cual existe una máquina de Turing que acepta <br>"
                        + "acepta y se detiene con cualquier cadena del lenguaje, pero que puede parar y rechazar, o bien iterar indefinidamente, <br>"
                        + "con una cadena que no pertenece al lenguaje. Todos los lenguajes, regulares, independientes de contexto, dependientes <br>"
                        + "de contexto y recursivos son recursivamente enumerables.<br>"
                        + "<br><br></p>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "Una cadena ω∈A^*, es aceptada por una MT, si comienza en el estado e0, con la cabeza de lectura/escritura en el símbolo <br>"
                        + "más a la izquierda, luego de leer toda la cadena ω, llega a un estado e_f∈F. El lenguaje aceptado por MT, es el conjunto <br>"
                        + "de todas las cadenas aceptadas por la MT.<br>"
                        + "<br><br></p>"

                        + "<h2 style='color: #5B74C3;'>"
                        + "L(MT)={ω / e_0 ω ⊢*α_1 e_f α_2 y e_f∈F y α_1,α_1 ∈C^* y ω∈A^* }"
                        + "</h2>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "Tenemos por ejemplo una MT que reconoce el lenguaje {0^n 1^n:n≥1}. Las transiciones de la máquina se representan como sigue:<br>"
                        + "<br><br></p>"

                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405660926_282454688128241_6438087525585764374_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=5f2048&_nc_ohc=7ziqry4De-IAX9-cZUb&_nc_ht=scontent.fbga3-1.fna&oh=00_AfADzxkDNot67r6DYR3V7kSmekiAGPQ9IFGX6yAO-dyUEQ&oe=6568C499' alt='Placeholder Image'><br><br>"

                        + "<h2 style='color: #5B74C3;'>"
                        + "Se evalúa la cadena w = 1100, arrojando el siguiente resultado:<br>"
                        + "</h2>"

                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405160796_282455501461493_1410448688043461519_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=5f2048&_nc_ohc=saOVxrA3_P8AX-q_deu&_nc_ht=scontent.fbga3-1.fna&oh=00_AfDo9cLIJEBmfpNKiK6Q2N5eY51-2PLekpq490qNIFZeBQ&oe=6568FF4A' alt='Placeholder Image'><br><br>"

                        + "<div style='text-align: left; margin-left:100px;'> "

                        + "<br><br></body></html>";

        private final String topic3ES = "<html><body style='text-align: center; color: black; font-family: Arial;' >"
                        + "<h1 style='color: #5B74C3;'>INTRODUCCION A LAS MAQUINA DE TURING</h1><br><br>"

                        + "<img src='https://th.bing.com/th/id/OIP.BDs8D_Jtb7yKMAK86mKADgAAAA?rs=1&pid=ImgDetMain' alt='Placeholder Image'><br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>Las máquinas de Turing son un modelo matemático de una computadora abstracta Fueron inventadas por Alan Turing en 1936 <br> para estudiar la naturaleza de los cálculos computables "
                        + "<br><br><br></p>"
                        + "<h2 style='color: #5B74C3;'>¿QUE ES?</h2>"

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
                        + "<h2 style='color: #5B74C3;'>Componentes</h2>"
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
                        + "<h2 style='color: #5B74C3;'>Puede definirse en una cinta como una 7-tupla Donde: "
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
                        + "<h2 style='color: #5B74C3;'>¿Cómo Funciona?</h2>"
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
                        + "<h2 style='color: #5B74C3;'>Ejemplo</h2>"
                        + "<p style='margin-left: 20px;'>"
                        + "Consideremos una máquina de Turing que, dada una cadena de ceros y unos, escribe el número de ceros que contiene en la cinta. <br>"
                        + "La máquina tiene un alfabeto de dos símbolos: 0 y 1. El conjunto de estados de la máquina es {q0, q1, q2}. <br> <br>"
                        + "El estado inicial es q0. La tabla de transición de la máquina es la siguiente:"
                        + "<br></p>"
                        + "</div>"

                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405882392_281467738226936_2974071418843638468_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_ohc=NLoyQGH0TiAAX_cuYmx&_nc_ht=scontent.fbga3-1.fna&oh=00_AfBgk8KQnN4mxh8-SMwjTWjzeTb-voLtQMhZUh1kqOsAzA&oe=65658E4A' alt='Placeholder Image'><br><br>"

                        + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                        + "<h2 style='color: #5B74C3;'>El funcionamiento de la máquina es el siguiente: </h2>"
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
                        + "<h2 style='color: #5B74C3;'>Diagrama transición </h2>"
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
                        + "<h2 style='color: #5B74C3;'>Explicación del diagrama: </h2>"
                        + "<p style='margin-left: 20px;'>"
                        + "El diagrama está dividido en dos partes principales: <br>"
                        + "</p>"
                        + "<ul style='margin-left: 20px;'>"
                        + "<li>Los estados se muestran como círculos</li>"
                        + "<li>Las acciones se muestran como flechas que conectan los estados</li>"
                        + "</ul>"
                        + "</div>"

                        + "<br><br></body></html>";

        private final String topic4ES = "<html><body style='text-align: center; color: black; font-family: Arial;' >"
                        + "<h1 style='color: #5B74C3;'>LENGUAJES ACEPTADO POR MT</h1><br><br>"
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
                        + "<h2 style='color: #5B74C3;'>Algunos ejemplos de lenguajes aceptados por las máquinas de Turing incluyen:"
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
                        + "<h2 style='color: #5B74C3;'>Algoritmo</h2>"
                        + "<ol style='margin-left: 20px;'>"
                        + "<li>Se ejecuta la máquina de Turing con la cadena como entrada</li>"
                        + "<li>Si la máquina se detiene en un estado final, entonces la cadena pertenece al lenguaje</li>"
                        + "<li>Si la máquina no se detiene, entonces la cadena no pertenece al lenguaje</li>"
                        + "</ol>"
                        + "</div>"

                        + "<br><br></body></html>";
        private final String topic5ES = "<html><body style='text-align: center; color: black; font-family: Arial;' >"

                        + "<h1 style='color: #5B74C3;'>EXTENSIONES DE LAS MT BASICAS</h1><br><br>"

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
                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405554473_281721568201553_4190671734879336388_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=5f2048&_nc_ohc=rqoDg5OSrFYAX_y2z9w&_nc_ht=scontent.fbga3-1.fna&oh=00_AfD01m-suNlxjT6kLOT31la43JbxoBRbz2ne2dF7VrjXsw&oe=65667088'><br><br><br><br>"
                        + "</li>"

                        + "<br><li>"
                        + "<p><b>Lógica:</b> Las máquinas de Turing se utilizan para estudiar la lógica formal.<br>"
                        + "<br></p>"
                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405553615_281722054868171_209498988647614606_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=5f2048&_nc_ohc=n5ariE2o2lYAX-9AiQv&_nc_ht=scontent.fbga3-1.fna&oh=00_AfAdpUG7_YU-o3lF1XJl2EVBpvVy-_LAqdERUDb58sfUmw&oe=65676ABD'><br><br><br><br>"
                        + "</li>"

                        + "<li>"
                        + "<p><b>Matemáticas:</b> Las máquinas de Turing se utilizan para estudiar los fundamentos de las matemáticas.<br>"
                        + "<br></p>"
                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405582692_281722838201426_1563785501134258681_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=5f2048&_nc_ohc=z3EsZ7JkftYAX_tZL_u&_nc_ht=scontent.fbga3-1.fna&oh=00_AfASf_DOuJrMpykNOfhVyhBXTW2qW9ykHC_PtfeN3vP3Cg&oe=65664AA3'><br><br><br><br>"
                        + "</li>"

                        + "<li>"
                        + "<p><b>Ciencia de la computación:</b> Las máquinas de Turing se utilizan para estudiar la teoría de la computación.<br>"
                        + "<br></p>"
                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405598730_281723171534726_6799405737082640228_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=5f2048&_nc_ohc=Wg9nxt2F6LoAX-QS2oH&_nc_ht=scontent.fbga3-1.fna&oh=00_AfCruFOAar4gtIHsJHugwiiEFG0GfxLYZlCkBTQJvU0Nig&oe=65671FC6'>"
                        + "<br><br><br></li>"

                        + "</ol>"
                        + "</div>"

                        + "<br><br></body></html>";
        private final String topic6ES = "<html><body style='text-align: center; color: black; font-family: Arial;' >"

                        + "<h1 style='color: #5B74C3;'>ALGORITMOS ASOCIADOS A LAS MT</h1><br><br>"

                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405658314_282442044796172_2602224746062275254_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_ohc=iYo_thP0-tYAX_LBt8w&_nc_ht=scontent.fbga3-1.fna&oh=00_AfBwyP1SbG1Ka7n2QdbJKG55QE0LY62fob6m7ascZm71Vw&oe=6567A24C' alt='Placeholder Image'><br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "La abreviatura \"MT\" puede referirse a diferentes conceptos en el ámbito de la informática y la tecnología, por lo<br>"
                        + "que es importante proporcionar un contexto más específico. Algunas posibles interpretaciones de \"MT\" incluyen:<br>"
                        + "<br><br></p>"

                        + "<div style='text-align: left; margin-left:100px;'> "
                        + "<ol style='margin-left: 20px;'>"

                        + "<li>"
                        + "<p><b>Traducción Automática: </b> Los algoritmos asociados a la traducción automática son fundamentales para <br>"
                        + "procesar y traducir texto de un idioma a otro de manera automática. Algunos de los enfoques comunes incluyen:<br><br>"
                        + "</p>"

                        + "<ul>"

                        + "<li>"
                        + "<p>"
                        + "<b>Modelos basados en reglas:</b> Estos algoritmos utilizan reglas gramaticales y léxicas para realizar traducciones<br>"
                        + "Sin embargo, pueden ser limitados en la cobertura de idiomas y en la capacidad para manejar la complejidad semántica.<br>"
                        + "<br></p>"
                        + "</li>"

                        + "<li>"
                        + "<p>"
                        + "<b>Modelos estadísticos:</b>Estos modelos utilizan estadísticas y probabilidades basadas en corpus bilingües para<br>"
                        + "realizar traducciones. Métodos como el Modelo Oculto de Markov (HMM) y modelos de lenguaje n-gram son ejemplos <br> de enfoques estadísticos.<br>"
                        + "<br></p>"
                        + "</li>"

                        + "<li>"
                        + "<p>"
                        + "<b>Redes Neuronales Recurrentes :</b> Estos enfoques utilizan redes neuronales para capturar relaciones a largo<br>"
                        + "plazo en las secuencias de palabras y mejorar la calidad de las traducciones.<br>"
                        + "<br></p>"
                        + "</li>"

                        + "<li>"
                        + "<p>"
                        + "<b>Modelos de Transformador :</b>La arquitectura Transformer, que utiliza mecanismos de atención, ha sido <br>"
                        + "especialmente exitosa en tareas de traducción automática. Ejemplos incluyen GPT (Generative Pre-trained Transformer)<br>"
                        + "y modelos específicos para la traducción automática, como BERT (Bidirectional Encoder Representations from Transformers).<br>"
                        + "<br></p>"
                        + "</li>"
                        + "</ul>"
                        + "</li>"

                        + "<li>"
                        + "<p>"
                        + "<b>Cinta Magnética: </b>Si por \"MT\" te refieres a tecnologías relacionadas con cintasmagnéticas, los algoritmos <br>"
                        + "asociados podrían estar relacionados con la gestión de archivos en cintas, la recuperación de datos, la indexación <br>y la compresión de datos.<br>"
                        + "<br></p>"
                        + "</li>"

                        + "<li>"
                        + "<p>"
                        + "<b>Multihilo: </b>Los algoritmos asociados con la programación multihilo se utilizan para mejorar el rendimiento <br>"
                        + "de las aplicaciones al permitir la ejecución simultánea de múltiples hilos.<br>"
                        + "<br></p>"
                        + "</li>"

                        + "</ol>"
                        + "</div>"

                        + "<br><br></body></html>";

        // contenido en ingles
        private final String topic1EN = "<html><body style='text-align: center; color: black; font-family: Arial;' >"

                        + "<h1 style='color: #5B74C3;'>ALAN TURING'S BIOGRAPHY</h1><br><br>"

                        + "<img src='https://i.pinimg.com/474x/b6/bd/b0/b6bdb04511b63475b5c5e1887c9c6221.jpg'> <br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "(Alan Mathison Turing; London, 1912 - Wilmslow, United Kingdom, 1954) British mathematician. He spent <br>"
                        + "his first thirteen years in India, where his father worked in the colonial administration. Upon returning <br>"
                        + "to the United Kingdom, he studied at King's College and, after graduating, moved to Princeton University in <br>"
                        + "the United States, where he worked with the logician Alonzo Church.<br><br>"
                        + "</p>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "In 1937, he published a celebrated article in which he defined an infinite-capacity computing machine <br>"
                        + "(Turing machine) that operated based on a series of logical instructions, thus laying the groundwork for <br>"
                        + "the modern concept of an algorithm. Turing described in precise mathematical terms how an automatic system <br>"
                        + "with extremely simple rules could perform all kinds of mathematical operations expressed in a specific <br>"
                        + "formal language. The Turing machine was both an example of his computation theory and proof that a certain <br>"
                        + "type of computing machine could be built.<br><br>"
                        + "</p>"

                        + "<img src='https://slsa-collections.s3.amazonaws.com/cb/14/5bd1-565a-5961-aac8-ca1053c6160f.jpg'> <br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "<b>World War II</b> provided an unsuspected practical application for his theories, as the need arose to <br>"
                        + "decipher the encoded messages that the German Navy used to send instructions to the submarines harassing the <br>"
                        + "convoys of material aid sent from the United States. Turing, in charge of a division of British Intelligence, <br>"
                        + "designed both the processes and the machines that, capable of performing combinatorial calculations much more <br>"
                        + "quickly than any human, were decisive in the final breaking of the code.<br><br>"
                        + "</p>"

                        + "<img src='https://assets.isu.pub/document-structure/230409175227-6cf94194da62e53299ee9883ec3ce921/v1/b51bb4ecd3c455d5a5cac83338893fc7.jpeg'> <br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "Alan Turing also defined a theoretical method to decide whether a machine was capable of thinking like a human <br>"
                        + "(Turing test) and made contributions to other branches of applied mathematics, such as the application of <br>"
                        + "analytical and mechanical methods to the biological problem of morphogenesis. On a personal level, his status <br>"
                        + "as a homosexual was a constant source of strong social and familial pressures, to the point where it was <br>"
                        + "speculated whether his death by poisoning was accidental or an attempted suicide.<br><br>"
                        + "</p>"
                        + "<br><br></body></html>";

        private final String topic2EN = "<html><body style='text-align: center; color: black; font-family: Arial;' >"

                        + "<h1 style='color: #5B74C3;'>LANGUAGES ACCEPTED BY TURING MACHINES</h1><br><br>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "According to the classification of formal languages made by the American Avram Chomsky, the Turing Machine accepts<br> the most general languages, or type zero (0), also called recursively enumerable languages.<br>"
                        + "<br><br></p>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "A recursively enumerable language is a formal language for which there exists a Turing machine that accepts and <br>"
                        + "halts with any string from the language, but it may halt and reject, or iterate indefinitely,  with a string that <br>"
                        + "does not belong to the language. All regular, context-free, context-sensitive, and recursive languages are recursively <br>"
                        + "enumerable.<br>"
                        + "<br><br></p>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "A string ω∈A^*, is accepted by a Turing Machine if it starts in state e0, with the reading/writing head on the <br>"
                        + "leftmost symbol, after reading the entire string ω, reaches a state e_f∈F. The language accepted <br> by the Turing<br>"
                        + "Machine is the set of all strings accepted by the Turing Machine.<br>"
                        + "<br><br></p>"

                        + "<h2 style='color: #5B74C3;'>"
                        + "L(MT)={ω / e_0 ω ⊢*α_1 e_f α_2 and e_f∈F and α_1,α_1 ∈C^* and ω∈A^* }"
                        + "</h2>"

                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "For example, we have a Turing Machine that recognizes the language {0^n 1^n:n≥1}. The machine transitions are<br>"
                        + "represented as follows:<br>"
                        + "<br><br></p>"
                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405660926_282454688128241_6438087525585764374_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=5f2048&_nc_ohc=7ziqry4De-IAX9-cZUb&_nc_ht=scontent.fbga3-1.fna&oh=00_AfADzxkDNot67r6DYR3V7kSmekiAGPQ9IFGX6yAO-dyUEQ&oe=6568C499' alt='Placeholder Image'><br><br>"
                        
                        + "<h2 style='color: #5B74C3;'>"
                        + "The string w = 1100 is evaluated, yielding the following result:<br>"
                        + "</h2>"

                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405160796_282455501461493_1410448688043461519_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=5f2048&_nc_ohc=saOVxrA3_P8AX-q_deu&_nc_ht=scontent.fbga3-1.fna&oh=00_AfDo9cLIJEBmfpNKiK6Q2N5eY51-2PLekpq490qNIFZeBQ&oe=6568FF4A' alt='Placeholder Image'><br><br>"
                        + "<div style='text-align: left; margin-left:100px;'> "

                        + "<br><br></body></html>";

        private final String topic3EN = "<html><body style='text-align: center; color: black; font-family: Arial;' >"
                        + "<h1 style='color: #5B74C3;'>INTRODUCTION TO TURING MACHINES</h1><br><br>"
                        + "<img src='https://th.bing.com/th/id/OIP.BDs8D_Jtb7yKMAK86mKADgAAAA?rs=1&pid=ImgDetMain' alt='Placeholder Image'><br><br>"
                        + "<p style='text-align:left; margin-left:100px;'>Turing machines are a mathematical model of an abstract computer. They were invented by Alan Turing in 1936 <br> to study the nature of computable calculations."
                        + "<br><br><br></p>"
                        + "<h2 style='color: #5B74C3;'>WHAT IS IT?</h2>"
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
                        + "<h2 style='color: #5B74C3;'>Components</h2>"
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
                        + "<h2 style='color: #5B74C3;'>It can be defined on a tape as a 7-tuple Where: "
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
                        + "<h2 style='color: #5B74C3;'>How Does It Work?</h2>"
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
                        + "<h2 style='color: #5B74C3;'>Example</h2>"
                        + "<p style='margin-left: 20px;'>"
                        + "Consider a Turing machine that, given a string of zeros and ones, writes the number of zeros it contains on the tape. <br>"
                        + "The machine has an alphabet of two symbols: 0 and 1. The set of states of the machine is {q0, q1, q2}. <br> <br>"
                        + "The initial state is q0. The transition table of the machine is as follows:"
                        + "<br></p>"
                        + "</div>"
                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405882392_281467738226936_2974071418843638468_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_ohc=NLoyQGH0TiAAX_cuYmx&_nc_ht=scontent.fbga3-1.fna&oh=00_AfBgk8KQnN4mxh8-SMwjTWjzeTb-voLtQMhZUh1kqOsAzA&oe=65658E4A' alt='Placeholder Image'><br><br>"
                        + "<div style='text-align: left; margin-left:100px; padding:20px;'> "
                        + "<h2 style='color: #5B74C3;'>The machine's operation is as follows: </h2>"
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
                        + "<h2 style='color: #5B74C3;'>Transition Diagram </h2>"
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
        private final String topic4EN = "<html><body style='text-align: center; color: black; font-family: Arial;' >"
                        + "<h1 style='color: #5B74C3;'>LANGUAGES ACCEPTED BY TM</h1><br><br>"
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
                        + "<h2 style='color: #5B74C3;'>Some examples of languages accepted by Turing machines include:"
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
                        + "<h2 style='color: #5B74C3;'>Algorithm</h2>"
                        + "<ol style='margin-left: 20px;'>"
                        + "<li>The Turing machine runs with the string as input</li>"
                        + "<li>If the machine halts in a final state, then the string belongs to the language</li>"
                        + "<li>If the machine does not halt, then the string does not belong to the language</li>"
                        + "</ol>"
                        + "</div>"

                        + "<br><br></body></html>";
        private final String topic5EN = "<html><body style='text-align: center; color: black; font-family: Arial;' >"
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

        private final String topic6EN = "<html><body style='text-align: center; color: black; font-family: Arial;' >"
                        + "<h1 style='color: #5B74C3;'>ALGORITHMS ASSOCIATED WITH MT</h1><br><br>"
                        + "<img src='https://scontent.fbga3-1.fna.fbcdn.net/v/t39.30808-6/405658314_282442044796172_2602224746062275254_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_ohc=iYo_thP0-tYAX_LBt8w&_nc_ht=scontent.fbga3-1.fna&oh=00_AfBwyP1SbG1Ka7n2QdbJKG55QE0LY62fob6m7ascZm71Vw&oe=6567A24C' alt='Placeholder Image'><br><br>"
                        
                        + "<p style='text-align:left; margin-left:100px;'>"
                        + "The abbreviation \"MT\" may refer to different concepts in the field of computer science and technology, so it is important to <br>"
                        + "provide more specific context. Some possible interpretations of \"MT\" include:<br>"
                        + "<br><br></p>"

                        + "<div style='text-align: left; margin-left:100px;'> "
                        + "<ol style='margin-left: 20px;'>"
                        + "<li>"
                        + "<p><b>Machine Translation:</b> Algorithms associated with machine translation are fundamental for processing and translating <br>"
                        + "text from one language to another automatically. Some common approaches include:<br><br></p>"
                        + "<ul>"
                        + "<li>"
                        + "<p>"
                        + "<b>Rule-based Models:</b> These algorithms use grammatical and lexical rules to perform translations. However, they can be <br>"
                        + "limited in language coverage and their ability to handle semantic complexity.<br>"
                        + "<br></p>"
                        + "</li>"
                        + "<li>"
                        + "<p>"
                        + "<b>Statistical Models:</b> These models use statistics and probabilities based on bilingual corpora to perform translations. <br>"
                        + "Methods like Hidden Markov Model (HMM) and n-gram language models are examples of statistical approaches.<br>"
                        + "<br></p>"
                        + "</li>"
                        + "<li>"
                        + "<p>"
                        + "<b>Recurrent Neural Networks:</b> These approaches use neural networks to capture long-term relationships in word sequences <br>"
                        + "and improve the quality of translations.<br>"
                        + "<<br>/p>"
                        + "</li>"
                        + "<li>"
                        + "<p>"
                        + "<b>Transformer Models:</b> The Transformer architecture, using attention mechanisms, has been particularly successful in<br>"
                        + "machine translation tasks. Examples include GPT (Generative Pre-trained Transformer) and translation-specific models like <br>"
                        + "BERT (Bidirectional Encoder Representations from Transformers).<br>"
                        + "<br></p>"
                        + "</li>"
                        + "</ul>"
                        + "<br></li>"

                        + "<li>"
                        + "<p>"
                        + "<b>Magnetic Tape:</b> If by \"MT\" you mean technologies related to magnetic tapes, algorithms associated might involve<br>"
                        + "file management on tapes, data retrieval, indexing, and data compression.<br>"
                        + "<br></p>"
                        + "</li>"

                        + "<li>"
                        + "<p>"
                        + "<b>Multi-threading:</b> Algorithms associated with multi-threading programming are used to enhance application performance<br>"
                        + "by allowing the simultaneous execution of multiple threads.<br>"
                        + "</p>"
                        + "</li>"

                        + "</ol>"
                        + "</div>"

                        + "<br><br></body></html>";

        private final String[] contentES = { topic1ES, topic2ES, topic3ES, topic4ES, topic5ES, topic6ES };
        private final String[] contentEN = { topic1EN, topic2EN, topic3EN, topic4EN, topic5EN, topic6EN };

        public String[] getContentES() {
                return contentES;
        }

        public String[] getContentEN() {
                return contentEN;
        }

}
