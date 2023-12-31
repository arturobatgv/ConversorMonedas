/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Exceptions.ExceptionCajaVacia;
import clases.HerramientasFormularios;
import clases.Peso;
import clases.TextGris;
import javax.swing.JOptionPane;

    



/**
 *
 * @author Sergio
 */
public class InterfazConversorPeso extends javax.swing.JFrame {
   
    HerramientasFormularios distribuidor = new HerramientasFormularios();
    Peso metodo = new Peso();
    /**
     * Creates new form Bienvenida
     */
    public InterfazConversorPeso() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        jScrollPane.setBorder(null);
        setIconImage(distribuidor.getIconImage());
        distribuidor.setImageBackground(backgroundPeso, "src/imagenes/backgroundPeso.png");
        new TextGris("  Aquí", cajaTextoPeso);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        backgroundBlackTitulo = new javax.swing.JPanel();
        labelTituloProgram = new javax.swing.JLabel();
        backgroundBlack = new javax.swing.JPanel();
        logoDev = new javax.swing.JLabel();
        btnCopiar = new javax.swing.JToggleButton();
        btnRegresar = new javax.swing.JToggleButton();
        copyRight = new javax.swing.JLabel();
        backgroundPeso = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        introduccion = new javax.swing.JTextArea();
        labelPeso = new javax.swing.JLabel();
        comboConversion2 = new javax.swing.JComboBox<>();
        labelResultado = new javax.swing.JLabel();
        cajaTextoPeso = new javax.swing.JTextField();
        txtResultado = new javax.swing.JLabel();
        lineaResultado = new javax.swing.JSeparator();
        lineaTemperatura = new javax.swing.JSeparator();
        comboConversion = new javax.swing.JComboBox<>();
        inverso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Peso");
        setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundBlackTitulo.setBackground(new java.awt.Color(0, 0, 0));
        backgroundBlackTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTituloProgram.setBackground(new java.awt.Color(0, 0, 0));
        labelTituloProgram.setFont(new java.awt.Font("Roboto Medium", 3, 14)); // NOI18N
        labelTituloProgram.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloProgram.setLabelFor(background);
        labelTituloProgram.setText("Conversor de Peso");
        backgroundBlackTitulo.add(labelTituloProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        background.add(backgroundBlackTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 210, 30));

        backgroundBlack.setBackground(new java.awt.Color(0, 0, 0));
        backgroundBlack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sg.png"))); // NOI18N
        backgroundBlack.add(logoDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        background.add(backgroundBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 120, 120));

