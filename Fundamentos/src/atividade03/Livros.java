/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

/**
 *
 * @author Aluno
 */
public class Livros {
    private String nome;
    private String autor;
    private String categorias;
    private long codigo;

    public Livros(String nome, String autor, String categorias, long codigo) {
        this.nome = nome;
        this.autor = autor;
        this.categorias = categorias;
        this.codigo = codigo;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Categorias{" + "nome=" + nome + ", autor=" + autor + ", categorias=" + categorias + ", codigo=" + codigo + '}';
    } 
}
