
public class App {

    public static void main(String[] args) throws Exception {

        // uso il costruttore e inserisco i parametri del prodotto
        Prodotto prodotto1 = new Prodotto("biscotti", 10.33, "gocciole");

        // calcolo prezzo finale
        double finalPrice = prodotto1.getFinalPrice();

        // stampo prezzo finale formattato e base
        System.out.println("Il prezzo base è: " + prodotto1.getPrice());

        String priceFormatted = String.format("%.2f", finalPrice);
        System.out.println("Prezzo finale: " + priceFormatted); 

        // stampo il nome completo con il codice prodotto
        String fullName = prodotto1.getFullName();
        System.out.println(fullName);

    }
}
