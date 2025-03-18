package _5_arrayList;

import java.util.ArrayList;

public class ArrayEjemplo1 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        String[] baseColores = {"rojo", "amarillo", "verde", "rojo", "amarillo", "azul", "naranja", "marrón", "verde"};
        
        // Poblar el ArrayList hasta 100 elementos
        while (colores.size() < 100) {
            for (String color : baseColores) {
                if (colores.size() < 100) {
                    colores.add(color);
                    
                } else {
                    break;
                }
            }
        }
        
        // Imprimir con for
        System.out.println("for\n---");
        for (int i = 0; i < colores.size(); i++) {
            System.out.print(colores.get(i) + " ");
        }
        System.out.println("\n");
        
        // Imprimir con for-each
        System.out.println("for-each\n--------");
        for (String color : colores) {
            System.out.print(color + " ");
        }
        System.out.println("\n");
        
        // Borrar el segundo "rojo"
        int rojoCount = 0;
        for (int i = 0; i < colores.size(); i++) {
            if (colores.get(i).equals("rojo")) {
                rojoCount++;
                if (rojoCount == 2) {
                    colores.remove(i);
                    break;
                }
            }
        }
        
        // Mostrar lista tras borrar segundo "rojo"
        System.out.println("ArrayList despues de borrado segundo rojo\n-----------------------------------------");
        for (String color : colores) {
            System.out.print(color + " ");
        }
        System.out.println("\n");
        
        // Borrar todos los "amarillo"
        while (colores.contains("amarillo")) {
            colores.remove("amarillo");
        }
        
        // Mostrar lista tras borrar "amarillos"
        System.out.println("ArrayList despues de borrado todos los amarillos\n------------------------------------------------");
        for (String color : colores) {
            System.out.print(color + " ");
        }
        System.out.println();
    }
}

