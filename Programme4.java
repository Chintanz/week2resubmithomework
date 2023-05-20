package week2resubmithomework;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
    int a = 1;
    int b = 2;
    static int c = 3;
    static int d = 4;

    public static void main(String[] args) {
        Programme3 sc = new Programme3();
        System.out.println(sc.a);
        System.out.println(sc.b);
        System.out.println(c);
        System.out.println(d);
    }

    public void m1() {
        Programme3 x = new Programme3();
        Programme3 y = new Programme3();
        System.out.println(x.a);
        System.out.println(y.b);

    }
}



