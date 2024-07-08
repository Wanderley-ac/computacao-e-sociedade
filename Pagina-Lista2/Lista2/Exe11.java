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
public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("tempo em segundos do video:");
        int segundos=scanner.nextInt(); 
        
        
        int horas = segundos / 3600;
        int min = (segundos % 3600) / 60;
        int seg= (segundos % 3600) % 60;
        
        System.out.println("tempo total do video:"+horas+"h"+min+"m"+seg+"s");
        
        
    
}
}
