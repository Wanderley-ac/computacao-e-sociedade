/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Lista04 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in); 
         System.out.print("digite o Peso:");
       float peso=scanner.nextFloat();
        
         System.out.print("digite sua Altura:");
        float altura=scanner.nextFloat();
        
       float al=altura*altura;
       
       float imd=peso/al;
       
        System.out.println("Indise de massa corporal:"+imd); 
        
        if (imd>25)
            System.out.println("esta acima do pesso");
        else
            System.out.println("não esta acima do peso");
       
       
        
        
        
    
    }
}
