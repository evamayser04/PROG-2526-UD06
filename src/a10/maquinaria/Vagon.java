/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a10.maquinaria;

/**
 *
 * @author evama
 */
class Vagon {
    int num_ident;
    double kg_max;
    double kg_actual;
    String mercancia;
    
    Vagon(int num_ident, double kg_max, double kg_actual, String mercancia){
            this.num_ident = num_ident;
            this.kg_max = kg_max;
            this.kg_actual = kg_actual;
            this.mercancia = mercancia;        
    }
}

