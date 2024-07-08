/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner roda = new Scanner(System.in);
        System.out.print("Digite o valor de X:");

        double x = roda.nextInt();

        System.out.println("X=" + x);
        int a = 3;
        int b = 2;

        double y = a * x + b;

        System.out.println("Y=" + y);

    }
}
