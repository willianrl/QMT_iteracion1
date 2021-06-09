package Domain.API_Clima;

import java.util.HashMap;

public class ConsultorClima {

  public static HashMap<String, Object> consultarClimaCiudad(String ciudad){
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    return (HashMap<String, Object>) apiClima.getWeather(ciudad).get(0).get("Temperature");
  }
}
