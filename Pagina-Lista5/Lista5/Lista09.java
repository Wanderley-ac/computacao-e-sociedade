/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista5;

import java.util.Scanner;

public class Lista09 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Digite o CPF (ou '00' para sair):");
            String cpf = scanner.nextLine();

            if (cpf.equals("00")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.println("Digite a renda mensal:");
            double rendaMensal = scanner.nextDouble();

            System.out.println("Digite a classe de renda (A, B, C, D ou E):");
            char classeRenda = scanner.next().charAt(0);

            double desconto = calcularImpostoRenda(rendaMensal, classeRenda);
            if (desconto == -1) {
                System.out.println("Classe de renda inválida.");
            } else {
                System.out.println("Alíquota de desconto: " + desconto + "%");
                double valorDesconto = rendaMensal * (desconto / 100);
                System.out.println("Valor a ser descontado: R$" + valorDesconto);
            }

            scanner.nextLine(); // Limpar o buffer do scanner
        }
    }

    public static double calcularImpostoRenda(double rendaMensal, char classeRenda) {
        double aliquota = -1; // Valor inválido por padrão

        switch (classeRenda) {
            case 'A' -> aliquota = 0;
            case 'B' -> aliquota = 5;
            case 'C' -> aliquota = 10;
            case 'D' -> aliquota = 15;
            case 'E' -> aliquota = 20;
        }

        return aliquota;
    }
}
    

