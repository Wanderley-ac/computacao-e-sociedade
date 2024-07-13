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
public class Aula02 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
     
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro (maior que o primeiro):");
        int num2 = scanner.nextInt();

        while (num1>= num2) {
            System.out.println("O segundo número deve ser maior que o primeiro. Digite novamente:");
            num2 = scanner.nextInt();
        }

        int soma = num1 + num2;
        System.out.println("A soma dos números é: " + soma);

       
    }
}