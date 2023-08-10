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
public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Veículo:\n1 - Fiat Argo\n"
                + "2 - Fiat Mobi\n3 - Hyundai Hb20");
        
        System.out.println("Digite a opção(número) do veículo: ");
        int veiculo = scanner.nextInt();
        
        System.out.println("Digite a distância a percorrer: ");
        double distancia = scanner.nextDouble();
        
        System.out.println("Digite o total de dias a alugar: ");
        int dias = scanner.nextInt();
        
        if (veiculo == 1) {
            double fiatArgo = 98.00;
            double valor1 = (fiatArgo * dias) + (distancia * 2.39);
            System.out.println("Valor Total: " + valor1);
        } else if (veiculo == 2) {
            double fiatMobi = 79.00;
            double valor2 = (fiatMobi * dias) + (distancia * 1.99);
            System.out.println("Valor Total: " + valor2);            
        } else if (veiculo == 3) {
            double HyundaiHb20 = 102.00;
            double valor3 = (HyundaiHb20 * dias) + (distancia * 1.99);
            System.out.println("Valor Total: " + valor3);               
        } else {
            System.out.println("Erro na digitação das opções");
        }
{
        }
    }
}
