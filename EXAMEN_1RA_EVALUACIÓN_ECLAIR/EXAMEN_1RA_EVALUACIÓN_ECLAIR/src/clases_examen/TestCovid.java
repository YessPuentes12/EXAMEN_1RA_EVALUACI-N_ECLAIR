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
public class TestCovid {
        private int edad;
        private double estatura;
        private double peso;
        private boolean enfermedadCronica;
        
        public TestCovid(){
          edad=26;
          estatura=1.75;
          peso=100;
          enfermedadCronica=false;
        }
        
        
        public void setEdad(int n){
          edad=n;
        }
        
        public void setEstatura(double n){
          estatura=n;
        }
        
        public void setPeso(double n){
          peso=n;
        }
        
        public void setEnfermedadCronica(boolean n){
          enfermedadCronica=n;
        }
        
        
        
        
        public int getEdad(){
          return edad;
        }
        
        public double getEstatura(){
          return estatura;
        }
        
        public double getPeso(){
          return peso;
        }
        
        
        
        
        public String getEnfermedadCronica(){
        
          if(enfermedadCronica){
            return "Si";
          }else{
          return "No";
          }
        }
        
        
        private double IMC(){
          double imc=peso/(estatura*estatura);
          return imc;
        }
        
        
        public String calcularPersonaRiesgo(){
          if((edad>=65)||(enfermedadCronica)||(IMC()>30)){
            return "Persona en Riesgo";
          }else{
            return "Persona SIN Riesgo";
          }
        }
}

