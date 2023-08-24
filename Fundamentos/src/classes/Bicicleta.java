/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {

    //Atributos, são as características da bicicleta
    private int qtdeRodas;
    private boolean temMarchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade;
    
    // construtor sem argumentos
    public Bicicleta() {
    }
    
    // construtor com argumentos
    public Bicicleta(int qtdeRodas, boolean temMarchas, int qtdeMarchas, String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "parada";
        this.velocidade = 0;
    }
    
    // Ações da bicicleta (void = não tem retorno)
   public void andar(int velocidade){
       this.situacao = "andando";
       this.velocidade = velocidade;
       //this.velocidade = this.velocidade + 2;
       
   }
   
   public void frear () {
       this.situacao = "freiando";
       this.velocidade -= 1;
   }
   
   // boolean retorna se tem ou não tem feio (true ou falso)
   public boolean verificarSeTemFreio() {
       return this.temFreio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", temMarchas=" + temMarchas + ", qtdeMarchas=" + qtdeMarchas + ", modelo=" + modelo + ", temFreio=" + temFreio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }


    
}
