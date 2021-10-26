package Class13Homework;

public class DoWhileLoopMultiplicationTable {
    public static void main(String[] args){

       //Print times table using do while loop
        int number=3;
        int i=1;

        do{
            System.out.println(number + "*" + i + "=" + (number*i));
            i++;
        }while( i<=10);


    }
}
