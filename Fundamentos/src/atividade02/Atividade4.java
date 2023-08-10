/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Item Economizar:\n1-Notebook Lenovo --- R$ 3299,00"
                + "\n2-Celular MotoG22 --- R$ 1789,00\n"
                + "3-Carro Hb20 --- R$ 6800,00\n"
                + "4-Apartamento --- R$ 180000,00");
        
        System.out.println("\nDigite o número da opção que deseja: ");
        int itemEconomizar = scanner.nextInt();
        
        switch (itemEconomizar) {
            case 1:
                double item1 = 3299.00;
                double pagarMes1 = item1 * 0.05;
                double valorPagar1 = item1 / pagarMes1;
                double valorArrendondar = Math.ceil(valorPagar1);
                System.out.println("Vai pagar o produto por: " + valorArrendondar + "meses");
                break;
            case 2: 
                double item2 = 1789.00;
                double pagarMes2 = item2 * 0.1;
                double valorPagar2 = item2 / pagarMes2;
                double valorArrendondar2 = Math.ceil(valorPagar2);
                System.out.println("Vai pagar o produto por: " + valorArrendondar2 + "meses");
                break;
            case 3:
                double item3 = 6800.00;
                double pagarMes3 = item3 * 0.02;
                double valorPagar3 = item3 / pagarMes3;
                double valorArrendondar3 = Math.ceil(valorPagar3);
                System.out.println("Vai pagar o produto por: " + valorArrendondar3 + "meses");
                break;
            case 4:
                double item4 = 180000.00;
                double pagarMes4 = item4 * 0.01;
                double valorPagar4 = item4 / pagarMes4;
                double valorArrendondar4 = Math.ceil(valorPagar4);
                System.out.println("Vai pagar o produto por: " + valorArrendondar4 + "meses");
                break;
            default:
                System.out.println("Erro ao digitar a informação");;
        }
        
    }
}
