import enumeradores.EstadoReserva;

import java.util.Objects;

public abstract class Reserva implements Comparable<Reserva> {

    private static int contador = 1;

    private int id;
    private String dni;
    private String pasajero;
    private String origen;
    private String destino;
    private double cantKm;
    private EstadoReserva estado;

    //CONSTRUCTORES

    public Reserva() {
    }

    public Reserva(String dni, String pasajero, String origen, String destino, double cantKm) {
        this.id = contador++;
        this.dni = dni;
        this.pasajero = pasajero;
        this.origen = origen;
        this.destino = destino;
        this.cantKm = cantKm;
        this.estado = EstadoReserva.PENDIENTE;
    }

    //GETTER Y SETTERS



    //solo get de id


    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Reserva.contador = contador;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCantKm() {
        return cantKm;
    }

    public void setCantKm(double cantKm) {
        this.cantKm = cantKm;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }


    //TO STRING
    //Debe mostrar en una sola línea, como mínimo:
    //
    //Número | Tipo | Pasajero | DNI | Origen | Destino | Km | Estado | Precio

    @Override
    public String toString() {
        return "Reserva{" +
                "Nª Id: " + id +
                "| Tipo: " + obtenerTipoReserva() + '\'' +
                "| pasajero: " + pasajero + '\'' +
                "| DNI: " + dni + '\'' +
                "| Origen: " + origen + '\'' +
                "| Destino: " + destino + '\'' +
                "| CantKm: " + cantKm +
                "| Estado: " + estado +
                "| Precio: $" + calcularPrecio() +
                '}';
    }


    //EQUALS

    //Dos reservas deben considerarse iguales cuando coincidan:
    //DNI, Origen, Destino

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Reserva reserva)) return false;
        return Objects.equals(dni, reserva.dni) && Objects.equals(origen, reserva.origen) && Objects.equals(destino, reserva.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, origen, destino);
    }


    //compareTo

    @Override
    public int compareTo(Reserva o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }


    //METODOS

    public abstract double calcularPrecio();
    public abstract String obtenerTipoReserva();
}
