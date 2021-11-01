package Class14Homework;

public class Pen {
// To implement Pen as an object

    String type = "gel";       // Attribute
    String colour = "blue";    //Attribute
    double point = 0.5;        //Attribute

    static boolean clicked = false;

    public static void click()  //Action
    {
        clicked = true;
    }

    public static void unclick()  //Action
    {
        clicked = false;
    }

    public static void main(String[] args) {
        Pen p = new Pen();

        System.out.println(p.colour);
        System.out.println(p.point);
        System.out.println(p.type);
        System.out.println(p.clicked);
        p.click();
        System.out.println(p.clicked);
        p.unclick();

    }
}
