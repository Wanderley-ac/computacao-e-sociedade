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
public class Lista19 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 0 e 999: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 999) {
            System.out.println("Número inválido. Por favor, digite um número entre 0 e 999.");
            return;
        }

       
        int somadi=calcularSomaDigitos(numero);

       
        System.out.println("A soma dos dígitos do número " + numero + " é: " + somadi);
    }

    
    public static int calcularSomaDigitos(int numero) {
        
        int digitoCentena = numero / 100;
        int digitoDezena = (numero / 10) % 10;
        int digitoUnidade = numero % 10;

        
        int soma = digitoCentena + digitoDezena + digitoUnidade;
        return soma;
    }
    
}
