public class Main {
    // Adatok
    private String marka;
    private String modell;
    private int evjarat;

    // Konstruktor
    public Main(String marka, String modell, int evjarat) {
        this.marka = marka;
        this.modell = modell;
        this.evjarat = evjarat;
    }

    // displayInfo
    public void displayInfo() {
        System.out.println("Autó adatai:");
        System.out.println("Márka: " + marka);
        System.out.println("Modell: " + modell);
        System.out.println("Évjárat: " + evjarat);
    }

    // startEngine
    public void startEngine() {
        System.out.println("Az autó indul!");
    }

    // stopEngine
    public void stopEngine() {
        System.out.println("Az autó megáll!");
    }

    // Main teszteléshez
    public static void main(String[] args) {
        // Autó példány létrehozása
        Main auto1 = new Main("Suzuki", "Swift", 2020);


        auto1.displayInfo();
        auto1.startEngine();
        auto1.stopEngine();

        System.out.println();

        // Második autó példány
        Main auto2 = new Main("Toyota", "Corolla", 2022);
        auto2.displayInfo();
        auto2.startEngine();
        auto2.stopEngine();
    }
}