import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("""
                1. EJERCICIO 1
                2. EJERCICIO 2
                3. EJERCICIO 3
                4. EJERCICIO 5
                5. EJERCICIO 6
                6. EJERCICIO 9
                7. EJERCICIO 11
                8. EJERCICIO 13
                9. EJERCICIO 17
                10. EJERCICIO 18
                11. EJERCICIO 19
                12. EJERCICIO 20
                13. EJERCICIO 22
                14. EJERCICIO 24
                """);
        System.out.print("Elige una opción --> ");
                int ejercicio = s.nextInt();
                s.nextLine();
        System.out.println();

        switch (ejercicio) {

            case 1: // EJERCICIO 1
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 1" + ut.RESET);
                System.err.println("""
                        Escribe un programa que pida por teclado un día de la semana
                        y que diga qué asignatura toca a primera hora ese día.
                        """);
                String dia;
                System.err.print(
                        "Por favor, introduzca un día de la semana y le diré qué \nasignatura toca a primera hora ese día: ");
                dia = System.console().readLine();

                switch (dia.toLowerCase()) {
                    case "lunes", "miércoles", "miercoles" -> System.err.println("Programación");
                    case "jueves" -> System.err.println("Sistemas informáticos");
                    case "martes", "viernes" -> System.err.println("Bases de Datos");
                    default -> System.err.println("El día introducido no es correcto.");
                }
                break;

            case 2: // EJERCICIO 2
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

                } catch (NumberFormatException e) {
                    System.err.println("ERROR! Introduce un número!");

                } catch (Exception e) {
                    System.err.println("ERROR! Ha ocurrido un error inesperado");
                }
                break;

            case 3: // EJERCICIO 3
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 3" + ut.RESET);
                System.err.println("""
                        Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
                        nombre del día de la semana.
                        """);
                try {
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
                break;

            case 4: // EJERCICIO 5
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

                    if (valor_a == 0) {
                        System.err.println("No es una ecuación de primer grado");
                    } else {
                        double x = -valor_b / valor_a;
                        System.err.println("La ecuación es x = " + x);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Error! Introduce un número!");
                } catch (Exception e) {
                    System.err.println("Error inesperado!");
                }
                System.out.println();

            case 5: // EJERCICIO 6
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 6" + ut.RESET);
                System.err.println("""
                        Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
                        Aplica la fórmula t = √2hg siendo g = 9.81m/s2
                        """);
                System.err.println("Cálculo del tiempo de caíde de un objeto.");
                System.err.print("Por favor, introduzca la altura (en metro) desde la que cae el objeto: ");
                try {
                    double altura = s.nextDouble();
                    double tiempo = Math.sqrt((2 * altura) / 9.81);
                    System.err.printf("El objeto tarda %.2f segundos en caer", tiempo);
                } catch (NumberFormatException e) {
                    System.err.println("ERROR! Introduce un número!");
                } catch (Exception e) {
                    System.err.println("ERROR! Error inesperado!");
                }
                break;

            case 6: // EJERCICIO 9
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 9" + ut.RESET);
                System.err.println("""
                        Realiza un programa que resuelva una ecuación de segundo grado
                        (del tipo ax2 + bx + c = 0).
                        """);
                System.err.println("Por favor, introduzca los valores.");
                System.err.print("a = ");
                try {
                    double a = s.nextDouble();
                    System.err.print("b = ");
                    double b = s.nextDouble();
                    System.err.print("c = ");
                    double c = s.nextDouble();
                    double discriminante = Math.pow(b, 2) - 4 * a * c;

                    if (Double.isNaN(discriminante)) {
                        System.err.println("No hay soluciones reales.");
                    } else if (discriminante > 0) {
                        System.err.printf("x1 = %f%nx2 = %f", (-b + Math.sqrt(discriminante)) / (2 * a),
                                (-b - Math.sqrt(discriminante)) / (2 * a));
                    } else if (discriminante == 0) {
                        System.err.printf("x = %f", -b / (2 * a));
                    } else
                        System.err.printf("No hay soluciones reales");
                } catch (NumberFormatException e) {
                    System.err.println("ERROR! INTRODUCE UN NÚMERO");
                } catch (Exception e) {
                    System.err.println("ERROR INESPERADO");
                }
                break;

            case 7: // EJERCICIO 11
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 11" + ut.RESET);
                System.err.println("""
                        Escribe un programa que dada una hora determinada (horas y minutos),
                        calcule los  segundos que faltan para llegar a la medianoche.
                        """);
                try {
                    System.err.println(
                            "A continuación deberá introducir una hora del día, primero introducirá la hora y luego los minutos.");
                    System.err.print("Hora: ");
                    int hora = s.nextInt();
                    System.err.print("Minutos: ");
                    int mins = s.nextInt();
                    int segundos_día = (24 * 60) * 60;

                    if (hora > 23 || mins > 59) {
                        System.err.println("Introduce un rango de horas adecuado");
                    } else {
                        int segundos_dia_recorrido = (hora * 60 + mins) * 60;
                        System.err.printf("Desde las %d:%d hasta la medianoche faltan %d segundos", hora, mins,
                                segundos_día - segundos_dia_recorrido);
                    }
                }

                catch (NumberFormatException e) {
                    System.err.println("ERROR! INTRODUZCA UN NÚMERO");
                } catch (Exception e) {
                    System.err.println("ERROR INESPERADO!");
                }
                break;

            case 8: // EJERCICIO 13
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 13" + ut.RESET);
                System.err.println("""
                        Escribe un programa que ordene tres números enteros introducidos por teclado.
                        """);
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
                        if (num1 < num2 && num2 < num3)
                            System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.",
                                    num1,
                                    num2, num3);
                        else
                            System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.",
                                    num1,
                                    num3, num2);
                    else if (num2 < num1 && num2 < num3)
                        if (num2 < num1 && num1 < num3)
                            System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.",
                                    num2,
                                    num1, num3);
                        else
                            System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.",
                                    num2,
                                    num3, num1);
                    else if (num3 < num2 && num3 < num1)
                        if (num3 < num2 && num2 < num1)
                            System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.",
                                    num3,
                                    num2, num1);
                        else
                            System.err.printf("Los números introducidos ordenados de mayor a menos son %d, %d y %d.",
                                    num3,
                                    num1, num2);
                } catch (NumberFormatException e) {
                    System.err.println("ERROR! INTRODUCE UN NÚMERP");
                } catch (Exception e) {
                    System.err.println("ERROR INESPERADO");
                }
                break;

            case 9: // EJERCICIO 17
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 17" + ut.RESET);
                System.err.println(
                        """
                                Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

                                """);
                System.err.println(
                        "Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.");
                System.err.print("Por favor, introduzca un número entero: ");
                try {
                    int numero = s.nextInt();
                    System.err.println("La ultima cifra del número introducido es " + numero % 10);
                } catch (NumberFormatException e) {
                    System.err.println("ERROR! INTRODUCE UN NÚMERO");
                } catch (Exception e) {
                    System.err.println("ERROR INESPERADO");
                }
                break;

            case 10: // EJERCICIO 18
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 18" + ut.RESET);
                System.err.println(
                        """
                                Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

                                """);
                System.err.println(
                        "Escribe un programa que diga cuál es la primera cifra de un número entero positivo introducido por teclado. Se permiten números de hasta 5 cifras.");
                System.err.print("Por favor, introduzca un número entero positivo (de 5 cifras como máximo): ");
                try {
                    int numero = s.nextInt();

                    if (numero < 10)
                        System.err.println("La primera cifra del número introducido es el: " + numero);
                    else if (numero < 100)
                        System.err.println(
                                "La primera cifra del número introducido es el: " + (int) Math.floor(numero / 10));
                    else if (numero < 1000)
                        System.err.println(
                                "La primera cifra del número introducido es el: " + (int) Math.floor(numero / 100));
                    else if (numero < 10000)
                        System.err.println(
                                "La primera cifra del número introducido es el: " + (int) Math.floor(numero / 1000));
                    else if (numero < 100000)
                        System.err
                                .println("La primera cifra del número introducido es el: "
                                        + (int) Math.floor(numero / 10000));
                    else
                        System.err.println("No puedes introducir un número de 6 cifras");

                } catch (NumberFormatException e) {
                    System.err.println("ERROR! INTRODUCE UN NÚMERO");
                } catch (Exception e) {
                    System.err.println("ERROR INESPERADO");
                }
                break;

            case 11: // EJERCICIO 19
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 19" + ut.RESET);
                System.err.println(
                        """
                                Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo.
                                Se permiten números de hasta 5 dígitos.
                                """);
                System.err.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
                try {
                    int numero = s.nextInt();
                    if (numero < 10 && numero > -10)
                        System.err.println("El número tiene 1 dígito");
                    else if (numero < 100 && numero > -100)
                        System.err.println("El número tiene 2 dígitos");
                    else if (numero < 1000 && numero > -1000)
                        System.err.println("El número tiene 3 dígitos");
                    else if (numero < 10000 && numero > -10000)
                        System.err.println("El número tiene 4 dígitos");
                    else if (numero < 100000 && numero > -100000)
                        System.err.println("El número tiene 5 dígitos");
                    else
                        System.err.println("Has introducido un númeor mayor a 5 cifras");
                } catch (NumberFormatException e) {
                    System.err.println("ERROR! INTRODUCE UN NÚMERO");
                } catch (Exception e) {
                    System.err.println("ERROR INESPERADO");
                }
                break;

            case 12:// EJERCICIO 20
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 20" + ut.RESET);
                System.err.println(
                        """
                                Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten
                                números de hasta 5 cifras.

                                """);
                System.err.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
                try {
                    int capicua = s.nextInt();
                    if (capicua < 10)
                        System.err.printf("El número %d es capicúa.", capicua);
                    else if (capicua < 100) {
                        System.err.printf("El número %d %s es capicúa", capicua,
                                (capicua % 10) == Math.floor(capicua / 10) ? "si" : "no");
                    } else if (capicua < 1000)
                        System.err.printf("EL número %d %s es capicúa", capicua,
                                (capicua % 100) == Math.floor(capicua / 100) ? "si" : "no");
                    else if (capicua < 10000) {
                        int a = capicua / 1000;
                        int b = (capicua / 100) % 10;
                        int c = (capicua / 10) % 10;
                        int d = capicua % 10;
                        System.err.printf("El número %d %s capicúa.", capicua, ((a == d) && (b == c)) ? "si" : "no");
                    } else
                        System.err.println("No puedes introducir un número de más de 5 dígitos!!");

                } catch (NumberFormatException e) {
                    System.err.println("ERROR! INTRODUCE UN NÚMERO");
                } catch (Exception e) {
                    System.err.println("ERROR INESPERADO");
                }
                break;

            case 13: // EJERCICIO 22
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 22" + ut.RESET);
                System.err.println(
                        """
                                Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora
                                (horas y minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de
                                semana comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.
                                        """);
                int minutos_luneasAviernes_hasta3 = (24 * 60) * 4 + (15 * 60);
                System.err.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
                try {
                    String dia_semana = s.nextLine();
                    System.err.println("A continuación introduzca la hora (hora y minutos)");

                    System.err.print("Hora: ");
                    int hora = s.nextInt();

                    System.err.print("Minutos: ");
                    int minutos = s.nextInt();

                    int minutos_dia_entero = 1440;
                    switch (dia_semana.toLowerCase()) {

                        case "lunes":
                            System.err.printf("Quedan %d minutos hasta el fin de semana%n",
                                    minutos_luneasAviernes_hasta3);
                            break;

                        case "martes":
                            int minutos_martesAviernes_hasta3 = minutos_luneasAviernes_hasta3
                                    - ((hora * 60 + minutos) + minutos_dia_entero);
                            System.err.printf("Quedan %d minutos hasta el finde%n", minutos_martesAviernes_hasta3);
                            break;

                        case "miercoles", "miércoles":
                            int minutos_miercolesAviernes_hasta3 = minutos_luneasAviernes_hasta3
                                    - ((hora * 60 + minutos) + minutos_dia_entero * 2);
                            System.out.printf("Quedan %d minutos hasta el finde%n", minutos_miercolesAviernes_hasta3);
                            break;

                        case "jueves":
                            int minutos_juevesAviernes_hasta3 = minutos_luneasAviernes_hasta3
                                    - ((hora * 60 + minutos) + minutos_dia_entero * 3);
                            System.out.printf("Quedan %d miutos hasta el finde%n", minutos_juevesAviernes_hasta3);
                            break;

                        case "viernes":
                            int minutos_viernesAviernes_hasta3 = minutos_luneasAviernes_hasta3
                                    - ((hora * 60 + minutos) + minutos_dia_entero * 4);
                            System.out.printf("Quedan %d minutos hasta el finde%n", minutos_viernesAviernes_hasta3);
                            break;

                        default:
                            System.err.println("Introduce un día de la semana");

                    }

                } catch (NumberFormatException e) {
                    System.err.println("ERROR! INTRODUCE UN NÚMERO");
                } catch (Exception e) {
                    System.err.println("ERROR INESPERADO");
                }
                break;

            case 14: // EJERCICIO 24
                System.err.println(ut.GREEN_BOLD + "EJERCICIO 24" + ut.RESET);
                System.err.println(
                        """
                                Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:

                                    - Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), los días que ha estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
                                    - El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior, un prog. senior o un jefe de proyecto respectivamente.
                                    - Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al sueldo neto
                                    hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en caso de estar casado.
                                                            """);

                System.err.print("""
                        1. Programador Junior
                        2. Progrmador senior
                        3. Jefe de proyecto
                        """);
                System.out.print("Introduzca el cargo del empleo (1 - 3): ");
                try {
                    int cargo_empleado = s.nextInt();

                    System.out.print("¿Cuántos días has estado de viaje visitando clientes?: ");
                    int dias_viaje = s.nextInt();

                    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
                    int estado_civil = s.nextInt();

                    switch (cargo_empleado) {
                        case 1: {
                            double sueldo_base = 950;
                            int IRPF = (estado_civil == 1 ? 25 : 20);
                            double sueldo_bruto = sueldo_base + (dias_viaje * 30.0);
                            double retencion_IRPF = sueldo_bruto * (IRPF / 100.0);
                            System.err.printf("""
                                    ------------------------------------
                                    | Sueldo base:   %-6.2f            |
                                    | Dietas ( 5 viajes)  %-6.2f       |
                                    |----------------------------------|
                                    | Sueldo bruto:  %-7.2f            |
                                    | Retención IRPF (%% %d): %-7.2f   |
                                    |----------------------------------|
                                    | Sueldo neto:  %-6.2f             |
                                    ------------------------------------
                                                    """,
                                    sueldo_base, dias_viaje * 30.0,
                                    sueldo_bruto,
                                    IRPF, retencion_IRPF,
                                    sueldo_bruto - retencion_IRPF);
                            break;
                        }

                        case 2: {
                            double sueldo_base = 1200;
                            int IRPF = (estado_civil == 1 ? 25 : 20);
                            double sueldo_bruto = sueldo_base + (dias_viaje * 30.0);
                            double retencion_IRPF = sueldo_bruto * (IRPF / 100.0);
                            System.err.printf("""
                                    --------------------------------------
                                    | Sueldo base: %-6.2f               |
                                    | Dietas ( 5 viajes)  %-7.2f        |
                                    |------------------------------------|
                                    | Sueldo bruto:  %-7.2f             |
                                    | Retención IRPF (%% %d): %-8.2f    |
                                    |------------------------------------|
                                    | Sueldo neto:  %-6.2f              |
                                    --------------------------------------
                                                    """,
                                    sueldo_base, dias_viaje * 30.0,
                                    sueldo_bruto,
                                    IRPF, retencion_IRPF,
                                    sueldo_bruto - retencion_IRPF);
                            break;
                        }

                        case 3: {
                            double sueldo_base = 1600;
                            int IRPF = (estado_civil == 1 ? 25 : 20);
                            double sueldo_bruto = sueldo_base + (dias_viaje * 30.0);
                            double retencion_IRPF = sueldo_bruto * (IRPF / 100.0);
                            System.err.printf("""
                                    --------------------------------------
                                    | Sueldo base: %-6.2f               |
                                    | Dietas ( 5 viajes)  %-7.2f        |
                                    |------------------------------------|
                                    | Sueldo bruto:  %-7.2f             |
                                    | Retención IRPF (%% %d): %-8.2f    |
                                    |------------------------------------|
                                    | Sueldo neto:  %-6.2f              |
                                    --------------------------------------
                                                    """,
                                    sueldo_base, dias_viaje * 30.0,
                                    sueldo_bruto,
                                    IRPF, retencion_IRPF,
                                    sueldo_bruto - retencion_IRPF);
                            break;
                        }
                        default:
                            System.out.println("Puesto fuera de rango");
                            break;
                    }

                } catch (NumberFormatException e) {
                    System.err.println("ERROR! INTRODUCE UN NÚMERO");
                } catch (Exception e) {
                    System.err.println("ERROR INESPERADO");
                }
            break;

            default : System.out.println("El número introducido no corresponde a ningún ejercicio");
        }
    }
}
