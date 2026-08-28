package praktikum;

import javax.swing.*;

public class D_If_Abfragen
{

    // Erstelle zwei Variablen mit dem Namen Zahl1 und Zahl2
    // Weise den beiden Variablen jeweils einen Wert zu und vergleiche in einer If-Abfrage, welcher Wert größer ist.
    // Gebe den größeren Wert auf der Konsole aus!
    // Füge eine weitere Abfrage hinzu, ob die beiden Werte gleich groß sind!
    public static void main(String[] args)
    {
     int Zahl1 =8;
     int Zahl2 =8;

     if (Zahl1>Zahl2)
     {
         System.out.println(Zahl1);
     }else if (Zahl1 <Zahl2){
         System.out.println(Zahl2);
     }
     else {
         System.out.println("Zahl1Zahl2==");
     }
    }
}


