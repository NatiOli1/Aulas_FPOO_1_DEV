/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenca;

/**
 *
 * @author Aluno
 */
public class Carro extends Veiculo{
    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    public Carro(String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freiosAbs,int qtdePortas, CambioEnum cambioEnum, CombustivelEnum combustivelEnum) {
        super(descricao, ano, cor, modelo, marca, valor, zerokm, freiosAbs);
        
        this.qtdePortas = qtdePortas;
        this.modeloCambio = cambioEnum.getTipoCambio();
        this.combustivel = combustivelEnum.getTipoCombustivel();
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "\n" + "Carro{" + "qtdePortas=" + qtdePortas + ", modeloCambio=" + modeloCambio + ", combustivel=" + combustivel + '}';
    }
    
}
