/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Lista14 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("didite seu nome");
        String nome = scanner.nextLine();

        System.out.println("nota de");
        float notap = scanner.nextFloat();

        System.out.println("nota de");
        float notam = scanner.nextFloat();

        System.out.println("nota de");
        float notag = scanner.nextFloat();

        float media = (notap + notam + notag) / 3;

        System.out.println("\nNome:" + nome);
        System.out.println("nota de português:" + notap);
        System.out.println("nota de matématica:" + notam);
        System.out.println("nota de conhecimentos gerais:" + notag);
        System.out.println("Media do aluno:" + media);

        if (media>7 && notap>5 && notam>5 && notag>5) 
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
            
        
    }

}
