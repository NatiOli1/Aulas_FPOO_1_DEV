
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicletaria {
    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true, 8, "Caloi Cross", true, "vermelho");
        System.out.println(caloiCross);
        
        caloiCross.andar(10);
        caloiCross.andar(20);
        caloiCross.andar(30);
        
        System.out.println(caloiCross);
    }
}
