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
        
        public String convertirResultadoString(Double grados){
            return String.valueOf(grados);
        }
        public void validarCajavacia(JTextField caja) throws ExceptionCajaVacia{
            if(caja.getText().isEmpty()){            
                throw new ExceptionCajaVacia("Error, No se ingreso alguna temperatura");
            }
        }
        public void copiarPortapapeles(JLabel label){
            StringSelection seleccion = new StringSelection(label.getText());
            Clipboard portapapels =  Toolkit.getDefaultToolkit().getSystemClipboard();
            portapapels.setContents(seleccion, null);
        }

}
