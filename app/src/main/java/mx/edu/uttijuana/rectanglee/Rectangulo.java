package mx.edu.uttijuana.rectanglee;

public class Rectangulo {
    //atributos
    private double ancho, alto;

    //propiedades

    public double getAncho() { return this.ancho;}
    public void setAncho(double valor){this.ancho= valor;}

    public double getAlto() { return this.alto;}
    public void setAlto(double valor){this.alto= valor;}

    public double getArea() { return this.ancho * this.alto;}

    public double getPerimetro() { return (this.ancho + this.alto)*2;}


    //constructores
    public Rectangulo()
    {
        this.ancho = 0;
        this.alto  = 0;
    }

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

}