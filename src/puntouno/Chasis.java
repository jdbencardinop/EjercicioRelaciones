package puntouno;

/**
 *
 * @author Bencardino Perdomo
 */
public class Chasis {
    
    private final int numserie;
    private final String marca;
    private final String material;
    private final int pasajeros;
    private static int cantidad = 0;

    public Chasis(int numserie, String marca, String material, int pasajeros) {
        this.numserie = numserie;
        this.marca = marca;
        this.material = material;
        this.pasajeros = pasajeros;
        Chasis.cantidad++;
        System.out.println("Chasis creado");
    }

    public Chasis() {
        this.numserie = Chasis.cantidad;
        this.marca = "GM";
        this.material = "Acero";
        this.pasajeros = (Chasis.cantidad % 6) + 1;
        Chasis.cantidad++;
        System.out.println("Chasis creado");
    }

    public int getNumserie() {
        return numserie;
    }

    public String getMarca() {
        return marca;
    }

    public String getMaterial() {
        return material;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public static int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Chasis{" + numserie + ", Marca: " + marca + 
                ", Material: " + material + ", Pasajeros: " + pasajeros + '}';
    }    
    
}
