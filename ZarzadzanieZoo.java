public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Ssak lew = new Ssak("Lew", 6, "Złote");
        Ptak orzel = new Ptak("Orzeł", 2, "Ciemnobrązowe");
        Gad krokodyl = new Gad("Krokodyl", 9, "Łuskowata");

        System.out.println("SSAK");
        lew.wyswietlInformacje();

        System.out.println("\nPTAK");
        orzel.wyswietlInformacje();

        System.out.println("\nGAD");
        krokodyl.wyswietlInformacje();

    }
}
