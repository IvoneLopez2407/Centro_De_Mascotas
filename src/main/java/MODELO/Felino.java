/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author WORKING
 */
import java.util.*; 

public class Felino extends Mascota implements ICalculos{
    private String toxo;
    private static ArrayList<Felino> listaFelino = new ArrayList();

    public Felino() {
    }

    public Felino(String toxo, String nombre, int edad, String raza, String color) {
        super(nombre, edad, raza, color);
        this.toxo = toxo;
        listaFelino.add(this);
    }

    public String getToxo() {
        return toxo;
    }

    public void setToxo(String toxo) {
        this.toxo = toxo;
    }

    public ArrayList<Felino> getListaFelino() {
        return listaFelino;
    }

    public void setListaFelino(ArrayList<Felino> listaFelino) {
        this.listaFelino = listaFelino;
    }

    

   @Override
    public String toString() {
        String info="";
        info=infoMascota();
        return info+"<br>Libre de toxoplasmosis: " + toxo+"<br>"+"<br>";
    }

    @Override
    public int obtenerCantidad() {
        int cant = 0;
        cant = listaFelino.size();
        return cant;
    }

    @Override
    public double calcularPromedioEdad() {
        int totalEdad = 0;
        double prom = 0;
        int numFelinos = listaFelino.size();
        for (Felino f : listaFelino) {
            totalEdad += f.getEdad();
        }
        prom = totalEdad/numFelinos;
        return prom;
    }

    
    public double sumaedades (){
        double suma = 0.0;
        for (Felino can : listaFelino){
            suma+=can.getEdad();
        }

        return suma;
    }
    public String eliminarFelino (String nombre){
        
    String mascota = "";    
    for (int i = 0; i < listaFelino.size(); i++) {
    Felino felinoActual = listaFelino.get(i);
    if (felinoActual.getNombre().equalsIgnoreCase(nombre)) {
        
        mascota+="Información del felino encontrado:<br>"+"Nombre: " + felinoActual.getNombre()+"<br>"+
        "Edad: " + felinoActual.getEdad()+"<br>"+"Color: " + felinoActual.getColor()+"<br>"+
         "Raza: "+felinoActual.getRaza()+"<br>"+
         "Libre de toxoplasmosis: " + felinoActual.getToxo()+"<br>";
        
        listaFelino.remove(i);
        
        break;
    }
}
    
    return mascota;
    }
}

 