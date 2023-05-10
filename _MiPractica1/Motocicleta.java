package _MiPractica1;

import java.util.Scanner;

public class Motocicleta extends Vehiculo{

    //ATRIBUTOS
    private double cilindrada;
    private String tipoChasis;

    //CONSTRUCTOR

    public Motocicleta(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    public Motocicleta(String marca, String modelo, int anio, double cilindrada, String tipoChasis) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
        this.tipoChasis = tipoChasis;
    }

    //METODOS
    public void pedirMotocicleta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("/nIngrese datos de la motocicleta");

        //pidiendo datos del padre
        System.out.println("Marca: ");
        setMarca(entrada.next());

        System.out.println("Modelo: ");
        setModelo(entrada.next());

        System.out.println("Año: ");
        setAnio(entrada.nextInt());

        //pidiendo datos de la clase
        System.out.println("Cilindraje: ");
        cilindrada = entrada.nextDouble();

        System.out.println("Tipo chasis: ");
        tipoChasis = entrada.next();

    }//

    public void mostrarMotocicleta(){
        System.out.println("--------------Lista de automoviles-------------------");
        System.out.println("\nMarca: "+getMarca()+" "
                +"\nModelo: "+getModelo()
                +" "+"\nAnio: "+getAnio()
                +" "+"\nCilindraje: "+getCilindrada()
                +" "+"\nTipo Chasis: "+getTipoChasis() );
    }

    //GET AND SET
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoChasis() {
        return tipoChasis;
    }

    public void setTipoChasis(String tipoChasis) {
        this.tipoChasis = tipoChasis;
    }

}//FIN CLASS
