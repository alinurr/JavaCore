public class Product {
    String name;
    double price;
    int quantity;
    String category;

    @Override
    public String toString(){
        return name + " " + price + " " + quantity + " " + category;
    }
}
