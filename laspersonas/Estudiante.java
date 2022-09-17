package laspersonas;

public class Estudiante extends Persona{
    
    public String nombreUniversidad;
//metodo constructor
    public Estudiante(String nombre, String nombreUniversidad){//este metodo es el constructor de la clase hija, al parecer se debe enunciar el atributo heredado "nombre"
        super(nombre);
        this.nombreUniversidad = nombreUniversidad;
    }
//metodo propio de la clase hija
    public void mostrarNombreUniverdidad(){
        this.saludar();
        System.out.println("El nombre de la universidad es: "+ this.nombreUniversidad);
    }
    @Override
    //metodo a aplicar polimorfismo
  public void mostrarDeudas(){
    System.out.println("soy estudiante y no tengo deudas");
  }   
}
//fin e la clase de estudiante





/*@Override
    //metodo a aplicar polimorfismo
  public void mostrarDeudas(){
    System.out.println("soy estudiante y no tengo deudas");*/