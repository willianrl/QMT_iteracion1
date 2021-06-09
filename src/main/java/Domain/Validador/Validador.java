package Domain.Validador;

public class Validador {
  public static <T> T validarNoEsNull(T objeto, String mensaje){
    if(objeto == null) throw new RuntimeException(mensaje);
    return objeto;
  }
}
