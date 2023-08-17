/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

/**
 *
 * @author Aluno
 */
public class Produtos {
    private String nome;
    private CategoriasProdutosEnum categoriaProduto;
    private double preco;
    private String pagamento;

    public Produtos(String nome, CategoriasProdutosEnum categoriaProduto, double preco, String pagamento) {
        this.nome = nome;
        this.categoriaProduto = categoriaProduto;
        this.preco = preco;
        this.pagamento = pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    

    @Override
    public String toString() {
        return "Produtos{" + "nome=" + nome + ", categoriaProduto=" + categoriaProduto + ", preco=" + preco + ", pagamento=" + pagamento + '}';
    }


    
    
    
    
    
}
