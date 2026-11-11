/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

/**
 *
 * @author carlos
 */
public class EVA3_7_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] productos = {
            "Hamburguesa Clásica",
            "Tacos de Asada (3 uds)",
            "Pizza Margherita",
            "Ensalada César",
            "Pasta Alfredo",
            "Club Sandwich",
            "Papas a la Francesa",
            "Malteada de Chocolate",
            "Refresco de Lata",
            "Pastel de Queso"
        };

        double[] precios = {
            145.50,
            120.00,
            185.90,
            95.00,
            160.75,
            115.25,
            55.00,
            65.50,
            35.00,
            75.80
        };

        System.out.println("==========================================");
        System.out.println("          MENÚ DEL RESTAURANTE            ");
        System.out.println("==========================================");
        System.out.printf("%-4s %-25s %10s%n", "No.", "Producto", "Precio");
        System.out.println("------------------------------------------");

        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%-4d %-25s $%9.2f%n", (i + 1), productos[i], precios[i]);
        }

        System.out.println("==========================================");
        System.out.println("        ¡Gracias por su visita!           ");
        System.out.println("==========================================");
    }
}
