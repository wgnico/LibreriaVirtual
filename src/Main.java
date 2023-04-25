import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Genero Productos
        Libro caperusita = new Libro("la caperusita roja", "tobias",new Date(1989,2,11), "laGarza", "131231312313", 200.50,true);
        Revista ole = new Revista("revista ole", new Date(2022,10,22),"Geremias",50,"133333333");
        Libro asdasd = new Libro("asdasd","nicolas",new Date(2020,2,2),"loreouse","12121212",222,true);

        //Genero Carrito de Compras
        CarritoDeCompras carrito = new CarritoDeCompras();

        //Genero Items
        ItemCarrito i1 = new ItemCarrito(caperusita,2);
        ItemCarrito i2 = new ItemCarrito(ole, 3);
        ItemCarrito i3 = new ItemCarrito(asdasd,1);

        carrito.agregarItem(i1);
        carrito.agregarItem(i2);

        carrito.mostrarCarrito();

        /*carrito.eliminarProducto(caperusita);

        carrito.mostrarCarrito();

        carrito.agregarProducto(asdasd);

        carrito.mostrarCarrito();*/

    }
}