package laspersonas;
public class Persona{ //esta es la clase Persona

  //Estos son lso atributos
  public String nombre;
        
        
  //lista de metodos
  public Persona(String nombre){//este metodo es un constructor 
    this.nombre=nombre;
  }
  public void saludar(){
    System.out.println("Hola me llamo: "+ this.nombre);


  }
//metodos de poliformismo por sobrecarga de parámetros
  public void mostrarDeudas(){
    System.out.println("Deudas por doquier");
  }
  
  public void mostrarDeudas(int deuda){
    System.out.println("La deuda que tengo es: " + deuda);
  }

  public void mostrarDeudas(String tipoDeuda){
    System.out.println("El tipo de deuda es: " + tipoDeuda);
  }

  public void despedirse(){
    System.out.println("Me voy adios");
    }





//metodo a aplicar polimorfismo
/*public void mostrarDeudas(){
    
}*/





            /*switch(this.edad){
 
 case 15:
  System.out.println("Hola mi nombre es:" +this.nombre +"y soy un niño");
  break;

 case 25:
  System.out.println("Hola mi nombre es:" +this.nombre +"y soy un adulto joven");
  break;

 case 35:
  System.out.println("Hola mi nombre es:" +this.nombre +"y soy un adulto maduro");
  break;

 case 55:
  System.out.println("Hola mi nombre es:" +this.nombre +"y soy un adulto mayor");
  break;

 case 85:
  System.out.println("Hola mi nombre es:" +this.nombre +"y soy de la tercera edad");
  break;

 default:
  System.out.println("Hola mi nombre es:" +this.nombre +"y mi edad no es ninguna de las anteriores");
  break;*/
  


        /*estos son atributos que se ubican al inicio
        private String nombre;
        private String apellido;
        private int edad;
        private int telefono;*/

//estos se usan para poder llamar a las variables "private"
/*public String getNombre(){
  return this.nombre;
}
public void setNombre(String nombre){
  this.nombre = nombre;
}
public String getApellido(){
  return this.apellido;
}
public void setApellido(String apellido){
  this.apellido = apellido;
}
public int getEdad(){
  return this.edad;
}
public void setEdad(int edad){
  this.edad = edad;
}

public int getTelefono(){
  return this.telefono;
}
public void setTelefono(int telefono){
  this.telefono = telefono;
}*/


 //System.out.println("Chao, see you later"); // este es el código funcional
 }

 

