import java.util.Scanner;

public class App {

    static boolean isAlive;

    public static void main(String[] args) throws Exception {
        // tiposPrimitivos();
        // operadoresAritmeticos();
        // clasesDeUtilidad();
        // operadoresLogicos();
        // controlFlujo();
        debugersYDragons();
    }

    /** Tipos primitivos */
    public static void tiposPrimitivos() {
        byte hp = 127; // -127 a 127
        short score = 300; // -32,768 a 32,767
        int atacks = 1500; // -2,147,483,648 a 2,147,483,647
        long distance = 150000L; // -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        float speed = 14.3f; // 6 a 7 decimales
        double power = 20.88181818181818;
        char grade = 'A'; // Un solo caracter

        System.out.println("Hp: " + hp + "\nScore: " + score + "\nAtacks: " + atacks + "\nDistance: " + distance
                + "\nSpeed: " + speed + "\nPower: " + power + "\nGrade: " + grade + "\nIs Alive: " + isAlive);
    }

    /** Clases de utilidad */
    public static void clasesDeUtilidad() {
        String player = "Hero";
        System.out.println("Player: " + player + " Longitud del nombre: " +
                player.length());
        Integer score = 1500; // wrappers
        score = Integer.parseInt("2000");
        System.out.println("Score: " + score);
        double power = Math.pow(3, 2);
        System.out.println("Power: " + power);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }

    /** Operadores aritmeticos */
    public static void operadoresAritmeticos() {
        int a = 10;
        int b = 5;

        int sum = a + b;
        int rest = a - b;
        int mult = a * b;
        int div = a / b;
        int resto = a % b;

        System.out
                .println("Sum: " + sum + "\nRest: " + rest + "\nMult: " + mult + "\nDiv: " + div + "\nResto: " + resto);

        sum += 5; // sum = sum + 5
        rest -= 2; // rest = rest - 2
        mult *= 3; // mult = mult * 3
        div /= 2; // div = div / 2
        resto %= 2; // resto = resto % 2
        sum++; // sum = sum + 1
        rest--; // rest = rest - 1
        System.out
                .println("Sum: " + sum + "\nRest: " + rest + "\nMult: " + mult + "\nDiv: " + div + "\nResto: " + resto);
    }

    // ** Operadores lógicos */

    public static void operadoresLogicos() {
        int a = 10;
        int b = 5;

        if (a > b) {
            System.out.println("a es mayor que b");
        }
        if (b < a) {
            System.out.println("a es menor que b");
        }
        b = 10;
        if (a >= b) {
            System.out.println("a es mayor o igual que b");
        }
        if (b <= a) {
            System.out.println("a es menor o igual que b");
        }
        a = -2;
        if (a > 0 && b > 0) {
            System.out.println("a y b son positivos");
        }

        if (a > 0 || b > 0) {
            System.out.println("a o b son positivas");
        }

        if (!isAlive) {
            System.out.println("El personaje no está vivo");
        }
        b = -2;
        if (a == b) {
            System.out.println("a es igual que b");
        }
        if (a != b) {
            System.out.println("a es diferente que b");
        }
    }

    /** Control de flujo */
    public static void controlFlujo() {
        int num = 7;
        // IF, IF-ELSE
        if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // IF TERNARIO
        String resultado = (num % 2 == 0) ? "El número es par" : "El número es impar";
        // String resultado = (num > 0) ? "El número es positivo" : (num < 0) ? "El
        // número es negativo" : "El número es cero";
        System.out.println(resultado);

        // SWITCH

        int dia = 3;
        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
        }

        // NUEVO SWITCH JAVA 14+
        nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println("El día es: " + nombreDia);

        // WHILE
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // DO-WHILE
        count = 3;
        do {
            System.out.println("Count en do-while: " + count);
            count++;
        } while (count % 2 == 0);

        // FOR
        for (int i = 0; i <= 5; i++) {
            System.out.println("i en for: " + i);
        }

        // FOR-EACH
        String[] frutas = { "Manzana", "Banana", "Naranja" };
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // FOR Y BREAK
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i con break: " + i);
        }

        // FOR Y CONTINUE

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i con continue (impares): " + i);
        }
    }

    /** Mini juego: Debugers & Dragons */
    public static void debugersYDragons() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n¡Bienvenido a Debugers & Dragons! Ingrese su nombre: ");
        String name = sc.nextLine();
        short playerHealth = 100;
        short playerAttack = 25;
        short playerDefense = 15;
        float playerCritical = 0.2f;
        boolean isCriticalHit = false;
        boolean isPlayerDefending = false;

        short dragonHealth = 200;
        short dragonAttack = 25;
        short dragonDefense = 10;

        System.out.println("\n¡Hola " + name + "! Te enfrentas a un dragón feroz.");

        while (playerHealth > 0 && dragonHealth > 0) {
            System.out.println("Elige tu acción: 1. Atacar 2. Defender");
            int action = sc.nextInt();
            switch (action) {
                case 1 -> {
                    isCriticalHit = (Math.random() < playerCritical);
                    int hitDamage = isCriticalHit ? (playerAttack * 2) - dragonDefense : playerAttack - dragonDefense;
                    dragonHealth -= hitDamage;
                    System.out.println("Has atacado al dragón y le has causado " + hitDamage + " puntos de daño."
                            + (isCriticalHit ? " ¡Golpe crítico!" : ""));
                }
                case 2 -> {
                    System.out.println("Te estas defendiendo." +
                            "\nEl daño recibido se reduce a la mitad y aumenta tu probabilidad de crítico.");
                    playerCritical += 0.15f;
                    isPlayerDefending = true;
                }
                default -> System.out.println("Acción inválida. Pierdes tu turno.");
            }

            if (dragonHealth > 0) {
                int damageToPlayer = isPlayerDefending
                        ? (dragonAttack - playerDefense) / 2
                        : dragonAttack - playerDefense;
                playerHealth -= damageToPlayer;
                if (isPlayerDefending) {
                    isPlayerDefending = false;
                }
                System.out.println("El dragón te ha atacado y te ha causado " + damageToPlayer + " puntos de daño." +
                        "\nEstadisticas actuales - Tu salud: " + playerHealth + ", Salud del dragón: " + dragonHealth);
            } else {
                System.out.println("¡Has derrotado al dragón! ¡Felicidades, " + name + "!");
            }
        }
        if (playerHealth <= 0) {
            System.out.println("Has sido derrotado por el dragón. ¡Mejor suerte la próxima vez, " + name + "!");
        }
        sc.close();
    }
}
