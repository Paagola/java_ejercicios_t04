import java.util.Scanner;

public class proof {
    public static void main(String[] args) {
        
// EJERCICIO 22
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 22" + ut.RESET);
        System.err.println("""
               Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora 
               (horas y minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de 
               semana comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.

                """);
            Scanner s = new Scanner(System.in);
            int minutos_luneasAviernes_hasta3 = (24 * 60) * 4 + (15 * 60)  ;
            System.err.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
            try {
                String dia_semana = s.nextLine();
                System.err.println("A continuación introduzca la hora (hora y minutos)");
                System.err.print("Hora: ");
                int hora = s.nextInt();
                System.err.print("Minutos: ");
                int minutos = s.nextInt();

                if (dia_semana.toLowerCase().equals("lunes"))
                    System.err.printf("Quedan %d hasta el fin de semana%n", minutos_luneasAviernes_hasta3);

                else if (dia_semana.toLowerCase().equals("martes")) {
                    int minutos_martesAviernes_hasta3 = minutos_luneasAviernes_hasta3 - (hora*60 + minutos);
                    System.err.printf("Quedan %d hasta el finde%n", minutos_martesAviernes_hasta3);

                } else if (dia_semana.toLowerCase().equals("miércoles") || dia_semana.equals("miercoles")) {
                    int minutos_miercolesAviernes_hasta3 = minutos_luneasAviernes_hasta3 - (hora*60 + minutos) + 86400;
                    System.err.printf("Quedan %d hasta el finde%n", minutos_miercolesAviernes_hasta3);
                }
                
                
            } catch (NumberFormatException e) {
                System.err.println("ERROR! INTRODUCE UN NÚMERO");
            } catch (Exception e) {
                System.err.println("ERROR INESPERADO");
            }

    }
}
