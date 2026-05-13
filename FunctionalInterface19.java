
@FunctionalInterface
interface A{
    int sum(int a, int b);
}
// class B implements A{
//     public void show(){
//         System.out.println("In B ");
//     }
// }



public class FunctionalInterface19 {
    public static void main(String[] args){
        // A obj = new B();
        // obj.show();

        A obj = (int a, int b) -> a+b;
        // int result = obj.sum();
        System.out.println(obj.sum(4,5));
    }
}
