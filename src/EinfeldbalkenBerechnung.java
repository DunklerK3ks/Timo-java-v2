import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EinfeldbalkenBerechnung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Balkenlänge (l): ");
        double l = scanner.nextDouble();

        System.out.print("Belastung (p): ");
        double p = scanner.nextDouble();

        // Auflagerkräfte und Schnittgrößen berechnen
        double ra = p * l / 2;
        double rb = p * l / 2;
        double mx = p * l / 2;
        double qx = p;

        // Ergebnisse anzeigen
        System.out.println("Auflagerkräfte:");
        System.out.println("Ra: " + ra);
        System.out.println("Rb: " + rb);
        System.out.println("Schnittgrößen:");
        System.out.println("Mx: " + mx);
        System.out.println("Qx: " + qx);

        // Ergebnisse in eine Textdatei exportieren
        exportErgebnisse(ra, rb, mx, qx);
    }

    private static void exportErgebnisse(double ra, double rb, double mx, double qx) {
        try {
            FileWriter writer = new FileWriter("ergebnisse.txt");
            writer.write("Auflagerkräfte:\n");
            writer.write("Ra: " + ra + "\n");
            writer.write("Rb: " + rb + "\n");
            writer.write("Schnittgrößen:\n");
            writer.write("Mx: " + mx + "\n");
            writer.write("Qx: " + qx + "\n");
            writer.close();
            System.out.println("Ergebnisse wurden in die Datei ergebnisse.txt exportiert.");
        } catch (IOException e) {
            // Fehlerbehandlung für Dateizugriffsfehler
            System.out.println("Fehler beim Export der Ergebnisse.");
        }
    }
}
