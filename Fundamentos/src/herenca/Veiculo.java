
package herenca;

public class Veiculo {
    private String descricao;
    private  int ano;
    private String cor;
    private String modelo;
    private String marca;
    private double valor;
    private boolean zerokm;
    private boolean freiosAbs;

    public Veiculo(String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freiosAbs) {
        this.descricao = descricao;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.zerokm = zerokm;
        this.freiosAbs = freiosAbs;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "descricao=" + descricao + ", ano=" + ano + ", cor=" + cor + ", modelo=" + modelo + ", marca=" + marca + ", valor=" + valor + ", zerokm=" + zerokm + ", freiosAbs=" + freiosAbs + '}';
    }
    
    
    
}
