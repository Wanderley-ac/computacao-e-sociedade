/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista5;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */

public class Aula03 {
   public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int repeticoes = 0;
        String nome;
        int idade;
        char sexo;
        while (true) {
            System.out.print("Digite o nome da pessoa: ): ");
            nome = input.nextLine();
           
            
            System.out.print("Digite a idade da pessoa (ou '0' para encerrar: ");
            idade = Integer.parseInt(input.nextLine());
            if (idade == 0) {
                break;
            }
            System.out.print("Digite o sexo da pessoa (M/f): ");
            sexo = input.nextLine().charAt(0);
            repeticoes++;
         }
          System.out.println("O algoritmo foi repetido " + repeticoes + " vezes.");
        }
    }
