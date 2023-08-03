/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a distancia: ");
        double distancia = scanner.nextDouble();
        
        if (distancia > 200) {
            double passagem1 = 0.50;
            double valorTotal = passagem1 * distancia;
            System.out.println("O preço total da passagem é " + valorTotal);
        } else {
            double passagem2 = 0.45;
            double valorTotal2 = distancia * passagem2;
            System.out.println("O preço total da passagem é " + valorTotal2);
        }
    }
    
}
