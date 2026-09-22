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
            System.out.println("2- ");//buscarPorNumero(int numero)
            System.out.println("3- ");//cambiarEstado(int numero, EstadoReserva nuevoEstado)
            System.out.println("4- ");//listarPorEstado(EstadoReserva estado)
            System.out.println("5- "); //facturacionTotal()
            System.out.println("6- ");//reservaMasCara()
            System.out.println("7- ");//listarOrdenadas()
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
                    Reserva reserva = null;
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
                            "1-Reserva Regular\n" +
                            "2- Reserva Premium\n");

                    int tipoReserva = entrada.nextInt();
                    entrada.nextLine();

                    if(tipoReserva == 1){
                        reserva = new Regular(dni, pasajero, origen, destino, cantKm);
                        gestor.agregarReserva(reserva);
                    } else if (tipoReserva == 2) {
                        System.out.println("Ingrese el monto asegurado");
                        double montoAseg = entrada.nextDouble();
                        entrada.nextLine();

                        reserva = new Premium(dni,pasajero, origen, destino, cantKm, montoAseg);

                        }else {
                        System.out.println("El tipo de reserva ingresado no existe");
                    }
                    if(reserva != null){
                        if (gestor.agregarReserva(reserva)) {

                            System.out.println("Reserva agregada correctamente");

                        } else {

                            System.out.println("La reserva ya existe");

                        }


                        }



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
                    if(reservaBuscada != null){
                        System.out.println(reservaBuscada);
                    }else{
                        System.out.println("La reserva buscada no existe");
                    }

                    break;

//cambiarEstado(int numero, EstadoReserva nuevoEstado)
                //Debe buscar la reserva por número y modificar su estado.
                //Si no existe, debe informar la situación.

//listarPorEstado(EstadoReserva estado)
 //Debe devolver las reservas que se encuentren en el estado recibido.
 //Por ejemplo:listarPorEstado(EstadoReserva.CONFIRMADA);
                case 3:



                    break;
//facturacionTotal()
//Debe devolver la suma de los precios de todas las reservas cargadas.
//Debe utilizar polimorfismo.No debe hacer algo como:
//if (r instanceof ReservaPremium)
//para calcular el precio. Debe simplemente utilizar: r.calcularPrecio()


                case 4:

                    break;

//reservaMasCara()
//Debe devolver la reserva cuyo precio sea mayor. Si no hay reservas, debe devolver: null
                case 5:

                    break;

//listarOrdenadas()
//Debe devolver las reservas ordenadas utilizando el orden natural definido mediante: Comparable
//Debe poder utilizar:
//Collections.sort(...)

                case 6:

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

