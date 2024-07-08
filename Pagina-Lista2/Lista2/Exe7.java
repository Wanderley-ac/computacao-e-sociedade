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
public class Exe7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digitrde a quantidade de picolés de morango:");
        int pa = scanner.nextInt();
        double a = pa * 1.50;

        System.out.print("digitrde a quantidade de picolés chocolate:");
        int pe = scanner.nextInt();
        double b = pe * 2.0;

        System.out.print("digitrde a quantidade de picolés flocos:");
        int pi = scanner.nextInt();
        double c = pi * 0.75;

        System.out.println("o valor arrecadado do picole de morango foi:R$" + a);
        System.out.println("o valor arrecadado do picole de chocolate foi:R$" + b);
        System.out.println("o valor arrecadado do picole de flocos foi:R$" + c);

        double total = a + b + c;

        System.out.println("o valor total das vendas é:R$" + total);

    }

}
