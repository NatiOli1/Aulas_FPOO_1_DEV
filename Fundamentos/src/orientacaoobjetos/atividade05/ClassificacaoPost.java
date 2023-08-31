/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package orientacaoobjetos.atividade05;

/**
 *
 * @author Aluno
 */
public interface ClassificacaoPost {
    public int UMA_ESTRELA = 1;
    public int TRES_ESTRELA = 3;
    public int CINCO_ESTRELAS = 5;
    
    public boolean avaliarEstrelaPost(int ClassificacaoPost);
    public boolean validarConteudo(String conteudo);
    public boolean verificarComentario(String comentario);

}
