package Domain.Sugerencia;

import Domain.Armario.ArmarioPrendas;
import Domain.Prenda.Prenda;

public class QuitarPrenda extends Sugerencia {

  public QuitarPrenda(Prenda prenda) {
    super(prenda);
  }

  @Override
  public void aplicarOperacion(ArmarioPrendas armario) {
    armario.quitarPrenda(this.prenda);
  }

  @Override
  public void deshacerOperacion(ArmarioPrendas armario) {
    armario.agregarPrendaFinalizada(this.prenda);
  }
}
