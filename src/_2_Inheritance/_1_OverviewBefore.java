/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _2_Inheritance;

/**
 *
 * @author manana
 */
public class _1_OverviewBefore {
    public static void main(String[] args) {
        Animal a = new Animal(250);
        Gato g = new Gato(6);
        Perro p = new Perro(40.5);

        a.identificar();
        System.out.printf(" y peso %f,%n", a.getPeso());
        g.identificar();
        System.out.printf(" y peso %f,%n", g.getPeso());
        p.identificar();
        System.out.printf(" y peso %f,%n", p.getPeso());

        
    }
}
