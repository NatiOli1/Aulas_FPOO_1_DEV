/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
    TI("TI"),
    MERCENARIA("Mercenaria"),
    ARTE("Arte"),
    AGRICULTURA("Agricultura"),
    ARQUITETURA("Arquitetura");
    
    private String categorias;

    private CategoriaEnum(String categorias) {
        this.categorias = categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

 


    
    
}
