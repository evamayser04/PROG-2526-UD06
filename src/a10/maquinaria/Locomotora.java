/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a10.maquinaria;
import a10.personal.Mecanico;
/**
 *
 * @author evama
 */
public class Locomotora {
    private String matricula;
    private int potencia;
    private int año_fabricado;
    private Mecanico mecanico_asignado;
    
    Locomotora(String matricula, int potencia, int año_fabricado, Mecanico mecanico_asignado){
        this.matricula = matricula;
        this.potencia = potencia;
        this.año_fabricado = año_fabricado;
        this.mecanico_asignado = mecanico_asignado;
    }   
}
