/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases_examen;

/**
 *
 * @author Omar Carrillo
 */
public class Password {

    String usuario;
    String contraseña;
 //-----------------------------------------------------------------------------   
    public void setUser(String user) {
      usuario = user;
    }
 //-----------------------------------------------------------------------------    
    public void setPass(String pass) {
     contraseña = pass;
    }
//-----------------------------------------------------------------------------     
    public boolean verificarAcceso(String user, String pass) {
        return usuario.equals(user) && contraseña.equals(pass);
    }

 //-----------------------------------------------------------------------------  
 
 public void data (){
     System.out.println("\nDatos ingresados.");
     System.out.println("Usuario: " +usuario);
     System.out.println("Contraseña: " +contraseña);
 }
 }
