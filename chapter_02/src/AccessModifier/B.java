package AccessModifier;

public class B {
    public A a = new A();
    public B() {
        System.out.println("Class in same pakage\n");

        System.out.println("Acess Public Field: " + a.field1);
        System.out.println("Acess Default Field: " + a.field2);
        System.out.println("Acess Private Field: " + "Fail");

        System.out.print("Call in same pakage: ");
        a.method1();
        System.out.print("Call in same pakage: ");
        a.method2();
        System.out.println("Call in same pakage: Fail Call Private Method\n");
    }
}
