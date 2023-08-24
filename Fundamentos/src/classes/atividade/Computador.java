/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Computador {
    private boolean computador;
    private MemoriaEnum memoria;
    private ProcessadorEnum processador;
    private int discoRigido;
    private String sistemaOperacional;

    public Computador(boolean computador, MemoriaEnum memoria, ProcessadorEnum processador, int discoRigido, String sistemaOperacional) {
        this.computador = computador;
        this.memoria = memoria;
        this.processador = processador;
        this.discoRigido = discoRigido;
        this.sistemaOperacional = sistemaOperacional;
    }

    

    public void computadorLigado(){
        if (computador = true) {
            System.out.println("O computador está ligando"); 
        }
    }
    
    public void sistemaOperacional(){
        if (computador) {
            if(sistemaOperacional == "Windows"){
                System.out.println("Você está usando o Sistema Opercial Windows!!");
            }
            if(sistemaOperacional == "Linux"){
                System.out.println("Você está usando o Sistema Opercial Linux!!");
            }
            if(sistemaOperacional == "macOS"){
                System.out.println("Você está usando o Sistema Opercial macOS!!");
            }
            if(sistemaOperacional == "UNIX"){
                System.out.println("Você está usando o Sistema Opercial macOS!!");
            }
        } else {
            System.out.println("Sistema Operacionao não identifacado");
        }

    }

    public void setMemoria(MemoriaEnum memoria) {
        this.memoria = memoria;
    }

    public void setProcessador(ProcessadorEnum processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Computador{" + "computador=" + computador + ", memoria=" + memoria + ", processador=" + processador + ", discoRigido=" + discoRigido + ", sistemaOperacional=" + sistemaOperacional + '}';
    }

 
    
    
}
