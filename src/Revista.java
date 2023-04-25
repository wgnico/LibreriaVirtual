import java.util.Date;

public class Revista extends Producto {
    private String nombre;
    private String editor;

    public Revista(String nombre, Date fechaPublicacion, String editor, double costo ,String codigo) {
        this.nombre = nombre;
        super.fechaPublicacion = fechaPublicacion;
        this.editor = editor;
        super.codigo = codigo;
        super.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditor() {
        return editor;
    }

    private void setEditor(String editor) {
        this.editor = editor;
    }


    @Override
    protected double calcularPrecio() {
        if (this.esDigital){
            this.precioVentaDigital = costo*1.12;
            return precioVentaDigital;
        }else{
            this.precioVentaFisico = costo*1.22;
        }
        return precioVentaFisico;
    }

    public String toString(){
        return super.toString() + "\nNombre del editor: " + editor + ".\nNombre de la revista: " + nombre +
                "\nEl precio en formato  es: $" + calcularPrecio() + ".";

    }
}


