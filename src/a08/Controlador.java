/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a08;

/**
 *
 * @author evama
 */
public class Controlador {
    
    private final double saltos = 0.5;
    private final double FrecuenciaMax = 108.0;
    private final double FrecuenciaMin = 80.0;
    private double frecuencia;
    
    Controlador(double frecuenciaInicial){
        if(frecuenciaInicial < FrecuenciaMin){
            frecuencia = FrecuenciaMin;
        }else if(frecuenciaInicial > FrecuenciaMax){
            frecuencia = FrecuenciaMax;
        }else{
            frecuencia = frecuenciaInicial;
        }
    }
    
    public void up(){
        frecuencia += saltos;
        if(frecuencia > FrecuenciaMax){
            frecuencia = FrecuenciaMin;
        }
    }
    
    public void down(){
        frecuencia -= saltos;
        if(frecuencia < FrecuenciaMin){
            frecuencia = FrecuenciaMax;
        }
    }
    
    public double get(){
        return frecuencia;
    }
}
