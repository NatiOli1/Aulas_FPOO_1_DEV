/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum MarchaEnum {
    PRIMEIRA_MARCHA("Primeiro marcha", 1),
    SEGUNDA_MARCHA("Segunda Marcha", 2),
    TERCEIRA_MARCHA("Terceira Marcha", 3),
    QUARTA_MARCHA("Quarta Marcha", 4),
    QUINTA_MARCHA("Quinta Marcha",5),
    MARCHA_RE("Marcha Ré", -1),
    MARCHA_NEUTRO("Marcha Neutra", 0);
    
    private String marchas;
    private int numeroMarcha;

    private MarchaEnum(String marchas, int numeroMarcha) {
        this.marchas = marchas;
        this.numeroMarcha = numeroMarcha;
    }

    public String getMarchas() {
        return this.marchas;
    }

    public int getNumeroMarcha() {
        return numeroMarcha;
    }
    
    
    
    
}
