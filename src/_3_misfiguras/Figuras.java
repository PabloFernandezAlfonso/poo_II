/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _3_misfiguras;

/**
 *
 * @author manana
 */
public abstract class Figuras {
    private String color;
    private double area;

    public double getArea() {
        return area;
    }

    public Figuras() {
    }
    
    public Figuras(String color) {
        this.color = color;
    }

    public Figuras(double area) {
        this.area = area;
    }
    
    
    public abstract double perimetro();
    
    public abstract double area();
    
    public  boolean compararAreas(Figuras f){
         return this.area() == f.area();
    }
    
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
