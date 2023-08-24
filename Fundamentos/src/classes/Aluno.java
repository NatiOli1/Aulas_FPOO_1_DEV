/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private String email;
    private int ra;
    private double nota1;
    private double nota2;
    private double media;
    private String foiAprovado;

    public Aluno(String nome, String email, int ra, double media, String foiAprovado, double nota1, double nota2) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.foiAprovado = "Indefinido";
    }
    
    public void calcularMedia(){
        this.media = (this.nota1 + this.nota2)/2;
    }
    
    public void verificarAprovado(){
        if (media >= 5) {
            this.foiAprovado = "Aprovado";
        } else {
            this.foiAprovado = "Reprovado";
        }
        
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media + ", foiAprovado=" + foiAprovado + '}';
    }
    
 
}
