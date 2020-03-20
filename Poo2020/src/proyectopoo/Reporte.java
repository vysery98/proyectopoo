package proyectopoo;

/**
 *
 * @author vysery98 
 */
public class Reporte extends Producto {

    public Reporte(String tipo, String descripcion, String precio, String cantidad) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = cantidad;
    }

    public void calcularTotal() {
        total = Double.parseDouble(precio) * Integer.parseInt(stock);
    }
}
