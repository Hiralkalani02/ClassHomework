package Class13Homework;

public class WhileLoopEvenOddNumbers {

    public static void main(String[] args) {
        //To print odd numbers up to 20
        int i = 1;

        System.out.println("Printing odd numbers");
        while (i < 20) {

            System.out.println(+i);
            i = i + 2;
        }

        //To print even number up to 20
        i = 1;

        System.out.println("Printing even numbers");
        while (i < 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }


    }
}

