/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_rectangulo;

/**
 *
 * @author casa
 */
public class Rectangulo {

    private int base;// declaro mis atributos y de que tipos de datos es 

    private float haltura;// declaro mis atributos y de que tipos de datos es
    // metodo constructor

    public Rectangulo(int numero1, float numero2) { // el metodo constructor con su parametros que me se servira para inicializar mis atributos
        base = numero1;
        haltura = numero2;
    }

    public Rectangulo(int num1, int num2) { // agrego este metodo para que  pueda almacenar mis datos que ingrese 
        base = num1;
        haltura = num2;
    }
    //metodo get la que me perimte consultar mis datos o mostrar

    public int getBase() {
        return (this.base);
    }

    public float getHaltura() {
        return (this.haltura);
    }

    //agrego este metodo set para que pueda modicar mis datos
    public void setBase(int base) {
        this.base = base;
    }

    public void setHaltura(float haltura) {
        this.haltura = haltura;
    }
    

    public float perimetro() { // en este metodo meto ya la formula que es lo quiero calcular
        return (base + base + haltura + haltura);
    }

    public float area() { // este metodo la voy a utilizar para calcular el area del rectangulo
        return (base * haltura);
    }

}
