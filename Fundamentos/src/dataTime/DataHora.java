/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Aluno
 */
public class DataHora {
    LocalDate hoje = LocalDate.now();
    
    LocalDateTime agora = LocalDateTime.now();
    
    LocalDate diaNatalAnoAnterior = LocalDate.of(2022,12,25);
    
    LocalDateTime horarioCeiaNatalAnoAnterior = LocalDateTime.of(2022,12,25,22, 30);
}
