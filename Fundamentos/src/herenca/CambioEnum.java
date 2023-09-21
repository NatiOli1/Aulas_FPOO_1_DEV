/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenca;

/**
 *
 * @author Aluno
 */
public enum CambioEnum {
    AUTOMATICO("Automático"),
    MANUAL("Manual");
    
    private String TipoCambio;

    private CambioEnum(String TipoCambio) {
        this.TipoCambio = TipoCambio;
    }

    public String getTipoCambio() {
        return this.TipoCambio;
    }
    
    
}
