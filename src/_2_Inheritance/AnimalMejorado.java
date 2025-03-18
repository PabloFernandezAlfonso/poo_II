/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _2_Inheritance;
/**
 *
 * @author manana
 */
public abstract class AnimalMejorado {
    
    private double peso;
    private String color;

    public double getPeso() {
        return peso;
    }
    
    public AnimalMejorado(double peso) {
        this.peso = peso;
    }

    public AnimalMejorado(String color) {
        this.color = color;
    }

    public AnimalMejorado(double peso, String color) {
        this.peso = peso;
        this.color = color;
    }
    
    public void identificar(){
        System.out.print("Soy un ANIMAL MEJORADO");
    }
    
    public void emitirSonido(){
        System.out.print("Su sonido es: ");
    }
}
