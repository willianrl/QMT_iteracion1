package Domain.Sugerencia;

import Domain.Armario.ArmarioPrendas;
import Domain.Prenda.Prenda;

public class AgregarPrenda extends Sugerencia{

  public AgregarPrenda(Prenda prenda) {
    super(prenda);
  }

  @Override
  public void aplicarOperacion(ArmarioPrendas armario) {
    armario.agregarPrendaFinalizada(this.prenda);
  }

  @Override
  public void deshacerOperacion(ArmarioPrendas armario) {
    armario.quitarPrenda(this.prenda);
  }
}
