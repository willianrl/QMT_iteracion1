package Domain.Uniformes.Sastre;

import Domain.Prenda.BorradorPrenda;
import Domain.Prenda.Color;
import Domain.Prenda.Prenda;
import Domain.Prenda.TipoMaterial;
import static Domain.Prenda.TipoPrenda.TipoPrenda.*;

public class SastreSanJuan implements Sastre{

  @Override
  public Prenda frabricarParteSuperior() {
    return new BorradorPrenda(CHOMBA)
        .setTipoMaterial(TipoMaterial.PIQUE)
        .setColorPrimario(Color.VERDE)
        .crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    return new BorradorPrenda(PANTALON)
        .setTipoMaterial(TipoMaterial.ALGODON)
        .setColorPrimario(Color.GRIS)
        .crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    return new BorradorPrenda(ZAPATILLAS)
        .setTipoMaterial(TipoMaterial.POLIESTER) //no tengo ni idea de que material es una zapatilla
        .setColorPrimario(Color.BLANCO)
        .crearPrenda();
  }
}
