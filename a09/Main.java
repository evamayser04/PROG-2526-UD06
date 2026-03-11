/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a09;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        
        int opcion = 0;
            do {
            System.out.println("Elige la opcion para tus bombillas");
            System.out.println("0: Salir");
            System.out.println("1: Encender bombilla 1");
            System.out.println("2: Encender bombilla 2");
            System.out.println("3: Apagar bombilla 1");
            System.out.println("4: Apagar bombilla 2");
            System.out.println("5: Apagar general");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                b1.encender();
                System.out.println("Bombilla B1: " + b1.muestraEstado());
            } else if (opcion == 2) {
                b2.encender();
                System.out.println("Bombilla B2: " + b2.muestraEstado());
            } else if (opcion == 3) {
                b1.apagar();
                System.out.println("Bombilla B1: " + b1.muestraEstado());
            } else if (opcion == 4) {
                b2.apagar();
                System.out.println("Bombilla B1: " + b2.muestraEstado());
            } else if (opcion == 5){
                Bombilla.apagaGeneral();
                System.out.println("B1: " + b1.muestraEstado()+ ", B2: " + b2.muestraEstado());
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);
    }
}
