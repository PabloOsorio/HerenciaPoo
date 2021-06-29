/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.awt.Color;

/**
 *
 * @author pablo
 */
public class Animal {
    private int numeroPatas;
    private Color color;
    private float peso;

    public Animal() {
        this.color = Color.white;
        this.numeroPatas=0;
        this.peso = 0;
    }

    public Animal(int numeroPatas, Color color, float peso) {
        this.numeroPatas = numeroPatas;
        this.color = color;
        this.peso = peso;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", color=" + color + ", peso=" + peso + '}';
    }
    //metodos puede hacer que hagan una accion o que interactuen con los atributos 
    public void emitirSonido(){
        System.out.println("emitir sonido");
    }
    
}
