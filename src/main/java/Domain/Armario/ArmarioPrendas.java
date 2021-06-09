package Domain.Armario;

import Domain.Prenda.Atuendo;
import Domain.Prenda.Prenda;
import Domain.Prenda.BorradorPrenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArmarioPrendas {

  private List<Prenda> prendasFinalizadas;
  private List<BorradorPrenda> borradorPrendas;

  public ArmarioPrendas(){
    this.prendasFinalizadas = new ArrayList<Prenda>();
    this.borradorPrendas = new ArrayList<BorradorPrenda>();
  }

  public void agregarPrendaFinalizada(Prenda prenda) {
    this.prendasFinalizadas.add(prenda);
  }

  public void agregarPrendaIncompleta(BorradorPrenda borrador) {
    this.borradorPrendas.add(borrador);
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
}
