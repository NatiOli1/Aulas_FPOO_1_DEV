/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Prato:\n1-Arroz, feijão, bife acebolado --- R$ 19,99\n"
                + "2-Arroz, feijão, filé de frango --- R$ 18,99\n"
                + "3-Arroz, feijão, brajola --- R$ 23,99\n");
        
        System.out.println("Digite o número da sua opção: ");
        int prato = scanner.nextInt();
        
        System.out.println("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        
        switch (prato) {
            case 1:
                double prato1 = 19.99;
                double valorTotal1 = prato1 * quantidade;
                System.out.println("Valor a pagar: " + valorTotal1);
                break;
            case 2: 
                double prato2 = 18.99;
                double valorTotal2 = prato2 * quantidade;
                System.out.println("Valor a pagar: " + valorTotal2);
                break;
            case 3:
                double prato3 = 23.99;
                double valorTotal3 = prato3 * quantidade;
                System.out.println("Valor a pagar: " + valorTotal3);
                break;                
            default:
                System.err.println("Opção não identificada");
        }
    }
}


