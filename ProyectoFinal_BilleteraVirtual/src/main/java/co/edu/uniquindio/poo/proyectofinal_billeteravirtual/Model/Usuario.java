package co.edu.uniquindio.poo.proyectofinal_billeteravirtual.Model;

import java.util.LinkedList;

public class Usuario extends Persona{

    private double saldoTotal;
    private LinkedList<EntidadCuenta> cuentasAsociadas;

    public Usuario(String nombre, String idGeneral, String email, String telefono, String direccion, double saldoTotal, LinkedList<EntidadCuenta> cuentaAsociadas) {
        super(nombre, idGeneral, email, telefono, direccion);
        this.saldoTotal = saldoTotal;
        cuentaAsociadas = new LinkedList<>();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public LinkedList<EntidadCuenta> getCuentasAsociadas() {
        return cuentasAsociadas;
    }

    public void setCuentasAsociadas(LinkedList<EntidadCuenta> cuentasAsociadas) {
        this.cuentasAsociadas = cuentasAsociadas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "saldoTotal=" + saldoTotal +
                ", cuentasAsociadas=" + cuentasAsociadas +
                '}';
    }
}
