/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05;

/**
 *
 * @author evama
 */
public class Gestor {
    public String nombre;
    final String tlf;
    double impmax;
    
    Gestor (String nombre, String tlf, double impmax){
    this.nombre = nombre;
    this.tlf = tlf;
    this.impmax = impmax;
    }
    
    Gestor (String nombre, String tlf){
    this(nombre, tlf, 10000.0);
    }
    
    void mostrarGestor (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Télefono: " + tlf);
        System.out.println("Tu importe maximo es de: " + impmax);
    }
}