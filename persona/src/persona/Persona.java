package persona;

public class Persona {
    String nombre;
    int edad;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class EjemploPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";
        persona.edad = 19;
        
        // Línea añadida para mostrar los datos en consola
        persona.mostrarInformacion();
    }
}
    
  
