package Class13Homework;

public class DoWhileLoopOddEvenNumbers {
    public static void main(String[] args) {
        //To print even numbers from 1 to 20 using do while loop
        int a = 2;

        System.out.println("Printing even numbers");
        do {
            System.out.println(a);
            a = a + 2;
        }
        while (a <= 20);

        //To print odd numbers from 1 to 20 using do while loop

        System.out.println("Printing odd numbers");
        int i = 1;
        do {
            System.out.println(i);
            i = i + 2;

        } while (i <= 20);

    }
}
