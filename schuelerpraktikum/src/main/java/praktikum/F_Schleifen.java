package praktikum;


public class F_Schleifen
{

    // Erstelle eine For-Schleife, welche die Zahlen von 1 bis einschließlich 10 addiert!
    // Erstelle eine While-Schleife die solange laufen soll, bis die Variable größer 20 ist, dabei soll der Wert der
    // Variable jeweils in der Konsole angezeigt werden!
    public static void main(String[] args)
    {
        int summe=0;
        for( int i= 0;i<= 10;i++){
            summe=summe+i;
        }

        System.out.println(summe);

        int i=0;
        while (i<20){
            System.out.println(i);
            i++;
        }
 }
}








