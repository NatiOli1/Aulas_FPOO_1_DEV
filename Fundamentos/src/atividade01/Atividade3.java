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
public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a velocidade do carro?: ");
        int velocidadeCarro = scanner.nextInt();
        
        if (velocidadeCarro > 80) {
            System.err.println("Você foi mutado!!");
            double multa = (velocidadeCarro - 80) * 5.00;
            System.out.println("Sua multa é de: " + multa);
        }
    }
}
