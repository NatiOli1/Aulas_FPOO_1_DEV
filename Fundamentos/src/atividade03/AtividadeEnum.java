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
        
        System.out.println("Data Atual: ");
        Meses meses = new Meses(17, MesesEnum.Agosto.getMeses(), 2023);
        System.out.println(meses);
        
        System.out.println("Data de Nascimento: ");
        Meses meses2 = new Meses(11, MesesEnum.Julho.getMeses(), 2023);
        System.out.println(meses2);

        System.out.println("Livros: ");
        Livros livro = new Livros("Percy Jackson: O ladrão de raios", "Rick Riordan", CategoriaEnum.Fantasia.getCategorias(),3676);
        System.out.println(livro);
        
        Livros livro2 = new Livros("Vermelho, Branco e Sangue Azul", "Casey Mcquiston", CategoriaEnum.Romance.getCategorias(), 4543);
        System.out.println(livro2);
        
        Livros livro3 = new Livros("Suicidas", "Raphael Montes", CategoriaEnum.Suspense.getCategorias(), 1343);
        System.out.println(livro3);
        
        System.out.println("Produtos da Cantina: ");
        Produtos categoriaProdutos = new Produtos("Ruffles Original", CategoriasProdutosEnum.Salgadinho, 16.50, FormaPagamentoEnum.Debito.getCategorias());
        System.out.println(categoriaProdutos);
        
        Produtos categoriaProdutos2 = new Produtos("Bombom", CategoriasProdutosEnum.Chocolate, 2.50, FormaPagamentoEnum.Dinheiro.getCategorias());
        System.out.println(categoriaProdutos2);
        
        Produtos categoriaProdutos3 = new Produtos("Coca-Cola", CategoriasProdutosEnum.Refrigerante, 6.50, FormaPagamentoEnum.Pix.getCategorias());
        System.out.println(categoriaProdutos3);
        
        Produtos categoriaProdutos4 = new Produtos("Bala", CategoriasProdutosEnum.Doce, 0.20, FormaPagamentoEnum.Dinheiro.getCategorias());
        System.out.println(categoriaProdutos4);
        
        System.out.println("Redes sociail mais usada: ");
        RedesSociais redesSociais = new RedesSociais("Nathalia", 18, "estudante", CategoriaRedesSociaisEnum.Tiktok);
        System.out.println(redesSociais);
        
        RedesSociais redesSociais3 = new RedesSociais("Sarah", 16, "estudante", CategoriaRedesSociaisEnum.Tiktok);
        System.out.println(redesSociais3);
        
        RedesSociais redesSociais4 = new RedesSociais("Rafaella Maria", 16, "estudante", CategoriaRedesSociaisEnum.Instagram);
        System.out.println(redesSociais4);
        
        RedesSociais redesSociais5 = new RedesSociais("Cléia Oliveira", 45, "faxineira", CategoriaRedesSociaisEnum.Facebook);
        System.out.println(redesSociais5);
        
        RedesSociais redesSociais6 = new RedesSociais("Henzo", 16, "estudante", CategoriaRedesSociaisEnum.Instagram);
        System.out.println(redesSociais6);
    }
}
