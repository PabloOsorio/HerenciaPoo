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
public class Perro extends Animal {
    private String raza;
    private int edad;
    private String nombre;

    public Perro() {
    }

    public Perro(String raza, int edad, String nombre) {
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Perro(String raza, int edad, String nombre, int numeroPatas, Color color, float peso) {
        super(numeroPatas, color, peso);//Super quiere decir que ya esta inicializado es muy necesario
        this.raza = raza;
        this.edad = edad;//Despues los atributos unicos de esta clase
        this.nombre = nombre;
    }
  
    @Override//Sobrecarga "Polimorfismo"
    public void emitirSonido() {
        super.emitirSonido();
        System.out.println("Gouf");//To change body of generated methods, choose Tools | Templates.
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "raza=" + raza + ", edad=" + edad + ", nombre=" + nombre + '}';
    }
    
}
