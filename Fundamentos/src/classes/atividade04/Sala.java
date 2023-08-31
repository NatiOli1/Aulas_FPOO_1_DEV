/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade04;

/**
 *
 * @author Aluno
 */
public class Sala {
    private int cadeiras;
    private int mesas;
    private int numeroSala;
    private boolean temProjetor;
    private int computadores;

    public Sala(int cadeiras, int mesas, int numeroSala, boolean temProjetor, int computadores) {
        this.cadeiras = cadeiras;
        this.mesas = mesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.computadores = computadores;
    }
    
    public void quantidadeCadeiraMesas(){
        if (this.mesas < 32){
            System.out.println("Está faltando mesas na sala!!");
        }
        if (this.cadeiras < 32) {
            System.out.println("Está faltando cadeiras na Sala!!");
        }
    }
    
      public boolean verificarSeTemProjetor() {
       return this.temProjetor;
    }

    @Override
    public String toString() {
        return "sala{" + "cadeiras=" + cadeiras + ", mesas=" + mesas + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", computadores=" + computadores + '}';
    }
    
    
    
    
    
    
}
