import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Parqueadero parqueadero1 = new Parqueadero();
        int op= 0;
        do {
            System.out.println("1. Ingresar Carro ");
            System.out.println("2. Dar salida a un carro ");
            System.out.println("3. Informar los ingresos del parqueadero ");
            System.out.println("4. Consultar la cantidad de puestos disponible ");
            System.out.println("5. Avanzar el reloj del parqueadero ");
            System.out.println("6. Cambiar la tarifa del parqueadero");
            System.out.println("7. Mostrar metodo 1");
            System.out.println("8. Mostrar metodo 2");
            System.out.println("9. Salir ");
            System.out.println();
            System.out.println("Ingrese una opcion: ");
            op= scanner.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingrese la placa del vehiculo: ");
                    String placa= scanner.next();
                    int resultado= parqueadero1.entrarCarro(placa);
                    if (resultado == Parqueadero.NO_HAY_PUESTO){
                        System.out.println("No hay puestos disponibles");
                    }else if(resultado == Parqueadero.CARRO_YA_EXISTE){
                        System.out.println("Ya hay un carro con esa placa");
                    }else{
                        System.out.println("Carro en el puesto: "+resultado);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la placa del vehiculo: ");
                    String pPlaca= scanner.next();
                    int resultadoS = parqueadero1.sacarCarro(pPlaca);
                    if (resultadoS == Parqueadero.CARRO_NO_EXISTE){
                        System.out.println("El carro no esta en el parqueadero");
                    }else{
                        System.out.println("Se ha sacado el carro");
                        System.out.println("\nLa tarifa total a pagar es: "+resultadoS);
                    }
                    break;
                case 3:
                    System.out.println("La informacion de los ingresos del parqueadero es: "+parqueadero1.darMontoCaja());
                    break;
                case 4:
                    System.out.println("Puestos disponibles: "+parqueadero1.calcularPuestosLibres());
                    break;
                case 5:
                    parqueadero1.avanzarHora();
                    System.out.println("Avanzando una hora. Hora Actual: "+parqueadero1.darHoraActual());
                    break;
                case 6:
                    System.out.println("Ingrese la nueva tarifa: ");
                    int pTarifa= scanner.nextInt();
                    parqueadero1.cambiarTarifa(pTarifa);
                    System.out.println("Tarifa cambiada a "+parqueadero1.darTarifa()+" por hora");
                    break;
                case 7:
                    System.out.println(parqueadero1.metodo1());
                    break;
                case 8:
                    System.out.println(parqueadero1.metodo2());
                    break;
                case 9:
                    System.out.println("Gracias... Saliendo");
                    break;
            }
        }while(op!=9);
    }
}