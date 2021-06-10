package Domain.Sugerencia;

import Domain.Armario.ArmarioPrendas;
import Domain.Prenda.Prenda;

public abstract class Sugerencia {

  protected Prenda prenda;
  protected EstadoSugerencia estado;

  public Sugerencia(Prenda prenda) {
    this.prenda = prenda;
    this.estado = EstadoSugerencia.PENDIENTE;
  }

  public void cambiarEstado(EstadoSugerencia estado){
    this.estado = estado;
  }

  public void aplicarEn(ArmarioPrendas armario){
    this.estado = EstadoSugerencia.ACEPTADA;
    this.aplicarOperacion(armario);
  }

  public void deshacer(ArmarioPrendas armario){
    validarEstado(EstadoSugerencia.ACEPTADA);
    this.deshacerOperacion(armario);
  }

  public void validarEstado(EstadoSugerencia estado){
    if(this.estado != estado) {
      throw new RuntimeException("estado invalido");
    }
  }

  protected abstract void aplicarOperacion(ArmarioPrendas armarioPrendas);

  protected abstract void deshacerOperacion(ArmarioPrendas armario);
}
