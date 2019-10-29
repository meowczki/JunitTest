import java.util.ArrayList;
import java.util.List;
//dodającą produkt do koszyka,
//        • usuwającą produkt z koszyka,
//        • usuwającą wszystkie produkty z koszyka,
//        • zwracającą kwotę zakupów w koszyku.
public class Koszyk {
    private List<Produkt> produkty;

    public Koszyk() {
        produkty=new ArrayList<>();
    }

    public void dodajProdukt(Produkt p){
    produkty.add(p);
}
    public void usunProdukt(Produkt p){
        produkty.remove(p);
    }
    public void usunProdukty(){
        produkty.clear();
    }
    public getKwotaZakupow(){
        
    }
}
