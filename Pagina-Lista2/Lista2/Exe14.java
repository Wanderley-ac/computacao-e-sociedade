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
public class Exe14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("De 0-23 digite a hora: ");
        int horas = scanner.nextInt();
        System.out.print("De 0-59 digite os minutos (0-59): ");
        int minutos = scanner.nextInt();
        System.out.print("De 0-59 digite os segundos atuais (0-59): ");
        int segundos = scanner.nextInt();

        int rs = horas * 3600 + minutos * 60 + segundos;
        int rt = 24 * 3600 - rs;

        System.out.println("Segundos que faltam para dia o dia terminar: " + rt);
    }

}
