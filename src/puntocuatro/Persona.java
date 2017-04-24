package puntocuatro;

/**
 *
 * @author Bencardino Perdomo
 */
public class Persona {
    
    private String nombre;
    private int cedula;
    private Fecha cumpleaños;
    private static int cantidad = 0;

    public Persona(String nombre, Fecha cumpleaños) {
        Persona.cantidad++;
        this.nombre = nombre;
        this.cedula = Persona.cantidad*1234321;
        this.cumpleaños = cumpleaños;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Fecha getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Fecha cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    @Override
    public String toString() {
        return "Hola " + nombre + ".\nDe cedula: " + cedula + 
                ".\n Tu cumples años el: " + cumpleaños;
    }
    
    
}
