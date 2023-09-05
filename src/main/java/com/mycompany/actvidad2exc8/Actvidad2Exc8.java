/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actvidad2exc8;

/**
 *
 * @author omarz
 */

/*Enunciado:
    Ejercicio resuelto Nº 13
Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
amarilla un 25%, si es azul un
50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
mencionados. 
*/

import java.util.Scanner;

public class Actvidad2Exc8 {

    public static void main(String[] args) {
        String ballColor;
        double totalValue, pValue, disct, totalD;
        
        System.out.println("Ingrese el valor total de la compra: ");
        
        Scanner totalC = new Scanner(System.in);
        totalValue = totalC.nextDouble();
        
        System.out.println("Ingrese el color de la bolita: ");
        
        Scanner color = new Scanner(System.in);
        ballColor = color.nextLine().toLowerCase();
        
        if (ballColor.equals("blanco")){
            disct = 0.0;        
        }
        else if (ballColor.equals("verde")){
            
            disct = 10.0;
        }
        else if (ballColor.equals("amarillo")){
            
            disct = 25.0;
        }
        else if (ballColor.equals("azul")){
            
            disct = 50.0;
        }
        else{
            disct = 100.0;
        }
        
        totalD = totalValue * (disct / 100);
        
        pValue = totalValue - totalD;
        
        System.out.println(ballColor);
        System.out.println(totalD);
        System.out.println("El cliente debe pagar: $" + pValue);        
        
    }
}
