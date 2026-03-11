/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a09;

/**
 *
 * @author evama
 */
public class Bombilla {
    private boolean interruptor;
    public static boolean interruptorGeneral = true;
    
    public void bombilla(){
        interruptor = false;
    }
    
    public void encender(){
        interruptor = true;
    }
    
    public void apagar(){
        interruptor = false;
    }
    
    public static void apagaGeneral(){
        interruptorGeneral = false;
    }
    public boolean estado(){
        return interruptor && interruptorGeneral;
    }
    
    public String muestraEstado() {
    return estado() ? "Encendida" : "Apagada";
    //dependiendo del estado se devuelve la cadena "Encendida" o "Apagada"
    }
}
