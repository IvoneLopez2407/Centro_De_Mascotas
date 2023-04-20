/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author WORKING
 */
public class Canino extends Mascota implements ICalculos{
    private int nivelEntrenamiento;
    private  static ArrayList<Canino> listaCanino = new ArrayList();

    public Canino() {
    }

    public Canino(int nivelEntrenamiento, String nombre, int edad, String raza, String color) {
        super(nombre, edad, raza, color);
        this.nivelEntrenamiento = nivelEntrenamiento;
        listaCanino.add(this);
    }

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public ArrayList<Canino> getListaCanino() {
        return listaCanino;
    }

    public void setListaCanino(ArrayList<Canino> listaCanino) {
        this.listaCanino = listaCanino;
    }

    
    @Override
    public String toString() {
       String info="";
       info=infoMascota();
        return info+"<br>nivel de entrenamiento: " + nivelEntrenamiento+"<br>"+"<br>";
    }

    
    @Override
    public double calcularPromedioEdad() {
        double totalEdad = 0.0;
        double prom = 0.0;
        int numCaninos = listaCanino.size();
        for (Canino c : listaCanino) {
            totalEdad += c.getEdad();
        }
        prom = totalEdad/numCaninos;
        return prom;
    }

    @Override
    public int obtenerCantidad() {
        int cant = 0;
        cant = listaCanino.size();
        return cant;
    }
    public double sumaedades (){
        double suma = 0.0;
        for (Canino can : listaCanino){
            suma+=can.getEdad();
        }
 
        return suma;
    }
    public String eliminarCanino (String nombre){
        
    String mascota = "";    
    for (int i = 0; i < listaCanino.size(); i++) {
    Canino caninoActual = listaCanino.get(i);
    if (caninoActual.getNombre().equalsIgnoreCase(nombre)) {
        
        mascota+="Información del canino encontrado:<br>"+"Nombre: " + caninoActual.getNombre()+"<br>"+
        "Edad: " + caninoActual.getEdad()+"<br>"+"Color: " + caninoActual.getColor()+"<br>"+
         "Raza: "+caninoActual.getRaza()+"<br>"+
         "Nivel de entrenamiento: " + caninoActual.getNivelEntrenamiento()+"<br>";
        
        listaCanino.remove(i);
        
        break;
    }
  }
    
    return mascota;
 }
}
