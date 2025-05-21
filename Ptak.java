public class Ptak extends Zwierze {
    protected String upierzenie;

    public Ptak(String nazwa, int wiek, String upierzenie) {
        super(nazwa, wiek);
        this.upierzenie = upierzenie;
    }
    public String getUpierzenie() {
        return upierzenie;
    }

    @Override
    public String wydajDzwiek() {
        return "Ptak śpiewa";
    }

    @Override
    public String poruszajSie() {
        return "Ptak lata";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Powietrze";
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Upierzenie: " + upierzenie);
    }
}
