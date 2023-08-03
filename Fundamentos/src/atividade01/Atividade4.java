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
public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Qual é o sálario do funcionário? ");
        double salario = scanner.nextDouble();
        if (salario > 1350.00) {
            int pAumento1 = 10 / 100;
            double valorTotal = pAumento1 * salario;
            System.out.println("Sálario atual: " + valorTotal);
        } else {
            int pAumento2 = 15/100;
            double valorTotal2 = pAumento2 * salario;
            System.out.println("Sálario atual: " + valorTotal2);
        }
    }
    
}
