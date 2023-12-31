/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Exceptions.ExceptionCajaVacia;
import clases.Monedas;
import clases.HerramientasFormularios;
import clases.TextGris;
import javax.swing.JOptionPane;

    



/**
 *
 * @author Sergio
 */
public class InterfazConversorOtraMonedaPesos extends javax.swing.JFrame {
   
    HerramientasFormularios distribuidor = new HerramientasFormularios();
    Monedas metodo = new Monedas();
    /**
     * Creates new form Bienvenida
     */
    public InterfazConversorOtraMonedaPesos() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        jScrollPane.setBorder(null);
        setIconImage(distribuidor.getIconImage());
        new TextGris("  Aquí", cajaTextoCantidad);
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
        backgroundBilletes = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        introduccion = new javax.swing.JTextArea();
        labelCantidad = new javax.swing.JLabel();
        comboConversion = new javax.swing.JComboBox<>();
        labelResultado = new javax.swing.JLabel();
        cajaSigno = new javax.swing.JTextField();
        cajaTextoCantidad = new javax.swing.JTextField();
        txtResultado = new javax.swing.JLabel();
        lineaResultado = new javax.swing.JSeparator();
        linea = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Monedas");
        setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundBlackTitulo.setBackground(new java.awt.Color(0, 0, 0));
        backgroundBlackTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTituloProgram.setBackground(new java.awt.Color(0, 0, 0));
        labelTituloProgram.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        labelTituloProgram.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloProgram.setLabelFor(background);
        labelTituloProgram.setText("Conversor de Otra Moneda");
        backgroundBlackTitulo.add(labelTituloProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        background.add(backgroundBlackTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 210, 30));

        backgroundBlack.setBackground(new java.awt.Color(0, 0, 0));
        backgroundBlack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sg.png"))); // NOI18N
        backgroundBlack.add(logoDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        background.add(backgroundBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 120, 120));

