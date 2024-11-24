public class Administrador extends Persona {

    public Administrador(int edad, String nombre, String apellido, String tipoDeTrabajo, String zonaDeTrabajo) {
        super(edad, nombre, apellido, tipoDeTrabajo, zonaDeTrabajo);
    }

    public void generarFactura() {
        System.out.println("Generando factura...");
    }

    public float registrarHoraIngreso() {
        System.out.println("Registrando hora de ingreso...");
        return System.currentTimeMillis();
    }
}
