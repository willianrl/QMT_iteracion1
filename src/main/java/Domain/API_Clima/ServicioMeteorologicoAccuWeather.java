package Domain.API_Clima;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {

  private final AccuWeatherAPI api;
  private final Duration periodoDeValidez;
  private Map<String, RespuestaMeteorologica> ultimasRespuestas;

  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoDeValidez){
    this.api = api;
    this.periodoDeValidez = periodoDeValidez;
    this.ultimasRespuestas = new HashMap<>();
  }

  public Map<String, Object> obtenerCondicionesClimaticas(String direccion){
    if(!this.ultimasRespuestas.containsKey(direccion)
      || this.ultimasRespuestas.get(direccion).expiro()) {
      ultimasRespuestas.put(direccion, new RespuestaMeteorologica(this.consultarApi(direccion), this.proximaExpiracion()));
    }
    return this.ultimasRespuestas.get(direccion).getEstadoDelTiempo();
  }

  public int consultarTemperatura(String direccion) {
    return (int) this.obtenerCondicionesClimaticas(direccion).get("Value");
  }

  private LocalDateTime proximaExpiracion(){
    return LocalDateTime.now().plus(this.periodoDeValidez);
  }

  private Map<String, Object> consultarApi(String direccion) {
    return this.api.getWeather(direccion).get(0);
  }

}
