import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Metodos m = new Metodos();

        System.out.print("Ingrese el tamaño n de la matriz cuadrada: ");
        int n = Integer.parseInt(teclado.nextLine());

        Producto[][] matriz = m.registrarProductos(n);

        m.contarOfertas(matriz);
    }
}
