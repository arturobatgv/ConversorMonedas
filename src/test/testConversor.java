/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import clases.HerramientasFormularios;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class testConversor {
    private static final String API_KEY = "523269dbb2ab41adb0939034057a509b"; // Reemplaza con tu clave de API
    
   public static double convertirAB(double A) {
        double B = 21.74 * A;
        return B;
    }

    public static void main(String[] args) {
        double valorA = 2;
        double resultadoB = convertirAB(valorA);
        System.out.println("El equivalente de " + valorA + " A es " + resultadoB + " B.");
    }

    
    

    public static double getConversionRate(String fromCurrency, String toCurrency) {
        try {
            String url = "https://api.currencyfreaks.com/latest?apikey=" + API_KEY
                    + "&from=" + fromCurrency + "&to=" + toCurrency;

            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = reader.readLine();
            reader.close();

            JSONObject jsonResponse = new JSONObject(response);

            if (jsonResponse.has("rates")) {
                JSONObject rates = jsonResponse.getJSONObject("rates");
                if (rates.has(toCurrency)) {
                    double conversionRate = rates.getDouble(toCurrency);
                    return conversionRate;
                }
            }

            return 0.0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}