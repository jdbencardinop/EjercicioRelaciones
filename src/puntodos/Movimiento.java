package puntodos;

import java.util.Date;

/**
 *
 * @author Bencardino Perdomo
 */
public class Movimiento {
    
    private Date fecha;
    private double saldoInicial;
    private double cantidad;
    private Tipo tipo;

    public Movimiento(double cantidad, Tipo tipo) {
        this.fecha = new Date();
        this.saldoInicial = 0;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    public double transaccion() {
        switch(this.tipo.movimiento()) {
            case 1:
                if(this.saldoInicial >= this.cantidad){                    
                    return this.saldoInicial - this.cantidad;
                } else {                   
                    return this.saldoInicial;
                }
            case 2:
                return this.saldoInicial + this.cantidad;
            default:
                return this.saldoInicial;
        }        
    }

    @Override
    public String toString() {
        String texto = "Movimiento\n\tFecha: " + fecha + 
                "\n\tSaldo Inicial: " + saldoInicial + "\n\t" + tipo;
        
        if(this.transaccion() == this.saldoInicial) {
            texto += "\n\tNo hubo cambios en el saldo de la cuenta";
        } else {
            texto += "\n\tCantidad: " + cantidad + " Transacción realizada";
        }
        
        return texto;
    }
    
    

}
