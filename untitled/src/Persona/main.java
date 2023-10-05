package Persona;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona P1 = new Persona("Pepe", "Papa",4568252,1995,"Colombia",'M');
        Persona P2 = new Persona("Carlo","Magno",15248962,1996,"Dallas",'M');
        P1.Mostrar();
        System.out.println(" ");
        P2.Mostrar();
    }
}