
import java.util.Scanner;


/**
 *
 * @author Formacion SENA
 */
public class CalculoRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
        scanner.close();
    }
}
