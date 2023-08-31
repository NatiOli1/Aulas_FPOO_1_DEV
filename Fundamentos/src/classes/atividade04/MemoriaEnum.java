/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade04;

/**
 *
 * @author Aluno
 */
public enum MemoriaEnum {
    DRAM("DRAM"),
    SRAM("SRAM"),
    ROM("ROM"),
    EPROM("EPROM"),
    CMOS("CMOS"),
    EEPROM("EEPROM"),
    MRAM("MRAM");
    
    private String memoria;

    private MemoriaEnum(String memoria) {
        this.memoria = memoria;
    }

    public String getMemoria() {
        return this.memoria;
    }
    
    
}
