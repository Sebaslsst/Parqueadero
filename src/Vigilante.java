public class Vigilante extends Persona {
    private String areaVigilancia;
    private String turnoTrabajo;
    private String reporteIncidentes;

    public Vigilante(int edad, String nombre, String apellido, String tipoDeTrabajo, String zonaDeTrabajo,
                     String areaVigilancia, String turnoTrabajo) {
        super(edad, nombre, apellido, tipoDeTrabajo, zonaDeTrabajo);
        this.areaVigilancia = areaVigilancia;
        this.turnoTrabajo = turnoTrabajo;
    }

    public void monitorearZona() {
        System.out.println("Monitoreando la zona...");
    }
}

