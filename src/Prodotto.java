import java.util.Random;


public final class Prodotto {

    // fields
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva = 22;

    // costruttore
    public Prodotto(String name, double price, String description) {

        // verifica dei parametri corretti
        if (name == null || name.equals("")|| price <= 0 || description == null) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            code = getNewProductNumber();
            this.name = name;
            this.price = price;
            this.description = description;
        }
    }

    // ottengo il nuovo codice prodotto
    private int getNewProductNumber() {
        Random random = new Random();
        int newProductNumber = random.nextInt(1000);
        return newProductNumber;
    }

    // ottengo il prezzo finale con iva
    public double getFinalPrice() {
        double finalPrice = price + ((price * iva) / 100);
        return finalPrice;
    }

    // ottengo il nome completo con il codice
    public String getFullName() {
        String fullName = name + "-" + this.code;
        return fullName;
    }



    // getter
    public String getDescription() {
        return description;
    }

    public int getIva() {
        return iva;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }


    // setter
    public void setDescription(String description) {
        if (description == null || description.equals("")) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.description = description;
        }
    }

    public void setIva(int iva) {
        if (iva <= 0) {
            System.out.println("hai inserito valori errati, metto quella di default");
        } else {
            this.iva = iva;
        }
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("hai inserito valori errati, metto NaN");
        } else {
            this.price = price;
        }
    }
    
}
