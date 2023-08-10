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
public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a largura: ");
        double largura = scanner.nextDouble();
        System.out.println("Digite a comprimento: ");
        double comprimento = scanner.nextDouble();
        
        double area = largura * comprimento;
        
        if (area <= 250) {
            double valor1 = area * 8.50;
            System.out.println("O valor do terreno é: " + valor1);
        } else if (area <= 350) {
            double valor2 = area * 9.50;
            System.out.println("O valor do terreno é: " + valor2);            
        } else if (area > 350) {
            double valor3 = area * 11.50;
            System.out.println("O valor do terreno é: " + valor3);  
        }
    }
    
}
