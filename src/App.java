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
        } catch  (NumberFormatException e) {
            System.err.println("ERROR! Introduce un número!");
            
        }


    }
}
