abstract class A{
    public void show(){
        System.out.println("in A ");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B ");
    }
}
class C extends B{
    public void show(){
        System.out.println("in C ");
    }
}


public class DynamicMethodDispatch15 {
    public static void main(String[] args){

        A obj = new B();
        obj.show();
        obj = new C();
        obj.show();

        B obj1 = (B) obj;
        obj1.show();

        //A object = new A();
    }
}
