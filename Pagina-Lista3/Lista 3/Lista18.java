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
public class Lista18 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite sua data de nascimento:");
        System.out.print("Dia: ");
        int diaNascimento = scanner.nextInt();
        System.out.print("Mês: ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Ano: ");
        int anoNascimento = scanner.nextInt();

        
        System.out.println("\nDigite a data atual:");
        System.out.print("Dia: ");
        int diaAtual = scanner.nextInt();
        System.out.print("Mês: ");
        int mesAtual = scanner.nextInt();
        System.out.print("Ano: ");
        int anoAtual = scanner.nextInt();

       
        int idadeEmDias = calcularIdadeEmDias(diaNascimento, mesNascimento, anoNascimento,
                                               diaAtual, mesAtual, anoAtual);

        
        System.out.println("\nVocê viveu aproximadamente " + idadeEmDias + " dias.");
    }

    
    public static int calcularIdadeEmDias(int diaNascimento, int mesNascimento,
        int anoNascimento, int diaAtual, int mesAtual, int anoAtual) {
        
        int diasNascimento = anoNascimento * 360 + mesNascimento * 30 + diaNascimento;
        int diasAtual = anoAtual * 360 + mesAtual * 30 + diaAtual;
        return diasAtual - diasNascimento;
    }
}
    

