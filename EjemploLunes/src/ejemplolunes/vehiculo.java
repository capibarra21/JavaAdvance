/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolunes;

/**
 *
 * @author joedirt
 */
public class vehiculo {
    String patente;
    private int velocidad;
    public vehiculo(String patente, int velocidad) {
    this.patente = patente;
    this.velocidad = velocidad;
     }
     public void VerDatos()
     {
        System.out.println("Patente: "+patente);
        System.out.println("Velocidad: "+velocidad);
      }
public static void main(String[] args) {
    vehiculo mivehiculo = new vehiculo("Nissan",100);
    mivehiculo.VerDatos();
  
 }
    public int getVelocidad() {
    return velocidad;
    }
    public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
        System.out.println("velocidad" + velocidad);
        
}
}
