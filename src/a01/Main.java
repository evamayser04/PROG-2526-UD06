/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a01;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu dni y nombre: ");
        CuentaCorriente cuenta1 = new CuentaCorriente(sc.nextLine(), sc.nextLine());
        
        System.out.print("Cuanto dinero quieres ingresar?");
        cuenta1.ingresar(sc.nextDouble());
        
        System.out.print("Cuanto dinero quieres sacar?");
        cuenta1.sacar(sc.nextDouble());
        
        System.out.print("La información de tu cuenta es la siguiente: ");
        cuenta1.mostrar();
    }
}
