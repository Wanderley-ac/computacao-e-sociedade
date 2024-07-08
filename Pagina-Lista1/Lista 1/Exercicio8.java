
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Exercicio8 {
    public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
        System.out.print("1:numero=");
        int numero=scanner.nextInt();
        System.out.print("2:numero=");
        int bola=scanner.nextInt();
        System.out.print("3:numero=");
        int dado=scanner.nextInt();
        System.out.print("4:numero=");
        int sol=scanner.nextInt();
        
       int a=numero*numero;
       int b=bola*bola;
       int c=dado*dado;
       int d=sol*sol;
        
        System.out.println("resutados do quadrado de cada numero");
       
        System.out.println("1="+a);
        System.out.println("2="+b);
        System.out.println("3="+c);
        System.out.println("4="+d);
       
        System.out.println("o resultado da soma da area dos quadrados eh :"+a+b+c+d);
 
    }
    
}
