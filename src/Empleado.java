import java.io.Serializable;

public abstract class Empleado extends Persona implements Contrato{
    protected String tipoDeTrabajo;
    protected String zonaDeTrabajo;

    public Empleado(int edad, String nombre, String apellido, String tipoDeTrabajo, String zonaDeTrabajo) {
        super(edad, nombre, apellido);
        this.tipoDeTrabajo = tipoDeTrabajo;
        this.zonaDeTrabajo = zonaDeTrabajo;
    }
}
