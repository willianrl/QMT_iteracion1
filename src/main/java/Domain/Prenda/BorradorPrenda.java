package Domain.Prenda;

import Domain.Prenda.TipoPrenda.TipoPrenda;
import static Domain.Validador.Validador.validarNoEsNull;

public class BorradorPrenda {

  private TipoPrenda tipoPrenda;
  private TipoMaterial tipoMaterial;
  private TipoTrama tipoTrama;
  private Color colorPrimario;
  private Color colorSecundario;

  public BorradorPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = validarNoEsNull(tipoPrenda, "No se especifico tipo de prenda");
  }

  public BorradorPrenda setTipoMaterial(TipoMaterial tipoMaterial) {
    //material debe ser consistente con el tipo de prenda
    this.tipoMaterial = validarNoEsNull(tipoMaterial, "No se especifico tipo de material");
    return this;
  }

  public BorradorPrenda setTipoTrama(TipoTrama tipoTrama) {
    this.tipoTrama = validarNoEsNull(tipoTrama, "No se especifico tipo de trama");
    this.tipoTrama = tipoTrama;
    return this;
  }

  public BorradorPrenda setColorPrimario(Color colorPrimario) {
    this.colorPrimario = validarNoEsNull(colorPrimario, "No se especifico el color primario");
    return this;
  }

  public BorradorPrenda setColorSecundario(Color colorSecundario) {
    this.colorSecundario = validarNoEsNull(colorSecundario, "No se especifico el color secundario");
    return this;
  }

  public Prenda crearPrenda(){

    Prenda prenda = new Prenda(
        this.tipoPrenda,
        validarNoEsNull(this.tipoMaterial, "No se especifico el tipo de material"),
        (this.tipoTrama == null? TipoTrama.LISA : this.tipoTrama),
        validarNoEsNull(this.colorPrimario, "No se especifico el color primario"),
        temperaturaAdecuadaMaxima);

    if (colorSecundario != null) {
      prenda.setColorSecundario(colorSecundario);
    }

    return prenda;
  }
}
