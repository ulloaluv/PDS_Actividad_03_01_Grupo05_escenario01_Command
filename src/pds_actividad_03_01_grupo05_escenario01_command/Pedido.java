package pds_actividad_03_01_grupo05_escenario01_command;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void realizarPedido() {
        System.out.println("Pedido realizado con los siguientes productos:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
    }
}