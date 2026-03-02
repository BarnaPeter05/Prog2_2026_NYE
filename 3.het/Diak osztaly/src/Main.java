public class Main {
    // Adatok
    private String nev;
    private double[] osztalyzatok;

    // Konstruktor
    public Main(String nev, double[] osztalyzatok) {
        this.nev = nev;
        this.osztalyzatok = osztalyzatok;
    }

    // calculateAverage
    public double calculateAverage() {
        if (osztalyzatok == null || osztalyzatok.length == 0) {
            return 0.0; // Ha nincs osztályzat, átlag 0
        }

        double osszeg = 0;
        for (double osztalyzat : osztalyzatok) {
            osszeg += osztalyzat;
        }

        return osszeg / osztalyzatok.length;
    }


    public String getNev() {
        return nev;
    }

    public double[] getOsztalyzatok() {
        return osztalyzatok;
    }

    // Main
    public static void main(String[] args) {
        // Tesztadatok
        double[] jegyek1 = {4.5, 3.8, 5.0, 4.2, 3.5};
        Main diak1 = new Main("Kiss János", jegyek1);

        double[] jegyek2 = {2.0, 3.5, 4.0, 2.5, 3.0, 4.5};
        Main diak2 = new Main("Nagy Anna", jegyek2);

        double[] jegyek3 = {}; // Üres tömb tesztelése
        Main diak3 = new Main("Teszt Elek", jegyek3);

        // Eredmények kiíratása
        System.out.println("Diák: " + diak1.getNev());
        System.out.print("Osztályzatok: ");
        for (double jegy : diak1.getOsztalyzatok()) {
            System.out.print(jegy + " ");
        }
        System.out.println("\nÁtlag: " + String.format("%.2f", diak1.calculateAverage()));
        System.out.println();

        System.out.println("Diák: " + diak2.getNev());
        System.out.print("Osztályzatok: ");
        for (double jegy : diak2.getOsztalyzatok()) {
            System.out.print(jegy + " ");
        }
        System.out.println("\nÁtlag: " + String.format("%.2f", diak2.calculateAverage()));
        System.out.println();

        System.out.println("Diák: " + diak3.getNev());
        System.out.print("Osztályzatok: ");
        for (double jegy : diak3.getOsztalyzatok()) {
            System.out.print(jegy + " ");
        }
        System.out.println("\nÁtlag: " + String.format("%.2f", diak3.calculateAverage()));
    }
}