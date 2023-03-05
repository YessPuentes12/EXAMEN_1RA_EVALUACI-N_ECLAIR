/*

 */
package examen_1ra_evaluación_eclair;

import clases_examen.Cuenta;
import clases_examen.DatosIntegrantes;
import clases_examen.FICHA;
import clases_examen.Password;
import clases_examen.Peliculas;
import clases_examen.TestCovid;
import clases_examen.empliado;
import clases_examen.serie_fibonacci;


public class EXAMEN_1RA_EVALUACIÓN_ECLAIR {


    public static void main(String[] args) {
 //1. CLASE DATOS DEL EQUIPO
   DatosIntegrantes.ImprimirDatosEquipo();
   DatosIntegrantes.ImprimirProblemasResueltos();
  

//  NIVEL BASICO
 //2. CLASE CONTRASEÑA:
        Password acceso = new Password();
    acceso.setUser("invitado1");
    acceso.setPass("150822");
    acceso.data();
    
   if (acceso.verificarAcceso("invitado1", "150822")) {
    System.out.println("Acceso válido");
   } else {
    System.out.println("Acceso inválido");
    }
   
   Password acceso2 = new Password();
   
    acceso.setUser("persona");
    acceso.setPass("33244");
    acceso.data();
    
   if (acceso.verificarAcceso("invitado1", "150822")) {
    System.out.println("Acceso válido");
   } else {
    System.out.println("Acceso inválido");
    }
   
   
//3. CLASE PELICULA:
   Peliculas miPelicula = new Peliculas("El Padrino", "Paramount Pictures", 18);
System.out.println(miPelicula.getTitulo());
System.out.println(miPelicula.getEstudio());
System.out.println(miPelicula.getRating());
miPelicula.setEstudio("Warner Bros");
System.out.println(miPelicula.getEstudio());


//4. CLASE FICHA BIBLIOGRÁFICA

 FICHA miFicha = new FICHA();
    
 
 
    // Imprimir los datos del libro en formato APA
    miFicha.imprimirFicha();
//  NIVEL MEDIO  
   //1. CLASE TEST COVID:
    TestCovid test1=new TestCovid ();
   
   test1.setEdad(18);
   System.out.println(test1.getEdad());
   
   test1.setPeso(60);
   test1.setEstatura(1.80);
   test1.setEnfermedadCronica(false);
   
   System.out.println("Persona 1: "+test1.calcularPersonaRiesgo());
   
   TestCovid test2=new TestCovid();
   
   System.out.println("Persona 2: "+test2.calcularPersonaRiesgo());
   
   //2. CLASE CUENTA BANCARIA:
   // Crear un objeto con constructor sin parámetros
Cuenta cuenta1 = new Cuenta();
cuenta1.setNumeroCuenta("123456789");
cuenta1.setCliente("Juan Perez");
cuenta1.depositarEnCuenta(1000);
cuenta1.imprimirDatos();

// Crear un objeto con constructor con parámetros
Cuenta cuenta2 = new Cuenta("987654321", "María García", 5000);
cuenta2.retirarDeCuenta(2000);
cuenta2.imprimirDatos();


   //3. CLASE EMPLEADO:
// Crear una instancia de la clase Empleado con los datos del empleado
   empliado empleados = new empliado("Juan", "Pérez", "Calle 123, Ciudad", 2015, 2500.0);
    
    // Calcular las prestaciones del empleado
    double prestaciones = empleados.calcularPrestaciones();
    
    // Imprimir el resultado en la consola
        System.out.println("nombre del empleado:" + empleados.getNombre());
        System.out.println("apellido del empleado: "+ empleados.getApellido());
        System.out.println("direccion del empleado: " +empleados.getDireccion());
        System.out.println("año que ingreso: "+ empleados.getAnioIngreso());
        System.out.println("salario del empleado: "+ empleados.getSalario());
        System.out.println("Las prestaciones del empleado son: $" + prestaciones);

//  NIVEL AVANZADO   
//1. FIBONACCI:
   serie_fibonacci fib1 = new  serie_fibonacci ();
        fib1.setA1(2);
        fib1.setA2(5);
        fib1.setN(6);
        fib1.Serie();
     
       serie_fibonacci fibo = new  serie_fibonacci (); 
       fibo.Fib2(1, 1, 7);
       fibo.Serie();
}
    }
