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
public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Digite o nome do produto:");
        String nomeProdto = scanner.nextLine();

     
        System.out.println("Digite o valor do produto:");
        double valorProdto = scanner.nextDouble();

       
        System.out.println("Digite a quantidade do produto:");
        int qtdeProdto = scanner.nextInt();

       
        double valorTotal = valorProdto * qtdeProdto;

      
        System.out.println("Digite a forma de pagamento C(credito) ou D(debito):");
        String formaPagamento = scanner.next();
        
      
        if (formaPagamento.equalsIgnoreCase("D")) {
            if (valorTotal <= 100.0) {
                valorTotal = valorTotal - (valorTotal * 0.05) ;
            } else {
                valorTotal = valorTotal - (valorTotal * 0.03) ;
            }
        }

        if (formaPagamento.equalsIgnoreCase("C")) {
            System.out.println("Digite a quantidade de parcelas:");
            int qtdeParcela = scanner.nextInt();
            double valorParcela = valorTotal / qtdeParcela;
            System.out.println("Valor da parcela:" + valorParcela);
        }
        else {
            System.out.println("Forma de pagamento inválida");
        }

     
        System.out.println("Nome do produto:" + nomeProdto);
        System.out.println("Valor do produto:" + valorProdto);
        System.out.println("Quantidade:" + qtdeProdto);
        System.out.println("Valor total:" + valorTotal);

      
        scanner.close();
    }
    
}
