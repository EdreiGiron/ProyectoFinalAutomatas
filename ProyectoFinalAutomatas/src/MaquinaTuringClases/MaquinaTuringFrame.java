package MaquinaTuringClases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * egiron
 */
/**
 * Esta clase representa la interfaz gráfica y la funcionalidad principal de una
 * Máquina de Turing. Permite configurar estados, alfabeto, transiciones y
 * simular la ejecución paso a paso de la máquina.
 */
public class MaquinaTuringFrame extends javax.swing.JFrame {

    public MaquinaTuringFrame() {
        initComponents(); // Inicializa todos los componentes de la interfaz gráfica
    }

    // Variables principales para manejar el estado de la máquina
    String cadena; // La cadena a ser procesada en la cinta
    int estado = 0; // Estado actual de la máquina
    int señalizador = 0; // Posición actual del cabezal en la cinta
    String[] cinta; // Representa la cinta de la máquina
    Map<String, String[]> transiciones = new HashMap<>(); // Mapa para almacenar las transiciones
    String estadoInicial; // Estado en el que comienza la máquina
    String[] estadosFinales; // Array que contiene los estados finales de aceptación

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextFieldCadenaSimular = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jButtonCargarCadena = new javax.swing.JButton();
        jButtonVisualizarPaso = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DatosEstudiante = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEstadosMaquina = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEstadoInicial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEstadosFinales = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAlfabateEntrada = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTransiciones = new javax.swing.JTextArea();
        jButtonGuardarConfiguracion = new javax.swing.JButton();
        javax.swing.JButton jButtonCargarConfiguracion = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        JTextFieldEstadoActual = new javax.swing.JTextField();

