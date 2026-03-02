import java.util.Scanner;

public class Torta{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eletkor;

        do {
            System.out.print("Hány éves vagy? (1-20 között): ");
            eletkor = scanner.nextInt();

            if (eletkor < 1 || eletkor > 20) {
                System.out.println("Hibás érték! Kérem, adjon meg egy számot 1 és 20 között!");
            }
        } while (eletkor < 1 || eletkor > 20);

        // Csillagok rajzolása
        for (int i = 0; i < eletkor; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Függőleges vonalak rajzolása
        for (int i = 0; i < eletkor; i++) {
            System.out.print("| ");
        }
        System.out.println();

        // Torta alja
        for (int i = 0; i < eletkor; i++) {
            System.out.print("--");
        }
        System.out.println();

        scanner.close();
    }
}
