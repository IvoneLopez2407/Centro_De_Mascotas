/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author WORKING
 */
public class Mascota {
    
   private String nombre;
   private int edad;
   private String raza;
   private String color;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, String raza, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
   public String infoMascota (){
       String info = "NOMBRE: "+nombre+"<br>EDAD: "+edad+"<br>RAZA: "+raza+"<br>COLOR: "+color;
       return info;
   }
    
}
