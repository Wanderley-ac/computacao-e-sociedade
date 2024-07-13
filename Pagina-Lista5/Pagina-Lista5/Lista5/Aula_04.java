package Lista5;


import java.util.Scanner;

public class Aula_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|------------------------------------|");
        System.out.println("| Especificação     | Codigo | preço |");
        System.out.println("| Cachorro quente   |  100   | 4,00  |");
        System.out.println("| X salada          |  101   | 6,00  |");
        System.out.println("| Bauru com ovo     |  102   | 6,50  |");
        System.out.println("| Refrigerante      |  103   | 2,00  |");
        System.out.println("|------------------------------------|");

        int quente = 4;
        int salada = 6;
        double ovo = 6.5;
        int refri = 2;
        int codigo;
        int quantidade;
        double total = 0;

        System.out.print("Informe a quntidade de pediddos:");
        
        int numPedidos=scanner.nextInt();
        for (int i = 0; i < numPedidos; i++) {
            System.out.println("Faça seu pedido pelo codigo:");
            codigo = scanner.nextInt();

            System.out.println("quantidade do do pedido :");
            quantidade = scanner.nextInt();
            switch (codigo) {
                case 100 ->
                    total += quente * quantidade;
                case 101 ->
                    total += salada * quantidade;
                case 102 ->
                    total += ovo * quantidade;
                case 103 ->
                    total += refri * quantidade;
                default-> System.out.println("Codigo de pedido invalido");
                        
                                

            }
            System.out.println("o valor total dos pedidos é:"+total);
        }

    }

}
