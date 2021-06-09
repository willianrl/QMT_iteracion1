package Domain.API_Clima;

import java.time.LocalDateTime;
import java.util.Map;

public class RespuestaMeteorologica {
  private Map<String, Object> estadoDelTiempo;
  private LocalDateTime expiracion;

  public RespuestaMeteorologica(Map<String, Object> estadoDelTiempo, LocalDateTime expiracion){
    this.estadoDelTiempo = estadoDelTiempo;
    this.expiracion = expiracion;
  }

  public Map<String, Object> getEstadoDelTiempo() {
    return estadoDelTiempo;
  }

  public LocalDateTime getExpiracion() {
    return expiracion;
  }

  public Boolean expiro() {
    return this.expiracion.isAfter(LocalDateTime.now());
  }
}
