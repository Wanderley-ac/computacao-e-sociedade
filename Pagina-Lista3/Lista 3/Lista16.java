/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import java.util.Scanner;
//Professora essa questão n consegui fazer, usei chat.
public class Lista16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        double[] precos0101 = lerPrecos(scanner, "01/01/2022");

     
        double[] precos0102 = lerPrecos(scanner, "01/02/2022");

       
        double inflacaoMedia = calcularInflacaoMedia(precos0101, precos0102);

        
        double meta = 0.55;
        if (inflacaoMedia > meta) {
            System.out.println("\nA inflação do período está acima da meta (" + meta + "%).");
        } else {
            System.out.println("\nA inflação do período está dentro da meta (" + meta + "%).");
        }
    }

  
    public static double[] lerPrecos(Scanner scanner, String data) {
        double[] precos = new double[3];
        System.out.println("Digite os preços das mercadorias em " + data + ":");
        for (int i = 0; i < 3; i++) {
            System.out.print("Mercadoria " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }
        return precos;
    }

    
    public static double calcularInflacaoMedia(double[] precosAnteriores, double[] precosAtuais) {
        double somaInflacoes = 0;
        for (int i = 0; i < 3; i++) {
            double inflacao = ((precosAtuais[i] - precosAnteriores[i]) / precosAnteriores[i]) * 100;
            somaInflacoes += inflacao;
        }
        return somaInflacoes / 3;
    }
}