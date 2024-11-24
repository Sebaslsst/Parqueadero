public class Piso {
    private int cantidad;
    private float tamanio;

    public Piso(int cantidad, float tamanio) {
        this.cantidad = cantidad;
        this.tamanio = tamanio;
    }

    // Getters y Setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTamano() {
        return tamanio;
    }

    public void setTamano(float tamanio) {
        this.tamanio = tamanio;
    }
    public String toString() {
        return cantidad + " " ;
    }
}