        btnCopiar.setBackground(new java.awt.Color(0, 102, 204));
        btnCopiar.setFont(new java.awt.Font("Roboto Black", 1, 11)); // NOI18N
        btnCopiar.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiar.setText("Copiar");
        btnCopiar.setFocusPainted(false);
        btnCopiar.setFocusable(false);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        background.add(btnCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, 30));

        btnRegresar.setBackground(new java.awt.Color(255, 36, 0));
        btnRegresar.setFont(new java.awt.Font("Roboto Black", 1, 11)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setFocusable(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        background.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 100, 30));

        copyRight.setFont(new java.awt.Font("Roboto Light", 2, 11)); // NOI18N
        copyRight.setForeground(new java.awt.Color(51, 255, 204));
        copyRight.setText("© Copyrigth Sergio González - 2023");
        background.add(copyRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, 20));
        background.add(backgroundPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 260, 380));

        bienvenida.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        bienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ConversorPesologo.png"))); // NOI18N
        bienvenida.setText(" ¡BIENVENIDO!");
        background.add(bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        introduccion.setEditable(false);
        introduccion.setColumns(20);
        introduccion.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        introduccion.setLineWrap(true);
        introduccion.setText("Programa que convierte una medición de peso a otro tipo de medición de peso.");
        introduccion.setToolTipText("");
        introduccion.setWrapStyleWord(true);
        introduccion.setBorder(null);
        introduccion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        introduccion.setFocusable(false);
        introduccion.setRequestFocusEnabled(false);
        jScrollPane.setViewportView(introduccion);

        background.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 360, -1));

        labelPeso.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        labelPeso.setText("Ingresa el peso a convertir:");
        background.add(labelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        comboConversion2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        comboConversion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una conversión", "kilogramos", "gramos", "miligramos", "libras", "onzas", "toneladas" }));
        comboConversion2.setFocusable(false);
        comboConversion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboConversion2ActionPerformed(evt);
            }
        });
        background.add(comboConversion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 170, 30));

        labelResultado.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        labelResultado.setForeground(new java.awt.Color(255, 51, 51));
        labelResultado.setText("Resultado:");
        background.add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        cajaTextoPeso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cajaTextoPeso.setBorder(null);
        cajaTextoPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaTextoPeso.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cajaTextoPesoCaretUpdate(evt);
            }
        });
        cajaTextoPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaTextoPesoMouseClicked(evt);
            }
        });
        cajaTextoPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaTextoPesoKeyTyped(evt);
            }
        });
        background.add(cajaTextoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 210, 20));

        txtResultado.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtResultado.setText("En espera de ingresar algun valor a convertir");
        background.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 300, 20));
        background.add(lineaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 250, 20));
        background.add(lineaTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, 20));

        comboConversion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        comboConversion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una conversión", "kilogramos", "gramos", "miligramos", "libras", "onzas", "toneladas" }));
        comboConversion.setFocusable(false);
        comboConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboConversionActionPerformed(evt);
            }
        });
        background.add(comboConversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 30));

        inverso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inverso.png"))); // NOI18N
        inverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inversoMouseClicked(evt);
            }
        });
        background.add(inverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Conversor de Peso");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        distribuidor.btnRegresar(this, new InterfazPrincipal());
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cajaTextoPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaTextoPesoMouseClicked
            cajaTextoPeso.setText("");
            txtResultado.setText("En espera de ingresar algun valor a convertir"); 
    }//GEN-LAST:event_cajaTextoPesoMouseClicked

    private void cajaTextoPesoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cajaTextoPesoCaretUpdate
        txtResultado.setText("En espera de seleccionar una conversión");

    }//GEN-LAST:event_cajaTextoPesoCaretUpdate

    private void cajaTextoPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTextoPesoKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car<',' || car>'.')) evt.consume();
    }//GEN-LAST:event_cajaTextoPesoKeyTyped

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
            distribuidor.copiarPortapapeles(txtResultado);
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void comboConversion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboConversion2ActionPerformed
        try{
            distribuidor.validación(cajaTextoPeso);
            metodo.obtenerDatos(comboConversion,comboConversion2 , cajaTextoPeso, txtResultado);
        }catch (ExceptionCajaVacia e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Se ingreo un valor Invalido");
        }
    }//GEN-LAST:event_comboConversion2ActionPerformed

    private void comboConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboConversionActionPerformed
        try{
            distribuidor.validación(cajaTextoPeso);
            metodo.obtenerDatos(comboConversion,comboConversion2 , cajaTextoPeso, txtResultado);
        }catch (ExceptionCajaVacia e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Se ingreo un valor Invalido");
        }
    }//GEN-LAST:event_comboConversionActionPerformed

    private void inversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inversoMouseClicked
            int indexCombo1 = comboConversion.getSelectedIndex();
            int indexCombo2 = comboConversion2.getSelectedIndex();
            comboConversion.setSelectedIndex(indexCombo2);
            comboConversion2.setSelectedIndex(indexCombo1);
    }//GEN-LAST:event_inversoMouseClicked

    /* 
    ° C -> ° F
    ° C -> ° K
    ° F -> ° C
    ° F -> ° K
    ° K -> ° C
    ° K -> ° F*/
    
    
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(InterfazConversorPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazConversorPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazConversorPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazConversorPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazConversorPeso().setVisible(true);
                
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel backgroundBlack;
    private javax.swing.JPanel backgroundBlackTitulo;
    private javax.swing.JLabel backgroundPeso;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JToggleButton btnCopiar;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JTextField cajaTextoPeso;
    private javax.swing.JComboBox<String> comboConversion;
    private javax.swing.JComboBox<String> comboConversion2;
    private javax.swing.JLabel copyRight;
    private javax.swing.JTextArea introduccion;
    private javax.swing.JLabel inverso;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel labelTituloProgram;
    private javax.swing.JSeparator lineaResultado;
    private javax.swing.JSeparator lineaTemperatura;
    private javax.swing.JLabel logoDev;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
    
    


}
