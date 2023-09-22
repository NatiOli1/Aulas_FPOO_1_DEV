
package herenca.escola;

public class Aluno extends Pessoa{
    private String ra;
    private double nota1;
    private double nota2;
    private int faltas;
    private double media;

    public Aluno(String ra, double nota1, double nota2, int faltas, String nome, int idade, String email, String genero) {
        super(nome, idade, email, genero);
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.faltas = faltas;
    }

    @Override
    public void verificarGenero() {
        super.verificarGenero(); 
    }

   

    @Override
    public boolean verificarDominioEmailGmail(String email) {
        return super.verificarDominioEmailGmail(email);
    }

    @Override
    public boolean verificarDominioEmailYahoo(String email) {
        return super.verificarDominioEmailYahoo(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public String getEmail() {
        return super.getEmail();
    }
    
    public void calcularMedia(){
        this.media = (this.nota1 + this.nota2) / 2;
        if (this.media >= 6 && this.faltas <= 4) {
            System.out.println("Você foi aprovado!!");
        } else if (this.media >=6 && this.faltas > 4) {
            System.err.println("Você foi reprovado!!");
        }else{
            System.err.println("Você foi reprovado!!");
        }
    }
    
    public void ra(){
        System.out.println("O aluno tem: " + this.ra.length() + " caracteries");
    }
    

    @Override
    public boolean verificarMaiorDeIdade() {
        return super.verificarMaiorDeIdade();
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+ "Aluno{" + "ra=" + ra + ", nota1=" + nota1 + ", nota2=" + nota2 + ", faltas=" + faltas + ", media=" + media + '}';
    }

    

    
}
