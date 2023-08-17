/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

/**
 *
 * @author Aluno
 */
public class AtividadeEnum {
    public static void main(String[] args) {
        Meses meses = new Meses(17, MesesEnum.Agosto.getMeses(), 2023);
        System.out.println(meses);
        
        Livros categorias = new Livros("Percy Jackson", "Rick Riordan", CategoriaEnum.Fantasia.getCategorias(), 1354);
        System.out.println(categorias);
        
        Produtos categoriaProdutos = new Produtos("Ruffles Original", CategoriasProdutosEnum.Salgadinho, 16.50, FormaPagamentoEnum.Dinheiro.getCategorias());
        System.out.println(categoriaProdutos);
        
        RedesSociais redesSociais = new RedesSociais("Nathalia", 18, "estudante", CategoriaRedesSociaisEnum.Tiktok);
        System.out.println(redesSociais);
    }
}
