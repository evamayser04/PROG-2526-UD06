/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05;

/**
 *
 * @author evama
 */
public class Main {
     public static void main(String[] args) {
        Gestor gestor1 = new Gestor("Laura Pérez", "600123456", 20000);
        
        Gestor gestor2 = new Gestor("Carlos Gómez", "699888777");
        
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Juan López",1500, gestor1);
        
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Alejandro Ruiz",3000, gestor2);
        
        CuentaCorriente cuenta3 = new CuentaCorriente("87654321B","Ana Martínez",2000);
        
        System.out.println("CUENTA 1 (CON GESTOR)");
        cuenta1.mostrar();
        cuenta1.ingresar(500);
        cuenta1.sacar(300);
        cuenta1.mostrar();
        
        System.out.println("Datos del gestor de la cuenta 1:");
        gestor1.mostrarGestor();
        
        System.out.println("CUENTA 2 (CON GESTOR)");
        cuenta2.mostrar();
        cuenta2.ingresar(1525);
        cuenta2.sacar(5000);
        cuenta2.mostrar();
        
        System.out.println("Datos del gestor de la cuenta 1:");
        gestor2.mostrarGestor();
        
        System.out.println("CUENTA 3 (SIN GESTOR)");
        cuenta3.mostrar();
        cuenta3.ingresar(1525);
        cuenta3.sacar(700);
        cuenta3.mostrar();
        
        CuentaCorriente.setBanco("BBVA");
        System.out.println("El banco actual es: " + CuentaCorriente.getBanco());
        
    }
}
