/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividaderevisão;

import java.text.DecimalFormat;

/**
 *
 * @author Aluno
 */
public class AcougueClasse {
    private int desconto;
    private int kilos;
    private double valor;
    private double valorDesconto;
    private double valorTotal;
    
    public AcougueClasse(int kilos, double valor) {
        this.kilos = kilos;
        this.valor = valor;
    }

    public int getKilos() {
        return kilos;
    }

    public double getValor() {
        return valor;
    }
    
    public void calcularValorTotal(){
        this.valorTotal = this.kilos * this.valor;
        if (this.valorTotal >= 150.00) {
            this.desconto = 15 / 100;
            this.valorDesconto = this.desconto * this.valorTotal;
            this.valorTotal = this.valorTotal - this.valorDesconto;
            System.out.println("Valor total: " + Math.round(this.valorTotal));
            System.out.println("Teve desconto!!");
        } else{
            System.out.println("Valor total: " + this.valorTotal);
            System.out.println("Não teve desconto");
        }

    }
    
}
