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
public class Lista03 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in); 
        
         System.out.print("digite o preço dos quilowatts:");
       float watts=scanner.nextFloat();
        
         System.out.print("digite o quantidade de watts:");
        float qw=scanner.nextFloat();
        
       float conta=watts*qw;
        
        float atraso=conta*1.10f;
           
        System.out.println("conta:"+conta+ "      conta em atraso:"+atraso);
        
        if (watts>70)
        System.out.println("consumo elevado de Energia");
        else
            System.out.println("");
        
    }
        
}
