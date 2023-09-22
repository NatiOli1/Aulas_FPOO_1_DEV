
package herenca.escola;

public class escola {
    public static void main(String[] args) {
        Professor professor = new Professor(true, "Moises", 40, "moises@gmail.com","masculino");
        professor.verificarDominioEmailGmail(professor.getEmail());
        professor.verificarDedicacaoExclusiva(professor.DedicacaoExclusiva());
        professor.verificarGenero();
        System.out.println(professor);
        
        System.out.println("\n---------------\n");
        
        Professor professor2 = new Professor(true, "Flávia", 35, "flavia@yahoo.com", "feminino");
        professor2.verificarDominioEmailYahoo(professor2.getEmail());
        professor2.verificarDedicacaoExclusiva(professor2.DedicacaoExclusiva());
        professor2.verificarGenero();
        System.out.println(professor2);
        
        System.out.println("\n---------------\n");
        
        Aluno aluno = new Aluno("bd280w", 7, 9, 3, "Nathalia", 18, "nathalia.goncalves3@gmail.com", "feminino");
        aluno.calcularMedia();
        aluno.verificarMaiorDeIdade();
        aluno.verificarDominioEmailGmail(aluno.getEmail());
        aluno.ra();
        aluno.verificarGenero();
        System.out.println(aluno);
        
        System.out.println("\n---------------\n");
        
        Aluno aluno2 = new Aluno("d34k3o", 9, 8, 5, "Sarah", 16, "sarah.christina@yahoo.com", "feminino");
        aluno2.verificarDominioEmailYahoo(aluno2.getEmail());
        aluno2.verificarGenero();
        aluno.ra();
        aluno2.verificarMaiorDeIdade();
        aluno2.calcularMedia();
        System.out.println(aluno2);
        
    }
}
