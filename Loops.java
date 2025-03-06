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

        //infinite loop
        for (int i = 1; ; ){
            System.out.println("Iteration number: " + i);
            i++;
            if (i == 100){
                break;
            }
        }

        //continue
        for (int k = 0; k <= 10; k++){
            if (k == 3 || k == 7){
                continue;
            }
        }
        System.out.println("Skipping value: 3");

        //break
        for (int k = 0; k <= 10; k++){
            if (k == 9){
                System.out.println("Stopping at 9");
                break;
            }
        }
    }
}
