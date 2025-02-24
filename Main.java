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

        /*Product[] products1 = new Product[6];
        for (int i = 0; i < products1.length; i++){
            insertProduct(products[i]);
        }
        System.out.println(products1);*/

        sortProductsByPrice(products);
        System.out.println(Arrays.toString(products));

        convertArray(products);
        System.out.println(products);

        deleteProduct(products, 4.0, "Cheesecake");
        System.out.println(Arrays.toString(products));
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
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (products[j].price > products[j + 1].price) {
                    // Swap arr[j] and arr[j + 1]
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static Product[] insertProduct(Product[] products, Product p){
        Product[] products1 = new Product[products.length + 1];
        for (int i = 0; i < products.length; i ++){
            products[i] = p;
        }
        return products;
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