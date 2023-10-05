package Sobrecarga_de_Constructores;

public class Empleado {
    private int identificador;
    private String Nombre;
    private String Apellido;
    private int edad;
    public Empleado (){
        identificador = identificador;
        Nombre = "Nuevo empleado";
        Apellido = "Nuevo empleado";
        edad = 18;
    }
    public Empleado (int identificador,String Nombre,String Apellido,int edad){
        this.identificador = identificador;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }
}