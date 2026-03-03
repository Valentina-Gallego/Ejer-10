public class Producto {

    private String nombre;
    private double precio;
    private boolean oferta;

    public Producto(String nombre, double precio, boolean oferta) {
        this.nombre = nombre;
        this.precio = precio;
        this.oferta = oferta;
    }

    public boolean isOferta() {
        return oferta;
    }

    @Override
    public String toString() {
        return nombre + " | Precio: " + precio + " | Oferta: " + oferta;
    }
}
