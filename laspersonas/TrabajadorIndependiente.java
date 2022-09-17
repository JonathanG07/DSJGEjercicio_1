package laspersonas;

public class TrabajadorIndependiente extends Persona{
    
    public String tipoNegocio;

    //metodo constructor
    public TrabajadorIndependiente(String nombre, String tipoNegocio){//este metodo es el constructor de la clase hija, al parecer se debe enunciar el atributo heredado "nombre"
        super(nombre);
        this.tipoNegocio = tipoNegocio;
    }

//metodo propio de la clase hija
    public void mostrarTipoNegocio(){
        this.saludar();
        System.out.println("El tipo de negocio que poseo es: "+ this.tipoNegocio);
    }
    
}//fin e la clase de estudiante





/*@Override
    //metodo a aplicar polimorfismo
  public void mostrarDeudas(){
    System.out.println("soy un trabajador independiente y tengo proveedores");
  }*/