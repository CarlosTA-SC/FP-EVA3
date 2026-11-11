/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA3_9_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor;
        boolean valorEncontrado = false;
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.print("[" + valores[i] + "]");
        }
        do{
            System.out.println("Introduce el valor a buscar en el arreglo");
            valor = captu.nextInt();
            captu.nextLine();
            for (int i = 0; i < valores.length; i++) {
                if(valor == valores[i]){
                    System.out.println("ENCONTRASTE EL VALOR: ESTA EN LA POSICION: " + i);
                    valorEncontrado = true;
                    break;
                    
                } 
            } 
            // pedir, buscar, si se encuentra, salir
            if(valorEncontrado){
                break;
            }
        } while(true);
      }
    }
    

