import java.util.Scanner;

public class Metodos {

    Scanner teclado = new Scanner(System.in);

    // Crear y registrar matriz cuadrada
    public Producto[][] registrarProductos(int n) {

        Producto[][] matriz = new Producto[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.println("\nProducto en posición [" + i + "][" + j + "]");

                System.out.print("Nombre: ");
                String nombre = teclado.nextLine();

                System.out.print("Precio: ");
                double precio = Double.parseDouble(teclado.nextLine());

                System.out.print("¿Está en oferta? (true/false): ");
                boolean oferta = Boolean.parseBoolean(teclado.nextLine());

                matriz[i][j] = new Producto(nombre, precio, oferta);
            }
        }

        return matriz;
    }

    // Contar productos en oferta
    public void contarOfertas(Producto[][] matriz) {

        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas

                if (matriz[i][j].isOferta()) {
                    contador++;
                }
            }
        }

        System.out.println("\nCantidad total de productos en oferta: " + contador);
    }
}
