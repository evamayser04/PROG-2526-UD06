/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a10.personal;

/**
 *
 * @author evama
 */
public class Mecanico {
    private String nombre;
    private static String telefono;
    private Especialidad especialidad;
    
    Mecanico(String nombre, String telefono, String especialidad){
            this.nombre = nombre;
            this.telefono = telefono;
            this.especialidad = Especialidad.valueOf(especialidad);
    }
}
    