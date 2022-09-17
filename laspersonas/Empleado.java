package laspersonas;

public class Empleado extends Persona{
    
    public int tiempoLaborado;

    //metodo constructor
    public Empleado(String nombre, int tiempoLaborado){//este metodo es el constructor de la clase hija, al parecer se debe enunciar el atributo heredado "nombre"
        super(nombre);
        this.tiempoLaborado = tiempoLaborado;
    }
//metodo propio de la clase hija

    public void mostrarTiempoLaborado(){
        this.saludar();
        System.out.println("Yo trabajo : "+ this.tiempoLaborado);
    }
    
}//fin e la clase de estudiante




/*@Override
    //metodo a aplicar polimorfismo
  public void mostrarDeudas(){
    System.out.println("soy empleado y no tengo deudas");

  }*/