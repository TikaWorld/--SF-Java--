import AccessModifier.*;

public class AccessModifier {
    public static void main(String[] arg) {
        B b = new B();

        System.out.println("Class in different pakage\n");

        System.out.println("Acess Public Field: " + b.a.field1);
        System.out.println("Acess Default Field: " + "Fail");
        System.out.println("Acess Private Field: " + "Fail");

        System.out.print("Call in same pakage: ");
        b.a.method1();
        System.out.println("Call in different pakage: Fail Call Default Method");
        System.out.println("Call in different pakage: Fail Call Private Method\n");
    }
}
