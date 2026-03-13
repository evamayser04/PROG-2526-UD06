/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a07;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author evama
 */
public class Texto {
    
    private int longMax = 30;
    private String texto;
    private LocalDate fecha;
    private LocalDateTime fechaHora;
    
    Texto(String texto){
        if (texto.length() <= longMax){
            this.texto = texto;
            fecha = LocalDate.now();
        }else{
            System.out.println("Es demasiado largo!");
        }
    }
    public String getTexto() {
        return texto;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    
    public void addCaracterPrincipio(char caracterInicio){
        if((caracterInicio + texto).length() < longMax){
            texto = caracterInicio + " " + texto;
            fechaHora = LocalDateTime.now();
        }else{
            System.out.println("Es demasiado largo");
        }
    }
    
    public void addCaracterFinal(char caracterFinal){
        if((texto + caracterFinal).length() < longMax){
            texto = texto + " " + caracterFinal;
            fechaHora = LocalDateTime.now();
        }else{
            System.out.println("Es demasiado largo");
        }
    }
    public void addCadenaPrincipio(String textoInicio){
        if((textoInicio + texto).length() < longMax){
            texto = textoInicio + " " + texto;
            fechaHora = LocalDateTime.now();
        }else{
            System.out.println("Es demasiado largo");
        }
    }
    
    public void addCadenaFinal(String textoFinal){
        if((texto + textoFinal).length() < longMax){
            texto = texto + " " + textoFinal;
            fechaHora = LocalDateTime.now();
        }else{
            System.out.println("Es demasiado largo");
        }
    }

    public boolean esVocal(char letra){
        boolean resultado = false;
        if(letra == 'a' || letra == 'A'){
            resultado = true;
        }else{
            if(letra == 'e' || letra == 'E'){
               resultado = true;
            }else{
                if(letra == 'i' || letra == 'I'){
                    resultado = true;
                }else{
                    if(letra == 'o' || letra == 'O'){
                        resultado = true;
                    }else{
                        if(letra == 'u' || letra == 'U'){
                            resultado = true;
                        }
                    }
                }
            }
        }
        return resultado;
    }
    
    public int numVocales(){
        int total = 0;
        char tex[] = texto.toCharArray();
        for(int cont = 0; tex.length > cont; cont++){
            if(esVocal(tex[cont])== true){
                ++total;
            }
        }
        return total;
    }
     
    public void mostrar(){
        System.out.println(getTexto());
        System.out.println(numVocales());
        System.out.println(getFecha());
        System.out.println(getFechaHora());
    }
}
