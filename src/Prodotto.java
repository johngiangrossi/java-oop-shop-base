
public final class Prodotto {

    // fields
    public int code;
    public String name;
    public String description;
    public double price;
    public int iva;

    // costruttore
    public Prodotto(String name, double price) {

        // verifica dei parametri corretti
        if (name == null || "".equals(name) || price <= 0) {
            System.out.println("hai inserito valori errati");
            this.name = "";
            this.price = Double.NaN;
        } else {
            code = getNewProductNumber();
            this.name = name;
            this.price = price;
            iva = 22;
        }
    }

    // ottengo il prezzo base
    public double getPrice() {
        return price;
    }

    // ottengo il nuovo codice prodotto
    public int getNewProductNumber() {
        int newProductNumber = (int) (Math.random() * 101);
        return newProductNumber;
    }

    // ottengo il prezzo finale con iva
    public double getFinalPrice() {
        double finalPrice = price + ((price * iva) / 100);
        return finalPrice;
    }

    // ottengo il nome completo con il codice
    public String getFullName() {
        String fullName = "il prodotto " + name + " con il codice " + this.code;
        return fullName;
    }
}
