import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
// EJERCICIO 1
    System.err.println(ut.GREEN_BOLD + "EJERCICIO 1" + ut.RESET);
    System.err.println("""
            Escribe un programa que pida por teclado un día de la semana
            y que diga qué asignatura toca a primera hora ese día.
            """);
        String dia;
        System.err.print("Por favor, introduzca un día de la semana y le diré qué \nasignatura toca a primera hora ese día: ");
        dia = System.console().readLine();

        switch (dia.toLowerCase()) {
            case "lunes", "miércoles", "miercoles" -> System.err.println("Programación");
            case "jueves" -> System.err.println("Sistemas informáticos");
            case "martes", "viernes" -> System.err.println("Bases de Datos");
            default -> System.err.println("El día introducido no es correcto.");
        }
        System.err.printf("%n%n");


// EJERCICIO 2
    System.err.println(ut.GREEN_BOLD + "EJERCICIO 2" + ut.RESET);
    System.err.println("""
            Realiza un programa que pida una hora por teclado y que muestre 
            luego buenos días, buenas tardes o buenas noches según la hora. 
            Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. 
            Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
            """);
        try {
            System.err.print("Por favor, introduzca una hora del día (0 - 23): ");
            int hora_dia = Integer.parseInt(System.console().readLine());
            switch (hora_dia) {
                case 21, 22, 23, 24, 0, 1, 2, 3, 4, 5, 6 -> System.err.println("Buenasnoches");
                case 7, 8, 9, 10, 11 -> System.err.println("Buenosdías");
                case 12, 13, 14, 15, 16, 17, 18, 19, 20 -> System.err.println("Buenastardes");
                default -> System.err.println("La hora introducida no es correcta.");
            }
        
        } catch  (NumberFormatException e) {
            System.err.println("ERROR! Introduce un número!");
            
        } catch (Exception e) {
            System.err.println("ERROR! Ha ocurrido un error inesperado");
        }

        System.err.printf("%n");

// EJERCICIO 3
    System.err.println(ut.GREEN_BOLD + "EJERCICIO 3" + ut.RESET);
    System.err.println("""
            Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente 
            nombre del día de la semana.
            """);
        try{
            System.err.print("Por favor, introduzca un úmero del 1 al 7: ");
            int num_dia = Integer.parseInt(System.console().readLine());

            switch (num_dia) {
                case 1 -> System.err.println("Lunes");
                case 2 -> System.err.println("Martes");
                case 3 -> System.err.println("Miércoles");
                case 4 -> System.err.println("Jueves");
                case 5 -> System.err.println("Viernes");
                case 6 -> System.err.println("Sabado");
                case 7 -> System.err.println("Domingo");
                default -> System.err.println("Día Incorrecto");
            }
        }

         catch (NumberFormatException e) {
             System.err.println("ERROR! Introduce un número!");

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error inesperado");
        }
        System.err.printf("%n%n");

// EJERCICIO 5
    System.err.println(ut.GREEN_BOLD + "EJERCICIO 5" + ut.RESET);
    System.err.println("""
            Realiza un programa que resuelva una ecuación de primer grado 
            (del tipo ax + b = 0).
            """);
        System.err.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        try {
            System.err.print("Por favor, introduzca el valor de a: ");
            double valor_a = Double.parseDouble(System.console().readLine());
            System.err.print("Ahora introduzca el valor de b: ");
            double valor_b = Double.parseDouble(System.console().readLine());
            
            if (valor_a==0) {
                System.err.println("No es una ecuación de primer grado");
            } else {
                double x = -valor_b / valor_a;
                System.err.println("La ecuación es x = " + x);
            } 
        }
        catch (NumberFormatException e) {
            System.err.println("Error! Introduce un número!");
        } catch (Exception e) {
            System.err.println("Error inesperado!");
        }
        System.err.printf("%n");

// EJERCICIO 6
    System.err.println(ut.GREEN_BOLD + "EJERCICIO 6" + ut.RESET);
    System.err.println("""
            Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. 
            Aplica la fórmula t = √2hg siendo g = 9.81m/s2
            """);
        Scanner s = new Scanner(System.in);
            System.err.println("Cálculo del tiempo de caíde de un objeto.");
            System.err.print("Por favor, introduzca la altura (en metro) desde la que cae el objeto: ");  
        try {
            double altura = s.nextDouble();
            double tiempo = Math.sqrt((2*altura) / 9.81);
            System.err.printf("El objeto tarda %.2f segundos en caer", tiempo);
        } catch (NumberFormatException e) {
            System.err.println("ERROR! Introduce un número!");
        } catch (Exception e) {
            System.err.println("ERROR! Error inesperado!");
        }
<<<<<<< HEAD
        System.err.printf("%n%n");

=======
        s.close();
>>>>>>> c87d7778bcccc16496bc4629f0ad650ba6d81aa2
// EJERCICIO 9
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 9" + ut.RESET);
        System.err.println("""
                Realiza un programa que resuelva una ecuación de segundo grado 
                (del tipo ax2 + bx + c = 0).
                """);
<<<<<<< HEAD
            System.err.println("Por favor, introduzca los valores.");
            System.err.print("a = ");
            double a = s.nextDouble();
            System.err.print("b = ");
            double b = s.nextDouble();
            System.err.print("c = ");
            double c = s.nextDouble();
            double discriminante = Math.pow(b, 2) - 4*a*c;
            
            if (Double.isNaN(discriminante)) {
                System.err.println("El número es nulo");
            } else if (discriminante < 0) {
                System.err.println("No hay soluciones reales.");
            } else if (discriminante > 0) {
                System.err.printf("x1 = %f%nx2 = %f", (-b + Math.sqrt(discriminante))/(2*a), (-b - Math.sqrt(discriminante))/(2*a) );
            } else if (discriminante == 0) {
                System.err.printf("x = %f", -b / (2*a));
            } else 
            System.err.printf("");
                }


=======
            System.err.println("Por favor, introduzca los valores.");  
            System.err.print("a = ");
            try {
                double a = s.nextDouble();
                System.err.print("b = ");
                double b = s.nextDouble();
                System.err.print("c = ");
                double c = s.nextDouble();
                double discriminante = Math.pow(b, 2) - 4*a*c;
                
                if (Double.isNaN(discriminante)) {
                    System.err.println("No hay soluciones reales.");
                } else if (discriminante > 0) {
                    System.err.printf("x1 = %f%nx2 = %f", (-b + Math.sqrt(discriminante))/(2*a), (-b - Math.sqrt(discriminante))/(2*a) );
                } else if (discriminante == 0) {
                    System.err.printf("x = %f", -b / (2*a));
                } else 
                System.err.printf("No hay soluciones reales");
            } catch (NumberFormatException e) {
                System.err.println("ERROR! INTRODUCE UN NÚMERO");
            } catch (Exception e) {
                System.err.println("ERROR INESPERADO");
            }
    }
>>>>>>> c87d7778bcccc16496bc4629f0ad650ba6d81aa2
}
