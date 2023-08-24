/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Atividade {
    public static void main(String[] args) {
       Sala sala = new Sala(20, 32, 5, true, 10);
       sala.quantidadeCadeiraMesas();
       sala.verificarSeTemProjetor();
        System.out.println(sala);
      Sala sala2 = new Sala(32, 45, 9, false, 20);
      sala.quantidadeCadeiraMesas();
      sala.verificarSeTemProjetor();
        System.out.println(sala2);
        
        System.out.println("-----------------");
        
        Computador computador = new Computador(true, MemoriaEnum.EPROM, ProcessadorEnum.INTEL_CORE, 80, "Windows");
        computador.computadorLigado();
        computador.sistemaOperacional();
        System.out.println(computador);
        
        System.out.println("-----------------");
        
        Curso curso = new  Curso("Desenvolvimento De Sistemas", "", CategoriaEnum.MERCENARIA, true);
        curso.cursoPago();
        curso.descricaoVazia();
        System.out.println(curso);
    }
}
