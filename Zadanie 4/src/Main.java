import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        Product p1 = new Product("Banan", 10.50);
        Product p2 = new Product("Ananas", 27.89);
        Product p3 = new Product("Sok", 5.39);
        Product p4 = new Product("Banan", 10.50);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4); //taki sam produkt nie zosatnie dodany

        System.out.println("Produkty: " + products);
    }
}