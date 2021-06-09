package Domain.Usuario;

import Domain.API_Clima.ConsultorClima;
import Domain.Armario.ArmarioPrendas;
import Domain.Exceptions.ExcedioLimiteConsultasDiarias;
import Domain.Prenda.Prenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Usuario {

  private String nombre;
  private ArmarioPrendas armarioPrendas;
  private String ubicacion;

  private Integer CANTMAXIMACONSULTAS;
  private Integer limiteConsultas;
  private LocalDate fechaUltimaConsulta;

  public Usuario(String nombre, ArmarioPrendas armarioPrendas, String ubicacion, Integer CANTMAXIMACONSULTAS) {
    this.nombre = nombre;
    this.armarioPrendas = armarioPrendas;
    this.ubicacion = ubicacion;
    this.CANTMAXIMACONSULTAS = CANTMAXIMACONSULTAS;
  }

  public Integer getLimiteConsultas() {
    return limiteConsultas;
  }

  public void setLimiteConsultas(Integer limiteConsultas) {
    this.limiteConsultas = limiteConsultas;
  }

  public LocalDate getFechaUltimaConsulta() {
    return fechaUltimaConsulta;
  }

  public void setFechaUltimaConsulta(LocalDate fechaUltimaConsulta) {
    this.fechaUltimaConsulta = fechaUltimaConsulta;
  }

  private Boolean nuncaRealizeConsulta() {
    return getFechaUltimaConsulta() == null;
  }

  public Boolean agoteMisConsultas() {
    return getLimiteConsultas() == 0;
  }

  public void verificarFechaUltimaConsulta(){
    if(getFechaUltimaConsulta().isAfter(LocalDate.now()) || nuncaRealizeConsulta()) {
      setFechaUltimaConsulta(LocalDate.now());
      setLimiteConsultas(this.CANTMAXIMACONSULTAS);
    }
  }

  public void actualizarLimiteConsultas(){
    if(agoteMisConsultas()) {
      throw new ExcedioLimiteConsultasDiarias("Se exedio el limite de consultas diarias");
    }
    this.limiteConsultas--;
  }

  public HashMap<String, Object> consultarClima(String ubicacion){
    verificarFechaUltimaConsulta();
    actualizarLimiteConsultas();
    return ConsultorClima.consultarClimaCiudad(ubicacion);
  }

  public ArrayList<Prenda> obtenerSugerenciasPrendas(){
    Integer temperaturaActual = (Integer) consultarClima(this.ubicacion).get("Value");
    return (ArrayList<Prenda>) this.armarioPrendas.obtenerPrendasPorTemperaturaAdecuada(temperaturaActual);
  }

}
