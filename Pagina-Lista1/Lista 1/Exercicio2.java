
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andre
 */
public class Exercicio2 {

    public static void main(String[] args) {
        int numero;

        System.out.print("digite um numero: ");
        Scanner bola = new Scanner(System.in);
        numero = bola.nextInt();

        System.out.println("o antecessor e " + (numero - 1));
        System.out.println("o sucessor e " + (numero + 1));

    }

}
