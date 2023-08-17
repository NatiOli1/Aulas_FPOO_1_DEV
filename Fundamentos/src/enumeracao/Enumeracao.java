
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Enumeracao {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Usuario 01", "usuario@gmail.com", true, TipoUsuarioEnum.TECNICO);
        System.out.println(usuario);
        
        Pedido pedido = new Pedido("Pedido do usuario 01", 29.99, StatusEnum.EM_PREPARACAO.getStatus());
        System.out.println(pedido);
        pedido.setStatus(StatusEnum.EM_TRANSPORTE.getStatus());
        System.out.println(pedido);
        pedido.setStatus(StatusEnum.Entregue.getStatus());
        System.out.println(pedido);
    }
}
