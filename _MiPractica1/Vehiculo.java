package _MiPractica1;

public class Vehiculo {

    //ATRIBUTOS
    private String marca;
    private String modelo;
    private int anio;

    //CONSTRUCTOR

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void pedirVehiculo() {
        System.out.println("Pedir vehículo genérico");
    }

    //GET AND SET
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}//class
