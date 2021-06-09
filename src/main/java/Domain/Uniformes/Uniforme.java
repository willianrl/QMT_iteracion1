package Domain.Uniformes;

import Domain.Prenda.Prenda;
import Domain.Uniformes.Sastre.Sastre;

public class Uniforme {

  private Prenda parteSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Uniforme(Sastre sastre) {
    this.parteSuperior = sastre.frabricarParteSuperior();
    this.prendaInferior = sastre.fabricarParteInferior();
    this.calzado = sastre.fabricarCalzado();
  }

}
