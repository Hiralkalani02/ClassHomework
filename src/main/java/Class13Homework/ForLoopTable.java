package Class13Homework;

public class ForLoopTable {
    public static void main(String[] args) {

        int number = 7;
        // Print 7 times table using for loop
        for (int i = 1; i <= 10; i++) {

            {
                int result = number * i;
                System.out.println(number + "*" + i + "=" + result);

                // OR System.out.println(number + "*" + i + "=" + (number * i));

            }
        }
    }
}



















