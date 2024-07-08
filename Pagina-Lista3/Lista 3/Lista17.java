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
public class Lista17 {
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    
        System.out.print("Digite a quantidade de parcelas do consorcio:");
        float pc=scanner.nextFloat();
        
     System.out.print("Digite a quantidade de parcelas do consorcio pagas:");
        float pcpg=scanner.nextFloat();
        
        System.out.println("digite o valor das parcelas:");
        float valor=scanner.nextFloat();
        
        float totalpg=valor*pcpg;
        float sald=(pc-pcpg)*valor;
        
        System.out.println("o total já pago pelo cliente:"+totalpg);
        System.out.println("saldo devedor:"+sald);
    }
}
