package praktikum;

import java.util.Scanner;

public class TaschenrechnerDemoProjekt {
    public TaschenrechnerDemoProjekt() {
    }

    public static void main(String[] args) {
        System.out.println("Nenne eine Zahl für a");
        Scanner meinScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        double a = meinScanner.nextDouble();
        System.out.println("Deine Zahl für a ist " + a);
        System.out.println("Nenne eine Zahl für b");
        double b = meinScanner.nextDouble();
        System.out.println("Deine Zahl für b ist " + b);
        System.out.println("Soll ich dir die Lösungen für alle fünf Grundrechenarten geben?");
        System.out.println("Antwort (j/n):");
        switch (scanner.nextLine()) {
            case "ja":
            case "j":
                double addieren = a + b;
                double subtrahieren = a - b;
                double multiplizieren = a * b;
                double dividieren = a / b;
                double base = a;
                double exponet = b;
                double power = Math.pow(base, exponet);
                System.out.println(a + " + " + b + " = " + addieren);
                System.out.println(a + " - " + b + " = " + subtrahieren);
                System.out.println(a + " × " + b + " = " + multiplizieren);
                System.out.println(a + " ÷ " + b + " = " + dividieren);
                System.out.println(a + "^" + b + " = " + power);
                break;
            case "nein":
            case "n":
                System.out.println("keine Lösungen");
        }

    }
}
