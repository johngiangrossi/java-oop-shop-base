public class App {
    public static void main(String[] args) throws Exception {
        
        // uso il costruttore e inserisco i parametri del prodotto
        Prodotto prodotto1 = new Prodotto("biscotti", 10);
        
        // calcolo prezzo finale
        double finalPrice = prodotto1.getFinalPrice();

        // stampo prezzo finale e base
        System.out.println("il prezzo base è: " + prodotto1.getPrice());
        System.out.println("il prezzo finale è: " + finalPrice);

        // stampo il nome completo con il codice prodotto
        String fullName = prodotto1.getFullName();
        System.out.println(fullName);

    }
}
