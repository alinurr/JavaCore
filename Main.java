public class Main {
    public static void main(String[] args) {
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
        searchProduct(products, "Espresso");

        Product[] products1 = new Product[8];
        for (int i = 0; i < products1.length; i++){
            insertProduct(products[i]);
        }
        System.out.println(products1);

    }

    public static void searchProduct(Product[] products, String productName) {
        for (Product p : products){
            if(p.name.equals(productName)){
                System.out.println(p.name + " " + p.price + " " + p.quantity + " " + p.category);
            }
        }
    }

    public static Product[] insertProduct(Product p){
        Product[] products = new Product[6];
        for (int i = 0; i < products.length; i ++){
            products[i] = p;
        }
        return products;
    }
}