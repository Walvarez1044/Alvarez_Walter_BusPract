import enumeradores.EstadoReserva;

import java.util.List;
import java.util.Scanner;


public class Vista {
    private Scanner  entrada;
    private GestionEmpresaCostaBus gestor;

    public Vista() {
        entrada = new Scanner(System.in);
        gestor = new GestionEmpresaCostaBus();
    }


    public void menu(){
        int opcion;
        do{
            System.out.println("Ingrese la opcion que desea utilizar\n");
            System.out.println("1- Agregar Reserva");//agregarReserva(...)
            System.out.println("2- Buscar por Nmero de Reserva");//buscarPorNumero(int numero)
            System.out.println("3- Cambiar Estado de Reserva");//cambiarEstado(int numero, EstadoReserva nuevoEstado)
            System.out.println("4- Listar por Estado de Reserva");//listarPorEstado(EstadoReserva estado)
            System.out.println("5- Ver Facturacion Total"); //facturacionTotal()
            System.out.println("6- Ver Reserva mas Cara");//reservaMasCara()
            System.out.println("7- Listado Ordenado");//listarOrdenadas()
            System.out.println("0- SALIR");

            opcion = entrada.nextInt();
            entrada.nextLine();//para limpiar buffer

            switch (opcion){
//agregarReserva(...)
//Debe:
//recibir una reserva;
//verificar si ya existe;
//utilizar equals() para determinar duplicados;
//rechazar la reserva si ya existe;
//informar por pantalla si pudo agregarse.
//Ejemplo:
//Reserva agregada correctamente. o: No se pudo agregar: la reserva ya existe.
                case 1:
// private String dni;
//    private String pasajero;
//    private String origen;
//    private String destino;
//    private double cantKm;
//    private EstadoReserva estado;
                    Reserva res = null;
                    System.out.println("Ingrese DNI");
                    String dni = entrada.next();
                    System.out.println("Ingrese Pasajero");
                    String pasajero = entrada.next();
                    System.out.println("Ingrese Origen del viaje");
                    String origen = entrada.next();
                    System.out.println("Ingrese Destino");
                    String destino = entrada.next();
                    System.out.println("Ingrese Cantidad de Kilometros");
                    double cantKm = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.println("Ingrese el tipo de reserva que desea cargar: \n" +
                            "1- Reserva Regular\n" +
                            "2- Reserva Premium\n");

                    int tipoReserva = entrada.nextInt();
                    entrada.nextLine();

                    if(tipoReserva == 1){
                        res = new Regular(dni, pasajero, origen, destino, cantKm);

                    } else if (tipoReserva == 2) {
                        System.out.println("Ingrese el monto asegurado");
                        double montoAseg = entrada.nextDouble();
                        entrada.nextLine();

                        res = new Premium(dni,pasajero, origen, destino, cantKm, montoAseg);

                        }else {
                        System.out.println("El tipo de reserva ingresado no existe");
                    }
                    if(res != null){
                        if (gestor.agregarReserva(res)) {

                            System.out.println("Reserva agregada correctamente");

                            } else {

                            System.out.println("La reserva ya existe");
                            }
                        }
                    System.out.println("Pulse enter para volver al menu");
                    entrada.nextLine();//para limpiar el buffer
                    entrada.nextLine();//hace la pausa real

                    break;

 //Debe devolver:
 //la reserva encontrada; null si no existe.
 //Ejemplo:
 //Reserva r = empresa.buscarPorNumero(3);

                case 2:

                    System.out.println("Ingrese el numero de reserva buscado");
                    int numero = entrada.nextInt();
                    entrada.nextLine();

                    Reserva reservaBuscada = gestor.buscarPorNumero(numero);
                    if (reservaBuscada != null) {
                        System.out.println(reservaBuscada);
                    } else {
                        System.out.println("La reserva buscada no existe");
                    }
                    System.out.println("Pulse enter para volver al menu");
                    entrada.nextLine();//para limpiar el buffer
                    entrada.nextLine();//hace la pausa real


                    break;

//cambiarEstado(int numero, EstadoReserva nuevoEstado)
                //Debe buscar la reserva por número y modificar su estado.
                //Si no existe, debe informar la situación.
                case 3:
                    System.out.println("Ingrese el numero de Reserva que desea cambiar de Estado");
                    int num = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Estados: PENDIENTE, CONFIRMADA, VIAJANDO, CANCELADA");
                    EstadoReserva estado = EstadoReserva.valueOf(entrada.nextLine().toUpperCase());

                    if (gestor.cambiarEstado(num, estado)) {
                        System.out.println("El Estado se actualizo correctamente");
                    } else {
                        System.out.println("Hubo un error al actualizar Estado");
                    }
                    System.out.println("Pulse enter para volver al menu");
                    entrada.nextLine();//para limpiar el buffer
                    entrada.nextLine();//hace la pausa real


                    break;

//listarPorEstado(EstadoReserva estado)
//Debe devolver las reservas que se encuentren en el estado recibido.
//Por ejemplo:listarPorEstado(EstadoReserva.CONFIRMADA);
                case 4:
                    System.out.println("Estados: PENDIENTE, CONFIRMADA, VIAJANDO, CANCELADA");
                    System.out.println("Ingrese el Estado que desea listar");

                    EstadoReserva estadoCamb = EstadoReserva.valueOf(entrada.nextLine().toUpperCase());
                    List<Reserva> listaEstado = gestor.listarPorEstado(estadoCamb);

                    for (Reserva reserva : listaEstado) {
                            System.out.println(reserva);
                        }

                    System.out.println("Pulse enter para volver al menu");
                    entrada.nextLine();//para limpiar el buffer
                    entrada.nextLine();//hace la pausa real

                    break;

//facturacionTotal()
//Debe devolver la suma de los precios de todas las reservas cargadas.
//Debe utilizar polimorfismo.No debe hacer algo como:
//if (r instanceof ReservaPremium)
//para calcular el precio. Debe simplemente utilizar: r.calcularPrecio()

                case 5:
                    double facturacion = gestor.facturacionTotal();
                    System.out.println("La facturacion Total es: $"+facturacion);

                    System.out.println("Pulse enter para volver al menu");
                    entrada.nextLine();//para limpiar el buffer
                    entrada.nextLine();//hace la pausa real


                    break;
//reservaMasCara()
//Debe devolver la reserva cuyo precio sea mayor. Si no hay reservas, debe devolver: null

                case 6:

                    Reserva reservaMasCara = gestor.reservaMasCara();
                    if(reservaMasCara != null){
                        System.out.println("La reserva mas cara es: "+reservaMasCara);
                    }else {
                        System.out.println("No hay reservas ingresadas");
                    }

                    System.out.println("Pulse enter para volver al menu");
                    entrada.nextLine();//para limpiar el buffer
                    entrada.nextLine();//hace la pausa real


                    break;
//listarOrdenadas()
//Debe devolver las reservas ordenadas utilizando el orden natural definido mediante: Comparable
//Debe poder utilizar:
//Collections.sort(...)
                case 7:
                    List<Reserva> listadoOrdenado = gestor.listarOrdenAsc();
                    for(Reserva reserva : listadoOrdenado){
                        System.out.println(listadoOrdenado);
                    }
                    System.out.println("Pulse enter para volver al menu");
                    entrada.nextLine();//para limpiar el buffer
                    entrada.nextLine();//hace la pausa real
                    break;
                case 0:

                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion Invalida. Ingrese nuevamente");

                    break;
            }

        }while (opcion != 0);
    }
}

