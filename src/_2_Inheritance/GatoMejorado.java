/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _2_Inheritance;
/**
 *
 * @author manana
 */
public class GatoMejorado extends AnimalMejorado{

    public GatoMejorado(double peso) {
        super(peso);
    }

    public GatoMejorado(String color) {
        super(color);
    }

    public GatoMejorado(double peso, String color) {
        super(peso, color);
    }
    
    @Override
    public void identificar(){
        System.out.print("Soy un GATO MEJORADO");
    }
    @Override
    public void emitirSonido(){
        super.emitirSonido();
        System.out.println("Meaw");
    }
}
