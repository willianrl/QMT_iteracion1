package Domain.Usuario;

import Domain.Armario.ArmarioPrendas;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

  private String nombre;
  private List<ArmarioPrendas> armarioPrendas;
  private String ubicacion;

  public Usuario(String nombre, String ubicacion) {
    this.nombre = nombre;
    this.armarioPrendas = new ArrayList<>();
    this.ubicacion = ubicacion;
  }

  public void agregarArmario(ArmarioPrendas armarioPrendas){
    this.armarioPrendas.add(armarioPrendas);
  }

  public void compartirArmario(ArmarioPrendas armarioPrendas, Usuario usuario){
    usuario.agregarArmario(armarioPrendas);
  }


}
