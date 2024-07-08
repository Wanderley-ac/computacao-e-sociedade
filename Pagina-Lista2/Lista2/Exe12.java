/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exe12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o peso do prato:");
        double peso = scanner.nextDouble();

        double pe = peso-0.450;
        double valor=pe*39.0;
        
        
       

        System.out.println("valor total a pagar:R$" +valor );

    }

}
