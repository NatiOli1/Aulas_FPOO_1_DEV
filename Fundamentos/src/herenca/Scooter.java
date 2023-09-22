/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenca;

/**
 *
 * @author Aluno
 */
public class Scooter extends Veiculo{
    private int potenciaBateria;

    public Scooter(int potenciaBateria, String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freiosAbs) {
        super(descricao, ano, cor, modelo, marca, valor, zerokm, freiosAbs);
        this.potenciaBateria = potenciaBateria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScooter{" + "potenciaBateria=" + potenciaBateria + '}';
    }
    
    
    
}
