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

public class Aula03 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
 int repeticoes = 0;
 String nome;
 int idade;
 String sexo;
 while (true) {
 System.out.print("Digite o nome da pessoa (ou '0' para encerrar): ");
 nome=entrada.nextLine();
 if (nome.equals("0")) {
     break;
 }
 System.out.print("Digite a idade da pessoa: ");
 idade=entrada.nextInt();
 if (idade == 0) {
     break; 
 }
  System.out.print("Digite o sexo da pessoa: ");
  sexo=entrada.nextLine();
   if (sexo.equals("0")) {
  repeticoes++; 
 }
  System.out.println("O algoritmo foi repetido " + repeticoes + " vezes.");
}
}
}