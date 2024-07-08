/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Exe4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor de A:");
        int A = scanner.nextInt();
        System.out.print("digite o valor de B");
        int B = scanner.nextInt();

        int soma = A + B;
        int QS = soma * soma;

        System.out.println("o quadrado da soma de de " + A + " e " + B + " eh:" + QS);

    }

}
