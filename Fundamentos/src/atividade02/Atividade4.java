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
        
        int itemEconomizar = scanner.nextInt();
        
        switch (itemEconomizar) {
            case 1:
                double item1 = 3299.00;
                double pagarMes1 = item1 * 0.05;
                double valorPagar1 = item1 / pagarMes1;
                double valorArrendondar = Math.ceil(valorPagar1);
                System.out.println("Vai pagar o produto por: " + valorArrendondar);
                
                break;
            default:
                throw new AssertionError();
        }
        
    }
}
