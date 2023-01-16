import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kolekce kolekce = new Kolekce();
        kolekce.nactiSeznam();
        kolekce.pridejZakaznici(new Zakaznik("Pepa Pavel", 151));
        kolekce.pridejZakaznici(new Zakaznik("Odrej Zemank", 562));
        List<Zakaznik> seznam = kolekce.ziskejSeznamZakazniku();
        for (Zakaznik zakaznik: seznam){
            System.out.println(zakaznik.getJmeno() + ":" + zakaznik.getPocetProdeje());
        }

    }
}