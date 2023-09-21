/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeestruturadecisao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeEstruturaDecisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite 1 para semanal e digite 2 para fim de semana: ");
        int numeroDiaria = entrada.nextInt();
        boolean verdade = false;
        if (numeroDiaria == 1) {
            verdade = true;
        } else if(numeroDiaria == 2){
            verdade = false;
        }
                
       
        System.out.println("Digite o número do modelo de quarto: ");
        System.out.println("1- Basico: jantar incluso");
        System.out.println("2- Superflex: Café e Jantar incluso");
        System.out.println("3- Premium: Café e Almoço incluso");
        System.out.println("4- Master: Tudo Incluso!!");
        int numeroQuarto = entrada.nextInt();
        
        System.out.println("Digite a quantidade de dias que vai ficar: ");
        int dias = entrada.nextInt();
      
        
        Classes classes = new Classes(numeroQuarto, verdade, dias);
        classes.valorPagarEstadia();
        
        System.out.println("---Informações da Estadia---\nModelo de quarto:" + classes.getModeloQuarto() + "\n"
                + "Valor estadia: " + classes.getValorPorDia() + "\nValor Total: " + classes.getValorPagar());
    }
    
}
    