import java.util.Scanner;

public class proof {
    public static void main(String[] args) {
        
    
    // EJERCICIO 9
    System.err.println(ut.GREEN_BOLD + "EJERCICIO 9" + ut.RESET);
    System.err.println("""
            Realiza un programa que resuelva una ecuación de segundo grado 
            (del tipo ax2 + bx + c = 0).
            """);
        Scanner s = new Scanner(System.in);
        System.err.println("Por favor, introduzca los valores.");  
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double discriminante = Math.pow(b, 2) - 4*a*c;
        
        if (discriminante < 0) {
            System.err.println("No hay soluciones reales.");
        } else if (discriminante > 0) {
            System.err.printf("x1 = %f%nx2 = %f", (-b + Math.sqrt(discriminante))/(2*a), (-b - Math.sqrt(discriminante))/(2*a) );
        } else if (discriminante == 0) {
            System.err.printf("x = %f", -b / (2*a));
        } else 
        System.err.printf("");
    }
}
