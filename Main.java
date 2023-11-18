import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> boxesLocation = new ArrayList<Integer>();
        int value = 0;
        while( value < 1){
            int km1 = random.nextInt(7);
            int km2 = random.nextInt(7);
            int km3 = random.nextInt(7);

            if(km1!=km2 && km1 != km3 && km3 != km2){
                boxesLocation.add(km1);
                boxesLocation.add(km2);
                boxesLocation.add(km3);
                value++;
            }

            System.out.println(boxesLocation);

            int firstBox = scanner.nextInt();
            int secondBox = scanner.nextInt();
            int thirdBox = scanner.nextInt();
            int rightNumbers = 0;
            for (int i = 0; i < 3; i++) {
                int al = 0;
                al = check(boxesLocation.get(i), firstBox, secondBox, thirdBox);
                if (al == 1) {
                    rightNumbers++;
                }
            }
            if (rightNumbers == 3) {
                successfulFinding();
            } else {
                System.out.println("You entered " + rightNumbers + " location correctly.");
            }



        }

    }
    public static void successfulFinding(){
        System.out.println("You have successfully found all three boxes!");
        System.exit(0);
    }

    public static int check(int a, int b, int c, int d){
        int g = 0;
        boolean checkAB = a == b || a == c || a == d;
        if(checkAB){
            g++;
        }
        return g;
    }
}