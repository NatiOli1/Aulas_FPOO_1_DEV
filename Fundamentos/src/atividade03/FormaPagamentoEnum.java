/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

/**
 *
 * @author Aluno
 */
public enum FormaPagamentoEnum {
    Dinheiro("Dinheiro"),
    Debito("Débito"),
    Credito("Crédito"),
    Pix("Pix");
    
    private String pagamento;
    
    private FormaPagamentoEnum(String pagamento) {
        this.pagamento = pagamento;
    }
    
    public String getCategorias() {
        return this.pagamento;
    }
    
}
