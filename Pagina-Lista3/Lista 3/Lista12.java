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
public class Lista12 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o valor de A:");
        float a = scanner.nextFloat();

        System.out.print("digite o valor de B:");
        float b = scanner.nextFloat();

        if (a == b) {
            System.out.println("A e B são iguais");
        } else {
            System.out.println("A e B são diferentes");
        }

    }
}
