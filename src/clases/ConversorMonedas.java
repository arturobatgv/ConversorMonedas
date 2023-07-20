
package clases;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ConversorMonedas {
    private static final String API_KEY = "523269dbb2ab41adb0939034057a509b"; // Reemplaza con tu clave de API 
    private double conversionRateMXN;
    HerramientasFormularios distribuidor = new HerramientasFormularios();
        public double getconversionRateMXN(){
                String fromCurrency = "USD";
                String toCurrency = "MXN";
                conversionRateMXN = getConversionRate(fromCurrency, toCurrency);               
                return conversionRateMXN;
        }        
        
        
            
    public String obtenerConversionDolar(String divisaInicial, String divisaFinal, double cantidad){
                double conversionRate = getConversionRate(divisaInicial, divisaFinal);
                if(divisaFinal.equals("MXN")){
                    double dolares = cantidad / conversionRate;
                    return dolares + " " + divisaInicial;
                } 
                double convertedAmount = (conversionRate/getconversionRateMXN()) * cantidad;
                return convertedAmount + " " + divisaFinal;
        }
    
    public String obtenerConversionInversa(String divisaInicial, String divisaFinal, double cantidad){
                double conversionRate = getConversionRate(divisaInicial, divisaFinal);
                if(divisaFinal.equals("MXN")){
                    double dolares = cantidad * conversionRate;
                    return dolares + "  MXN";
                } 
                double convertedAmount = (1/(conversionRate/getconversionRateMXN()))*cantidad;
                return convertedAmount + "  MXN";
        }
    
   
    

    private static double getConversionRate(String fromCurrency, String toCurrency) {
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
