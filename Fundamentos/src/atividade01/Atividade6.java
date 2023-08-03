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
public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o valor da casa: ");
        double valorCasa = scanner.nextDouble();
        System.out.println("Digite seu salario: ");
        double salario = scanner.nextDouble();
        System.out.println("Digite a quantidades de anos a pagar:");
        int anosPagar = scanner.nextInt();
        double prestacaoMensal = valorCasa / (anosPagar * 12);
        double  limitePrestacao = salario * (30/100);
        
        if (prestacaoMensal > limitePrestacao) {
            System.err.println("A prestação é superior que 30% do sálario!!");
        } else {
            System.out.println("O total da prestacao é " + prestacaoMensal);
        }
        
    }
    
}
