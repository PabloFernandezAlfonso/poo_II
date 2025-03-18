/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _3_misfiguras;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author manana
 */
public class Color {
    
    private static String[] colores ={"negro", "azul", "marrón", "gris", "verde", "naranja", "rosa", "púrpura", "rojo", "blanco ","amarillo"};
    
    public static String[] ListaColores(){
        return colores;    
    }
    
    public static String dameColor(String colorTentativo){
        for (String color : colores) {
            if(color.equalsIgnoreCase(
                    colorTentativo)){
                return color;
            }
        }
        return colores[0];
    }
    
    
    
}
