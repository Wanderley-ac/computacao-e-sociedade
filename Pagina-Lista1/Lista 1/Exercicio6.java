
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andre
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner roda = new Scanner(System.in);

        System.out.print("quilometro:");
        double d = roda.nextInt();

        System.out.print("litros:");
        double c = roda.nextInt();

        System.out.println("consumo=" + d / c);
    }
}
