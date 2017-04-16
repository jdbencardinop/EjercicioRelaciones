package puntouno;

/**
 *
 * @author Bencardino Perdomo
 */
public class Motor {
    
    private final int numserie;
    private final String marca;
    private final int pistones;
    private final double volumen;
    private static int cantidad = 0;

    public Motor(int numserie, String marca, int pistones, double volumen) {
        this.numserie = numserie;
        this.marca = marca;
        this.pistones = pistones;
        this.volumen = volumen;
        Motor.cantidad++;
        System.out.println("Motor creado");
    }

    public Motor() {
        this.numserie = Motor.cantidad;
        this.marca = "GM";
        this.pistones = ((Motor.cantidad * 2) & 7) + 6;
        this.volumen = (Motor.cantidad & 7) * 11/10;
        Motor.cantidad++;
        System.out.println("Motor creado");
    }

    public int getNumserie() {
        return numserie;
    }

    public String getMarca() {
        return marca;
    }

    public int getPistones() {
        return pistones;
    }

    public double getVolumen() {
        return volumen;
    }

    public static int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Motor{" + numserie + ", Marca: " + marca + 
                ", Pistones: " + pistones + ", Volumen: " + volumen + '}';
    }
    
}
