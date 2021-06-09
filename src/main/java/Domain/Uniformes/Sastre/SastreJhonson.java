package Domain.Uniformes.Sastre;

import Domain.Prenda.BorradorPrenda;
import Domain.Prenda.Color;
import Domain.Prenda.Prenda;
import Domain.Prenda.TipoMaterial;
import static Domain.Prenda.TipoPrenda.TipoPrenda.*;

public class SastreJhonson implements Sastre{

  @Override
  public Prenda frabricarParteSuperior() {
    return new BorradorPrenda(CAMISA)
        .setTipoMaterial(TipoMaterial.ALGODON)
        .setColorPrimario(Color.BLANCO)
        .crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    return new BorradorPrenda(PANTALON)
        .setTipoMaterial(TipoMaterial.ALGODON)
        .setColorPrimario(Color.BLANCO)
        .crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    return new BorradorPrenda(ZAPATOS)
        .setTipoMaterial(TipoMaterial.CUERO)
        .setColorPrimario(Color.NEGRO)
        .crearPrenda();
  }
}
