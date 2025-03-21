package co.edu.uniquindio.poo.proyectofinal_billeteravirtual.Model;

public class EntidadCuenta {
    private String idCuenta;
    private String nombreBanco;
    private TipoCuenta tipoCuenta;
    private String numeroCuenta;

    public EntidadCuenta(String idCuenta, String nombreBanco, TipoCuenta tipoCuenta, String numeroCuenta) {
        this.idCuenta = idCuenta;
        this.nombreBanco = nombreBanco;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "EntidadCuenta{" +
                "idCuenta='" + idCuenta + '\'' +
                ", nombreBanco='" + nombreBanco + '\'' +
                ", tipoCuenta=" + tipoCuenta +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}
