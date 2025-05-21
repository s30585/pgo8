public class Gad extends Zwierze {
    protected String typSkory;

    public Gad(String nazwa, int wiek, String typSkory) {
        super(nazwa, wiek);
        this.typSkory = typSkory;
    }
    public String getTypSkory() {
        return typSkory;
    }

    @Override
    public String wydajDzwiek() {
        return "Gad syczy";
    }

    @Override
    public String poruszajSie() {
        return "Gad człapie";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Bagno";
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Typ skóry: " + typSkory);
    }

}
