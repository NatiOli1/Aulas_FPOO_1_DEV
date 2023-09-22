/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenca.escola;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa implements ValidaPessoa{
    private boolean dedicacaoExclusiva;

    public Professor(boolean dedicacaoExclusiva, String nome, int idade, String email, String genero) {
        super(nome, idade, email, genero);
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    @Override
    public void verificarGenero() {
        super.verificarGenero();
    }

    @Override
    public boolean verificarDominioEmailYahoo(String email) {
        return super.verificarDominioEmailYahoo(email); 
    }
    

    @Override
    public boolean verificarDominioEmailGmail(String email) {
        return super.verificarDominioEmailGmail(email);
    }

    @Override
    public String getEmail() {
        return super.getEmail(); 
    }
    
    
    

    @Override
    public String toString() {
        return super.toString() + "\n" + "Professor{" + "dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }

    @Override
    public boolean verificarDedicacaoExclusiva(boolean dedicacaoExclusiva) {
        if (dedicacaoExclusiva == true) {
            System.out.println("O professor tem dedicação exclusiva");
            return true;
        }else{
            System.out.println("O professor não tem dedicação");
            return false;
        }
    }

    public boolean DedicacaoExclusiva() {
        return dedicacaoExclusiva;
    }
    
    
    
           
}
