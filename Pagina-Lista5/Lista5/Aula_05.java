/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista5;

import java.util.Scanner;

/**
 *
 * @author andre
 */

public class Aula_05 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        int quantidadeOtimo = 0;
        int somaIdadeRuim = 0;
        int quantidadeRuim = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;


        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Espectador " + i + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Opinião (A - Ótimo, B - Bom, C - Regular, D - Ruim): ");
            char opiniao = scanner.next().charAt(0);

        
            if (opiniao == 'A') {
                quantidadeOtimo++;
            }

          
            if (opiniao == 'D') {
                somaIdadeRuim += idade;
                quantidadeRuim++;
            }

          
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
        }

       
        double mediaIdadeRuim = somaIdadeRuim / (double) quantidadeRuim;

       
        int diferencaIdade = maiorIdade - menorIdade;

        
        System.out.println("Quantidade de respostas Ótimo: " + quantidadeOtimo);
        System.out.println("Média de idade das pessoas que responderam Ruim: " + mediaIdadeRuim);
        System.out.println("Diferença de idade entre a pessoa mais velha e a mais nova: " + diferencaIdade);
    
     
         }  
     }


