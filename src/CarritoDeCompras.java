import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<ItemCarrito> itemCarritos = new ArrayList<>();
    ItemCarrito itemCarrito;

    public void agregarItem(ItemCarrito itemCarrito) {
        itemCarritos.add(itemCarrito);
        System.out.println("Se ha agregado correctamente al carrito: \n" + itemCarrito.producto.toString()+".\n");
    }

    public void eliminarItem(ItemCarrito itemCarrito) {
        itemCarritos.remove(itemCarrito);
        System.out.println("Se ha eliminado de tu carrito: \n" + itemCarrito.producto.toString()+".\n");
    }
    public double calcularCarrito(){
        double total = 0;
        for (ItemCarrito itemCarrito : itemCarritos){
            total += itemCarrito.precio();
        }
        return  total;
    }

   public void mostrarCarrito(){
        for (ItemCarrito itemCarrito : itemCarritos){
            System.out.println(itemCarrito.producto.toString());
            System.out.println();;
        }
        System.out.println("\nEl Total del carrito es $" +calcularCarrito()+".\n");

    }


}
