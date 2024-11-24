//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Crear un parqueadero con un piso
        Parqueadero parqueadero = new Parqueadero(12.5f, 20);
        Piso piso1 = new Piso( 4, 500.0f); // Piso 5 con tamaño de 500 m²
        parqueadero.agregarPiso(piso1);

        // Crear un espacio de estacionamiento en el piso 5
        EspacioParaEstacionar espacio = new EspacioParaEstacionar(29, "Compacto", EstadoDeEspacio.USADO, piso1);
        parqueadero.agregarEspacio(espacio);

        // Crear una suscripción para el cliente
        Suscripcion suscripcion = new Suscripcion("Mensual", new Date());

        // Crear un vehículo
        Vehiculo vehiculo = new Vehiculo(4.5f, 1200.0f, 4, "Sedán", "ABC123", "Rojo");

        // Crear un cliente con sus datos
        Cliente cliente = new Cliente(30, "Sebastian", "Sánchez", "123456789", suscripcion, vehiculo);

        // Imprimir información
        System.out.println(cliente); // Información del cliente
        System.out.println("Lugar ingresado: " + espacio); // Información del espacio
        System.out.println("Piso: " + espacio.getPiso()); // Información del piso
        System.out.println("Suscripción: " + cliente.getSuscripcion()); // Información de la suscripción
    }
}