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
public class TDA_Rectangulo {

   
    public static void main(String[] args) {
        

        Rectangulo rectangulo1 = new Rectangulo(10, 15); // aqui cree un objeto y se instancia
        Rectangulo rectangulo2 = new Rectangulo(5, 8); // aqui creo otro objeto y la instancio para que pueda socitar datos de la segunda figura pero con diferentes tipos de datos

        float perimetro; // declaro la variable donde se va almacenar el resultado del perimetro
        perimetro = rectangulo1.perimetro(); // aqui mando llamar el metodo que quiero para que calcule mi perimetro
        System.out.println("el perimetro del rectangulo es:" + perimetro); //envio un mensaje y mando a llamar la variable donde almacenë mis datos 
        float area;//declaro la variable donde se va almacenar el resultado del perimetro
        area = rectangulo1.area();// aqui mando llamar el metodo que quiero para que calcule el area del rectangulo
        System.out.println("el area del rectangulo es:" + area);//envio un mensaje y mando a llamar la variable donde almacenë mis datos 
        System.out.println("datos de la figura 2");
// datos del la figura rectangulo 2
        int perimetro1; // declaro la variable donde se va almacenar el resultado del perimetro
        perimetro = rectangulo2.perimetro(); // aqui mando llamar el metodo que quiero para que calcule mi perimetro
        System.out.println("el perimetro del rectangulo es:" + perimetro); //envio un mensaje y mando a llamar la variable donde almacenë mis datos 
         int area1;//declaro la variable donde se va almacenar el resultado del perimetro
        area = rectangulo2.area();// aqui mando llamar el metodo que quiero para que calcule el area del rectangulo
        System.out.println("el area del rectangulo es:" + area);//envio un mensaje y mando a llamar la variable donde almacenë mis datos 
    }

}
