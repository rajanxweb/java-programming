
class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("In static block");
    }
    
    public void show(){
        System.out.println( name + " : "+ price +" : "+ brand);
    }
    public static void show1(Mobile obj){
        System.out.println(name);
        System.out.println(obj.brand +" : "+ obj.price + " : "+ obj.name);
    }
}

public class Static11 {
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.name = "SmartPhone";
        obj1.brand = "Apple";
        obj1.price = 10_00_00;
        obj1.show();
        System.out.println("------------------");
        Mobile.show1(obj1);

        //Class.forName("Mobile");
    }
}
