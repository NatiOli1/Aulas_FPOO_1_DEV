/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

/**
 *
 * @author Aluno
 */
public enum MesesEnum {
    Janeiro("Janeiro"),
    Fevereiro("Fevereiro"),
    Marco("Março"),
    Abril("Abril"),
    Maio("Maio"),
    Junho("Junho"),
    Julho("Julho"),
    Agosto("Agosto"),
    Setembro("Setembro"),
    Outubro("Outubro"),
    Novembro("Novembro"),
    Dezembro("Dezembro");
    
    private String meses;

    private MesesEnum(String meses) {
        this.meses = meses;
    }
    
    public String getMeses() {
        return this.meses;
    }
}
