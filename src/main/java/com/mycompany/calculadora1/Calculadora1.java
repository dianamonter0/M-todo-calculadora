/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora1;

/**
 *
 * @author diana
 */
public class Calculadora1 {

    public static void main(String[] args) {
        Operaciones2 op=new Operaciones2();
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    }
}
