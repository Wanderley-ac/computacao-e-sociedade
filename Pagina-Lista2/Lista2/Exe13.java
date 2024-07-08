/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exe13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("de 0-23 Digite a hora: ");
        int horas = scanner.nextInt();
        System.out.print("de 0-59 Digite os minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("de 0-59 Digite os segundos: ");
        int segundos = scanner.nextInt();

        int tempo = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("quantidade de segundos que ja se passaram: " + tempo);

    }
}
