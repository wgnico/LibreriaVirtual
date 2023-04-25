import java.util.Date;

public class Libro extends Producto{
    private String titulo;
    private String autor;
    private String editorial;


    public Libro(String titulo, String autor, Date fechaPublicacion, String editorial, String codigo, double costo, boolean esDigital) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        super.fechaPublicacion = fechaPublicacion;
        super.codigo = codigo;
        super.costo = costo;
        super.esDigital = esDigital;
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    private void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    protected double calcularPrecio() {
        if (this.esDigital){
            this.precioVentaDigital = costo*1.08;
            return precioVentaDigital;
        }else{
            this.precioVentaFisico = costo*1.18;
            return precioVentaFisico;
        }

    }

    public String toString(){
        return super.toString() + ".\nNombre de la editorial: " + editorial + "." +
                "\nTitulo del libro: " + titulo + "." +
                "\nAutor del libro: " + autor + "." +
                "\nEl precio en el formato elegido es: $" + calcularPrecio();
    }
}
