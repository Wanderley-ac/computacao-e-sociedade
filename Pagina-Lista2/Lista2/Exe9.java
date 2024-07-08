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
public class Exe9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a quantidade de café:");
        double Qcafe = scanner.nextInt();
        System.out.print("digite o custo do café:");
        double Ccafe = scanner.nextInt();

        System.out.print("\ndigite a quantidade de leite:");
        double Qleite = scanner.nextInt();
        System.out.print("digite o custo do leite:");
        double Cleite = scanner.nextInt();

        System.out.print("\ndigite a quantidade de blacha:");
        double Qbolacha = scanner.nextInt();
        System.out.print("digite o custo do bolacha:");
        double Cbolacha = scanner.nextInt();
        
        double Gcafe=Qcafe*Ccafe;
        double Gleite=Qleite*Cleite;
        double Gbolacha=Qbolacha*Cbolacha;
        
        System.out.println("\ntotal de gasto do café:R$"+Gcafe);
        System.out.println("tital de gasto do leite:R$"+Gleite);
        System.out.println("total de gasto da bolacha:R$"+Gbolacha);
    }
}
