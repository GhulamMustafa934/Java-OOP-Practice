class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Product Name: " + name +
                ", Quantity: " + quantity +
                ", Price: " + price);
    }
}

class Store {
    private String name;
    private String location;
    private Product[] productList;
    private int nbProduct;

    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        productList = new Product[100];
        nbProduct = 0;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product p) {
        if (nbProduct < 100) {
            productList[nbProduct] = p;
            nbProduct++;
        } else {
            System.out.println("Store is Full.");
        }
    }

    public boolean searchProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public Product deleteProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equalsIgnoreCase(productName)) {

                Product temp = productList[i];

                for (int j = i; j < nbProduct - 1; j++) {
                    productList[j] = productList[j + 1];
                }

                productList[nbProduct - 1] = null;
                nbProduct--;

                return temp;
            }
        }
        return null;
    }

    public void displayAll() {
        System.out.println("\nStore Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Products:");

        if (nbProduct == 0) {
            System.out.println("No Products Available.");
        } else {
            for (int i = 0; i < nbProduct; i++) {
                productList[i].display();
            }
        }
    }
}

class Company {
    private String name;
    private Store[] arrayStore;
    private int nbStore;

    public Company(String name) {
        this.name = name;
        arrayStore = new Store[10];
        nbStore = 0;
    }

    public void addStore(Store store) {
        if (nbStore < 10) {
            arrayStore[nbStore] = store;
            nbStore++;
        } else {
            System.out.println("Maximum number of stores reached.");
        }
    }

    public int searchNbofStore(String productName) {
        int count = 0;

        for (int i = 0; i < nbStore; i++) {
            if (arrayStore[i].searchProduct(productName)) {
                count++;
            }
        }

        return count;
    }

    public void displayAll() {
        System.out.println("\nCompany Name: " + name);
        System.out.println("Stores:");

        for (int i = 0; i < nbStore; i++) {
            System.out.println(arrayStore[i].getName());
        }
    }
}

public class TestCompany {

    public static void main(String[] args) {

        Product p1 = new Product("TV", 4, 34000);
        Product p2 = new Product("Bicycle", 4, 5500);
        Product p3 = new Product("Oven", 3, 70000);

        Store s1 = new Store("Makro", "Karachi");
        Store s2 = new Store("Hypermart", "Karachi");

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);

        s1.displayAll();

        Product tempProduct = s1.deleteProduct("Bicycle");

        if (tempProduct != null)
            System.out.println("\nProduct " + tempProduct.getName() + " is deleted");
        else
            System.out.println("\nThere is no product to delete");

        s1.displayAll();

        s2.addProduct(p1);
        s2.addProduct(p2);
        s2.addProduct(p3);

        s2.displayAll();

        Company c1 = new Company("Unilever");

        c1.addStore(s1);
        c1.addStore(s2);

        c1.displayAll();

        int n = c1.searchNbofStore("TV");

        System.out.println("\nNumber of stores have TV: " + n);
    }
}