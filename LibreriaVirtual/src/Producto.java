import java.util.Date;

public abstract class Producto {
    protected String codigo;
    protected double costo;
    protected Date fechaPublicacion;
    protected double precioVentaFisico;
    protected double precioVentaDigital;
    protected boolean esDigital;

    public Producto() {
    }

    public double getPrecioVentaFisico() {
        return precioVentaFisico;
    }
    protected void setPrecioVentaFisico(double precioVentaFisico) {
        this.precioVentaFisico = precioVentaFisico;
    }

    public double getPrecioVentaDigital() {
        return precioVentaDigital;
    }

    protected void setPrecioVentaDigital(double precioVentaDigital) {
        this.precioVentaDigital = precioVentaDigital;
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioCompra() {
        return costo;
    }

    protected void setPrecioCompra(double precioCompra) {
        this.costo = precioCompra;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    private void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    protected abstract double calcularPrecio();

    public String toString(){
        return "Codigo: " + codigo;
    }
}





