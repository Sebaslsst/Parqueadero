import java.util.Date;

public class Suscripcion {

    private String tipo;
    private Date fecha;

    public Suscripcion(String tipo, Date fecha) {
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Suscripción tipo: " + tipo + ", fecha de inicio: " + fecha;
    }
}
