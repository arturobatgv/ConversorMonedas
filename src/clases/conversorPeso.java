/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class conversorPeso {
    public static Map<String, Double> listaConversionesPeso = new HashMap<>();
    static {
        //lista Kilogramos
       listaConversionesPeso.put("kilogramoskilogramos", 1.0);
       listaConversionesPeso.put("kilogramosgramos", 1000.0);
       listaConversionesPeso.put("kilogramosmiligramos", 1000000.0);
       listaConversionesPeso.put("kilogramoslibras", 2.20462);
       listaConversionesPeso.put("kilogramostoneladas", 0.001);
       listaConversionesPeso.put("kilogramosonzas", 35.274);
        //lista gramos
       listaConversionesPeso.put("gramoskilogramos", 0.001);
       listaConversionesPeso.put("gramosgramos", 1.0);
       listaConversionesPeso.put("gramosmiligramos", 1000.0);
       listaConversionesPeso.put("gramoslibras", 0.00220462);
       listaConversionesPeso.put("gramostoneladas", 1000000.0);
       listaConversionesPeso.put("gramosonzas", 0.03527);
        //lista miligramos
       listaConversionesPeso.put("miligramoskilogramos", 0.000001);
       listaConversionesPeso.put("miligramosgramos", 0.001);
       listaConversionesPeso.put("miligramosmiligramos", 1.0);
       listaConversionesPeso.put("miligramoslibras", 0.000002205);
       listaConversionesPeso.put("miligramostoneladas", 0.000000001);
       listaConversionesPeso.put("miligramosonzas", 0.00003527);
        //lista libra
       listaConversionesPeso.put("libraskilogramos", 0.453592);
       listaConversionesPeso.put("librasgramos", 453.592);
       listaConversionesPeso.put("librasmiligramos", 453592.4);
       listaConversionesPeso.put("libraslibras", 1.0);
       listaConversionesPeso.put("librastoneladas", 0.000453592);
       listaConversionesPeso.put("librasonzas", 16.0);
       //lista tonelada 
       listaConversionesPeso.put("toneladaskilogramos", 1000.0);
       listaConversionesPeso.put("toneladasgramos", 1000000.0);
       listaConversionesPeso.put("toneladasmiligramos", 1000000000.0);
       listaConversionesPeso.put("toneladaslibras", 2204.62);
       listaConversionesPeso.put("toneladastoneladas", 1.0);
       listaConversionesPeso.put("toneladasonzas", 35274.0);
       //lista onzas
       listaConversionesPeso.put("onzaskilogramos", 0.0283495);
       listaConversionesPeso.put("onzasgramos", 28.3495);
       listaConversionesPeso.put("onzasmiligramos", 28349.5);
       listaConversionesPeso.put("onzaslibras", 0.0625);
       listaConversionesPeso.put("onzastoneladas", 0.0000283495);
       listaConversionesPeso.put("onzasonzas", 1.0);
    }
    
     public void obtenerDatos(JComboBox<String> cbDatoSeleccionado, JComboBox<String> cbDatoConversion, JTextField peso, JLabel labelResultado){
        Double datoPeso = Double.parseDouble(peso.getText());
        String datoSeleccionado = cbDatoSeleccionado.getSelectedItem().toString();
        String datoConversion = cbDatoConversion.getSelectedItem().toString();
        Double resultadoConversion = realizarConversion(datoSeleccionado, datoConversion, datoPeso);
        if(resultadoConversion == 0.0){
        labelResultado.setText("En espera de seleccionar una conversión");
        }else {
        labelResultado.setText(String.valueOf(resultadoConversion));
        }
    }
   
    public static Double realizarConversion(String datoSeleccionado, String datoConversion, Double peso){
        String key = datoSeleccionado + datoConversion;
        if(listaConversionesPeso.containsKey(key)){
            Double conversionSeleccionada = listaConversionesPeso.get(key);
            return conversionSeleccionada * peso;
        }
        return 0.0;
    }
}
