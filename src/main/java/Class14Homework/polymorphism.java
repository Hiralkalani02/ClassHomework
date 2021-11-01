package Class14Homework;
/*
 Polymorphism: Poly means many and Morph means forms.
 Polymorphism in java has two types. Static Polymorphism which includes overloading method.
  Dynamic polymorphism which includes overriding method.
  Overloading: If you have two methods with the same name but different parameters that's
  called overloading.
  Overriding: If you have two methods with the same name, same parameters but different
  classes, it's called overriding.
 */
//Example of overriding
class Bird {
    public void sing() {
        System.out.println("tweet tweet tweet");

    }
}

class Robin extends Bird {
    public void sing() {
        System.out.println("twidlee deedee");
    }
}

class Pelican extends Bird {
    public void sing() {
        System.out.println("Kwaah Kwaah Kwaah");
    }
}


public class polymorphism {
    public static void main(String[] args) {
        Pelican b = new Pelican();
        b.sing();


    }

}
