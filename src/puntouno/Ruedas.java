package puntouno;

/**
 *
 * @author Bencardino Perdomo
 */
public class Ruedas {
    
    private final int numserie;
    private final String marca;
    private final int diametro;
    private final int presion;
    private static int cantidad = 0;

    public Ruedas(int numserie, String marca, int diametro, int presion) {
        this.numserie = numserie;
        this.marca = marca;
        this.diametro = diametro;
        this.presion = presion;
        Ruedas.cantidad++;
        System.out.println("Rueda creada");
    }

    public Ruedas() {
        this.numserie = Ruedas.cantidad;
        this.marca = "Michelline";
        this.diametro = ((Ruedas.cantidad * 2) % 10) + 10;
        this.presion = (Ruedas.cantidad % 5) + 10;
        Ruedas.cantidad++;
        System.out.println("Rueda creada");
    }

    public int getNumserie() {
        return numserie;
    }

    public String getMarca() {
        return marca;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getPresion() {
        return presion;
    }

    @Override
    public String toString() {
        return "Rueda{" + numserie + ", Marca: " + marca +
                ", Diametro: " + diametro + ", Presion: " + presion + '}';
    } 
      
}
