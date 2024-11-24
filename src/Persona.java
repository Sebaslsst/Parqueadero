public abstract class Persona {
    protected int edad;
    protected String nombre;
    protected String apellido;

    public Persona(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int edad, String nombre, String apellido, String tipoDeTrabajo, String zonaDeTrabajo) {
    }
}
