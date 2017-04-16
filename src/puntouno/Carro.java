package puntouno;

/**
 *
 * @author Bencardino Perdomo
 */
public class Carro {
    
    private final int numserie;
    private final String marca;
    private final String color;
    private final double kilometraje;
    private Ruedas[] ruedas = new Ruedas[4];
    private final Chasis chasis;
    private Motor motor;
    private static int cantidad = 0;

    public Carro(Ruedas[] ruedas, Motor motor, int numserie, String marca, 
            String color, double kilometraje) {
        this.numserie = numserie;
        this.marca = marca;
        this.color = color;
        this.kilometraje = kilometraje;
        if(ruedas.length == 4) System.arraycopy(ruedas, 0, this.ruedas, 0, 4);
        else {
            System.out.println("NO ES UN NUMERO ADECUADO DE RUEDAS");
            System.exit(1);
        }
        this.chasis = new Chasis();
        this.motor = motor;
        Carro.cantidad++;
        System.out.println("Carro creado");
    }

    public Carro(Ruedas[] ruedas, Motor motor) {
        this.numserie = Carro.cantidad;
        this.marca = "Chrysler";
        this.color = "Gris";
        this.kilometraje = 0;
        if(ruedas.length == 4) System.arraycopy(ruedas, 0, this.ruedas, 0, 4);
        else {
            System.out.println("NO ES UN NUMERO ADECUADO DE RUEDAS");
            System.exit(1);
        }
        this.chasis = new Chasis();
        this.motor = motor;
        Carro.cantidad++;        
        System.out.println("Carro creado");
    }

    public int getNumserie() {
        return numserie;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public Ruedas[] getRuedas() {
        return ruedas;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public void setRuedas(Ruedas[] ruedas) {
        this.ruedas = ruedas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public static void setCantidad(int cantidad) {
        Carro.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return  numserie + ", Marca: " + marca + ", Color: " + 
                color + ", Kilometraje: " + kilometraje + ".\nRuedas: \n[1]" + 
                ruedas[0].toString() + "\n[2]" + ruedas[1].toString() + "\n[3]" 
                + ruedas[2].toString() + "\n[4]" + ruedas[3].toString() + "\n"
                + chasis.toString() + "\n" + motor.toString();
    }    
}
