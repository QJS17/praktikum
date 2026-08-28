package praktikum;

public class H_Arrays
{

    // Erstelle einen Array, welcher 10 Integer speichern kann und befülle diesen mit Zahlen
    // Erstelle eine For-Schleife, die über das Array iteriert und die Zahlen in der Konsole ausgibt
    // Befülle das Array mit einer For-Schleife, mit den Zahlen von 0 - 9

    public static void main(String[] args)
    {
        int[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < zahlen.length; i++)
        {
            System.out.println(zahlen[i]);
        }

        int[] meineZahlen= new int[10];

        for (int i=0;i<meineZahlen.length;i++){
            meineZahlen[i]= i;
            System.out.println(meineZahlen[i]);
        }
    }
}

