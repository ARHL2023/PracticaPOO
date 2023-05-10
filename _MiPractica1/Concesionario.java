package _MiPractica1;

public class Concesionario {
    public static void main(String[] args) {

        Automovil auto = new Automovil("","",0,0,"");
        auto.pedirAutomovil();
        auto.mostrarAutomovil();

        Motocicleta moto = new Motocicleta("","",0,0,"");
        moto.pedirMotocicleta();
        moto.mostrarMotocicleta();


    }//main
}//class
