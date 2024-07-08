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
public class Lista10 {
    public static void main(String args[]){
        Scanner scanner=new Scanner (System.in);
        
        System.out.println("digite o tamanho da pista em (Km):");
        float tamanhop=scanner.nextFloat();
        
        System.out.println("peso do avião em (t):");
        float peso=scanner.nextFloat();
        
        System.out.println("digite a visibilidade em (m):");
        float visibilidade=scanner.nextFloat();
        
        System.out.println("digite a quantidade de chuva em (mm):");
        float chuva=scanner.nextFloat();
        
        System.out.println("digite quantidade de passageiros:");
        float passageiros=scanner.nextFloat();
        
        
       
           System.out.print("Possui sistema de decolagem automatizada? (true/false): ");
        boolean automatisado = scanner.nextBoolean();
         
        if (tamanhop<1.5 && peso<40){
        System.out.println("o avião pode decolar:");
             }else if(tamanhop>=1.5 && tamanhop<=2 && peso<60){
            System.out.println("o avião pode decolar");
             }else if(tamanhop>2){
            System.out.println("o avião pode decolar"); 
             }else if(visibilidade<20 && !automatisado){
            System.out.println("o avião ´pode decolar");
            }else if(chuva>5 ){
            System.out.println("o avião não´pode decolar");
             }else if(chuva>0 && passageiros>=100){
            System.out.println("o avião não´pode decolar");
           
}else{
            System.out.println("o avião pode decolar");
    
            
    
   
        
    }
    
}
}