
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        
        System.out.print("nome:");
        String nome=scanner.nextLine();
        
        
        System.out.print("codigo prof:");
        int codigo=scanner.nextInt();
        
        System.out.print("idade:");
        int ID=scanner.nextInt();
        
        System.out.print("salario:");
        double salario=scanner.nextDouble();
        
        System.out.println("\nDADOS:");
        System.out.println("nome:"+nome);
        System.out.println("prof:"+codigo);
        System.out.println("idade"+ID);
        System.out.println("salario"+salario);
    }
    
}
