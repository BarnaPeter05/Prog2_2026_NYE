//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adja meg az aktuális hőmérsékletet: ");
        int homerseklet = scanner.nextInt();

        if (homerseklet < 0) {
            System.out.println("Fagypont alatti");
        } else if (homerseklet < 30) {
            System.out.println("Átlagos");
        } else {
            System.out.println("Túl meleg");
        }

        scanner.close();
    }
}