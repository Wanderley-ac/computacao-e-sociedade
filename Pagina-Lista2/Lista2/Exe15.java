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
public class Exe15 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("digite o peso inicial:");
        double peso=scanner.nextDouble();
        
        double gorda=peso*1.15;
        double magra=peso*0.80;
        
        System.out.println("novo peso se a pessoa engorda 15% do peso digitado:"+gorda);
        System.out.println("novo peso se a pessoa emagrecer 20% do peso digitado:"+magra);
    }
    
}
