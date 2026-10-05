package tarea8.herencia;

public class Persona {
    // Atributos protegidos
    protected String nombre;
    protected String cedula;

    // Constructor
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Sobrescritura del método toString()
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cedula: " + cedula;
    }
}
