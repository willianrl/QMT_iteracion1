package Domain.Sugerencia;

import Domain.Armario.ArmarioPrendas;
import Domain.Prenda.Prenda;

public class AgregarPrenda extends Sugerencia{

  public AgregarPrenda(Prenda prenda) {
    super(prenda);
  }

  @Override
  protected void aplicarOperacion(ArmarioPrendas armario) {
    armario.agregarPrendaFinalizada(this.prenda);
  }

  @Override
  protected void deshacerOperacion(ArmarioPrendas armario) {
    armario.quitarPrenda(this.prenda);
  }
}
