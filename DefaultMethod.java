
interface Sayable{
    default void say(){
        System.out.println("Hello, this is Default method");
    }

    void saySomethingMore(String msg);
}

public class DefaultMethod implements Sayable{
    @Override
    public void saySomethingMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethod dm = new DefaultMethod();
        dm.say(); // calling default method
        dm.saySomethingMore("Work is Workship");//calling abstract method
    }
}
