/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a10.personal;
import java.util.Date;
/**
 *
 * @author evama
 */
public class JefeEstacion {
    private String nombre;
    private String dni;
    private Date nombramiento;
    
    JefeEstacion(String nombre, String dni, Date nombremiento){
            this.nombre= nombre;
            this.dni = dni;
            this.nombramiento = nombremiento;
    }
}
