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
public class Lista06 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nota do trabalho:");
        float trabalho = scanner.nextFloat();

        System.out.print("nota do prova01:");
        float prova01 = scanner.nextFloat();

        System.out.print("nota do prova02:");
        float prova02 = scanner.nextFloat();
        
         System.out.print("digite a frequencia do aluno em (%):");
         float frequencia = scanner.nextFloat();
        
        if ((prova01>=6 || prova02>=6)&& trabalho>=7 && frequencia>=75)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
          
    
    }
    
}
