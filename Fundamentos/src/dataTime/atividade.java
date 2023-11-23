/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataTime;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class atividade {
    public static void main(String[] args) {
        LocalDate hj = LocalDate.of(2023, Month.NOVEMBER, 23);
        
        String mensagem = "Hoje é dia " + hj.getDayOfMonth() + " do mês " + hj.getMonth() + " ano " + hj.getYear();
        System.out.println(mensagem);
      
        
    }
}
