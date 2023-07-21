/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import formularios.InterfazPrincipal;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Exceptions.ExceptionCajaVacia;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sergio
 */
public class HerramientasFormularios {
    
    
     public void IniciarAplicacion(){
        InterfazPrincipal iniciar = new InterfazPrincipal();
        iniciar.setVisible(true);
    }
        public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/sgSinFondo.png"));
        return retValue;
        }
        
        public void setImageBackground(JLabel labelName, String src){
        ImageIcon image = new ImageIcon(src);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        }
        
        public void getOtherInterfaz(JFrame formularioIncio, JFrame formularioFinal){
            formularioIncio.setVisible(false);
            formularioFinal.setVisible(true);
        }
        
        public String convertirResultadoString(Double resultado){
            resultado = Math.round(resultado * 1e6) / 1e6;
            return String.valueOf(resultado);
        }
        public void validación(JTextField caja) throws ExceptionCajaVacia{
            if(caja.getText().isEmpty()){            
                throw new ExceptionCajaVacia("Error, No se ingreso alguna cantidad");
            }
        }

        public void copiarPortapapeles(JLabel label){
            StringSelection seleccion = new StringSelection(label.getText());
            Clipboard portapapels =  Toolkit.getDefaultToolkit().getSystemClipboard();
            portapapels.setContents(seleccion, null);
        }
        
    public void btnRegresar(JFrame cerrar, JFrame abrir ){
        Object[] opciones ={"Si","No","Salir del programa"};
       ImageIcon icono = new ImageIcon("src/imagenes/sg10.png");
        int respuesta = JOptionPane.showOptionDialog(null, "¿Estás seguro de Regresar?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,icono,opciones, opciones[2]);
        
       if(JOptionPane.YES_OPTION == respuesta ){
              getOtherInterfaz(cerrar,abrir);}
       if(JOptionPane.CANCEL_OPTION == respuesta){
            System.exit(0);
       }
    }
    
}
