/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
/**
 *
 * @author Sergio
 */
public class Temperatura {
    private static final double CELSIUS = 273.15;
    private static final double CELSIUS2 = 32;
    private static final double FAHRENHEIT = 459.67;
    private static final double FAHRENHEIT2 = 1.8;  
            
        HerramientasFormularios administrador = new HerramientasFormularios();
            public String convertirCentigradosFahrenheit(Double Centigrados){
                double operacion = Centigrados * FAHRENHEIT2 + CELSIUS2;
                return administrador.convertirResultadoString(operacion) + " °F";
            }
            public String convertirCentigradosKelvins (Double Centigrados){
                double operacion = Centigrados + CELSIUS;
                return administrador.convertirResultadoString(operacion) + " K";
            }
              public String convertirFahrenheitCentigrados(Double Fahrenheit){
                double operacion = (Fahrenheit-CELSIUS2) / this.FAHRENHEIT2;
                return administrador.convertirResultadoString(operacion) + " °C";
            }
              public String convertirFahrenheitKelvins(Double Fahrenheit){
                double operacion = (Fahrenheit+this.FAHRENHEIT) / this.FAHRENHEIT2;
                return administrador.convertirResultadoString(operacion) + " °K";
            }
              public String convertirKelvinsCentigrados(Double Kelvins){
                double operacion = Kelvins - CELSIUS;
                return administrador.convertirResultadoString(operacion) + " °C";
            }
               public String convertirKelvinsFahrenheit(Double Kelvins){
                double operacion = (Kelvins-CELSIUS)*9/5 + CELSIUS2;
                return administrador.convertirResultadoString(operacion) + " °F";
            }
              
}
