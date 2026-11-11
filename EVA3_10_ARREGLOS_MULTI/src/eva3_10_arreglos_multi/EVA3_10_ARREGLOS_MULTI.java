/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_arreglos_multi;

/**
 *
 * @author carlos
 */
public class EVA3_10_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Arreglo de una dimension
        int datos[] = new int[10];
        //Arreglo de dos dimensiones(Matriz)
        int matriz[][] = new int [3][3];
        for (int i = 0; i < matriz.length; i++) {//FILAS
        for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
            matriz[i][j] = (int)(Math.random() * 100);
        }
    }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i][j]; j++) {
                System.out.println("(" +matriz[i][j] + ")");
        }
                 }
        System.out.println("");
        }
        }
  