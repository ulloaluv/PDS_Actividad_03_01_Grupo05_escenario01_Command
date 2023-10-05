package pds_actividad_03_01_grupo05_escenario01_command;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al carrito: " + producto.getNombre());
    }

    public void mostrarCarrito() {
        System.out.println("Productos en el carrito:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
    }
}