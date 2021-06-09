package Domain.Armario;

import Domain.API_Clima.ServicioMeteorologicoAccuWeather;
import Domain.Prenda.Atuendo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AsesorDeImagen {
  private ServicioMeteorologicoAccuWeather servicioMeteorologicoAccuWeather;

  public AsesorDeImagen(ServicioMeteorologicoAccuWeather servicioMeteorologicoAccuWeather){
    this.servicioMeteorologicoAccuWeather = servicioMeteorologicoAccuWeather;

  }

  public Atuendo sugerirAtuendo(String direccion, ArmarioPrendas armarioPrendas) {

    Integer temperatura = servicioMeteorologicoAccuWeather.consultarTemperatura(direccion);

    List<Atuendo> combinaciones = armarioPrendas.todasLasPosiblesCombinaciones();

    return combinaciones.stream().filter(combinacion -> combinacion.aptaParaTemperatura(temperatura)).collect(Collectors.toList()).get(0);
  }
}
