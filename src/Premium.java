import enumeradores.EstadoReserva;
import interfaces.I_SeguroDeViaje;

public class Premium extends Reserva implements I_SeguroDeViaje {

    private double montoAsegurado;

    public Premium() {
    }

    public Premium(String dni, String pasajero, String origen, String destino, double cantKm, EstadoReserva estado, double montoAsegurado) {
        super(dni, pasajero, origen, destino, cantKm, estado);
        this.montoAsegurado = montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }
//metodos

    @Override
    public double calcularPrecio() {
        double precio = 3500+120*getCantKm();
        if(getCantKm() > 800){
            return precio*0.9;
        }

        return precio;
    }

    @Override
    public String obtenerTipoReserva() {
        return "PREMIUM";
    }

    @Override
    public double getMontoAsegurado() {
        return montoAsegurado;
    }


    //La devolución corresponde únicamente cuando la reserva se encuentra en estado:
    //
    //CANCELADA

    @Override
    public boolean correspondeDevolucion() {
        if(montoAsegurado > 0 && getEstado() == EstadoReserva.CANCELADA){
            return true;
        }
        return false;
    }

    //to string


    @Override
    public String toString() {
        return "Premium{" +
                "Monto Asegurado: $" + montoAsegurado +
                "} " + super.toString();
    }


}
