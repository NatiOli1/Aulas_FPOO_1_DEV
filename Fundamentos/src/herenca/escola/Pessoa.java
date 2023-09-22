
package herenca.escola;

public class Pessoa implements ValidaPessoa{
    private String nome;
    private int idade;
    private String email;
    private String genero;

    public Pessoa(String nome, int idade, String email, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.genero = genero;
    }

    public boolean  verificarMaiorDeIdade(){
        if (this.idade >= 18) {
            System.out.println("Você é maior de idade!!");
            return true;
        }else {
            System.out.println("Você não é maior de idade!!");
            return false;
        }
    }
    
    public void verificarGenero(){
        if (this.genero == "feminino") {
            System.out.println("Mulher");
        } else if (this.genero == "masculino") {
            System.out.println("Homem!!");
        }else{
            System.err.println("gênero não reconhecido");
        }
{
            
        }
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", email=" + email + ", genero=" + genero + '}';
    }


    @Override
    public boolean verificarDominioEmailGmail(String email) {
        if (this.email.contains("@gmail.com")) {
            System.out.println("Seu email é gmail.com!");
            System.out.println("Seu email é válido!");
            return true;
        }else{
            System.out.println("Seu email não válido!");
            return false;
        }
    }

    @Override
    public boolean verificarDominioEmailYahoo(String email) {
        if (this.email.contains("@yahoo.com")) {
            System.out.println("Seu email é yahoo.com!");
            System.out.println("Seu email é válido!");
            return true;
        }else{
            System.out.println("Seu email não válido!");
            return false;
        }
    }

    @Override
    public boolean verificarDedicacaoExclusiva(boolean dedicacaoExclusiva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
