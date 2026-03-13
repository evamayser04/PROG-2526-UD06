/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a08;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
            System.out.println("Con que frecuencia vas a empezar?");
            double frecuencia =  sc.nextDouble();
            
            Controlador f = new Controlador(frecuencia);
            
            int opcion = 0;
            do {
            System.out.println("Elige la opcion que quieres realizar en tu radio");
            System.out.println("0: Salir");
            System.out.println("1: Subir frecuencia");
            System.out.println("2: Bajar frecuencia");
            System.out.println("3: Ver frecuencia actual");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                f.up();
                System.out.println("Frecuencia subida. Ahora: " + f.get() + " MHz");
            } else if (opcion == 2) {
                f.down();
                System.out.println("Frecuencia bajada. Ahora: " + f.get() + " MHz");
            } else if (opcion == 3) {
                System.out.println("Frecuencia actual: " + f.get() + " MHz");
            } else if (opcion == 0) {
                System.out.println("¡Adiós!");
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);
    }
}
