package puntocuatro;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author Bencardino Perdomo
 */
public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas;
        //ArrayList<Fecha> cumples = new ArrayList();
        personas = new ArrayList();

        //cumples.add(new Fecha(29,05,1998));
        personas.add(new Persona("Juan", new Fecha(29, 5, 1998)));
        personas.add(new Persona("Tatiana", new Fecha(22, 2, 2000)));
        personas.add(new Persona("Bob", new Fecha(22, 11, 2000)));
        personas.add(new Persona("Hoy", new Fecha(23, 4, 2017)));
        personas.add(new Persona("Futuro", new Fecha(29, 5, 2025)));
        
        
        personas.forEach((Persona persona) -> {
            System.out.println(persona.toString());
        });    
    }
}
