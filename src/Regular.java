import enumeradores.EstadoReserva;

public class Regular extends Reserva{


// constructor



    public Regular() {
    }

    public Regular(String dni, String pasajero, String origen, String destino, double cantKm) {
        super(dni, pasajero, origen, destino, cantKm);
    }

    //to string


    @Override
    public String toString() {
        return "Regular{} " + super.toString();
    }

    @Override
    public double calcularPrecio() {
        return 2000+ 80*getCantKm();
    }

    @Override
    public String obtenerTipoReserva() {
        return "REGULAR";
    }



}
