/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a10.maquinaria;
import a10.personal.Maquinista;
/**
 *
 * @author evama
 */
public class Tren {
    private Locomotora locomotora;
    private Vagon vagones[];
    private Maquinista responsable;
    private int numVagones;
    private final int MAX_VAGONES = 5;
    
    public Tren(Locomotora locomotora, Maquinista responsable){
        this.locomotora = locomotora;
        this.responsable = responsable;
        vagones = new Vagon[MAX_VAGONES];
        
        numVagones = 0;    
    }
    
    public void enganchaVagon(int num_ident, double kg_max, double kg_actual, String mercancia){
        if (numVagones >= MAX_VAGONES){
            System.out.println("El tren no admite vagones");
        } else {
            Vagon v = new Vagon(num_ident, kg_max, kg_actual, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }
}
