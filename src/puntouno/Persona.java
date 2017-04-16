package puntouno;

import java.util.ArrayList;

/**
 *
 * @author Bencardino Perdomo
 */
public class Persona {
    
    private String Nombre;
    private ArrayList<Carro> carros = new ArrayList();

    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void AddCarro (Carro carro) {
        this.carros.add(carro);
    }
    
    public void AddCarro (Ruedas[] ruedas, Motor motor, int numserie, 
            String marca, String color, double kilometraje) {
        carros.add(new Carro(ruedas,motor,numserie,marca,color,kilometraje));
    }
    
    public void AddCarro (Ruedas[] ruedas, Motor motor) {
        this.carros.add(new Carro(ruedas, motor));
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }  

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }    

    @Override
    public String toString() {
        String texto = "Hola " + this.Nombre + ", Estos son tus carros: ";
        
        for (Carro carro : carros) {
            texto += "\n>> " + carro.toString();
        }
        
        return texto;
    }
    
    public static void main(String[] args) {
        
        Persona juan = new Persona("Juan");
        
        for (int i = 0; i < 2; i++) {
            Ruedas[] ruedas = new Ruedas[4];
            for (int j = 0; j < 4; j++) {
                ruedas[j] = new Ruedas();
            }
            Motor motor = new Motor();
            
            juan.AddCarro(ruedas, motor);
        }
        
        System.out.println(juan.toString());
        
    }
    
}