        jLabel2.setText("ESTADO: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Q0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(JTextFieldCadenaSimular, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 340, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese la cadena a simular");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 180, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("#");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 30, 20));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("#");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 30, 20));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("#");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 30, 20));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("#");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 30, 20));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("#");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 30, 20));

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("#");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 30, 20));

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("#");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 30, 20));

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("#");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 30, 20));

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("#");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 30, 20));

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("#");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 30, 20));

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("#");
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 30, 20));

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("-");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 30, 20));

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("-");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 30, 20));

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("-");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 30, 20));

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("-");
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 30, 20));

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("-");
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 30, 20));

        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("-");
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 30, 20));

        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("-");
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 30, 20));

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("-");
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 30, 20));

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("-");
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 30, 20));

        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("-");
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 30, 20));

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("-");
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 30, 20));

        jButtonCargarCadena.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCargarCadena.setText("Cargar Cadena");
        jButtonCargarCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarCadenaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCargarCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jButtonVisualizarPaso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonVisualizarPaso.setText("Visualizar Paso a Paso");
        jButtonVisualizarPaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarPasoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVisualizarPaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel4.setText("MAQUINA DE TURING");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        DatosEstudiante.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DatosEstudiante.setText("Edrei Giron 7690-21-218   Automatas y Lenguajes Formales");
        getContentPane().add(DatosEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Estados de la Maquina de Turing (Separados por comas q0,q1,q2)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jTextFieldEstadosMaquina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEstadosMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadosMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadosMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 400, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Estado Inicial");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jTextFieldEstadoInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEstadoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 110, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Estados Finales (Separados por comas)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        jTextFieldEstadosFinales.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldEstadosFinales, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 230, -1));

        jLabel9.setText("Alfabeto de Entrada (Separado por comas 1,0)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jTextFieldAlfabateEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldAlfabateEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 530, -1));

        jLabel10.setText("Transiciones (Separadas por parentesis y comas (q0,0->q0,0,R),(q0,1->q0,1,R))");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jTextAreaTransiciones.setColumns(20);
        jTextAreaTransiciones.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTransiciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 410, -1));

        jButtonGuardarConfiguracion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGuardarConfiguracion.setText("Guardar Configuración");
        jButtonGuardarConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardarConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        jButtonCargarConfiguracion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCargarConfiguracion.setText("Cargar Configuración");
        jButtonCargarConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCargarConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        jLabel11.setText("Estado Actual");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        JTextFieldEstadoActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextFieldEstadoActual.setToolTipText("");
        JTextFieldEstadoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldEstadoActualActionPerformed(evt);
            }
        });
        getContentPane().add(JTextFieldEstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 390, 70, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Acción al presionar el botón "Cargar Cadena". Inicializa la cinta y posición del cabezal.
    private void jButtonCargarCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarCadenaActionPerformed
        cargarCadena(); // Llama al método que carga la cadena en la cinta
    }//GEN-LAST:event_jButtonCargarCadenaActionPerformed

    private void jButtonVisualizarPasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarPasoActionPerformed
        simularPaso(); // Llama al método que simula un paso de la máquina                                                    
    }//GEN-LAST:event_jButtonVisualizarPasoActionPerformed


    private void jTextFieldEstadoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoInicialActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldEstadoInicialActionPerformed

    private void jTextFieldEstadosMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadosMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadosMaquinaActionPerformed

    private void jButtonCargarConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarConfiguracionActionPerformed
        // TODO add your handling code here:
        cargarConfiguracion(); // Llama al método que carga la configuración de la máquina                                                    
    }//GEN-LAST:event_jButtonCargarConfiguracionActionPerformed

    private void jButtonGuardarConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarConfiguracionActionPerformed
        // TODO add your handling code here:
        guardarConfiguracion(); // Llama al método que guarda la configuración de la máquina  
    }//GEN-LAST:event_jButtonGuardarConfiguracionActionPerformed

    private void JTextFieldEstadoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldEstadoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldEstadoActualActionPerformed

    /**
     * Método para cargar una configuración guardada en un archivo de texto.
     * Llena los campos de estados, estado inicial, finales, alfabeto y
     * transiciones desde el archivo.
     */
    private void cargarConfiguracion() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                jTextFieldEstadosMaquina.setText(reader.readLine());
                jTextFieldEstadoInicial.setText(reader.readLine());
                jTextFieldEstadosFinales.setText(reader.readLine());
                jTextFieldAlfabateEntrada.setText(reader.readLine());
                jTextAreaTransiciones.setText(reader.readLine());
                estadosFinales = jTextFieldEstadosFinales.getText().split(",");
                JOptionPane.showMessageDialog(this, "Configuración cargada exitosamente");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al cargar la configuración: " + e.getMessage());
            }
        }
    }

    /**
     * Guarda la configuración actual en un archivo de texto. Permite reutilizar
     * la configuración de la máquina en futuras sesiones.
     */
    private void guardarConfiguracion() {
        if (camposValidos()) { // Verifica que todos los campos tengan datos
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                try (PrintWriter writer = new PrintWriter(new FileWriter(fileChooser.getSelectedFile()))) {
                    writer.println(jTextFieldEstadosMaquina.getText());
                    writer.println(jTextFieldEstadoInicial.getText());
                    writer.println(jTextFieldEstadosFinales.getText());
                    writer.println(jTextFieldAlfabateEntrada.getText());
                    writer.println(jTextAreaTransiciones.getText());
                    JOptionPane.showMessageDialog(this, "Configuración guardada exitosamente");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al guardar la configuración: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de guardar");
        }
    }

    /**
     * Verifica que los campos requeridos no estén vacíos antes de guardar.
     *
     * @return true si todos los campos tienen datos, false en caso contrario.
     */
    private boolean camposValidos() {
        return !jTextFieldEstadosMaquina.getText().isEmpty()
                && !jTextFieldEstadoInicial.getText().isEmpty()
                && !jTextFieldEstadosFinales.getText().isEmpty()
                && !jTextFieldAlfabateEntrada.getText().isEmpty()
                && !jTextAreaTransiciones.getText().isEmpty();
    }

    private void actualizarCintaVisual() {
        // Cada campo de texto representa una celda en la cinta, aquí actualizamos cada uno
        jTextField1.setText(cinta[0]);
        jTextField2.setText(cinta[1]);
        jTextField3.setText(cinta[2]);
        jTextField4.setText(cinta[3]);
        jTextField5.setText(cinta[4]);
        jTextField6.setText(cinta[5]);
        jTextField7.setText(cinta[6]);
        jTextField8.setText(cinta[7]);
        jTextField9.setText(cinta[8]);
        jTextField10.setText(cinta[9]);
        jTextField11.setText(cinta[10]);
        jTextField12.setText(cinta[11]);
        jTextField13.setText(cinta[12]);
        jTextField14.setText(cinta[13]);
        jTextField15.setText(cinta[14]);
        jTextField16.setText(cinta[15]);
        jTextField17.setText(cinta[16]);
        jTextField18.setText(cinta[17]);
        jTextField19.setText(cinta[18]);
        jTextField20.setText(cinta[19]);
        jTextField21.setText(cinta[20]);
        jTextField22.setText(cinta[21]);
    }

    /**
     * Carga las transiciones ingresadas en el área de texto y las almacena en
     * un mapa. Verifica el formato de cada transición antes de guardarla.
     */
    private void cargarTransiciones() {
        transiciones.clear(); // Limpia las transiciones anteriores
        String[] transicionesTexto = jTextAreaTransiciones.getText().split("\\),\\(");

        for (String transicion : transicionesTexto) {
            transicion = transicion.replace("(", "").replace(")", "");
            String[] partes = transicion.split("→"); // Divide la transición en clave -> valor

            if (partes.length != 2) { // Verifica el formato
                JOptionPane.showMessageDialog(this, "Error en el formato de la transición: " + transicion);
                continue;
            }
            String[] clave = partes[0].split(",");
            String[] valores = partes[1].split(",");

            if (clave.length != 2 || valores.length != 3) { // Verifica que cada transición tenga 2 elementos en clave y 3 en valor
                JOptionPane.showMessageDialog(this, "Error en el formato de la transición: " + transicion);
                continue;
            }
            transiciones.put(clave[0] + "," + clave[1], valores); // Guarda la transición en el mapa
        }
    }

    /**
     * Carga la cadena en la cinta y posiciona el cabezal al inicio de la
     * cadena. Además, inicializa el estado actual al estado inicial.
     */
    private void cargarCadena() {
        cargarConfiguraciones();// Recarga todas las configuraciones al cargar la cadena
        JTextFieldEstadoActual.setText(estadoInicial); // Reinicia el estado actual a su valor inicial
        cadena = JTextFieldCadenaSimular.getText(); // Inicializa la cinta y la señalización
        cinta = new String[22];
        for (int i = 0; i < cinta.length; i++) {
            cinta[i] = "#"; // Se rellena con espacios en blanco
        }

         for (int i = 0; i < cadena.length(); i++) { // Coloca la cadena en el centro de la cinta (asumiendo que empieza en el índice 5)
            cinta[i + 5] = String.valueOf(cadena.charAt(i));
        }

        actualizarCintaVisual();// Reinicia el visualizador de la cinta

        try { // Asigna el estado inicial desde la configuración
            estado = Integer.parseInt(estadoInicial.substring(1));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Formato de estado inicial no válido");
            return; // Salir si hay un error de formato
        }
        
        señalizador = 5; // Reinicia el señalizador para apuntar a la primera posición de la cadena
        mostrarCabezal(); // Actualiza la posición del cabezal
    }

    private void cargarConfiguraciones() {
        estadoInicial = jTextFieldEstadoInicial.getText().trim();
        estadosFinales = jTextFieldEstadosFinales.getText().split(",");
        String alfabetoEntrada = jTextFieldAlfabateEntrada.getText();
        cargarTransiciones(); // Carga las transiciones definidas
    }

    /**
     * Realiza un paso en la simulación de la máquina de Turing. Lee el estado
     * actual y el contenido de la cinta, aplica la transición y actualiza el
     * estado y el cabezal.
     */
    private void simularPaso() {
        cargarTransiciones(); // Carga las transiciones antes de ejecutar el paso
        String clave = "q" + estado + "," + cinta[señalizador]; // Genera la clave de búsqueda en el mapa de transiciones

        if (transiciones.containsKey(clave)) { // Si existe la transición para la clave
            String[] transicion = transiciones.get(clave); // Obtiene la transición correspondiente
            estado = Integer.parseInt(transicion[0].substring(1)); // Cambia al nuevo estado
            JTextFieldEstadoActual.setText("q" + estado); // Actualiza el estado actual en la interfaz
            cinta[señalizador] = transicion[1]; // Escribe el nuevo símbolo en la cinta

            // Mueve el cabezal según la dirección de la transición
            if (transicion[2].equals("R")) {
                señalizador++;
            } else if (transicion[2].equals("L")) {
                señalizador--;
            }

            actualizarCintaVisual(); // Refleja los cambios en la cinta visualmente
            mostrarCabezal(); // Actualiza la posición del cabezal en la interfaz

            // Verifica si el estado actual es un estado final de aceptación
            for (String estadoFinal : estadosFinales) {
                if (("q" + estado).equals(estadoFinal.trim())) {
                    JOptionPane.showMessageDialog(this, "Cadena Aceptada"); // Indica que la cadena es aceptada
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cadena Inválida"); // Si no existe transición, la cadena es inválida
        }
    }

    /**
     * Muestra la posición actual del cabezal en la interfaz, marcando la celda
     * correspondiente.
     */
    private void mostrarCabezal() {
        // Cambia el texto en cada celda para reflejar la posición actual del cabezal
        jTextField12.setText(señalizador == 0 ? "↑↑" : "-");
        jTextField13.setText(señalizador == 1 ? "↑↑" : "-");
        jTextField14.setText(señalizador == 2 ? "↑↑" : "-");
        jTextField15.setText(señalizador == 3 ? "↑↑" : "-");
        jTextField16.setText(señalizador == 4 ? "↑↑" : "-");
        jTextField17.setText(señalizador == 5 ? "↑↑" : "-");
        jTextField18.setText(señalizador == 6 ? "↑↑" : "-");
        jTextField19.setText(señalizador == 7 ? "↑↑" : "-");
        jTextField20.setText(señalizador == 8 ? "↑↑" : "-");
        jTextField21.setText(señalizador == 9 ? "↑↑" : "-");
        jTextField22.setText(señalizador == 10 ? "↑↑" : "-");
    }

    public static void main(String args[]) {
        // Código para ejecutar la interfaz gráfica de la Máquina de Turing

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MaquinaTuringFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaquinaTuringFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaquinaTuringFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaquinaTuringFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaquinaTuringFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatosEstudiante;
    private javax.swing.JTextField JTextFieldCadenaSimular;
    private javax.swing.JTextField JTextFieldEstadoActual;
    private javax.swing.JButton jButtonCargarCadena;
    private javax.swing.JButton jButtonGuardarConfiguracion;
    private javax.swing.JButton jButtonVisualizarPaso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTransiciones;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldAlfabateEntrada;
    private javax.swing.JTextField jTextFieldEstadoInicial;
    private javax.swing.JTextField jTextFieldEstadosFinales;
    private javax.swing.JTextField jTextFieldEstadosMaquina;
    // End of variables declaration//GEN-END:variables
}
