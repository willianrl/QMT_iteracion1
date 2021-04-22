# QMT_iteracion1

```
class Prenda{
  tipoPrenda;
  CategoriaPrenda;
  material;
  colorPrincipal, colorSecundario;
  
  method Constructor(tipoPrenda, categoriaPrenda, material, colorPrimario, colorSecundario=NULL){
    if(tipoPrenda == NULL)
      throw new Exeption("falta agregar tipo")
    
    if(categoriaPrenda == NULL)
      throw new Exeption("falta agregar categoria")
    
    if(material == NULL)
      throw new Exeption("falta agregar material")
    
    if(colorPrimario == NULL)
      throw new Exeption("falta agregar colorPrimario")
    
    //trato de averiguar si el tipo de prenda pertenece a una categoria
    if(!categoriaPrenda.tiposPrendasPosibles.contains(tipoPrenda))
      trhow new Exeption("tipo prenda no coincide con la categoria")

    
    this.tipoPrenda = tipoPrenda;
    this.categoriaPrenda = categoriaPrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
  
}

Class CategoriaPrenda{
  method tiposPrendasPosibles(){
    return /[ tiposPrendas]
  }
}
```
![image](https://user-images.githubusercontent.com/48813828/115645435-bf4bc300-a2f6-11eb-9994-24bf36a1c485.png)
