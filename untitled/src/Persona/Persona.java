package Persona;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int DNI;
    private int año;
    private  String Paiz;
    private  char Genero;
    public Persona (String Nombre, String Apellido, int DNI, int año,String Paiz, char Genero){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.año = año;
        this.Paiz = Paiz;
        this.Genero = Genero;
    }
    public void Mostrar(){
        System.out.println(Nombre);
        System.out.println(" " + Apellido);
        System.out.print(" Genero " + Genero);
        System.out.println("ID " + DNI);
        System.out.println(" Paiz " + Paiz);
        System.out.println("Año de nacimiento " + año);
    }
}
