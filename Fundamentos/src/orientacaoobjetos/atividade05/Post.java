/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividade05;

/**
 *
 * @author Aluno
 */
public class Post implements ClassificacaoPost{
    private String titulo;
    private String conteudo;
    private String comentario;
    private int ClassificacaoPost;

    public Post(String titulo, String conteudo, String comentario, int ClassificacaoPost) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.comentario = comentario;
        this.ClassificacaoPost = ClassificacaoPost;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getComentario() {
        return comentario;
    }

    public int getClassificacaoPost() {
        return ClassificacaoPost;
    }

    @Override
    public String toString() {
        return "Post{" + "titulo=" + titulo + ", conteudo=" + conteudo + ", comentario=" + comentario + ", ClassificacaoPost=" + ClassificacaoPost + '}';
    }
    

    @Override
    public boolean avaliarEstrelaPost(int ClassificacaoPost){
        if (ClassificacaoPost == UMA_ESTRELA) {
            System.out.println("Avaliação Comum");
            return true;
        }
        if (ClassificacaoPost == TRES_ESTRELA) {
            System.out.println("Avaliação Legal");
            return true;
        }
        if (ClassificacaoPost == CINCO_ESTRELAS) {
            System.out.println("Avaliação Super Legal");
            return true;
        } else{
            System.out.println("Avaliação não identificada");
            return false;
        }
    }
    @Override
    public boolean validarConteudo(String conteudo){
        if (conteudo.length() > 150) {
            System.out.println("Atingiu limite de caracteres");
            return true;
        } else {
            System.out.println("Está dentro do limite de caracteres");
            return false;
        }
    }
    
    @Override
    public boolean verificarComentario(String comentario){
        if (comentario.length() == 0) {
            System.out.println("Não possui comentario");
            return true;
        } else {
            System.out.println("Este post tem comentarios");
            return false;
        }
    }
    
}
