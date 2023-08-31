/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividade05;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[] args) {
        Post post1 = new Post("Meu Primeiro Post", "Sou estudante de Java","", 1);
        System.out.println(post1);
        post1.avaliarEstrelaPost(post1.getClassificacaoPost());
        post1.validarConteudo(post1.getConteudo());
        post1.verificarComentario(post1.getComentario());
        
        System.out.println("\n");
        Post post2 = new Post("Aprendendo Interfaces", "Uma interface na linguagem de programação Java é um tipo abstrato usado para declarar um comportamento que as classes devem implementar. Eles são semelhantes aos protocolos. "
                + "As interfaces são declaradas usando a palavra-chave interface e "
                + "podem conter apenas assinatura de método e declarações constantes. ","Estou aprendendo", 5);
        System.out.println(post2);
        post2.avaliarEstrelaPost(post2.getClassificacaoPost());
        post2.validarConteudo(post2.getConteudo());
        post2.verificarComentario(post2.getComentario());
        
        System.out.println("\n");
        Post post3 = new Post("Meu terceiro post", "","Post sem conteudo", 0);
        System.out.println(post3);
        post3.avaliarEstrelaPost(post3.getClassificacaoPost());
        post3.validarConteudo(post3.getConteudo());
        post3.verificarComentario(post3.getComentario());
        
        System.out.println("\n");
        Post post4 = new Post("Classes", "Um arquivo de classe Java é um arquivo contendo bytecode "
                + "Java que pode ser executado na Java Virtual Machine. ","", 3);
        System.out.println(post4);
        post4.avaliarEstrelaPost(post4.getClassificacaoPost());
        post4.validarConteudo(post4.getConteudo());
        post4.verificarComentario(post4.getComentario());
    }
}
