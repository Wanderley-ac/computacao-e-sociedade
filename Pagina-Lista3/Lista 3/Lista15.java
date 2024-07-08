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
public class Lista15 {
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    
        System.out.print("Digite o salario bruto:");
        float salario=scanner.nextFloat();
        
        System.out.print("Digite numero de dependentes:");
        float dependentes=scanner.nextFloat();
        
        float sd=salario*0.26f;
        float sl=salario-sd;
        
        float total=(dependentes*150)+sl;
        
        System.out.println("Salário líquido:R$"+total);
    
       
    }
    
}
