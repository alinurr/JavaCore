public class Loops {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
        }
        System.out.println("The total sum is: " + sum);


        //inner counter and outer counter
        int a = 0;
        int b = 10;
        for(; a < b; a++, b--){
            System.out.println("Loop finished. Final a = " + a + ", b = " + b);
        }
    }
}
