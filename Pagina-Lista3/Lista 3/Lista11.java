/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Lista11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a distancia a ser percorrida(Km):");
        float distancia = scanner.nextFloat();

        System.out.print("digite consumo medio do carro (Km/L):");
        float consumo = scanner.nextFloat();

        System.out.print("digite preço combustivel:");
        float preço=scanner.nextFloat();
        
        
        float total=(distancia/consumo)*preço;
        
        System.out.println("valor a ser gasto com combustível na viagem è: R$"+total);
        
        

    }

}
