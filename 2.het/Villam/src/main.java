import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double HANG_SEBESSEG = 300; // méter/másodperc

        double masodperc;

        do {
            System.out.print("Hány másodperc telt el a villámlás és a dörgés között? ");
            masodperc = scanner.nextDouble();

            if (masodperc < 0) {
                System.out.println("Hibás érték! Az idő nem lehet negatív. Kérem, adjon meg pozitív számot!");
            }
        } while (masodperc < 0);

        double tavolsag = masodperc * HANG_SEBESSEG;

        System.out.printf("A villám körülbelül %.2f méter távolságra csapott le.%n", tavolsag);

        scanner.close();
    }
}
