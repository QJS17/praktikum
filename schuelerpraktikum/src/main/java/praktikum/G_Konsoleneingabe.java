package praktikum;

import java.io.File;
import java.util.Scanner;

public class G_Konsoleneingabe
{

    // Erstelle eine Konsoleneingabe, welche deinen Namen entgegennimmt und diesen danach mit " Willkommen
    // <Name>! ausgibt!

    public static void main(String[] args)
    {
        String name = "";
        int alter;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        alter = scanner.nextInt();
        System.out.println("Ich bin " + name + " und bin " + alter + " Jahre alt");

    }

}
