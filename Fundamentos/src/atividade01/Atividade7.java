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
public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de kWh consumidos: ");
        int consumoKwh = scanner.nextInt();

        System.out.print("Digite o tipo de instalação (R para residência, I para indústria, C para comércio): ");
        char tipoInstalacao = scanner.next().charAt(0);

        double precoPorKwh;

        switch (tipoInstalacao) {
            case 'R':
                if (consumoKwh <= 500) {
                    precoPorKwh = 0.40;
                } else {
                    precoPorKwh = 0.65;
                }
                break;

            case 'I':
                if (consumoKwh <= 1000) {
                    precoPorKwh = 0.55;
                } else {
                    precoPorKwh = 0.60;
                }
                break;

            case 'C':
                if (consumoKwh <= 5000) {
                    precoPorKwh = 0.55;
                } else {
                    precoPorKwh = 0.60;
                }
                break;

            default:
                System.out.println("Tipo de instalação inválido");
                return;
        }

        double precoTotal = consumoKwh * precoPorKwh;
        System.out.println("O valor a ser pago é: R$" + precoTotal);
    }
}
