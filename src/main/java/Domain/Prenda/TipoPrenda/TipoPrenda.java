package Domain.Prenda.TipoPrenda;

import java.sql.Timestamp;

import static Domain.Validador.Validador.validarNoEsNull;

public class TipoPrenda {

  private Categoria categoria;

  public TipoPrenda(Categoria categoria) {
    this.categoria = validarNoEsNull(categoria, "No se especifico la categoria");
  }

  public Categoria categoria() {
    return this.categoria;
  }

  //definimos posibles valores
  public static TipoPrenda CAMISA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  public static TipoPrenda CHOMBA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  public static TipoPrenda PANTALON = new TipoPrenda(Categoria.PARTE_INFERIOR);
  public static TipoPrenda ZAPATILLAS = new TipoPrenda(Categoria.CALZADO);
  public static TipoPrenda ZAPATOS = new TipoPrenda(Categoria.CALZADO);

}
