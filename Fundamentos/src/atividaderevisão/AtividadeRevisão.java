
package atividaderevisão;

import java.util.Scanner;

public class AtividadeRevisão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---Itens Disponiveis---\n - 1:Coxão Mole Bovino\n - 2:Linguiça Bovina\n"
                + " - 3:Linguiça Suína\n - 4:Contra Filé Bovino\n - 5:Alcatra Bife\n - 6:Costelinha Suína\n"
                + " - 7:Coxa c/ Sobrecoxa");
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n Digite o número do item escolhido: ");
        int numeroItem = entrada.nextInt();
        
        System.out.println("Digite a quantidade de kilos");
        int kilos =  entrada.nextInt();
        double valorProduto = 0.0;
        
        
        if (numeroItem == 1) {
            valorProduto = 29.99;
        } else if (numeroItem == 2) {
            valorProduto = 34.89;
        } else if (numeroItem == 3) {
            valorProduto = 48.50;
        }else if (numeroItem == 4) {
            valorProduto = 34.99;
        }else if (numeroItem == 5) {
            valorProduto = 25.00;
        }else if (numeroItem == 6) {
            valorProduto = 40.99;
        }else if (numeroItem == 7) {
            valorProduto = 20.50;
        } else {
            System.err.println("Produto não identificado!!");
        }
        
        AcougueClasse acougue = new AcougueClasse(kilos, valorProduto);
        System.out.println("---Informações do Pedido---\n"
                + "Valor do Produto: " + acougue.getValor() + "\nKilos: " + acougue.getKilos());
        acougue.calcularValorTotal();
    }
    
}
