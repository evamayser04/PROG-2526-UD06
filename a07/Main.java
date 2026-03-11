/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a07;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class Main {
    public static void main(String[] args) {
        
        int opcion = 0;
        char inicioCaracter = 'i';
        char  finCaracter = 'f';
        String inicioCadena;
        String finCadena;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame tu texto: ");
        Texto t1 = new Texto(sc.nextLine());
        
        System.out.println(t1.getTexto());
        
        do{
            System.out.println("Diga que opciones quiere realizar a continuacion: ");
            System.out.println("Opcion 0: Salir");
            System.out.println("Opcion 1: Optener Fecha de Creacion");
            System.out.println("Opcion 2: Añadir un caracter al inicio del texto");
            System.out.println("Opcion 3: Añadir un caracter al final del texto");
            System.out.println("Opcion 4: Añadir una cadena al inicio del texto");
            System.out.println("Opcion 5: Añadir una cadena al final del texto");
            System.out.println("Opcion 6: Saber cuantas vocales hay");
            System.out.println("Opcion 7: Mostrar informacion de cada texto");

            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion){
                case 0 ->
                    System.out.println("adeu");
                case 1 ->
                    System.out.println(t1.getFecha());
                case 2 ->{
                    t1.addCaracterPrincipio(inicioCaracter);
                }
                case 3 ->{
                    t1.addCaracterFinal(finCaracter);
                }
                case 4 ->{
                    inicioCadena = sc.nextLine();
                    t1.addCadenaPrincipio(inicioCadena);
                }
                case 5 ->{
                    finCadena = sc.nextLine();
                    t1.addCadenaFinal(finCadena);
                }
                case 6 ->
                    System.out.println(t1.numVocales());
                case 7 ->
                    t1.mostrar();
            }
        } while (opcion != 0);
    }
}
