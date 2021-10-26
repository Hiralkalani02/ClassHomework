package Class13Homework;

public class ForLoopEvenOddNumbers {
    public static void main(String[] args) {

        int n = 20;
        System.out.print("Odd Numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }
        }


        System.out.println("Even Numbers from 1 to " + n + " are: ");
        for (int j = 2; j <= n; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");


            }

        }
    }
}