class A{

    public int age;

    public void show(){

        System.out.println("in A");
    }
    static class Inner{
        public Inner(){
            System.out.println("in inner class");
        }
    }
}

public class InnerClass16 {
    public static void main(String[] args){

        A obj = new A(){
            public void show(){

                System.out.println("using Anonymous class");
            }
        };

        //A.Inner obj1 = obj.new Inner();
        A.Inner obj2 = new A.Inner();

        obj.show();


    }
}
