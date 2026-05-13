
class calc{

    public calc(){
        System.out.println("Default constructor of calc");
    }
    public calc(int a){
        System.out.println("parameterized constructor of calc");
    }
    public int sum(int a, int b){
        return a+b;
    }
    public int diff(int a, int b){
        return a-b;
    }

}

class advCalc extends calc{
    public advCalc(){
        super();
        System.out.println("Default advCalc");
    }
    public advCalc(int a){
        this();
        System.out.println("parameterized advCalc");
    }
    public int multi(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

class veryAdvCalc extends advCalc{
    public double pow(int a, int b){
        return Math.pow(a, b);
    }
}




public class Inheritance14 {
    public static void main(String[] args){
        calc obj1 = new calc();
        int result1 = obj1.sum(2,3);
        System.out.println(result1);

        advCalc obj2 = new advCalc();
        int result2 = obj2.sum(3,54);
        System.out.println(result2);

        veryAdvCalc obj3 = new veryAdvCalc();
        int result3 = obj3.sum(5,43);
        System.out.println(result3);
        System.out.println(obj3.pow(2,4));


        // demonstration of this and super keyword



    }
}
