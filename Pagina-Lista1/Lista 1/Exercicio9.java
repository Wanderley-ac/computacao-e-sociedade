
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andre
 */
public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para calcular a raiz quadrada: ");
        double numero = scanner.nextDouble();
        double raizQuadrada = Math.sqrt(numero);

        System.out.println("a raiz quadrada de " + numero + " eh:" + raizQuadrada);

    }

}
