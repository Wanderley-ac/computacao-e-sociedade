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
public class Exe3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("valor de A:");
        int A = scanner.nextInt();
        System.out.print("valor de B:");
        int B = scanner.nextInt();

        int SQ = (A * A) + (B * B);

        System.out.println("a soma dos quadrados de " + A + " e " + B + " eh:" + SQ);

    }

}
