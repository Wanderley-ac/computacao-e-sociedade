/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista5;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */

/*
*/
public class Aula01 {
    
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 1;

        while (valor1 != valor2) {
            System.out.print("Digite o primeiro valor: ");
            valor1 = scanner.nextInt();

            System.out.print("Digite o segundo valor: ");
            valor2 = scanner.nextInt();

            if (valor1 != valor2) {
                System.out.println("Os valores são diferentes. Digite novamente.");
            }
        }

        System.out.println("Os valores são iguais. Encerrando o programa.");
       
    }
}