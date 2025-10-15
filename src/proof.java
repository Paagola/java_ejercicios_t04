import java.util.Scanner;

public class proof {
    public static void main(String[] args) {
        
        // EJERCICIO 11
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 11" + ut.RESET);
        System.err.println("""
                Escribe un programa que dada una hora determinada (horas y minutos), 
                calcule los  segundos que faltan para llegar a la medianoche.
                """);
            try {
            Scanner s = new Scanner(System.in);
            System.err.println("A continuación deberá introducir una hora del día, primero introducirá la hora y luego los minutos.");  
            System.err.print("Hora: ");
            int hora = s.nextInt();
            System.err.print("Minutos: ");
            int mins = s.nextInt();
            int segundos_día = (24 * 60) * 60;

            if (hora > 23 || mins > 59) {
                System.err.println("Introduce un rango de horas adecuado");
            } else {
                int segundos_dia_recorrido = (hora * 60 + mins) * 60;
                System.err.printf("Desde las %d:%d hasta la medianoche faltan %d segundos", hora, mins, segundos_día - segundos_dia_recorrido);
            }
            } 
            
            catch (NumberFormatException e) {
                System.err.println("ERROR! INTRODUZCA UN NÚMERO");
            } catch (Exception e) {
                System.err.println("ERROR INESPERADO!");
            }
    
<<<<<<< HEAD
        
=======
>>>>>>> c87d7778bcccc16496bc4629f0ad650ba6d81aa2
    }
}
