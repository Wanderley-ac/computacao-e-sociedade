
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Exercicio4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        
        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

       
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        
        System.out.println("\nDados Pessoais:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);

      
}
}
       