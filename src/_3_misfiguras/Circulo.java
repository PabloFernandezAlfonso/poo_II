/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _3_misfiguras;

/**
 *
 * @author manana
 */
public class Circulo extends Figuras{
    
    
    private int radio;
    private static final double PI = 3.1416;

    public Circulo() {
        radio = 1;
    }

    public Circulo(double area){
       this.radio = (int)Math.sqrt(area / PI);
    }
    
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public Circulo(String color,int radio) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double perimetro(){
        return  2 * PI * radio ;
    }
    
    @Override
    public double area(){
        return  PI * (radio * radio) ;
    }
    
    @Override
    public String toString() {
        return String.format("El circulo de radio %d, altura %d, area %.2f y perímetro %2.f", radio, area(), perimetro());
    }
    
}
