/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sergio
 */
public class ExceptionCajaVacia extends Exception{
    public ExceptionCajaVacia (String mensaje){
        super (mensaje);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
