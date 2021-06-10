package Domain.Sugerencia;

import Domain.Armario.ArmarioPrendas;
import Domain.Prenda.Prenda;

public class QuitarPrenda extends Sugerencia {

  public QuitarPrenda(Prenda prenda) {
    super(prenda);
  }

  @Override
  protected void aplicarOperacion(ArmarioPrendas armario) {
    armario.quitarPrenda(this.prenda);
  }

  @Override
  protected void deshacerOperacion(ArmarioPrendas armario) {
    armario.agregarPrendaFinalizada(this.prenda);
  }
}
