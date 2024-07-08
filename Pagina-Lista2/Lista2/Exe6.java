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
public class Exe6 {

    public static void main(String[] args) {
        Scanner roda = new Scanner(System.in);
        System.out.print("Digite o valor celsius:");
        double C = roda.nextInt();

        System.out.println("celsius:" + C);

        double F = (9.0 / 5.0) * C + 32;

        System.out.println("\na temperatura correspondente em graus Fahrenheit eh:" + F);

    }

}
