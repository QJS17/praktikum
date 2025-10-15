package Praktikum;

import javax.xml.validation.SchemaFactoryConfigurationError;
import java.util.Random;
import java.util.Scanner;

public class Finn
{
    static Random random = new Random();
    static int pcWahl = random.nextInt(3);

    public static void main(String[] args)
    {
        Scanner p1 = new Scanner(System.in);
        System.out.println("Klicke die Taste 1 um gegen eine andere Person zu spielen");
        System.out.println("Klicke die Taste 2 um gegen den Computer zu spielen");

        String modus = p1.nextLine();


        String s1 = "";

        System.out.println("Spieler 1 ist am Zug");

        s1 = p1.nextLine();
        s1 = s1.toLowerCase();
        if (modus.equals("1"))
        {
            String s2 = "";
            System.out.println("Spieler 2 ist am Zug");

            s2 = p1.nextLine();
            s2 = s2.toLowerCase();


            if (s1.equals("schere") && s2.equals("papier"))
            {
                System.out.println("Spieler 1 gewinnt");
            }
            else if (s1.equals("schere") && s2.equals("stein"))
            {
                System.out.println("Spieler 2 gewinnt");
            }
            else if (s1.equals("schere") && s2.equals("schere"))
            {
                System.out.println("Unentschieden");
            }
            else if (s1.equals("stein") && s2.equals("papier"))
            {
                System.out.println("Spieler 2 gewinnt");
            }
            else if (s1.equals("stein") && s2.equals("stein"))
            {
                System.out.println("Unentschieden");
            }
            else if (s1.equals("stein") && s2.equals("schere"))
            {
                System.out.println("Spieler 1 gewinnt");
            }
            else if (s1.equals("papier") && s2.equals("papier"))
            {
                System.out.println("Unentschieden");
            }
            else if (s1.equals("papier") && s2.equals("stein"))
            {
                System.out.println("Spieler 1 gewinnt");
            }
            else if (s1.equals("papier") && s2.equals("schere"))
            {
                System.out.println("Spieler 2 gewinnt");
            }
        }
        else if (modus.equals("2"))
        {
            String pcEntscheidung = "";
            if (pcWahl == 0)
            {
                pcEntscheidung = "schere";
            }
            else if (pcWahl == 1)
            {
                pcEntscheidung = "stein";
            }
            else if (pcWahl == 2)
            {
                pcEntscheidung = "papier";

            }

            if (s1.equals("schere") && pcEntscheidung.equals("papier"))
            {
                System.out.println("Spieler 1 gewinnt");
            }
            else if (s1.equals("schere") && pcEntscheidung.equals("stein"))
            {
                System.out.println("Spieler 2 gewinnt");
            }
            else if (s1.equals("schere") && pcEntscheidung.equals("schere"))
            {
                System.out.println("Unentschieden");
            }
            else if (s1.equals("stein") && pcEntscheidung.equals("papier"))
            {
                System.out.println("Spieler 2 gewinnt");
            }
            else if (s1.equals("stein") && pcEntscheidung.equals("stein"))
            {
                System.out.println("Unentschieden");
            }
            else if (s1.equals("stein") && pcEntscheidung.equals("schere"))
            {
                System.out.println("Spieler 1 gewinnt");
            }
            else if (s1.equals("papier") && pcEntscheidung.equals("papier"))
            {
                System.out.println("Unentschieden");
            }
            else if (s1.equals("papier") && pcEntscheidung.equals("stein"))
            {
                System.out.println("Spieler 1 gewinnt");
            }
            else if (s1.equals("papier") && pcEntscheidung.equals("schere"))
            {
                System.out.println("Spieler 2 gewinnt");
            }


        }


    }

}