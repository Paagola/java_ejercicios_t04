import java.util.Scanner;

public class proof {
    public static void main(String[] args) {
        
        // EJERCICIO 11
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 11" + ut.RESET);
        System.err.println("""
                Escribe un programa que ordene tres números enteros introducidos por teclado.
                """);
            Scanner s = new Scanner(System.in);
            System.err.println("Este programa ordena tres números introducidos por teclado.");
            System.err.println("Por favor, vaya introduciendo los tres números y pulsando INTRO: ");
            try {
            System.err.print("-> ");
            int num1 = s.nextInt();
            System.err.print("-> ");
            int num2 = s.nextInt();
            System.err.print("-> ");
            int num3 = s.nextInt();

            if (num1 < num2 && num1 < num3)
                if (num1 < num2 && num2 < num3 )
                    System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.", num1, num2, num3);
                else System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.", num1, num3, num2);
            else if (num2 < num1 && num2 < num3)
                if (num2 < num1 && num1 < num3)
                    System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.", num2, num1, num3);
                else System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.", num2, num3, num1);
            else if (num3 < num2 && num3 < num1)
                if (num3 < num2 && num2 < num1)
                System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.", num3, num2, num1);
                else System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.", num3, num1, num2);
            } catch (NumberFormatException e) {
                System.err.println("ERROR! INTRODUCE UN NÚMERP");
            } catch (Exception e) {
                System.err.println("ERROR INESPERADO");
            }
    }
}
