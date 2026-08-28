package praktikum;

import java.awt.*;
import java.sql.SQLOutput;

public class C_Operatoren
{

    // Deklariere und Initialsiere 2 Variablen mit Zahl1 und Zahl2
    // Addiere, Subtrahiere, Dividiere und Multipliziere die Zahlen und gebe das Ergebnis auf der Konsole aus
    // Erhöhe den Wert von Zahl1 um 1
    // Erniedrige den Wert von Zahl2 um 1
    public static void main(String[] args)
    {
       int Zahl1 = 1;
       int Zahl2 = 2;
        System.out.println(Zahl1+Zahl2);
        System.out.println(Zahl1-Zahl2);
        System.out.println();
        System.out.println(Zahl1*Zahl2);
        System.out.println(Zahl1/Zahl2);
        Zahl1++;
        Zahl2--;
        System.out.println(Zahl1);
        System.out.println(Zahl2);
    }
}
