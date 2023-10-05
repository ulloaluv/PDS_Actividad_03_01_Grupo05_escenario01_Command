package pds_actividad_03_01_grupo05_escenario01_command;

public class AgregarProductoCommand implements Comando {
    private Carrito carrito;
    private Producto producto;

    public AgregarProductoCommand(Carrito carrito, Producto producto) {
        this.carrito = carrito;
        this.producto = producto;
    }

    @Override
    public void ejecutar() {
        carrito.agregarProducto(producto);
    }
}
