/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora1;

/**
 *
 * @author diana
 */
import javax.swing.JOptionPane;
public class Operaciones2 {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int residuo;
    
    //Métodos
    
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Coloca el num 1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Coloca el num 2"));
    } 
    
    public void sumar(){
        suma=numero1+numero2;
    }
    
    public void restar(){
      resta=numero1-numero2;
    }
    
     public void multiplicar(){
       multiplicacion=numero2*numero2;
    }
    
    public void dividir(){
        division=numero1/numero2;
        residuo=numero1%numero2;
    }
    
     public void mostrarResultados(){
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicación es "+multiplicacion);
        System.out.println("La division es "+division);
        System.out.println("El residuo es "+residuo);
    }
}
