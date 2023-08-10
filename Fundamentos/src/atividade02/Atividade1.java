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
public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu Cargo: ");
        String cargo = scanner.next();
        
        if (cargo.equalsIgnoreCase("Gerente")) {
            double salarioG = 5590.00;
            double convenioG = 289.00;
            double GdescontoINSS = salarioG * (8 / 100);
            double TotalSalarioG = salarioG - (GdescontoINSS + convenioG);
            System.out.println("Valor total: " + TotalSalarioG);
            
        } else if (cargo.equalsIgnoreCase("Supervisor")) {
            double convenioS = 239.00;
            double salarioS = 4128.00;
            double SdescontoINSS = salarioS * (7 / 100);
            double TotalSalarioS = salarioS - (SdescontoINSS + salarioS);
            System.out.println("Valor total: " + TotalSalarioS);
            
        } else if (cargo.equalsIgnoreCase("Tecnico")) {
            double salarioT = 3789.00;
            double convenioT = 189.00;
            double TdescontoINSS = salarioT * (4 / 100);
            double TotalSalarioT = salarioT - (TdescontoINSS + convenioT);
            System.out.println("Valor total: " + TotalSalarioT);            
            
        } else if (cargo.equalsIgnoreCase("Auxiliar")) {
            double salarioA =  2345.00;
            double convenioA = 156.00;
            double AdescontoINSS = salarioA * (2 / 100);
            double TotalSalarioA = salarioA - (AdescontoINSS + convenioA );
            System.out.println("Valor total: " + TotalSalarioA);
        } else {
            System.out.println("Cargo não identificado");
        }
        
    }
    
}
