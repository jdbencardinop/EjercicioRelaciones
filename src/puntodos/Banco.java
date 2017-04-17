package puntodos;

import java.util.ArrayList;

/**
 *
 * @author Bencardino Perdomo
 */
public class Banco {
    
    private final String codigo;
    private final String nombre = "Alderan´s Planetary Bank";
    private ArrayList<Tipo> tipos;
    private ArrayList<Cuenta> cuentas;
    private static int cantidad = 0x1;
    
    public Banco() {
        this.codigo = "" + ((Banco.cantidad++ *(0x999999)) & 0xFFFFFF);
        this.tipos = new ArrayList<>();
        this.cuentas = new ArrayList<>();
        System.out.println("Banco creado");
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void addTipo(Tipo tipo) {
        this.tipos.add(tipo);
        System.out.println("tipo añadido");
    }
    
    public void addCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
        System.out.println("cuenta añadida");
    }
    
    public void removeCuenta(Cuenta cuenta) {
        if(this.cuentas.contains(cuenta)){
            this.cuentas.remove(cuenta);
            System.out.println("cuenta borrada");
        } else {
            System.out.println("Esa ceunto no existe");
        }
    }

    public void removeTipo(Tipo tipo) {
        if(this.tipos.contains(tipo)){
            this.tipos.remove(tipo);
            System.out.println("Tipo borrado");
        } else {
            System.out.println("Ese tipo no existe");
        }
    }

    @Override
    public String toString() {
        String texto = "El banco: " + nombre + ". " + codigo + 
                "\nTipos de transacciones disponibles: ";
        
        texto = tipos.stream().map((tipo) -> 
                "\n" + tipo.toString()).reduce(texto, String::concat);
        
        texto += "\nCuentas";
        
        texto = cuentas.stream().map((cuenta) -> 
                "\n" + cuenta.toString()).reduce(texto, String::concat);
        
        return texto;
    }
    
    public static void main(String[] args) {
        Banco b = new Banco();
        
        Tipo retiro = new Tipo("Retiro");
        b.addTipo(retiro);
        
        Tipo deposito = new Tipo("Deposito");
        b.addTipo(deposito);
        
        Cuenta miranda = new Cuenta("Miranda");
        b.addCuenta(miranda);
        
        miranda.RealizarMovimiento(100, deposito);
        miranda.RealizarMovimiento(50, retiro);
        
        Cuenta juan = new Cuenta("Juan");
        b.addCuenta(juan);
        
        juan.RealizarMovimiento(50, deposito);
        juan.RealizarMovimiento(100, retiro);
        
        System.out.println(b.toString());
    }
    
}
