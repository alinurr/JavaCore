import java.util.Arrays;

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
        croissant.name = "Croissant";
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

        Product cake = new Product();
        pie.name = "Whoopie Cake";
        pie.price = 5.5;
        pie.quantity = 1;
        pie.category = "bakery";
        Product[] newProducts = insertProduct(products, cake);
        System.out.println("New array after inserting new product: " + Arrays.toString(newProducts));

        sortProductsByPrice(products);
        System.out.println("Sort products by price and name: " + Arrays.toString(products));

        convertArray(products);
        System.out.println(Arrays.toString(products));

        deleteProduct(products, 4.0, "Cheesecake");
        System.out.println("Delete product from array: " + Arrays.toString(products));
    }

    public static void searchProduct(Product[] products, String productName) {
        for (Product p : products){
            if(p.name.equals(productName)){
                System.out.println(p.name + " " + p.price + " " + p.quantity + " " + p.category);
            }
        }
    }

    public static void sortProductsByPrice(Product[] products){
        int n = products.length;

        for (int i = 0; i < n - 1; i++) {
            if (products[i].price > products[i + 1].price) {
                Product temp = products[i];
                products[i] = products[i + 1];
                products[i + 1] = temp;
                i = 0;
            }
        }
    }

    public static Product[] insertProduct(Product[] products, Product p){
        Product[] products1 = new Product[products.length + 1];
        for (int i = 0; i < products.length; i ++){
            products1[i] = products[i];
        }
        products1[products.length] = p;
        return products1;
    }

    public static Product[] deleteProduct(Product[] products, double price, String productName){
        Product[] products1 = new Product[products.length - 1];
        for(int i = 0, j = 0; i < products.length; i++){
            if (products[i].price != price && !products[i].name.equals(productName)){
                products1[j] = products[i];
            }
        }
        return products1;
    }

    public static String[] convertArray(Product[] products){
        String[] convertedArray = new String[products.length];
        for (int i = 0; i < products.length; i++){
            convertedArray[i] = "Product name: " + products[i].name + "Price: " + products[i].price +
                    "Quantity: " + products[i].quantity +
                    "Category: " + products[i].category;
        }
        return convertedArray;
    }
}