
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andre
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner roda = new Scanner(System.in);
        System.out.print("Digite o valor celsius:");
        double c = roda.nextInt();

        System.out.println("celsius=" + c);

        int a = 9;
        int b = 160;
        int d = 5;

        System.out.println("Fahreheit=" + a * c + b / d);

    }

}
