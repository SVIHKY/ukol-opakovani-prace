import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kolekce {

    static final String SOUBOR = "text.txt";
    static final String ODDELOVAC = ":";
    List<Zakaznik> zakaznici = new ArrayList<>();
    public void  pridejZakaznici(Zakaznik novyZakaznici) {
        PrintWriter writer;

        {
            try {
                writer = new PrintWriter(new BufferedWriter(new FileWriter(SOUBOR)));
                zakaznici.add(novyZakaznici);
                for (Zakaznik stejnyZakaznik : zakaznici) {
                    writer.println(stejnyZakaznik.getJmeno() + ODDELOVAC + stejnyZakaznik.getPocetProdeje());
                }
            } catch (IOException e) {
                System.err.println(e.getLocalizedMessage());
            }
        }

    }


    public void nactiSeznam() {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(SOUBOR)));
            zakaznici.clear();
            while (scanner.hasNextLine()) {
                String radek = scanner.nextLine();
                String[] casti = radek.split(ODDELOVAC);
                zakaznici.add(new Zakaznik("Petr Švihký", 12));
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }

    public List<Zakaznik> ziskejSeznamZakazniku(){
        return zakaznici;
    }
}