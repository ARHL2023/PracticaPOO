package _MiPractica1;

import java.util.Scanner;

public class Automovil extends Vehiculo {

    //ATRIBUTOS
    private int numeroPuertas;
    private String tipoCombustible;

    //CONSTRUCTOR

    public Automovil(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    public Automovil(String marca, String modelo, int anio, int numeroPuertas, String tipoCombustible) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    //METODOS

    public void pedirAutomovil(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese datos del automil");

        //pidiendo datos del padre
        System.out.println("Marca: ");
        setMarca(entrada.next());

        System.out.println("Modelo: ");
        setModelo(entrada.next());

        System.out.println("Año: ");
        setAnio(entrada.nextInt());

        //pidiendo datos de la clase
        System.out.println("Numero puertas: ");
        numeroPuertas = entrada.nextInt();

        System.out.println("Tipo Combustible: ");
        tipoCombustible = entrada.next();

    }

    public void mostrarAutomovil(){
        System.out.println("--------------Lista de automoviles-------------------");
        System.out.println("\nMarca: "+getMarca()+" "
                +"\nModelo: "+getModelo()
                +" "+"\nAnio: "+getAnio()
                +" "+"\nNumero puertas: "+getNumeroPuertas()
                +" "+"\nTipo combustible: "+getTipoCombustible() );
    }

    //GET AND SET
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

}//FIN CLASS
