/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeestruturadecisao;



/**
 *
 * @author Aluno
 */
public class Classes {
    private String modeloQuarto;
    private int numeroModelo;
    private double valorPorDia;
    private boolean cafeIncluso;
    private boolean almocoIncluso;
    private boolean jantarIncluso;
    private String SegundaSexta;
    private String SabadoDomingo;
    private double valorPagar;
    private double valorCafe;
    private double valorAlmoco;
    private double valorJantar;
    private boolean diariaSemanal;
    private int dias;

    public Classes(int numeroModelo, boolean diariaSemanal, int dias) {
        this.numeroModelo = numeroModelo;
        this.diariaSemanal = diariaSemanal;
        this.dias = dias;
        this.valorCafe = 29.99;
        this.valorAlmoco = 69.99;
        this.valorJantar = 59.99;
        
    }
    
    public void valorPagarEstadia(){
        if (diariaSemanal = true) {
            if (numeroModelo == 1) {
            this.modeloQuarto = "Basico";
            this.valorPorDia = 89.90 * this.dias;
            this.cafeIncluso = false;
            this.almocoIncluso = false;
            this.jantarIncluso = true;
            
            this.valorPagar = this.valorPorDia + this.valorJantar;
            Math.round(this.valorPagar);

            
        } else if (numeroModelo == 2) {
            this.modeloQuarto = "Superflex";
            this.valorPorDia = 109.90 * this.dias;
            this.cafeIncluso = true;
            this.almocoIncluso = false;
            this.jantarIncluso = true;
            
            this.valorPagar = this.valorPorDia + this.valorJantar + valorCafe;
            Math.round(this.valorPagar);


        } else if (numeroModelo == 3) {
            this.modeloQuarto = "Premium";
            this.valorPorDia = 199.90 * this.dias;
            this.cafeIncluso = true;
            this.almocoIncluso = true;
            this.jantarIncluso = false;
            
            this.valorPagar = this.valorPorDia + this.valorAlmoco + valorCafe;
            Math.round(this.valorPagar);

  
            } else if (numeroModelo == 4) {
            this.modeloQuarto = "Master";
            this.valorPorDia = 259.90 * this.dias;
            this.cafeIncluso = true;
            this.almocoIncluso = true;
            this.jantarIncluso = true;
            
            this.valorPagar = this.valorPorDia + this.valorAlmoco + valorCafe + valorJantar;
            Math.round(this.valorPagar);

            
            }
        } else if (diariaSemanal == false) {
            if (numeroModelo == 1) {
            this.modeloQuarto = "Basico";
            this.valorPorDia = 109.90 * this.dias;
            this.cafeIncluso = false;
            this.almocoIncluso = false;
            this.jantarIncluso = true;
            
            this.valorPagar = this.valorPorDia + this.valorJantar;
            Math.round(this.valorPagar);
 

            }else if (numeroModelo == 2) {
            this.modeloQuarto = "Superflex";
            this.valorPorDia = 139.90 * this.dias;
            this.cafeIncluso = true;
            this.almocoIncluso = false;
            this.jantarIncluso = true;
            
            this.valorPagar = this.valorPorDia + this.valorJantar + valorCafe;
            Math.round(this.valorPagar);
 

            }else if (numeroModelo == 3) {
            this.modeloQuarto = "Premium";
            this.valorPorDia = 229.90 * this.dias;
            this.cafeIncluso = true;
            this.almocoIncluso = true;
            this.jantarIncluso = false;
            
            this.valorPagar = this.valorPorDia + this.valorAlmoco + this.valorCafe;
            Math.round(this.valorPagar);

            
   
            }else if (numeroModelo == 4) {
            this.modeloQuarto = "Master";
            this.valorPorDia = 299.90 * this.dias;
            this.cafeIncluso = true;
            this.almocoIncluso = true;
            this.jantarIncluso = true;
            
            this.valorPagar = this.valorPorDia + this.valorJantar +this.valorCafe + this.valorAlmoco;
            Math.round(this.valorPagar);
            System.out.println(this.valorPagar);

            }

        }else {
            System.err.println("Ocorreu algum erro!!");
        }

         
         
        
    }

    public String getModeloQuarto() {
        return modeloQuarto;
    }

    public double getValorPorDia() {
        return valorPorDia;
    }

    public double getValorPagar() {
        return valorPagar;
    }
}
