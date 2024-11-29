public class Cliente extends Persona {

    private String identificacion;
    private Suscripcion suscripcion; // Relaciónn con Suscripcion
    private Vehiculo vehiculo; // Relación con un Vehículo

    public Cliente(int edad, String nombre, String apellido, String identificacion, Suscripcion suscripcion, Vehiculo vehiculo) {
        super(edad, nombre, apellido);
        this.identificacion = identificacion;
        this.suscripcion = suscripcion;
        this.vehiculo = vehiculo;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellido + " (ID: " + identificacion + ")";
    }
}
