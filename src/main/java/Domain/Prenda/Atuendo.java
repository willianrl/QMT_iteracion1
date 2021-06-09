package Domain.Prenda;

import java.util.List;

public class Atuendo {

  private List<Prenda> prendas;

  public Atuendo(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void setPrendas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public Boolean aptaParaTemperatura(Integer temperatura) {
    return prendas.stream().allMatch(prenda -> prenda.aptaParaTemperatura(temperatura));
  }
}

