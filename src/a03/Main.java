/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a03;

/**
 *
 * @author evama
 */
public class Main {
    
    public static void main(String[] args) {

        CuentaCorriente cuenta = new CuentaCorriente("12345678A", "Juan", 1000);

        //Se puede acceder porque es public
        System.out.println("Titular: " + cuenta.titular);

        //Se puede acceder porque está en el mismo paquete
        System.out.println("DNI: " + cuenta.dni);

        //ERROR: saldo es private
        //System.out.println("Saldo: " + cuenta.saldo);

        //Para ver el saldo usamos métodos públicos
        cuenta.mostrar();
    }
}