
package Atividade01;

import java.util.Scanner;


public class mediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de notas: ");
        int qtdaNotas = scanner.nextInt();
        
        double soma = 0;
        
        for (int i = 1; i <= qtdaNotas; i++) {
            System.out.println("Digite a nota" + i + ":");
            double resultado  = scanner.nextDouble();
            soma += resultado;
        }
       double media = soma /qtdaNotas;
        System.out.println("Media: " + media);
        
        scanner.close();
    }
   
}
