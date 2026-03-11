/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a06;

/**
 *
 * @author evama
 */
public class Hora {
    int h;
    int m;
    int s;
    boolean valido;

    Hora(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void setHora(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    int getHora(){
        return h;
    }

    int getMinutos(){
        return m;
    }

    int getSegundos(){
        return s;
    }

    void CambioHora(int n){
        for (int cont = 0; cont < n; ++cont){
            ++s;
            if (s > 59){
                s = 0;
                ++m;
                if (m > 59){
                    m = 0;
                    ++h;
                    if (h > 23){
                        h = 0;
                    }
                }
            }
            System.out.println(getHora() + " h " + getMinutos() + " m " + getSegundos() + " s");
        }
    }

    boolean ValidarHora(int h, int m, int s){
        valido = true;

        if (h >= 0 && h <= 23){
             if (m >= 0 && m <= 59){
                 if (s >= 0 && s <= 59){

                 } else {
                     valido = false;
                 }
             } else{
                 valido = false;
             }
        } else {
            valido = false;
        }

        return valido;
    }
}