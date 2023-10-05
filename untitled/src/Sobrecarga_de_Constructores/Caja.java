package Sobrecarga_de_Constructores;


public class Caja {
    private int longitud_B;
    private int anchura;
    private int altura;
    public Caja (int longitud_B,int anchura,int altura){
        this.longitud_B = longitud_B;
        this.anchura = anchura;
        this.altura = altura;
    }
    public Caja (){
        longitud_B = 0;
        anchura = 0;
        altura = 0;
    }
    public Caja (int tamaño){
        longitud_B = tamaño;
        anchura = tamaño;
        altura = tamaño;
    }
}
