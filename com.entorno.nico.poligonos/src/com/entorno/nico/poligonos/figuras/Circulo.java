package com.entorno.nico.poligonos.figuras;

import java.util.Random;

/**
 * Representa un circulo. Contiene constructores para crear un circulo dado el radio 
 * y para crear un circulo con un radio aleatorio entero entre 1 y 10. Contiene metodos 
 * para calcular el area y el perimetro.
 * 
 * @version 1.0
 * 
 * @author Nico
 *
 */
public class Circulo {
	
	int radio;
	
	/**
     * Crea un circulo con el radio especificado.
     *
     * @param radio    la radio del circulo
     */
    public Circulo (int radio) {
        this.radio = radio;
    }

    /**
     * Crea un circulo con el radio aleatorio.
     * Este sera un numero aleatorios enteros entre 1 y 10.
     * 
     * @see java.util.Random
     */
    public Circulo () {
    	Random numeroAleatorio = new Random ();
    	this.radio = numeroAleatorio.nextInt(10)+1;
    }
    
    /**
     * Devuelve el perimetro del circulo, es decir, la suma de todos los lados.
     *
     * @return  el perimetro del circulo
     */
    public int perimetro() {
        return 2 * Math.PI * this.radio;
    }

    /**
     * Devuelve el area del circulo.
     *
     * @return el area del circulo
     */
    public int area() {
        return Math.PI * this.radio * this.radio;
    }
}