        btnCopiar.setBackground(new java.awt.Color(0, 102, 204));
        btnCopiar.setFont(new java.awt.Font("Roboto Black", 1, 11)); // NOI18N
        btnCopiar.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiar.setText("Copiar");
        btnCopiar.setFocusable(false);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        background.add(btnCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 100, 30));

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
        copyRight.setForeground(new java.awt.Color(255, 255, 255));
        copyRight.setText("© Copyrigth Sergio González - 2023");
        background.add(copyRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        backgroundBilletes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/billetes.png"))); // NOI18N
        background.add(backgroundBilletes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 260, 330));

        bienvenida.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        bienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/otramonedaPeso.png"))); // NOI18N
        bienvenida.setText(" ¡BIENVENIDO!");
        background.add(bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        introduccion.setEditable(false);
        introduccion.setColumns(20);
        introduccion.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        introduccion.setLineWrap(true);
        introduccion.setText("Programa que convierte otro tipo de moneda dado a pesos.");
        introduccion.setToolTipText("");
        introduccion.setWrapStyleWord(true);
        introduccion.setBorder(null);
        introduccion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        introduccion.setFocusable(false);
        introduccion.setRequestFocusEnabled(false);
        jScrollPane.setViewportView(introduccion);

        background.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 360, -1));

        labelCantidad.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        labelCantidad.setText("Ingresa la cantidad a convertir:");
        background.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        comboConversion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        comboConversion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una conversión", "USD -> MXN", "EUR -> MXN", "LIBRA -> MXN", "YEN -> MXN", "Won SK -> MXN" }));
        comboConversion.setFocusable(false);
        comboConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboConversionActionPerformed(evt);
            }
        });
        background.add(comboConversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 200, 30));

        labelResultado.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        labelResultado.setForeground(new java.awt.Color(255, 0, 51));
        labelResultado.setText("Resultado:");
        background.add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        cajaSigno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cajaSigno.setBorder(null);
        cajaSigno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaSigno.setFocusable(false);
        cajaSigno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaSignoMouseClicked(evt);
            }
        });
        background.add(cajaSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 10, 20));

        cajaTextoCantidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cajaTextoCantidad.setBorder(null);
        cajaTextoCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaTextoCantidad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cajaTextoCantidadCaretUpdate(evt);
            }
        });
        cajaTextoCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaTextoCantidadMouseClicked(evt);
            }
        });
        cajaTextoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaTextoCantidadKeyTyped(evt);
            }
        });
        background.add(cajaTextoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, 20));

        txtResultado.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtResultado.setText("En espera de ingresar algun valor a convertir");
        background.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 300, 20));
        background.add(lineaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 250, 20));
        background.add(linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 190, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        distribuidor.btnRegresar(this, new InterfazConversorMonedas());
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cajaTextoCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaTextoCantidadMouseClicked
            cajaSigno.setText("");    
            cajaTextoCantidad.setText("");
            txtResultado.setText("En espera de ingresar algun valor a convertir"); 
    }//GEN-LAST:event_cajaTextoCantidadMouseClicked

    private void cajaTextoCantidadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cajaTextoCantidadCaretUpdate
        txtResultado.setText("En espera de seleccionar una conversión");
        if(cajaTextoCantidad.getText().isEmpty())
            cajaSigno.setText("");    
    }//GEN-LAST:event_cajaTextoCantidadCaretUpdate

    private void cajaTextoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTextoCantidadKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car<',' || car>'.')) evt.consume();
    }//GEN-LAST:event_cajaTextoCantidadKeyTyped

    private void comboConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboConversionActionPerformed
       try{
        distribuidor.validación(cajaTextoCantidad);
        double pesosUsuario = Double.parseDouble(cajaTextoCantidad.getText());
        int prueba = (int) comboConversion.getSelectedIndex();
       switch(prueba){
            case 0:
                break;
            case 1:
                cajaSigno.setText("$");
                txtResultado.setText(metodo.obtenerConversionInversa("USD","MXN",pesosUsuario));
                break;
            case 2:
                cajaSigno.setText("€");
                txtResultado.setText(metodo.obtenerConversionInversa("USD","EUR",pesosUsuario));
                break;
            case 3:
                cajaSigno.setText("£");
                txtResultado.setText(metodo.obtenerConversionInversa("USD","GBP",pesosUsuario));
                break;
            case 4:
                cajaSigno.setText("¥");
                txtResultado.setText(metodo.obtenerConversionInversa("USD","JPY",pesosUsuario));
                break;
            case 5:
                cajaSigno.setText("₩");
                txtResultado.setText(metodo.obtenerConversionInversa("USD","KRW",pesosUsuario));
                break;
       }
       }catch (ExceptionCajaVacia e){
            e.printStackTrace();           
       }catch (NumberFormatException e){
            e.printStackTrace();           
            JOptionPane.showMessageDialog(null, "Se ingreo un valor Invalido");
    }
 
    }//GEN-LAST:event_comboConversionActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
          distribuidor.copiarPortapapeles(txtResultado);
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void cajaSignoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaSignoMouseClicked
            cajaSigno.setText("");
            cajaTextoCantidad.setText("");
            txtResultado.setText("En espera de ingresar algun valor a convertir"); 
    }//GEN-LAST:event_cajaSignoMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazConversorOtraMonedaPesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazConversorOtraMonedaPesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazConversorOtraMonedaPesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazConversorOtraMonedaPesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InterfazConversorOtraMonedaPesos().setVisible(true);
                
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel backgroundBilletes;
    private javax.swing.JPanel backgroundBlack;
    private javax.swing.JPanel backgroundBlackTitulo;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JToggleButton btnCopiar;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JTextField cajaSigno;
    private javax.swing.JTextField cajaTextoCantidad;
    private javax.swing.JComboBox<String> comboConversion;
    private javax.swing.JLabel copyRight;
    private javax.swing.JTextArea introduccion;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel labelTituloProgram;
    private javax.swing.JSeparator linea;
    private javax.swing.JSeparator lineaResultado;
    private javax.swing.JLabel logoDev;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
    
    


}
