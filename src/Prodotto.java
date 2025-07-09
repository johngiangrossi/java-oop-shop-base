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
            this.code = getNewProductNumber();
            this.name = name;
            this.price = price;
            this.iva = 22;
        }
    }

    // ottengo il prezzo base
    public double getPrice() {
        return this.price;
    }
    
    // ottengo il nuovo codice prodotto
    public int getNewProductNumber() {
        int newProductNumber = (int) (Math.random() * 101);
        return newProductNumber;
    }

    // ottengo il prezzo finale con iva
    public double getFinalPrice() {
        double finalPrice = this.price + ((this.price * this.iva) / 100);
        return finalPrice;
    }
    
    // ottengo il nome completo con il codice
    public String getFullName() {
        String fullName = "il prodotto " + this.name + " con il codice " + this.code;
        return fullName;
    }
}
