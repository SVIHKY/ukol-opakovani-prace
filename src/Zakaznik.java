public class Zakaznik {
    private String jmeno;
    private int pocetProdeje;

    public Zakaznik(String jmeno, int pocetProdeje) {
        this.jmeno = jmeno;
        this.pocetProdeje = pocetProdeje;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getPocetProdeje() {
        return pocetProdeje;
    }

    public void setPocetProdeje(int pocetProdeje) {
        this.pocetProdeje = pocetProdeje;
    }
}
