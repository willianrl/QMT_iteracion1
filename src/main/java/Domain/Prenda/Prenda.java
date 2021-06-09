package Domain.Prenda;

import Domain.Prenda.TipoPrenda.Categoria;
import Domain.Prenda.TipoPrenda.TipoPrenda;

public class Prenda {

  private TipoPrenda tipoPrenda;
  private TipoMaterial tipoMaterial;
  private TipoTrama tipoTrama;
  private Color colorPrimario;
  private Color colorSecundario;
  private Integer temperaturaMaxima;

  public Prenda(TipoPrenda tipoPrenda, TipoMaterial tipoMaterial, TipoTrama tipoTrama, Color colorPrimario, Integer temperaturaMaxima) {
    this.tipoPrenda = tipoPrenda;
    this.tipoMaterial = tipoMaterial;
    this.tipoTrama = tipoTrama;
    this.colorPrimario = colorPrimario;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Categoria categoria() {
    return this.tipoPrenda.categoria();
  }

  public Boolean aptaParaTemperatura(int temperatura) {
    return temperatura <= this.temperaturaMaxima;
  }
}
