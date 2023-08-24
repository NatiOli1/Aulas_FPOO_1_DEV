/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private int rodas;
    private String combustivel;
    private double combustivelPreco;
    private boolean ligado;
    private MarchaEnum marcha;

    public Carro(String modelo, String marca, CorEnum cor, int ano, int rodas, String combustivel, double combustivelPreco, boolean ligado, MarchaEnum marcha) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.combustivel = combustivel;
        this.combustivelPreco = 0;
        this.ligado = ligado;
        this.marcha = marcha;
    }

   
    
    public void trocaMarcha(MarchaEnum novaMarcha){
        if (ligado) {
            if (podeTrocarMarcha (novaMarcha)){
                marcha =novaMarcha;
                System.out.println("Marcha trocada para" + marcha);
            } else {
                System.out.println("Não é recomendado trocar da" + marcha + " para a " + novaMarcha.getMarchas());
            }
        } else {
            System.out.println("O carro precisa estar ligado para trocar a marcha");
        }
    }
    
    private boolean podeTrocarMarcha(MarchaEnum novaMarcha) {
        int indiceMarchaAtual = marcha.getNumeroMarcha();
        int indiceNoveMarcha = novaMarcha.getNumeroMarcha();
        
        return Math.abs(indiceNoveMarcha - indiceMarchaAtual) == 1;
    }

    
    public void calcularPrecoCombustivel(){
        if (this.combustivel.toLowerCase() == "etanol" ) {
            this.combustivel = "etanol";
            this.combustivelPreco = 4.50;
            return;
        }
        if (this.combustivel.toLowerCase() == "gasolina") {
            this.combustivel = "gasolina";
            this.combustivelPreco = 5.40;
            return;
        }
    }

    public MarchaEnum getMarcha() {
        return marcha;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + ", combustivel=" + combustivel + ", combustivelPreco=" + combustivelPreco + ", ligado=" + ligado + ", marcha=" + marcha + '}';
    }
    






    
    
    
}
