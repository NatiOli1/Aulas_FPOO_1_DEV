/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public enum ProcessadorEnum {
    CPU("CPU"),
    GPU("GPU"),
    NPU("NPU"),
    ISP("ISP"),
    INTEL_CORE("Intel Core"),
    AMD_RYZEN_PRO("AMD Ryzen Pro"),
    AMD_Ryzen("AMD Ryzen");
    
    private String processador;

    private ProcessadorEnum(String processador) {
        this.processador = processador;
    }

    public String getProcessador() {
        return this.processador;
    }
    
    
}
