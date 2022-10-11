interface Sayable1{

    //default
    default void say(){
        System.out.println("Hello,this is default method");
    }

    //abstract method
    void sayMore(String msg);

    //static method
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}

public class StaticAndDefaultMethod implements Sayable1{
    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        StaticAndDefaultMethod dm1 = new StaticAndDefaultMethod();
        dm1.say();  //calling default methdo
        dm1.sayMore("I work in BigOhTech");
        Sayable1.sayLouder("hellooooo.....");
    }
}
