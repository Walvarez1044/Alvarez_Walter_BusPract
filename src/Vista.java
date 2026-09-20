import java.util.Scanner;
import java.util.ArrayList;


public class Vista {
    private Scanner  entrada;
    private GestionEmpresaCostaBus gestor;

    public Vista(Scanner entrada, GestionEmpresaCostaBus gestor) {
        entrada = new Scanner(System.in);
        gestor = new GestionEmpresaCostaBus();
    }

    public void menu(){
        int opcion;
        do{
            System.out.println("Ingrese la opcion que desea utilizar\n");
            System.out.println("1- ");
            System.out.println("2- ");
            System.out.println("3- ");
            System.out.println("4- ");
            System.out.println("5- ");
            System.out.println("6- ");
            System.out.println("7- ");
            System.out.println("0- SALIR");

            opcion = entrada.nextInt();;
            entrada.nextLine();//para limpiar buffer

            switch (opcion){

                case 1:


                    int opcionP;

                    System.out.println("\nIngrese el tipo de pedido que quiere cargar \n");
                    System.out.println("1- ");
                    System.out.println("2- ");
                    opcionP = entrada.nextInt();;
                    entrada.nextLine();//para limpiar buffer

                    switch (opcionP){

                        case 1:


                            break;
                        case 2:


                            break;
                        default:
                            System.out.println("Opcion Invalida. Ingrese el tipo de pedido nuevamente");


                            break;


                    }



                    break;
                case 2:



                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

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

