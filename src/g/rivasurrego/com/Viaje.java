package g.rivasurrego.com;

public abstract class Viaje {
    private String codViaje;
    private Double kilometraje;
    private String puntoA;
    private String puntoB;
    private Integer cantPasajeros;

    public abstract Double calcCosto();

    public abstract Double gastoGasolina();

    public String Prueba() {
        return null;
    }

    public Viaje(String codViaje, Double kilometraje, String puntoA, String puntoB, Integer cantPasajeros) {
        this.codViaje = codViaje;
        this.kilometraje = kilometraje;
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        this.cantPasajeros = cantPasajeros;
    }

    public String getCodViaje() {
        return codViaje;
    }

    public void setCodViaje(String codViaje) {
        this.codViaje = codViaje;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(String puntoA) {
        this.puntoA = puntoA;
    }

    public String getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(String puntoB) {
        this.puntoB = puntoB;
    }

    public Integer getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(Integer cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
}
