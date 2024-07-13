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

public class Aula08 {
     public static void main(String[] args) {
        
        int bilhetesInfantis = 0;
        int bilhetesNormais = 0;
        int bilhetes3Idade = 0;

        Scanner scanner = new Scanner(System.in);

       
        while (true) {
            System.out.print("Informe a idade do visitante (ou 'não' para encerrar): ");
            String input = scanner.nextLine();

           
            if (input.equalsIgnoreCase("não")) {
                break;
            }

            
            int idade = Integer.parseInt(input);

            
            if (idade < 6) {
              
            } else if (idade >= 6 && idade <= 12) {
                bilhetesInfantis++;
            } else if (idade >= 13 && idade <= 65) {
                bilhetesNormais++;
            } else {
                bilhetes3Idade++;
            }
        }

        System.out.println("Quantidade de bilhetes infantis vendidos: " + bilhetesInfantis);
        System.out.println("Quantidade de bilhetes normais vendidos: " + bilhetesNormais);
        System.out.println("Quantidade de bilhetes da terceira idade vendidos: " + bilhetes3Idade);

        
    }
}
    

