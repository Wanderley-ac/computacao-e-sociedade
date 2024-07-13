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

public class Aula_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continua = 0;
        
        
        do {
            System.out.println("Digite o nome do hóspede:");
            String nome = scanner.nextLine();

            System.out.println("Digite o tipo do apartamento (A, B ou C):");
            char tipoApartamento = scanner.next().charAt(0);

            double valorDiaria;
            switch (tipoApartamento) {
                case 'A' -> valorDiaria = 150.00;
                case 'B' -> valorDiaria = 100.00;
                case 'C' -> valorDiaria = 75.00;
                default -> {
                    System.out.println("Tipo de apartamento inválido.");
                    continue;
                }
            }

            System.out.println("Digite o número de diárias:");
            int numDiarias = scanner.nextInt();

            if (numDiarias <= 0) {
                System.out.println("Número de diárias inválido.");
                continue;
            }

            double totalPagar = valorDiaria * numDiarias;

            System.out.println("\nConta final:");
            System.out.println("Nome do hóspede: " + nome);
            System.out.println("Tipo do apartamento: " + tipoApartamento);
            System.out.println("Valor total das diárias: R$ " + totalPagar);

            System.out.println("\nDeseja continuar (S/N)?");

        } while (Character.toUpperCase(continua) == 'S');

       
    }
}




