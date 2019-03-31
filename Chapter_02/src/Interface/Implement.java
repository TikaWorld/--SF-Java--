package Interface;

public class Implement implements Declaration{
    @Override
    public void abstractMethod() {
        System.out.println("Call Override Method");
    }

    @Override
    public void defaultMethod(String arg) {
        System.out.println("Call Override Method");
    }
}
