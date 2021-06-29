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
public class Gato extends Animal {
    private String raza;
    private String nombre;
    private int edad;

    public Gato() {
    }

    public Gato(String raza, String nombre, int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Gato(String raza, String nombre, int edad, int numeroPatas, Color color, float peso) {
        super(numeroPatas, color, peso);
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
