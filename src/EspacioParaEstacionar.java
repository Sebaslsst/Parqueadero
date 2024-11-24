public class EspacioParaEstacionar {
    private int numero;
    private String tipo;
    private EstadoDeEspacio estado;
    private Piso piso; // Asociación con Piso

    public EspacioParaEstacionar(int numero, String tipo, EstadoDeEspacio estado, Piso piso) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
        this.piso = piso;
    }

    public Piso getPiso() {
        return piso;
    }

    @Override
    public String toString() {
        return "Espacio número: " + numero + " (Tipo: " + tipo + ", Estado: " + estado + ")";
    }
}
