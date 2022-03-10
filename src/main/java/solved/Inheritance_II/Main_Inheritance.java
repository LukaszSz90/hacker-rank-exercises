package solved.Inheritance_II;

public class Main_Inheritance {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.println(adder.callAdd(10,32) + " " + adder.callAdd(8,5) + " " + adder.callAdd(10,10));
    }
}

