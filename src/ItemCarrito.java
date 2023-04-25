public class ItemCarrito {
    Producto producto;
    int cantidad;
    public double precio() {
        if(producto.esDigital) {
            return this.cantidad * this.producto.getPrecioVentaDigital();
        }else return this.cantidad * this.producto.precioVentaFisico;
    }

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
