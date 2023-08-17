/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

/**
 *
 * @author Aluno
 */
public class RedesSociais {
    private String nome;
    private int idade;
    private String emprego;
    private CategoriaRedesSociaisEnum redeSocialUsada;

    public RedesSociais(String nome, int idade, String emprego, CategoriaRedesSociaisEnum redeSocialUsada) {
        this.nome = nome;
        this.idade = idade;
        this.emprego = emprego;
        this.redeSocialUsada = redeSocialUsada;
    }

    @Override
    public String toString() {
        return "RedesSociais{" + "nome=" + nome + ", idade=" + idade + ", emprego=" + emprego + ", redeSocialUsada=" + redeSocialUsada + '}';
    }

    

    
    
}
