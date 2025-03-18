/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_static;


public class Animal {
    
    private int id;
    private int peso;
    private String color;
    private static int cantAnimales;
    private int nextID = 1;

    public Animal(int peso, String color) {
        this.id = --nextID;
        this.peso = peso;
        this.color = color;
        ++cantAnimales;
        ++this.nextID;
    }

    public Animal() {
       this.id = --nextID;
        ++cantAnimales;
        ++nextID;
    }

    public Animal(int peso) {
        this.peso = peso;
        this.id = --nextID;
        ++cantAnimales;
    }

    
    
    public void show(){
    
        System.out.printf("Animal con id: %d, peso: %d, color: %s, cantidad de animales: %d, siguiente id: %d%n", id, peso, color, cantAnimales, nextID);
    }
    
    public void describeClase(){
    
    
        
    }
    
    public static void main(String[] args) {
                  Animal a1 = new Animal(10, "rojo");
                  Animal a2 = new Animal();
                  Animal a3 = new Animal(10);
                  a1.show();
                  a2.show();
                  a3.show();
    }
    
    
}
