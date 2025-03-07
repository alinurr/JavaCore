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

        //loop in the loop
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < i + 1; j++){
                if (i * j == 6){
                    continue;
                }
                if (i * j == 9){
                    break;
                }
                System.out.println("Outer loop i = " + i + ", inner loop j = " + j);
            }
        }

        for (
                int i = startLog();
                conditionLog(i);
                i = updateLog(i)
        ){
            System.out.println(i);
        }

    }
    //loop through methods
    public static int startLog(){
        System.out.println("Starting ... ");
        return 1;
    }

    public static boolean conditionLog(int x){
        System.out.println("Checking if x < 5");
        return x < 5;
    }

    public static int updateLog(int x){
        System.out.println("Incrementing x");
        return ++x;
    }


}
