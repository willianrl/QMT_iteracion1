package Domain.API_Clima;

import java.util.Map;

public interface ServicioMeteorologico {
  Map<String, Object> obtenerCondicionesClimaticas(String direccion);

  int consultarTemperatura(String direccion);
}
