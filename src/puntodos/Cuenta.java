package puntodos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bencardino Perdomo
 */
public class Cuenta {
    
    private final int numeroCuenta;
    private double saldo;
    private final Date fechaCreacion;
    private String nombreCliente;
    private ArrayList<Movimiento> transacciones;
    private static int cantidad = 1;

    public Cuenta(String nombreCliente) {
        this.numeroCuenta = Cuenta.cantidad++;
        this.saldo = 0;
        this.fechaCreacion = new Date();
        this.nombreCliente = nombreCliente;
        this.transacciones = new ArrayList<>();
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public ArrayList<Movimiento> getTransacciones() {
        return transacciones;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTransacciones(ArrayList<Movimiento> transacciones) {
        this.transacciones = transacciones;
    }

    public static void setCantidad(int cantidad) {
        Cuenta.cantidad = cantidad;
    }
    
    public void RealizarMovimiento(double cantidad, Tipo tipo) {        
        Movimiento m = new Movimiento(cantidad, tipo);
        m.setSaldoInicial(this.saldo);
        if((tipo.getCodigo().equals("Retiro")) && (this.saldo < cantidad)){
            System.out.println("No hay saldo suficiente");          
        } else {
            this.saldo = m.transaccion();
            System.out.println("Transacción Realizada");
        }        
        this.transacciones.add(m);
        System.out.println("Añadida al registro");
    }

    @Override
    public String toString() {
        String texto = "Hola " + nombreCliente + ". Esta es tu cuenta:\n\t" + 
                numeroCuenta + "\n\tFecha de Creación: " + fechaCreacion + 
                "\nSaldo: " + saldo;
        
        texto = transacciones.stream().map((transaccione) -> 
                "\n" + transaccione.toString()).reduce(texto, String::concat);
        
        texto += "\nConsulta hecha el: " + new Date() + 
                "\nMuchas gracias";
        
        return texto;
    }
        
}
