import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product espresso = new Product("Espresso", 5.5, 2, "coffee");
        Product cappuccino = new Product("Espresso", 6.5, 1, "coffee");
        Product croissant = new Product("Croissant", 7.0, 3, "bakery");
        Product pie = new Product("Cheesecake", 4.0, 2, "bakery");


        Product[] products = {espresso, cappuccino, croissant, pie};

        searchProduct(products, "Espresso");

        Product cake = new Product("Whoopie Cake", 5.5, 1, "bakery");
        Product[] newProducts = insertProduct(products, cake);
        System.out.println("New array after inserting new product: " + Arrays.toString(newProducts));

        sortProductsByPrice(products);
        System.out.println("Sort products by price: " + Arrays.toString(products));

        convertArray(products);
        System.out.println(Arrays.toString(products));

        deleteProduct(products, 4.0, "Cheesecake");
        System.out.println("Delete product from array: " + Arrays.toString(products));


        //Category Sweets
        Product chocolateCake = new Product("Chocolate Cake", 20.0);
        Product bears = new Product("Gummy Bears", 15.5);
        Product macarons = new Product("Macarons", 10.0);


        //Category Beverages
        Product orangeJuice = new Product("Orange Juice", 4.0);
        Product greenTea = new Product("Green Tea", 3.0);
        Product americano = new Product("Americano", 3.5);

        //Snacks
        Product potatoChips = new Product("Potato Chips", 5.0);
        Product trailMix = new Product("Trail Mix", 4.5);
        Product popcorn = new Product("Popcorn", 3.5);

        Product[][] categories = new Product[3][];
        categories[0] = new Product[]{chocolateCake, bears, macarons};
        categories[1] = new Product[]{potatoChips, trailMix, popcorn};
        categories[2] = new Product[]{orangeJuice, greenTea,  americano};

        System.out.println("-----------------------");
        System.out.println("Print products of each category: ");
        printCategories(categories);

        System.out.println("-----------------------");
        System.out.println("Search product by name: ");
        searchProductInCategories(categories, "Potato Chips");

        System.out.println("-----------------------");
        System.out.println("Sort each category by price: ");
        sortCategoriesByPrice(categories);
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

    public static void printCategories(Product[][] categories){
        for (int i = 0; i < categories.length; i++){
            for (int j = 0; j < categories[i].length; j++){
                System.out.println(categories[i][j]);
            }
        }
    }

    public static void searchProductInCategories(Product[][] categories, String product){
        for (int i = 0;i < categories.length; i++){
            for (int j = 0; j < categories[i].length; j++){
                if (categories[i][j].name.equals(product)){
                    System.out.println(categories[i][j]);
                }
            }
        }
    }

    public static void sortCategoriesByPrice(Product[][] categories){
        int n = categories.length;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < categories[i].length-1; j++){
                if (categories[i][j].price > categories[i][j+1].price){
                    Product temp = categories[i][j];
                    categories[i][j] = categories[i][j+1];
                    categories[i][j+1] = temp;
                    j = 0;
                    //System.out.println(categories[i][j]);
                }
                System.out.println(categories[i][j]);
            }
        }
    }
}