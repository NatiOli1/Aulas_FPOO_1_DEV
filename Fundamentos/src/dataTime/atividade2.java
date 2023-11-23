/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
/**
 *
 * @author Aluno
 */
public class atividade2 {
    public static void main(String[] args) {
        
    LocalDate hoje = LocalDate.now();
    
    int dia = hoje.getDayOfMonth();
    int mes = hoje.getMonthValue();
    int ano = hoje.getYear();
    
    String data = String.format("Hoje é dia %d do mês %d, ano %d", dia,mes,ano);
    System.out.print(data);
    
    Locale localeBrasil = Locale.of("pt","BR");
    
    String mesPorExtenso = hoje.getMonth().getDisplayName(TextStyle.FULL, localeBrasil);
    String dataPorExtenso = String.format("Hoje é dia %d do mês %s, ano %d", dia, mesPorExtenso, ano);
    System.out.println(dataPorExtenso);
    
    LocalDate dataFutura = hoje.plusDays(10);
    LocalDate dataPassada = hoje.minusDays(50);
    
    int comparaDatas  = hoje.compareTo(dataFutura);
    System.out.print(comparaDatas);
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatadaPadraoPtBr = hoje.format(formatter);
    
    System.out.println("Data Formatada: " + dataFormatadaPadraoPtBr);
        
    String diaAnoNovo = "01/01/2024";
    LocalDate dataAltoNivel = LocalDate.parse(diaAnoNovo, formatter);
    System.out.print("Data Alto nivel: " +  dataAltoNivel);
            }
}
