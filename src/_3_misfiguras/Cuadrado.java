/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _3_misfiguras;


/**
 *
 * @author manana
 */
public class Cuadrado extends Figuras{
    
    private int lado;

    public Cuadrado() {
        lado = 1;
    }

    public Cuadrado(double area) {
       
        this.lado = (int)Math.sqrt(lado);
        //super(area) = super(area) + Math.sqrt(lado);
    }

    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    public Cuadrado(String color,int lado) {
        super(color);
        this.lado = lado;
    }
    
    @Override
    public double perimetro(){
        return  lado * 4;
    }
    
    @Override
    public double area(){
        return  lado * lado;
    }

    @Override
    public String toString() {
        return String.format("El cuadrado de lado %d, area %.2f y perímetro %2.f", lado, area(), perimetro());
    }
    
}
