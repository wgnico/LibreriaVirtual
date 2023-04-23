import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<Producto> productos = new ArrayList<>();
    Producto producto;

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Se a agregado correctamente al carrito: " + producto.getCodigo()+".\n");
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        System.out.println("Se a eliminado de tu carrito: " + producto.getCodigo()+".\n");
    }
    public double calcularCarrito(){
        double total = 0;
        for (Producto producto : productos){
            total += producto.calcularPrecio();
        }
        return  total;
    }

    public void mostrarCarrito(){
        for (Producto producto : productos){
            System.out.println(producto.toString());
            System.out.println();;
        }
        System.out.println("\nEl Total del carrito es $" +calcularCarrito()+".\n");

    }


}
