import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private float tiempoUso;
    private int cantidadUso;

    private List<Piso> pisos = new ArrayList<>();
    private List<EspacioParaEstacionar> espacios = new ArrayList<>();

    public Parqueadero(float tiempoUso, int cantidadUso) {
        this.tiempoUso = tiempoUso;
        this.cantidadUso = cantidadUso;
    }

    // Métodos para agregar pisos y espacios
    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    public void agregarEspacio(EspacioParaEstacionar espacio) {
        espacios.add(espacio);
    }
}
