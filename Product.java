public class Product {
    String name;
    double price;
    int quantity;
    String category;

    Product(String name, double price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " " + price + " " + quantity + " " + category;
    }
}
