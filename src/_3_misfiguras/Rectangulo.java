/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _3_misfiguras;



/**
 *
 * @author manana
 */
public class Rectangulo extends Figuras{
    
    private int base;
    private int altura;

    public Rectangulo() {
        base = 2;
        altura = 1;
    }

    public Rectangulo(double area){
         
        
        altura = (int)Math.sqrt(area / 2);
        /*super(area) = base * altura;
         base = 2 * altura;*/
    }
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(String color,int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double perimetro(){
        return  base * 2 + altura * 2;
    }
    
    @Override
    public double area(){
        return  base * altura;
    }
    
    @Override
    public String toString() {
        return String.format("El rectangulo de base %d, altura %d, area %.2f y perímetro %2.f", base, altura, area(), perimetro());
    }
    
}
