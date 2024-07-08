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
public class Exe8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("salario minimo:");
        int sm = scanner.nextInt();
        double a = sm * 2;

        System.out.print("quantidade de carros vendidos no mês:");
        int carros = scanner.nextInt();
        double b = carros*150.0;

        System.out.print("valor total das vendas:");
        int vendas = scanner.nextInt();
        double c = vendas*0.05;

        
        
       double salario=a+b+c;

        System.out.println("salario do funcionario é:"+salario);
    }
}