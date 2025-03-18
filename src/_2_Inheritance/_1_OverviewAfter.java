/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _2_Inheritance;

/**
 *
 * @author manana
 */
public class _1_OverviewAfter {
    public static void main(String[] args) {
        //(abstracto)AnimalMejorado a = new AnimalMejorado(250);
        GatoMejorado g = new GatoMejorado(6);
        PerroMejorado p = new PerroMejorado(40.5);
        OsoMejorado o = new OsoMejorado(200);
        AnimalMejorado x = g;
        
        AnimalMejorado[] arrayAnimalMejorado = {
           new GatoMejorado("rojo"),
           new PerroMejorado(6),
           new OsoMejorado(500, "naranja"),
        };
       GatoMejorado[] arrayGatosMejorado ={
           new GatoMejorado("rojo"),
           new GatoMejorado(6),
           new GatoMejorado(5, "naranja"),
       };
       PerroMejorado[] arrayPerroMejorado ={
           new PerroMejorado("rojo"),
           new PerroMejorado(6),
           new PerroMejorado(5, "naranja"),
       } ;
       
        System.out.println("Gatos");
        for (PerroMejorado lista : arrayPerroMejorado) {
            lista.emitirSonido();
        }
        System.out.println("Perros");
        for (GatoMejorado lista : arrayGatosMejorado) {
            lista.emitirSonido();
        }
        System.out.println("Animales");
        for (AnimalMejorado lista : arrayAnimalMejorado) {
            lista.emitirSonido();
        }
        
        
        /*a.identificar();
        System.out.printf(" y peso %.2f.%n", a.getPeso());
       //Abstracta
        g.identificar();
        System.out.printf(" y peso %.2f.%n", g.getPeso());
        p.identificar();
        System.out.printf(" y peso %.2f.%n", p.getPeso());
        o.identificar();
        System.out.printf(" y peso %.2f.%n", o.getPeso());*/

    }
}
