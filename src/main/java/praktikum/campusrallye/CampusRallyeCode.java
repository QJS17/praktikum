package praktikum.campusrallye;


public class CampusRallyeCode {

    public static void main(String[] args) {
       






        String ergebnis1 = ("Glückwunsch, ihr als Team " + teamName + " habt " + gefundeneWortschnipsel + " von 13 Wortschnipseln gefunden. \n");

        String ergebnis2;
        if (ballWechselGeschafft) {
            ergebnis2 = ("Außerdem habt ihr alle 10 Ballwechsel geschafft. \n");
        } else {
            ergebnis2 = ("Leider habt ihr nicht alle 10 Ballwechsel geschafft. \n");
        }
        String ergebnis3;
        if (inPongGewonnen) {
            ergebnis3 = ("Zudem habt ihr auch bei Pong gewonnen. \n");
        } else {
            ergebnis3 = ("Im Pong habt ihr jedoch ganz knapp verloren. \n");
        }

        String ergebnis4;
        if (summeGebaeudenummern == 549) {
            ergebnis4 = ("Beim Gebäudenummern Zusammenzählen seid ihr auf " + summeGebaeudenummern + " gekommen, das stimmt! \n");
        } else {
            ergebnis4 = ("Beim Gebäudenummern Zusammenzählen seid ihr auf " + summeGebaeudenummern + " gekommen, das ist leider falsch. richtige Antwort: 549 \n");
        }

        String ergebnis5;
        if (distanzPapierflieger > 4.0) {
            ergebnis5 = ("Euer Papierflieger ist " + distanzPapierflieger + " Meter weit geflogen, sehr gut. \n");
        } else {
            ergebnis5 = ("Euer Papierflieger ist " + distanzPapierflieger + " Meter weit geflogen, das geht besser. \n");
        }

        String ergebnis6 = ("Beim Atruvia-Quiz habt ihr " + richtigeQuizAntworten + " von 3 richtigen Antworten geliefert. \n");

        System.out.println(ergebnis1 + ergebnis2 + ergebnis3 + ergebnis4 + ergebnis5 + ergebnis6 + "Wir hoffen, dass ihr Spaß hattet und dass euch der Campus gefallen hat.");
    }
    
}
