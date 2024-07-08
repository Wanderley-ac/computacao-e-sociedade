
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andre
 */
public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("lado do quadrado=");
        int numero = scanner.nextInt();

        int quadrado = numero * numero;

        System.out.println("o quadrado do numero digitado eh:" + quadrado);

    }
}
