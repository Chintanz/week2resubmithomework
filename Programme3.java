package week2resubmithomework;
/**
 * 3.1Declare one instance and one static variable.
 * 3.2Declare one instance method.
 * 3.3Declare one static method.
 * 3.4Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5Declare the Main method.
 * 3.6Call both instance and static methods into the Main method and run the programme
 */

public class Programme3 {
    int a =1;
    static int b=2;

    public  static  void main(String[]args){
        Programme3 obj1 = new Programme3();
        System.out.println(obj1.a);
        System.out.println(b);

    }
    public void m1(){
        Programme3 obj = new Programme3();
        System.out.println(obj.a);
    }

}
