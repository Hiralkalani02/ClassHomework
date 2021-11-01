package Class14Homework;

/*
There are four types of inheritance in java.
Single level, Multilevel, Hierarchical and Hybrid
*/

//Example of multilevel inheritance
class Calculator { //Super Class
    public int add(int i, int j) {
        return i + j;
    }
}

class CalcAdvance extends Calculator { //Sub Class
    public int sub(int i, int j) {
        return i - j;
    }
}

class CalcVeryAdvance extends CalcAdvance {
    public int multi(int i, int j) {
        return i * j;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        CalcVeryAdvance c1 = new CalcVeryAdvance();
        int result1 = c1.add(5, 4);
        int result2 = c1.sub(6, 3);
        int result3 = c1.multi(7, 8);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }

}


