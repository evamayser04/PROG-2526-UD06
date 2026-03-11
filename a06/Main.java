/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a06;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int m = 0;
        int s = 0;
        int n;
        Hora horita = new Hora(h, m, s);

        //Ingresa una hora hasta que sea válida
        do{
        System.out.println("Ingrese la hora, con los minutos y segundos: ");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();

        horita.setHora(h, m ,s);

        System.out.println("Su hora es valida: " + horita.ValidarHora(h, m, s));
        } while (horita.ValidarHora(h, m, s) == false);

        System.out.println("Ahora diga los segundos que quiere que pasen: ");
        n = sc.nextInt();
        horita.CambioHora(n);
    }
}
