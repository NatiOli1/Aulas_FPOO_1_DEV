/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade04;

/**
 *
 * @author Aluno
 */
public class Curso {
    private String nome;
    private String descricao;
    private CategoriaEnum categorias;
    private boolean cursoPG;

    public Curso(String nome, String descricao, CategoriaEnum categorias, boolean cursoPG) {
        this.nome = nome;
        this.descricao = descricao;
        this.categorias = categorias;
        this.cursoPG = cursoPG;
    }

    public void cursoPago(){
        if (cursoPG = true) {
            System.out.println("Seu curso é pago");
        } else {
            System.out.println("Seu curso é gratuito");
        }
    }
    public void descricaoVazia() {
        if (descricao == "") {
            System.out.println("Descrição está vazia!");
        }
    }

    public void setCategorias(CategoriaEnum categorias) {
        this.categorias = categorias;
    }
    

    @Override
    public String toString() {
        return "curso{" + "nome=" + nome + ", descricao=" + descricao + ", categorias=" + categorias + ", cursoPG=" + cursoPG + '}';
    }     
}
