/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a02;

/**
 *
 * @author evama
 */
public class CuentaCorriente {
    String dni;
    String titular;
    double saldo;
    
    CuentaCorriente(String dni, String titular){
        this(dni, titular, 0.0);
    }
    
    CuentaCorriente(String dni, double saldo){
    this(dni, "Sin nombre", saldo);
    }
    
    CuentaCorriente(String dni, String titular, double saldo){
    this.dni = dni;
    this.titular = titular;
    this.saldo = saldo;
    }
    
    double ingresar(double ingreso){
        if (ingreso > 0){
            saldo += ingreso;
        }
            return(saldo);
    }
    
    double sacar (double sacado){
        if (sacado > 0 && sacado < saldo){
            saldo -= sacado;
        }else if(sacado > saldo){
            System.out.println("No tienes suficiente dinero en la cuenta.");
        }
            return(saldo);
    }
    
    void mostrar (){
        System.out.println(titular + " con DNI" + dni);
        System.out.println("Tienes:" + saldo + "en tu cuenta.");
    }
}
