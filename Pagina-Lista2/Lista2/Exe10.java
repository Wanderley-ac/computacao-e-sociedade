/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um número inteiro:");
        int numero=scanner.nextInt(); 
        
        int quociente=numero/2;
         int resto = numero % 2;
         
        System.out.println("Quociente da divisão por 2= "+quociente);
        System.out.println("Resto da divisão por 2= "+resto);
        

    
    }
}
