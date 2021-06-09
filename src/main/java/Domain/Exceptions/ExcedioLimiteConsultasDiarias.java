package Domain.Exceptions;

public class ExcedioLimiteConsultasDiarias extends RuntimeException{

  public ExcedioLimiteConsultasDiarias(String mensaje) {
    super(mensaje);
  }
}
