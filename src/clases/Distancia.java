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
public class Distancia {
    public static Map<String, Double> listaConversionesDistancia=  new HashMap<>();
    static {
        //lista Kilometros
       listaConversionesDistancia.put("kilometroskilometros", 1.0);
       listaConversionesDistancia.put("kilometrosmetros", 1000.0);
       listaConversionesDistancia.put("kilometroscentimetros", 100000.0);
       listaConversionesDistancia.put("kilometrosmilimetros", 1000000.0);
       listaConversionesDistancia.put("kilometrospulgadas", 39370.08);
       listaConversionesDistancia.put("kilometrospies", 3280.84);
       listaConversionesDistancia.put("kilometrosyardas", 1093.61);
       listaConversionesDistancia.put("kilometrosmillas", 0.62);
        //lista metros
       listaConversionesDistancia.put("metroskilometros", 0.001);
       listaConversionesDistancia.put("metrosmetros", 1.0);
       listaConversionesDistancia.put("metroscentimetros", 100.0);
       listaConversionesDistancia.put("metrosmilimetros", 1000.0);
       listaConversionesDistancia.put("metrospulgadas", 39.37);
       listaConversionesDistancia.put("metrospies", 3.28);
       listaConversionesDistancia.put("metrosyardas", 1.09);
       listaConversionesDistancia.put("metrosmillas", 0.000621);
        //lista centimetros
       listaConversionesDistancia.put("centimetroskilometros", 0.00001);
       listaConversionesDistancia.put("centimetrosmetros", 0.01);
       listaConversionesDistancia.put("centimetroscentimetros", 1.0);
       listaConversionesDistancia.put("centimetrosmilimetros", 10.0);
       listaConversionesDistancia.put("centimetrospulgadas", 0.39);
       listaConversionesDistancia.put("centimetrospies", 0.03);
       listaConversionesDistancia.put("centimetrosyardas", 0.01);
       listaConversionesDistancia.put("centimetrosmillas", 0.00000621);
       
        //lista milimetros
       listaConversionesDistancia.put("milimetroskilometros", 0.000001);
       listaConversionesDistancia.put("milimetrosmetros", 0.001);
       listaConversionesDistancia.put("milimetroscentimetros", 0.01);
       listaConversionesDistancia.put("milimetrosmilimetros", 1.0);
       listaConversionesDistancia.put("milimetrospulgadas", 0.04);
       listaConversionesDistancia.put("milimetrospies", 0.00328);
       listaConversionesDistancia.put("milimetrosyardas", 0.00109);
       listaConversionesDistancia.put("milimetrosmillas", 0.000000621);
       //lista pulgadas 
       listaConversionesDistancia.put("pulgadaskilometros", 0.0000254);
       listaConversionesDistancia.put("pulgadasmetros", 0.0254);
       listaConversionesDistancia.put("pulgadascentimetros", 2.54);
       listaConversionesDistancia.put("pulgadasmilimetros", 25.4);
       listaConversionesDistancia.put("pulgadaspulgadas", 1.0);
       listaConversionesDistancia.put("pulgadaspies", 0.08);
       listaConversionesDistancia.put("pulgadasyardas", 0.03);
       listaConversionesDistancia.put("pulgadasmillas", 0.0000158);
       //lista pies
       listaConversionesDistancia.put("pieskilometros", 0.0003048);
       listaConversionesDistancia.put("piesmetros", 0.3048);
       listaConversionesDistancia.put("piescentimetros", 30.48);
       listaConversionesDistancia.put("piesmilimetros", 304.8);
       listaConversionesDistancia.put("piespulgadas", 12.0);
       listaConversionesDistancia.put("piespies", 1.0);
       listaConversionesDistancia.put("piesyardas", 0.33);
       listaConversionesDistancia.put("piesmillas", 12000.0);
       //lista yardas
       listaConversionesDistancia.put("yardaskilometros", 0.0009144);
       listaConversionesDistancia.put("yardasmetros", 0.9144);
       listaConversionesDistancia.put("yardascentimetros", 91.44);
       listaConversionesDistancia.put("yardasmilimetros", 914.4);
       listaConversionesDistancia.put("yardaspulgadas", 36.0);
       listaConversionesDistancia.put("yardaspies", 3.0);
       listaConversionesDistancia.put("yardasyardas", 1.0);
       listaConversionesDistancia.put("yardasmillas", 0.000568);
       //lista millas
       listaConversionesDistancia.put("millaskilometros", 1.609344);
       listaConversionesDistancia.put("millasmetros", 1609.344);
       listaConversionesDistancia.put("millascentimetros", 160934.4);
       listaConversionesDistancia.put("millasmilimetros", 1609344.0);
       listaConversionesDistancia.put("millaspulgadas", 63360.0);
       listaConversionesDistancia.put("millaspies", 5280.0);   
       listaConversionesDistancia.put("millasyardas", 1760.0);
       listaConversionesDistancia.put("millasmillas", 1.0);
    }
    
     public void obtenerDatos(JComboBox<String> cbDatoSeleccionado, JComboBox<String> cbDatoConversion, JTextField peso, JLabel labelResultado){
        Double datoPeso = Double.parseDouble(peso.getText());
        String datoSeleccionado = cbDatoSeleccionado.getSelectedItem().toString();
        String datoConversion = cbDatoConversion.getSelectedItem().toString();
        Double resultadoConversion = realizarConversion(datoSeleccionado, datoConversion, datoPeso);
        if(resultadoConversion == 0.0){
        labelResultado.setText("En espera de seleccionar una conversión");
        }else {
        labelResultado.setText(String.valueOf(resultadoConversion) + " " + datoConversion);
        }
    }
   
    public static Double realizarConversion(String datoSeleccionado, String datoConversion, Double peso){
        String key = datoSeleccionado + datoConversion;
        if(listaConversionesDistancia.containsKey(key)){
            Double conversionSeleccionada = listaConversionesDistancia.get(key);
            return conversionSeleccionada * peso;
        }
        return 0.0;
    }
}
