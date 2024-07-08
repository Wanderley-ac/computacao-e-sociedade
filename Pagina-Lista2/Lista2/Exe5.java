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
public class Exe5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor da Base:");
        int base = scanner.nextInt();
        System.out.print("digite o valor da Altura:");
        int altura = scanner.nextInt();

        int area = base * altura;
        int perimetro = (2 * base) + (2 * altura);

        System.out.println("a Área do retagulo de base " + base + " e altura" + altura + " eh:" + area + "e o Perimetro eh:" + perimetro);

    }
}
