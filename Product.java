public class Product {
    String name;
    double price;
    int quantity;
    String category;

    public void search(String productName) {
        if(productName.equals(name)){
            System.out.println(name + " " + price + " " + quantity + " " + category);
        }
    }

    public static void main(String[] args){
        Product espresso = new Product();
        espresso.name = "Espresso";
        espresso.price = 5.5;
        espresso.quantity = 2;
        espresso.category = "coffee";

        Product cappuccino = new Product();
        cappuccino.name = "Espresso";
        cappuccino.price = 6.5;
        cappuccino.quantity = 1;
        cappuccino.category = "coffee";

        Product croissant = new Product();
        croissant.name = "croissant";
        croissant.price = 7.0;
        croissant.quantity = 3;
        croissant.category = "bakery";

        Product pie = new Product();
        pie.name = "Cheesecake";
        pie.price = 4.0;
        pie.quantity = 2;
        pie.category = "bakery";

        Product[] products = {espresso, cappuccino, croissant, pie};

        for (Product product : products){
            product.search("Espresso");
        }

    }
}
