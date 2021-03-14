package ordenarnumeros;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Ventana extends JFrame implements ActionListener {

    ArrayList<JLabel> arregloJL = new ArrayList<JLabel>();
    private int i, j;
    int arreglo[] = new int[4];
    private JLabel auxiliarjL, auxiliarjL2;
    private Ordenar hilo;
    public JButton jbAgregar, jbOrdenar;
    public JTextField jtNumero;
    public JLabel jlPosicion1, jlPosicion2, jlPosicion3, jlPosicion4, jlAuxiliar;
    public boolean posicion1, posicion2, posicion3, posicion4;
   
    private JLabel[] arregloJB = new JLabel[2];

    public Ventana() {
        
        setLayout(null);
        setBounds(0, 0, 370, 340); // dimensiones de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ordenar Números");
        
        // Declaración de los componentes de la ventana
        jlPosicion1 = new JLabel(""); 
        jlPosicion2 = new JLabel("");
        jlPosicion3 = new JLabel("");
        jlPosicion4 = new JLabel("");
        jlAuxiliar = new JLabel("");
        jtNumero = new JTextField("");
        jbAgregar = new JButton("Agregar");
        jbOrdenar = new JButton("Ordenar");
        
        // Se posiciona y se le da dimensiones al objeto
        jtNumero.setBounds(10, 10, 140, 40); 
        add(jtNumero);// se agrega el elemento a la ventana

        jbAgregar.setBounds(160, 10, 100, 40);
        add(jbAgregar);
        jbAgregar.addActionListener(this); // indica que tendra un evento.

        jbOrdenar.setBounds(130, 245, 100, 40);
        jbOrdenar.setEnabled(false); // se desabilita el boton 
        add(jbOrdenar);
        jbOrdenar.addActionListener(this);
        // Se le da tamaño y tipo de letra que tendra el texto colocado en el JLabel.
        jlPosicion1.setFont(new Font("Tahoma", 1, 17));
        // indica que el texto colocado en el JLabel siempre aparecera centrado
        jlPosicion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        jlPosicion1.setToolTipText("");
        // se le da color al contorno del JLabel
        jlPosicion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 5)); 
        getContentPane().add(jlPosicion1); // Se agrega el elememento a la ventana
        jlPosicion1.setBounds(10, 130, 60, 40); // se le da dimensiones y posicion dentro del JFrame

        jlPosicion2.setFont(new Font("Tahoma", 1, 17));
        jlPosicion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPosicion2.setToolTipText("");
        jlPosicion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 5));
        getContentPane().add(jlPosicion2);
        jlPosicion2.setBounds(100, 130, 60, 40);

        jlPosicion3.setFont(new Font("Tahoma", 1, 17)); 
        jlPosicion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPosicion3.setToolTipText("");
        jlPosicion3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 5));
        getContentPane().add(jlPosicion3);
        jlPosicion3.setBounds(190, 130, 60, 40);

        jlPosicion4.setFont(new Font("Tahoma", 1, 17));
        jlPosicion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPosicion4.setToolTipText("");
        jlPosicion4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 5));
        getContentPane().add(jlPosicion4);
        jlPosicion4.setBounds(280, 130, 60, 40);

    }

    public void Ordenar() {

        int auxiliar = 0;
        boolean ordenado = false; // Variable para saber si esta ordenado de forma ascendente
        for (i = 0; i < 3; i++) {

            for (j = i; j < 4; j++) {

                if (ordenado && arreglo[i] < arreglo[j] && i == 2 && j == 3) {
                    //Mensaje que se mostrar si ya esta ordenado
                    JOptionPane.showMessageDialog(null, "Los numeros ya estan ordenados... ");                  
                }
                if (arreglo[i] > arreglo[j]) {
                    ordenado = false;
                    // auxiilar se le dara el valor que tenga el arreglo en esa posicion
                    auxiliar = arreglo[i];
                    //auxiliarJL se le asignara el JLabel que tiene el arraylist en esa posicion 
                    auxiliarjL = arregloJL.get(i); 
                    // se le cambia el numero que contiene en esa posicion del arreglo de numeros
                    arreglo[i] = arreglo[j];
                    //auxiliarJL2 se le asignara el JLabel que tiene el arraylist en esa posicion
                    auxiliarjL2 = arregloJL.get(j);
                    //se le cambia el JLabel que tiene en esa posicon por el auxiliarJL2
                    arregloJL.set(i, auxiliarjL2); 

                    arreglo[j] = auxiliar;
                    arregloJL.set(j, auxiliarjL);
                   
                    arregloJB[0] = auxiliarjL; // Se le asigna el Jlabel al areglo de label
                    arregloJB[1] = auxiliarjL2;
                    i = j = 4;// se le asigna valor a i y j para que salga del ciclo.
                    // se crea una instancia con Ordenar y se le pasa por parametro el arreglo de Jlable
                    hilo = new Ordenar(arregloJB); 
                    hilo.start();// se inicia el hilo 

                } else {
                    ordenado = true;
                }

            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Evento del boton Agregar 
        int numero;
        String cadena;
       
        if (e.getSource() == jbAgregar) {
            // Obtiene el texto que tiene el JTextField y lo almacena en un String.
            cadena = jtNumero.getText(); 
            if (!cadena.equals("")) {
                numero = Integer.parseInt(cadena); // Se convierte de String a Entero
                if (!posicion1 && !posicion2 && !posicion3 && !posicion4) {
                    posicion1 = true; // Se cambia a verdadero para indicar que ya esta ocupado.
                    jlPosicion1.setText(cadena); // Muesra el Numero que tenia el JTextFiel al JLabel
                    arreglo[0] = numero; // El numero convertido se inserta el la posición 1 del arreglo 
                    arregloJL.add(jlPosicion1); // Se añade el JLabel al arrayList 
                    jtNumero.setText(""); // se vacia el texto que contiene el JTextFiel 
                } else {
                    if (posicion1 && !posicion2) {
                        posicion2 = true;
                        jlPosicion2.setText(cadena);
                        arregloJL.add(jlPosicion2);
                        arreglo[1] = numero;
                        jtNumero.setText("");
                    } else if (posicion2 && !posicion3) {
                        posicion3 = true;
                        jlPosicion3.setText(cadena);
                        arregloJL.add(jlPosicion3);
                        jtNumero.setText("");
                        arreglo[2] = numero;
                    } else {
                        posicion4 = true;
                        jlPosicion4.setText(cadena);
                        arregloJL.add(jlPosicion4);
                        jtNumero.setText("");
                        // Se desabilita el JTextFiel para no ocurra un error
                        jtNumero.setEditable(false); 
                        jbAgregar.setEnabled(false);// se dabilita el boton Agregar
                        jbOrdenar.setEnabled(true);// Se abilita el boton Ordenar
                        arreglo[3] = numero;
                    }
                }
            } else {
                // Manda este mensaje si el JTextFiel esta vacio
                JOptionPane.showMessageDialog(null, "Inserte un numero."); 
            }
        }

        if (e.getSource() == jbOrdenar) {
            // Evento del boton Ordenar 
            Ordenar();
        }
    }

}
