package ut4_tarea4_.davidcareño;

import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;

public class PruebaReloj extends javax.swing.JFrame {

    public PruebaReloj() {
        initComponents();
        jTextField1.setText(relojDigital1.getMensajeAlarma());
        actualizarAlarma(); // Verifica y activa la alarma al iniciar, si ya tiene valores.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        relojDigital1 = new ut4_tarea4_.davidcareño.Reloj();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(1, 1, 12, 1)); // Rango inicial: 1-12
        jSpinner2 = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(0, 0, 59, 1)); // Rango: 0-59
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        relojDigital1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"12h", "24h"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Formato");

        jLabel2.setText("Hora de alarma");

        jLabel3.setText("Minuto de alarma");

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jLabel4.setText("Mensaje de alarma:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(127, 127, 127)
                                                .addComponent(relojDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(jLabel4))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jSpinner1))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jSpinner2))
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel5)))))))
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(relojDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jComboBox1ActionPerformed(ActionEvent evt) {
        String seleccion = (String) jComboBox1.getSelectedItem();
        boolean es24h = "24h".equalsIgnoreCase(seleccion);
        relojDigital1.set24h(es24h);

        // Ajusta el rango del spinner de horas según el formato
        int horaActual = (int) jSpinner1.getValue();
        jSpinner1.setModel(new SpinnerNumberModel(horaActual, 1, es24h ? 24 : 12, 1));
    }

    private void jSpinner1StateChanged(ChangeEvent evt) {
        int hora = (int) jSpinner1.getValue();
        boolean esAm = relojDigital1.is24h() || hora < 12; // AM es irrelevante en formato 24h
        relojDigital1.setHoraAlarma(hora, esAm);
        actualizarAlarma();
    }

    private void jSpinner2StateChanged(ChangeEvent evt) {
        int minuto = (int) jSpinner2.getValue();
        relojDigital1.setMinutoAlarma(minuto);
        actualizarAlarma();
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
        String mensaje = jTextField1.getText();
        if (mensaje.isEmpty()){
            relojDigital1.setMensajeAlarma("No se ha establecido ningun texto para la alarma.");
        }
        else{
            relojDigital1.setMensajeAlarma(mensaje);
        }
        actualizarAlarma();
    }

    private void actualizarAlarma() {
        int hora = (int) jSpinner1.getValue();
        int minuto = (int) jSpinner2.getValue();
        String mensaje = jTextField1.getText().trim();

        boolean alarmaValida = hora > 0 && minuto >= 0 && !mensaje.isEmpty();
        relojDigital1.setAlarmaActivada(alarmaValida);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PruebaReloj().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private ut4_tarea4_.davidcareño.Reloj relojDigital1;
    // End of variables declaration                   
}

