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
            scribe un programa en que dado un número del 1 a 7 escriba el correspondiente 
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
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error inesperado");
        }

    }
}
