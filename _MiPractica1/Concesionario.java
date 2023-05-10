package _MiPractica1;

import java.util.Scanner;

public class Concesionario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Automovil auto = new Automovil("","",0,0,"");
        Motocicleta moto = new Motocicleta("","",0,0,"");

        int opcion = 0;

        do {
            System.out.println("\n1. Automovil "+"\n2. Motocicleta" +"\n0. Salir");
            System.out.print("Ingrese una opcion: " );
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    auto.pedirAutomovil();
                    auto.mostrarAutomovil();
                    break;
                case 2:
                    moto.pedirMotocicleta();
                    moto.mostrarMotocicleta();
                    break;
                default:
                    System.out.println("\nOpcion no valida");
            }
        }while (opcion!=0);

    }//main
}//class
