package pds_actividad_03_01_grupo05_escenario01_command;

public class RealizarPedidoCommand implements Comando {
    private Pedido pedido;

    public RealizarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void ejecutar() {
        pedido.realizarPedido();
    }
}