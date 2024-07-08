/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coisaboa;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class LIsta08 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("tempo da pessoa ter visto o raio e ter escutado em segundos:");
        float tempo=scanner.nextFloat();
        
        float distancia=tempo*340;
         System.out.println("distancia:"+distancia);
         
         if (distancia<200)
             System.out.println("Perigo");
         else
             System.out.println("");
        
        
    
}
}