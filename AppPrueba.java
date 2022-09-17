/*import java.util.Scanner;*/



import laspersonas.*;//"*" llama toda la libreria

public class AppPrueba {

    public static void main(String args[]) {


        //creación e objetos
    Estudiante unEstudiante = new Estudiante ("nombre", "nombreUniversidad");
    Empleado unEmpleado = new Empleado("nombre", 1);
    TrabajadorIndependiente unTI = new TrabajadorIndependiente("nombre", "tipoNegocio");


//llamado a metodos
    unEstudiante.mostrarNombreUniverdidad();
    unEmpleado.mostrarTiempoLaborado();
    unTI.mostrarTipoNegocio();


    //aplicando poliformismo por sobrecarga
    unEstudiante.mostrarDeudas();
    unEmpleado.mostrarDeudas();
    unTI.mostrarDeudas();
    unEmpleado.mostrarDeudas(4500);
    unEmpleado.mostrarDeudas("compra de implementos");






    }
 
}  




//se crea un arreglo
/*Persona arregloPersonas[] = new Persona[3];
arregloPersonas[0] = unEstudiante;
arregloPersonas[1] = unEmpleado;
arregloPersonas[2] = unTI;

for(int i=0; i < arregloPersonas.length ; i++){
arregloPersonas[i].mostrarDeudas();
}*/





        //creación de los objetos

        /*Persona unaPersona = new Persona();
        Scanner lector= new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        
        //Llamado de los metodo
        unaPersona.setNombre (lector.nextLine());

        System.out.println("Ingrese su apellido: ");
        unaPersona.setApellido (lector.nextLine());

        System.out.println("Ingrese su edad: ");
        unaPersona.setEdad (lector.nextInt());

        System.out.println("Ingrese su telefono: ");
        unaPersona.setTelefono (lector.nextInt());
        
        //Llamado de los metodos a través del objeto unaPersona
        //unaPersona.saludar();
        System.out.println("Su nombre completo es "+ unaPersona.getNombre() + " " + unaPersona.getApellido() + " su edad es " + unaPersona.getEdad() + " años y su número telefonico es " + unaPersona.getTelefono() );
        unaPersona.despedirse();*/
  