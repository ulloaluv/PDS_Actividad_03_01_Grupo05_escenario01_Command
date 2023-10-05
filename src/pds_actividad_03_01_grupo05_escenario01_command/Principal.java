package pds_actividad_03_01_grupo05_escenario01_command;

public class Principal {

    public static void main(String[] args) {
        // Crear instancias de Carrito y Pedido
        Carrito carrito = new Carrito();
        Pedido pedido = new Pedido();

        // Crear algunos productos
        Producto producto1 = new Producto("Computador", 1200.0);
        Producto producto2 = new Producto("Escritorio", 300.0);

        // Crear comandos
        Comando agregarProducto1 = new AgregarProductoCommand(carrito, producto1);
        Comando agregarProducto2 = new AgregarProductoCommand(carrito, producto2);
        Comando realizarPedido = new RealizarPedidoCommand(pedido);

        // Crear historial de comandos
        HistorialComandos historial = new HistorialComandos();

        // Ejecutar comandos y mantener un historial
        historial.ejecutarComando(agregarProducto1);
        historial.ejecutarComando(agregarProducto2);
        historial.ejecutarComando(realizarPedido);

        // Mostrar el carrito y el pedido resultante
        carrito.mostrarCarrito();
    }
    
}
