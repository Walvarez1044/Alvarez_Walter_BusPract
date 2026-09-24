import enumeradores.EstadoReserva;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GestionEmpresaCostaBus {

    List<Reserva> reservas;

    public GestionEmpresaCostaBus() {
        this.reservas = new ArrayList<>();
    }

    //Métodos mínimos requeridos
    //agregarReserva(...)
    //

    public boolean agregarReserva(Reserva reserva){
        if(reservas.contains(reserva)){
            return false;
        }
        reservas.add(reserva);

        return true;
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

    public Reserva buscarPorNumero (int numBuscado){
        for (Reserva reserva : reservas){
            if(reserva.getId() == numBuscado){
                return reserva;
            }
        }
        return null;
    }


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

    public boolean cambiarEstado(int num, EstadoReserva estado){
        Reserva cambiar = buscarPorNumero(num);
        if(cambiar != null){
            cambiar.setEstado(estado);

            return true;
        }

        return false;
    }
    //
    //listarPorEstado(EstadoReserva estado)
    //
    //Debe devolver las reservas que se encuentren en el estado recibido.
    //
    //Por ejemplo:
    //
    //listarPorEstado(EstadoReserva.CONFIRMADA);

    public ArrayList<Reserva> listarPorEstado(EstadoReserva estadoListar) {
        ArrayList <Reserva> listaAux = new ArrayList<>();
        for(Reserva reserva : reservas){
            if(reserva.getEstado() == estadoListar){
                listaAux.add(reserva);
            }
        }
        return listaAux;
    }


    //facturacionTotal()
    //
    //Debe devolver la suma de los precios de todas las reservas cargadas.
    //
    //Debe utilizar polimorfismo.No debe hacer algo como:
    //if (r instanceof ReservaPremium)
    //para calcular el precio.Debe simplemente utilizar: r.calcularPrecio()

    public double facturacionTotal(){
        double total = 0;

        for(Reserva reserva : reservas){
            total+= reserva.calcularPrecio();
        }
        return total;
    }




    //reservaMasCara()
    //
    //Debe devolver la reserva cuyo precio sea mayor.Si no hay reservas, debe devolver: null

    public Reserva reservaMasCara(){
        return Collections.max(reservas);
    }


    //listarOrdenadas()
    //
    //Debe devolver las reservas ordenadas utilizando el orden natural definido mediante: Comparable
    //Debe poder utilizar: Collections.sort(...)

    public ArrayList<Reserva> listarOrdenAsc(){
        ArrayList<Reserva> listaAsc = new ArrayList<>(reservas);

        Collections.sort(listaAsc);

        return listaAsc;
    }



}
