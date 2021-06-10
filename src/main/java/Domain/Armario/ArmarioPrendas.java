package Domain.Armario;

import Domain.Prenda.Atuendo;
import Domain.Prenda.Prenda;
import Domain.Prenda.BorradorPrenda;
import Domain.Sugerencia.Sugerencia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArmarioPrendas {

  private List<Prenda> prendasFinalizadas;
  private List<BorradorPrenda> borradorPrendas;
  private List<Sugerencia> sugerencias;

  public ArmarioPrendas(){
    this.prendasFinalizadas = new ArrayList<Prenda>();
    this.borradorPrendas = new ArrayList<BorradorPrenda>();
    this.sugerencias = new ArrayList<Sugerencia>();
  }

  public void agregarPrendaFinalizada(Prenda prenda) {
    this.prendasFinalizadas.add(prenda);
  }

  public void agregarPrendaIncompleta(BorradorPrenda borrador) {
    this.borradorPrendas.add(borrador);
  }

  public void quitarPrenda(Prenda prenda){
    this.prendasFinalizadas.remove(prenda);
  }

  public List<Prenda> obtenerPrendasPorTemperaturaAdecuada(Integer temperatura){
    return this.prendasFinalizadas
        .stream()
        .filter(prenda -> prenda.aptaParaTemperatura(temperatura))
        .collect(Collectors.toList());
  }

  public List<Atuendo> todasLasPosiblesCombinaciones() {
    return null;
  }

  public void agregarSugerencia(Sugerencia sugerencia) {
    this.sugerencias.add(sugerencia);
  }

  public List<Sugerencia> verSugerencias() {
    return this.sugerencias;
  }

  public void aplicarSugerencia(Sugerencia sugerencia){
    this.sugerencias.remove(sugerencia);
    sugerencia.aplicarEn(this);
  }
}
