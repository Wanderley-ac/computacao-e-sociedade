/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Lista13 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o valor de A:");
        float a = scanner.nextFloat();

        System.out.print("digite o valor de B:");
        float b = scanner.nextFloat();
        
         System.out.print("digite o valor de C:");
        float c = scanner.nextFloat();


        if (a+b>c) 
            System.out.println("A+B `e maior que C");
        else 
            System.out.println("A+B é menor que C");
        }
    
}
