/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coisaboa;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Lista09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o valor da  compra:");
        float vc = scanner.nextFloat();

        System.out.print("digite o valor pago:");
        float vp = scanner.nextFloat();

        float troco = vp - vc;
        System.out.print("troco do cliente:" + troco);
        

        int nota100 = (int) (troco / 100);
        troco %= 100;
        System.out.println("quantidade de nota 100=" + nota100);
        
        int nota10 = (int) (troco / 10);
        troco %= 10;
        System.out.println("quantidade de nota 10=" + nota10);
        
        int nota1 = (int) troco;
        System.out.println("quantidade de nota 1=" + nota1);

    }

}
