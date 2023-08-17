
package enumeracao;

/**
 *
 * @author Aluno
 */
public enum StatusEnum {
    EM_PREPARACAO("Em Preparação"),
    EM_TRANSPORTE("Em Transporter"),
    Entregue("Entregue ao cliente");
    
    private String status;
    
    private StatusEnum(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
}
