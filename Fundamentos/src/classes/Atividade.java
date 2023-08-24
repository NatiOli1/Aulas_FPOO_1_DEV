/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Atividade {
    public static void main(String[] args) {
        Carro carro = new Carro("HB20", "Fiat", CorEnum.CINZA, 2013, 4, "gasolina", 0, true, MarchaEnum.PRIMEIRA_MARCHA);
        carro.calcularPrecoCombustivel();
        carro.trocaMarcha(MarchaEnum.QUARTA_MARCHA);
        System.out.println(carro);
        carro.trocaMarcha(MarchaEnum.SEGUNDA_MARCHA);
        System.out.println(carro);
        
        Aluno aluno = new Aluno("Nathalia", "nathalia@gmail.com", 2452, 0, "", 8, 7.4);
        aluno.calcularMedia();
        aluno.verificarAprovado();
        System.out.println(aluno);
    }
}
