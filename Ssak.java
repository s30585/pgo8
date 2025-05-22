public class Ssak extends Zwierze {
    protected String futro;

    public Ssak(String nazwa, int wiek, String futro) {
        super(nazwa, wiek);
        this.futro = futro;
    }
    public String getFutro() {
        return futro;
    }

    @Override
    public String wydajDzwiek() {
        return "Ssak ryczy";
    }

    @Override
    public String poruszajSie() {
        return "Ssak chodzi";
    }

    public void rodzajFutra(){
        System.out.println("Rodzaj futra: " + futro);
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Lasy";
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        rodzajFutra();
    }
}
