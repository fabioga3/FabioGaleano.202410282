package tarea8.herencia;

public class Estudiante extends Persona {
    // Atributos específicos
    private final String matricula;
    private final String carrera;

    // Constructor utilizando super(nombre, cedula)
    public Estudiante(String nombre, String cedula, String matricula, String carrera) {
        super(nombre, cedula);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Sobrescritura del método toString()
    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula + ", Carrera: " + carrera;
    }
}
