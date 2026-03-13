/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a02;

/**
 *
 * @author evama
 */
public class Main {
    public static void main(String[] args) {
        
        CuentaCorriente cuenta;
    
        cuenta = new CuentaCorriente("12345678A", "Eva");
        
        cuenta.ingresar(50);
        cuenta.sacar(30);
        cuenta.mostrar(); 
        
        System.out.println("¿Puedo sacar 5 €? Saldo actual: " + cuenta.sacar(5));
        System.out.println("¿Puedo sacar 50 €? Saldo actual: " + cuenta.sacar(50));
        
        cuenta = new CuentaCorriente("87654321Z", 10);
        cuenta.mostrar();
        
        cuenta = new CuentaCorriente("12345678B", "Alfredo", 500);
        cuenta.mostrar();
    }
}
