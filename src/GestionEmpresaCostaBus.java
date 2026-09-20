import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GestionEmpresaCostaBus {

    List<Reserva> reservas;

    public GestionEmpresaCostaBus(List<Reserva> reservas) {
        this.reservas = new ArrayList<>();
    }


    //Métodos mínimos requeridos
    //agregarReserva(...)
    //

    public boolean agregarReserva(Reserva reserva){
        if(!reservas.contains(reserva)){
            return reservas.add(reserva);
        }
        return false;
    }
    //Debe:
    //
    //recibir una reserva;
    //verificar si ya existe;
    //utilizar equals() para determinar duplicados;
    //rechazar la reserva si ya existe;
    //informar por pantalla si pudo agregarse.
    //
    //Ejemplo:
    //
    //Reserva agregada correctamente.
    //
    //o:
    //
    //No se pudo agregar: la reserva ya existe.
    //buscarPorNumero(int numero)
    //
    //Debe devolver:
    //
    //la reserva encontrada;
    //null si no existe.
    //
    //Ejemplo:
    //
    //Reserva r = empresa.buscarPorNumero(3);
    //cambiarEstado(int numero, EstadoReserva nuevoEstado)
    //
    //Debe buscar la reserva por número y modificar su estado.
    //
    //Si no existe, debe informar la situación.
    //
    //listarPorEstado(EstadoReserva estado)
    //
    //Debe devolver las reservas que se encuentren en el estado recibido.
    //
    //Por ejemplo:
    //
    //listarPorEstado(EstadoReserva.CONFIRMADA);
    //facturacionTotal()
    //
    //Debe devolver la suma de los precios de todas las reservas cargadas.
    //
    //Debe utilizar polimorfismo.
    //
    //No debe hacer algo como:
    //
    //if (r instanceof ReservaPremium)
    //
    //para calcular el precio.
    //
    //Debe simplemente utilizar:
    //
    //r.calcularPrecio()
    //reservaMasCara()
    //
    //Debe devolver la reserva cuyo precio sea mayor.
    //
    //Si no hay reservas, debe devolver:
    //
    //null
    //listarOrdenadas()
    //
    //Debe devolver las reservas ordenadas utilizando el orden natural definido mediante:
    //
    //Comparable
    //
    //Debe poder utilizar:
    //
    //Collections.sort(...)


}
