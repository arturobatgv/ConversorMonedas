/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Sergio
 */
public class Imagenes {
    
    
        public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/sgSinFondo.png"));
        return retValue;
        }
        
        
    
}
