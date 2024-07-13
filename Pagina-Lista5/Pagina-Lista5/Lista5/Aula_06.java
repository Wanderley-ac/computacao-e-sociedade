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


public class Aula_06{
 public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       
        double maiorAltura = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaTurma = 0;
        int contadorMulheres = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = scanner.nextDouble();
            System.out.print("Digite o código do sexo (1 para masculino, 2 para feminino) da pessoa " + i + ": ");
            int codigoSexo = scanner.nextInt();

          
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            
            if (codigoSexo == 2) {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }

     
            somaAlturaTurma += altura;
        }

      
        double mediaAlturaMulheres = somaAlturaMulheres / contadorMulheres;

        
        double mediaAlturaTurma = somaAlturaTurma / 10;

       
        System.out.println("A maior altura da turma é: " + maiorAltura);
        System.out.println("A média de altura das mulheres é: " + mediaAlturaMulheres);
        System.out.println("A média de altura da turma é: " + mediaAlturaTurma);

       
    }
}