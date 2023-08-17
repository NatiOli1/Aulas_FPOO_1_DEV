/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
    Romance("Romance"),
    Misterio("Mistério"),
    Ficcao_Cientifica("Ficção Científica"),
    Fantasia("Fantasia"),
    Suspense("Suspense");
    
    private String categorias;

    private CategoriaEnum(String categorias) {
        this.categorias = categorias;
    }
    
    public String getCategorias() {
        return this.categorias;
    }
}
